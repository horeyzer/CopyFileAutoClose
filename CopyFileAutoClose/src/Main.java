import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        int bajt;

        try(FileInputStream fis = new FileInputStream("C:\\Users\\vchup\\IdeaProjects\\CopyFileAutoClose\\file.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\vchup\\IdeaProjects\\CopyFileAutoClose\\copyOfFile.txt"))
        {
            do
            {
                bajt = fis.read();
                if((char) bajt == ' ') bajt = '=';
                if(bajt != -1) fos.write(bajt);
            }
            while(bajt != -1);
        }
        catch (IOException e)
        {
            System.out.println("Error IO");
        }
    }
}