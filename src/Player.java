import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    final char symbol;
    private String name;

    Player(char symbol) {
        this.symbol = symbol;

    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String getValidName(Scanner sc) {
        String tempName;
        while (true) {
            try {
                System.out.println("Choose name for a Player" + symbol);
                tempName = sc.nextLine().trim();
                if (tempName.isEmpty())
                    System.out.println("Name cannot be empty String!");
                else
                    return tempName;
            } catch (InputMismatchException e) {
                System.out.println("Wrong name");

            }
        }
    }

    void makeMove(Scanner sc) {
        boolean temp = true;
        while (temp) {
            try {
                System.out.println("Player " + symbol);
                System.out.print("Give me 1-digit number for a row: ");
                int moveRow = sc.nextInt();
                System.out.print("Give me 1-digit number for a col: ");
                int moveCol = sc.nextInt();


                if (isCorrect(moveRow, moveCol)) {
                    Board.fields[moveRow][moveCol] = symbol;
                    temp = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                sc.next();
            }
        }
    }

    boolean isCorrect(int Row, int Col) {
        if ((Row >= 0 && Row < 3 && Col >= 0 && Col < 3) && Board.fields[Row][Col] == '-') {
            return true;
        } else {
            System.out.println("Wrong move, try again!");
            return false;
        }
    }


}
