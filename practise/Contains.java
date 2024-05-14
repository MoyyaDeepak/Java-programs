package practise;

public class Contains {
    public static void main(String[] args) {
        String s="studio";
        for(char c='a';c<='z';c++){
            if(!s.contains(String.valueOf(c)))           //prints remaining alphabets not present in input
            System.out.print(c);
        }
    }
}
