package week11;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class FileHandlingTest {
    public static void main(String[] args) {
     //   File f= new File("C:\\Users\\mshah\\OneDrive\\Desktop\\RawText.txt");
        File f= new File("data/data.txt");

        File f2=new File("data");

        File filesList[]=f2.listFiles();
        FileHandling fh = new FileHandling(f);
        ArrayList<String> wordsList=new ArrayList<>();
        for(File temp:filesList)
        {
            //
            FileHandling fh2=new FileHandling(temp);
            //wordsList.addAll(Arrays.stream(fh2.countWords()).toArray());
            String array[]=fh2.countWords();
            for(int i=0;i<array.length;i++)
                wordsList.add(array[i]);
          //  System.out.println(array.length);
            //System.out.println(temp.getPath());
        }
        System.out.println(wordsList.size());

        //System.out.println(temp.getName());

        System.out.println(f2.isDirectory());
        System.out.println(f.isDirectory());

      //  System.out.println(fh.readFromFile());
   //     String arrayOfWords[]=fh.countWords();
   //     System.out.println(arrayOfWords.length);

  //      for(String t: arrayOfWords)
        //         System.out.println(t);
    }
}
