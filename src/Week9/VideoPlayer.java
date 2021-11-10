package Week9;

public class VideoPlayer extends MediaPlayer {
    private int brightness;

    VideoPlayer(String maker, boolean connectivity){
        super(maker,connectivity);

    }

    public void lowBrightness(){
        if(brightness>=0)
            brightness--;
        System.out.println("Brithness Level :"+brightness);
    }
    public void highBrightness(){
        if(brightness<=10)
            brightness++;
        System.out.println("Brithness Level :"+brightness);
    }


    @Override
    public void play(){
        System.out.println(this.getClass().getSimpleName()+" is playing a file");
    }




}
