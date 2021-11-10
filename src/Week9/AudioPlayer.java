package Week9;

public class AudioPlayer extends MediaPlayer {

    AudioPlayer(String maker, boolean connectiviy){
        super(maker,connectiviy);
        this.fileFormat="WAVE";
    }

    @Override
    public void play(){
        System.out.println(this.getClass().getSimpleName()+" is playing a file");
    }



}
