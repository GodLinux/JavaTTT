import java.util.Scanner;

public class Board {
    final int row = 3;
    final int col = 3;
    static char[][] fields;

    Board(){
        fields = new char[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                fields[i][j] = 'c';
            }
        }
    }

    void printOutBoard(){
        fields = new char[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(fields[i][j]);
            }
            System.out.println("");
        }
    }

    void printOutRules(Scanner sc){
        System.out.print("To do Rules! press any button to continue.");
        String response = sc.nextLine();



    }




}
