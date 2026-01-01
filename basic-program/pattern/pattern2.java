import java.util.Scanner;
public class pattern2 {

    // Print Hollow Rectangle of Stars
    // Output : m = 7, n = 8
    // * * * * * * * *  
    // *             *
    // *             *
    // *             *
    // *             *
    // *             *
    // * * * * * * * *
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        for(int i=1; i <= m; i++){
            for(int j =1; j <= n; j++) {
                if(i == 1 || j == 1 || i == m || j == n)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}
