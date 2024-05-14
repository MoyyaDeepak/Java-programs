package FileHandling;
import java.io.File;
import java.io.IOException;

public class Filehandle2 {
    public static void main(String[] args) throws IOException{
        File f=new File("./sample.txt");
        if(!f.exists()){
            f.createNewFile();
        }
    }
}
