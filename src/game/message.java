package game;

public class message {

    public static void gameStartFirstMessage(){
        
        // First message at start of the game
        System.out.println("\n=====WELCOME TO MINE SWEEPER!!!!!=====\n");
        System.out.println("1. A 5x5 Game board is shown below. Each column has it's address marked as {Row, Column}. Enter the suitable address to your move when asked.");
        System.out.println("2. You will be given a maximum of 3 chances per move in case you enter a wrong address.");
        System.out.println("3. The game will be over once you hit a mine.\n");
        System.out.println("=====BEST OF LUCK FOR YOUR GAME!!!=====");
    }

    public static void outOfRuns(int score){

        // Message to be printed when the user has ran out of runs
        System.out.println("You have exceded the maximum limit of your inputs.\nYour final score is = " + score);
    }

    public static void gameOver(int score){
        
        // Message to be printed when the game is over
        System.out.println("Nice game!!! Your final score is " + score);
    }

    public static void invalidInput(){

        // Message to be printed incase the input is invalid
        System.out.println("Invalid input. Please try entering numbers from 1 to 5.\n");
    }

    public static void validMove(int score){

        // Message to be printed after every input
        System.out.println("Great move. Your score is : " + score + "\n");
    }
}