import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        int count = 0;
        System.out.println("Please input your file path: ");
        String filePath = scnr.nextLine();
        File fileToRead = new File(filePath);

        Scanner readFile = new Scanner(fileToRead);
        while(readFile.hasNextLine()){
            readFile.nextLine();
            count ++;
        }
        readFile.close();
        System.out.println("Reading file is complete");
        System.out.println("Enter file to write to: ");
        String filePath2 = scnr.nextLine();
        scnr.close();
        try{
        FileWriter fileToWrite = new FileWriter(filePath2);
        fileToWrite.write("The amount of words from the first file is: " + count);
        fileToWrite.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Writing to file is done");
    }
}
