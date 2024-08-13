import java.util.Scanner;

public class Board {
    final int row = 3;
    final int col = 3;
    static char[][] fields;

    Board() {
        fields = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                fields[i][j] = '-';
            }
        }
    }

    void printOutBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(fields[i][j]);
            }
            System.out.println("");
        }
    }

    void printOutRules(@org.jetbrains.annotations.NotNull Scanner sc) {
        System.out.print("To do Rules! press any button to continue.");
        String response = sc.nextLine();


    }

    boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if ((fields[i][0] == fields[i][1] && fields[i][0] == fields[i][2] && fields[i][0] != '-')
                    || (fields[0][i] == fields[1][i] && fields[0][i] == fields[2][i] && fields[0][i] != '-'))
                return true;
        }
        return (fields[0][0] == fields[1][1] && fields[0][0] == fields[2][2] && fields[2][2] != '-')
                || (fields[0][2] == fields[1][1] && fields[0][2] == fields[2][0] && fields[2][0] != '-');

    }


}
