package com.bridgelabz;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1; // Assigning Constant variables
    public static final int IS_SNAKE = 2;  // Assigning Constant variable
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        // initialize player start position
        int position = 0;
        int diceCount = 0; // Initialize dice count variable
        while (position < WINNING_POSITION) {

            ++diceCount; // increment count
            // store value of Dice Roll
            int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            // store the position value
            int option = (int) (Math.floor(Math.random() * 10) % 3 + 1);
            if (option == IS_SNAKE) { // if randomly player reaches position having snake ,it will enter loop
                System.out.println("Snake for the player");
               // position = position - diceNumber; // Players position gets subtracted respectively
               // if (position < 0) {
                //   position = 0;
                //}
                if (position - diceNumber > 0){
                    position = position - diceNumber;
                }

            } else if
            (option == IS_LADDER) { // if player does not get snake it will check for ladder randomly & enter loop
                System.out.println("Ladder for the player");
                position = position + diceNumber; // Players position gets added respectively
             if ( position > 100){
                 position = position - diceNumber;
             }

            } else {
                System.out.println(" No Play for the player"); // Will Remain to same position
            }
            System.out.println(" dice: " + diceNumber );
            System.out.println("Dice Count :" + diceCount);
            System.out.println("position" + position);
        }
    }
}

