package game;

import java.util.*;

public class gameSource{

    public static void startMatch(){
        
        Random random = new Random();
        Scanner scn = new Scanner(System.in);
        int score = 0, flag = 0;
        int userRow, userColumn;
        int sysMove;
        String stringSysMove;

        String board[][] = {                                                    // 5x5 game board
            {" {1,1} ", " {1,2} ", " {1,3} ", " {1,4} ", " {1,5} "},
            {" {2,1} ", " {2,2} ", " {2,3} ", " {2,4} ", " {2,5} "},
            {" {3,1} ", " {3,2} ", " {3,3} ", " {3,4} ", " {3,5} "},
            {" {4,1} ", " {4,2} ", " {4,3} ", " {4,4} ", " {4,5} "},
            {" {5,1} ", " {5,2} ", " {5,3} ", " {5,4} ", " {5,5} "}
        };

        methods.printBoard(board);   // Print the game board

        while (flag != 3){

            System.out.print("\nRow : ");
            userRow = scn.nextInt();
            System.out.print("Column : ");
            userColumn = scn.nextInt();

            sysMove = random.nextInt(0, 5);

            if (methods.isValid(userRow, userColumn)){  // Validating the user move
                if (sysMove == 0){
                    stringSysMove = Integer.toString(sysMove);
                    board[userRow-1][userColumn-1] = "*{S:" + stringSysMove + "}*";     // Printing the user input into the game board
                    message.gameOver(score);
                    break;
                }
                else{
                    score += sysMove;       
                    message.validMove(score);
                    stringSysMove = Integer.toString(sysMove);
                    board[userRow-1][userColumn-1] = "*{S:" + stringSysMove + "}*";     // Printing the user input into the game board       
                    methods.printBoard(board);
                }
            }
            else{
                message.invalidInput();
                flag++;
            }
        }
        
        if (flag == 3){
            message.outOfRuns(score);
        }
        scn.close();
    }
}