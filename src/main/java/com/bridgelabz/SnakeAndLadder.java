package com.bridgelabz;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1; // Assigning Constant variables
    public static final int IS_SNAKE = 2;  // Assigning Constant variable
    public static final int WINNING_POSITION = 100;
           static int diceCount=0;
            static String turn ="player1";
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder");
        // initialize player start position
        int player1Position = 0;
        int player2Position = 0;
        int player1DiceCount = 0; // Initialize dice count variable for player 1
        int player2DiceCount = 0; // Initialize dice count variable for player 2
        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            ++diceCount; // increment count
            // store value of Dice Roll
          if (turn.equals("player1")) {
              turn = "player2";
              ++player1DiceCount;
              player1Position = getPosition(player1Position);

          }else {
              turn = "player1";
              ++player2DiceCount;
              player2Position = getPosition(player2Position);

          }
          }
           if (player1Position == WINNING_POSITION) {
               System.out.println("Player1 win the game");
               System.out.println("dice count " + player1DiceCount);
           } else {
               System.out.println("Player2 win the game");
               System.out.println("dice count " + player2DiceCount);
           }
        System.out.println("Total dice count " + diceCount);

        System.out.println("player1Position " + player1Position);
        System.out.println("player2Position " + player2Position);

    }

            private static int getPosition(int position){
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
                if(turn.equals("player1")) {
                    turn = "player1";
                }else if (turn.equals("player2")) {
                    turn = "player2";
                }
                 if(position +diceNumber <= 100) {
                     position = position + diceNumber;
                 }

            } else {
                System.out.println(" No Play for the player"); // Will Remain to same position
            }
            System.out.println(" dice: " + diceNumber );
            System.out.println("Dice Count :" + diceCount);
            System.out.println("position" + position);
            return position;
        }
    }


