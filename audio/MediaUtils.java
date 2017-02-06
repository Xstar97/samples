//How to use the MediaUtils.java?
//1. Add your sound files in the assets directory
//2. add "private MediaPlayer m;" in any activity or fragment
//
//then when you want to play the specific sound file do this:
//
//playSound(m, "sound.mp3");
//
//to stop playing the sound file(if looping was enabled)
//
//then use this...
//stopSound(m);

public class MediaUtils {

public static void playSound(MediaPlayer m,String name){
try{

//if sound is playing stop & release to to play a new sound file
stopSound(m);

//play sound from assets
AssetFileDescriptor descriptor = getAssets.openFd(name);
m.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
descriptor.close();
m.prepare();

//additional stuff you can try
//m.setVolume(1f, 1f);
//m.setLooping(true);

//start playing sound
m.start();

}
catch (Exception e){
}
}

public static void stopSound(MediaPlayer m){
//if sound is playing stop & release to to play a new sound file
if(m.isPlaying()){
m.stop();
m.release();
m = new MediaPlayer();
  }
 }
}
