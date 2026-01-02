public class pattern11 {
    public static void main() {

        int n =5;
        for(int i = 1; i <= n; i++) {
            for(int j=1; j<=i; j++) {
                // find even or odd ... if any pattern is there with (0 or 1)
                // OR if pattern is two different character to print , 
                // e.g. when even position then print true or dinosaur and if odd then print monkey

                int sum = i+j; 
                if(sum % 2 == 0) 
                    System.out.print("1 ");
                else 
                    System.out.print("0 "); 
            }
            System.out.println();
        }
    }
}
