package game;

public class methods {

    public static void printBoard(String gameBoard[][]){

        // Method to print the game board
        int i, j;

        System.out.println("");
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static boolean isValid(int userRow, int userColumn){
        // Manually specifying every possible input.
        // It is opted as there are limited possible
        // input and have to be specified.
        
        return ((userRow == 1 || userRow == 2 || userRow == 3 || userRow == 4 || userRow == 5) || (userColumn == 1 || userColumn == 2 || userColumn == 3 || userColumn == 4 || userColumn == 5));
    }
}