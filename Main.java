import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args){
        try{
            File file = new File("testo.txt");
            Scanner s = new Scanner(file);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
    }
}