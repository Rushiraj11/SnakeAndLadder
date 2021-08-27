package com.bridgelabz;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1; // Assigning Constant variables
    public static final int IS_SNAKE = 2;  // Assigning Constant variable
     public static void main(String[] args) {
         // initialize player start position
         int position = 0;
         // store value of Dice Roll
         int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
         // store the position value
         int option = (int) (Math.floor(Math.random() * 10) % 3 + 1);
         if (option == IS_SNAKE) { // if randomly player reaches position having snake ,it will enter loop
             System.out.println("Snake for the player");
             position = position - diceNumber; // Players position gets subtracted respectively
         } else if
         (option == IS_LADDER) { // if not player does not get snake it will check for ladder randomly & enter loop
             System.out.println("Ladder for the player");
             position = position + diceNumber; // Players position gets added respectively
         } else {
             System.out.println(" No Play for the player"); //
         }
         System.out.println("position" + position);
     }
    }

