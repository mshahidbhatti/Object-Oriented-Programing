package Week9;

import java.util.ArrayList;
import java.util.Collection;

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

      //  ElectronicInterface obj=new AudioPlayer("",true);

        TestInterface obj2 = new AudioPlayer("",true);
        obj2.someMethod();
       // obj2.play();

        AudioPlayer ap=(AudioPlayer) obj2;
       ap.play();


        MediaPlayer mpObject=new AudioPlayer("",true);

        mpObject.play();
        mpObject.someMethod();


        MediaPlayer obj3= new AudioPlayer("",false);



        ElectronicInterface e = new Audio2("",true);

        MediaPlayer mp= (MediaPlayer) e;


        Collection c= new ArrayList();

        c.add(null);







    }
}
