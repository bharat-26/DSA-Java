import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            // print empty spaces 
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // print stars 
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Output : n = 5
//     *
//    **
//   ***
//  ****
// *****