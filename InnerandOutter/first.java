package InnerandOutter;

class first {
    int x=21;
class Second{
    int y=26;
}  
}
class Main{
public static void main(String[] args) {
    first f=new first();
    first.Second g=f.new Second();
    System.out.println(f.x+g.y);
}
}