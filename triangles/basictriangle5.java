package triangles;

public class basictriangle5 {
    public static void main(String[] args) {
               int rows = 5; // number of rows in the triangle

        for (int i = rows; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
