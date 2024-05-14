package Gov;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {
    public static void main(String[] args) throws NumberFormatException,IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);

        int a=Integer.parseInt(bf.readLine());
        int b=Integer.parseInt(bf.readLine());
        int c=a+b;
        System.out.println(c);
    }
}
