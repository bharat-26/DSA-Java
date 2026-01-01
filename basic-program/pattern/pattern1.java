import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        for(int i =0; i<length; i++)
        {
            for(int j =0; j<length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}