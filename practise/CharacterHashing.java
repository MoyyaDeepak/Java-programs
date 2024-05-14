package practise;

public class CharacterHashing {
    static char check(char arr[]){
        char ch2[]={'a', 'c', 'z'};
        for(char c=0;c<ch2.length;c++){
            int count=0;
            for(char d=0;d<arr.length;d++){
                if(ch2[c]==arr[d]){
                    count++;
                }
            }
             System.out.print(count+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        String str = "abcdabefc";
        str.toLowerCase();
        char ch[]=str.toCharArray();
        check(ch);
    }
}
