package string;

public class str_rev {
    static void reverse(String s){
        System.out.println(" hello world ");
    }
    public static void main(String[] args) {
        String word[]=s.split();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i++){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
