import java.util.Scanner;

public class pattern7 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++) {
                if(j == 1 || i == 1 || j == n || i == n)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

// Output :  n = 6
//           * * * * * * 
//         *         *
//       *         *
//     *         *
//   *         *
// * * * * * *