package Week8;

public abstract class MediaPlayer {

    protected String maker;
    protected int volume;
    protected boolean connectivity;
    protected String fileFormat;

    MediaPlayer(String maker, boolean connectivity){
        this.maker=maker;
        this.connectivity=connectivity;
        this.volume=5;
        this.fileFormat="WAVE";
    }

    public String getMaker() {
        return maker;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isConnectivity() {
        return connectivity;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setVolume(int volume) {
        if(volume>0&&volume<=10)
            this.volume = volume;
    }

    public void setConnectivity(boolean connectivity) {
        this.connectivity = connectivity;
    }


    abstract void play();
   /* void play(){
        System.out.printf(this.maker+" MP is playing a file" );
    }*/
    public void volumeUp(){
        if(volume<10)
            volume++;
        System.out.println("Volume Up :"+volume);
    }
    public void volumeDown(){
        if(volume>0)
            volume--;
        System.out.println("Volume Down :"+volume);
    }
}
