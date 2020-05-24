package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Print a line saying that "Welcome to connect 4"
        // Choose a Level
        // 1. Single Player
        // 2. Multi Player
        // Type 1 or 2 to select the level.

        // Scanner to take input from the user
        // if input is 1 -> s.gType = State.PlayerType.SinglePlayer;
        // else if input is 2 -> Multiplayer



        Board b = new Board();
        InputManager im = new InputManager();
        State s = new State();
        s.gType = State.GameType.MultiPlayer;

        s.pType = State.PlayerType.Player;

        b.InitBoard(); // Initialize Board with NULL
        b.DisplayBoard();// Display Empty Board

        for(int i = 0;i<42;i++)
        {
            int inputCol = im.TakeInput(s);
            b.InsertCoin(inputCol,s); // Insert a Coin
            b.DisplayBoard();// Display Board
        }

    }

}
