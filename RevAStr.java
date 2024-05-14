public class RevAStr {                              //reverse a stirng
    public static void main(String[] args) {
        String original="DeepaK";
        String reverse="";
        System.out.println("Original name: "+original);
        for(int i=0;i<original.length();i++){
            reverse=original.charAt(i) + reverse;
        }
        System.out.println("Reversed name: "+reverse);
    }
}
