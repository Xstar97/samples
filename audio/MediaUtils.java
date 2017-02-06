//How to use the MediaUtils.java?
//1. Add your sound files in the assets directory or the raw directory

//then when you want to play the specific sound file do this:
//assets
//MediaUtils.playSound(MainActivity.this, "sound.mp3");
//raw
//MediaUtils.playSound(MainActivity.this, R.raw.filename);//exclude extension
//
//to stop playing the sound file(if looping was enabled)
//MediaUtils.stopSound();

package com.example.app;

import android.content.*;
import android.content.res.*;
import android.media.*;
import android.widget.*;

public class MediaUtils
{
	private static MediaPlayer m;

	public static void playSound(Context context, String fileName){
		playAsset(context, fileName);
	}
	public static void playSound(Context context, int fileName){
		playRaw(context, fileName);
	}

	private static void playAsset(final Context context, final String assetName){

		try{
			//if sound is playing stop & release to to play a new sound file
			stopSound();
			m = new MediaPlayer();
			AssetFileDescriptor afd = context.getAssets().openFd(assetName);
			m.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
			afd.close();
			m.prepare();
			m.start();
		}
		catch (Exception e){
			Toast.makeText(context, "error: " + e, Toast.LENGTH_LONG).show();
		}
	}
	
	private static void playRaw(Context context, int rawName){

		try{
			//if sound is playing stop & release to to play a new sound file
			stopSound();
			m = new MediaPlayer();
			m = MediaPlayer.create(context, rawName); 
			m.start();

		}
		catch (Exception e){
			Toast.makeText(context, "error: " + e, Toast.LENGTH_LONG).show();
		}
	}

	public static void stopSound(){
		//if sound is playing stop & release to to play a new sound file
		if(m != null){
		if(m.isPlaying()){
			m.stop();
			m.release();
			}
		}
	}
}
