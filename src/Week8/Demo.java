package Week8;

public class Demo {
    public static void main(String[] args) {

        //Abstract class cannot be instantiated
        //MediaPlayer obj=new MediaPlayer("",true);


        AudioPlayer audioPlayer=new AudioPlayer("LG",true);

        VideoPlayer videoPlayer=new VideoPlayer("Sony",true);


        audioPlayer.play();
        System.out.printf("");
        audioPlayer.volumeUp();


        videoPlayer.play();
        System.out.printf("");
        videoPlayer.highBrightness();



    }
}
