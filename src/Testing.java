import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int userInput = in.nextInt();

        if (userInput > 10) {
            System.out.println("YOU WIN");

        }
        else if (userInput < 10) {
            System.out.println("YOU LOSE");
        }
        else {
            System.out.println("YOU DRAW");
        }

    }
}
