package FileHandling;


import java.io.*;

public class ReadWiteOperations {


    public static void main(String[] args) {

        File f = new File("data.txt");


        //writeToFile("username",f);
        readFromFile(f);

    }



    public static void writeToFile(String text, File f){
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
        }
        catch (Exception e){

            e.printStackTrace();
        }

    }

    public static String readFromFile(File f)  {
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String text= br.readLine();

            System.out.println(text);
        }
        catch (IOException e){}
        return null;
    }


}
