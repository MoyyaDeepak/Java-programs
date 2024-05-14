package FileHandling;
import java.io.File;
import java.io.IOException;

public class Filehand1 {
    public static void main(String[] args) throws IOException {
        File f=new File("./exxample");
        System.out.println(f.createNewFile());
    }
}
