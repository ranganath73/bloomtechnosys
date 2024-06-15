import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConfirmingFile
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("Notes.docx");
        // file is called refrence variable
        Scanner input = new Scanner(file);
        String fileContent = input.next();
        System.out.println(fileContent);
    }
}