package arrays;
import java.io.*;
class arrex
{

public static void main(String[] args) 
{
   
   try{
    FileOutputStream fos =new FileOutputStream("Text.txt");
    String str="JAVA PROGGRAMMING";
    byte b[]=str.getBytes(str);
    fos.write(b);
    fos.close();
   } catch(Exception e){}
}
}