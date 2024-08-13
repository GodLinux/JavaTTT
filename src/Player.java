import java.util.Scanner;

public class Player {
    final char symbol;

    Player(char symbol) {
        this.symbol = symbol;
    }

    void makeMove(Scanner sc){
        boolean temp = true;
        while (temp){
        System.out.print("Give me 1-digit number for a row: ");
        int moveRow = sc.nextInt();
        System.out.print("Give me 1-digit number for a col: ");
        int moveCol = sc.nextInt();

        if(isCorrect(moveRow, moveCol)){
            Board.fields[moveRow][moveCol] = symbol;
            temp = false;
        }
        }
    }

    boolean isCorrect(int Row, int Col){
        if (Row >= 0 && Row < 3 && Col >= 0 && Col < 3){
            return true;
        } else {
            System.out.println("Wrong move, try again!");
            return false;
        }
    }






}
