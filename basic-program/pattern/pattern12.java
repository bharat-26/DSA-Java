// Print Butterfly pattern
public class pattern12 {
    public static void main() {
        int n = 4;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // reverse outer loop for inverted diagram
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output : n = 4

// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *