
public class MediaUtils {

//add this line in the activity or fragment you want to play the sound.
//private MediaPlayer m;

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
