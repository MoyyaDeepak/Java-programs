package TcsNqt;

public class Toggling {
    public static void main(String[] args){
        int n=10;
        int r=toggleBits(n);
        System.out.print("Result: "+r);

    }
    public static int toggleBits(int n){
        //Step-1: Convert Decimal to Binary
        String binary = Integer.toBinaryString(n);
        
        //Step-2: Toggle all bits after the most significant bit
        StringBuilder toggledBinary=new StringBuilder();
        boolean leadingOne=false;
        for(int i=0;i<binary.length();i++){
            if(!leadingOne && binary.charAt(i)=='1'){
                leadingOne=true;
            }
            if(leadingOne){
                toggledBinary.append(binary.charAt(i)== '0' ? '1':'0');
            }
        }
        // System.out.println(toggledBinary);
        //Step-3: Convert toggled binary back to decimal
        int result = Integer.parseInt(toggledBinary.toString(), 2);
        return result;
    }
}
