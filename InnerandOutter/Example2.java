package InnerandOutter;

class Example2 {
    int x=7;
class Another{
    public int method(){
        return x;
    }
}
}
class Original{
    public static void main(String[] args) {
        Example2 ex=new Example2();
        Example2.Another an=ex.new Another();
        System.out.println(an.method());
    }
}