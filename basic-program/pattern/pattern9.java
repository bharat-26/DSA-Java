import java.util.Scanner;

public class pattern9 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }    
}

// Output : n = 6
// 1 2 3 4 5 6 
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1