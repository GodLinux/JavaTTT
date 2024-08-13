import java.util.Scanner;

public class StartGame {
    boolean gameON = true;

    StartGame() {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player playerX = new Player('X');
        Player playerO = new Player('O');
        Player playerptr = playerX;
        board.printOutRules(scanner);
        while (true) {



            board.printOutBoard();
            playerptr.makeMove(scanner);



        }
    }




}
