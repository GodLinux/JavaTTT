import java.util.InputMismatchException;
import java.util.Scanner;

public class StartGame {
    boolean gameON = true;

    StartGame() {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player playerX = new Player('X');
        Player playerO = new Player('O');

        playerX.setName(playerX.getValidName(scanner));
        playerO.setName(playerO.getValidName(scanner));
        Player playerptr = playerX;



        board.printOutRules(scanner);
        while (true) {


            board.printOutBoard();
            playerptr.makeMove(scanner);

            if (board.checkWin()) {
                board.printOutBoard();
                System.out.printf("Player%s, %s won!%n", playerptr.getSymbol(), playerptr.getName());
                break;
            }


            if (playerptr == playerX) {
                playerptr = playerO;
            } else
                playerptr = playerX;
        }
        scanner.close();
    }


}




