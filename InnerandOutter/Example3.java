package InnerandOutter;

class Example3 {                      //when using static, we can access it without creating an object of the outer class
    int x=1;
    static class one{
        int x=2;
    }
}
class Two{
    public static void main(String[] args) {
        Example3.one o=new Example3.one();
        System.out.println(o.x);
    }
}
