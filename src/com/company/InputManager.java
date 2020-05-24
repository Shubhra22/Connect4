package com.company;

import java.util.Random;
import java.util.Scanner;

public class InputManager
{
    // Create a Method called/ named TakeInput
    // Return type is void
    // no arguments.

    int TakeInput(State s)
    {
        int inputCol = 0;
        if (s.pType == State.PlayerType.Player)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Column where you wanna put the coin");
            inputCol = sc.nextInt();
            if(s.gType == State.GameType.SinglePlayer)
            {
                s.pType = State.PlayerType.AI;
            }
            else // MultiPlayer
            {
                s.pType = State.PlayerType.Player;
            }
        }

        else if (s.pType == State.PlayerType.AI)
        {
            System.out.println();
            System.out.println("AI Turn");
            Random r = new Random();
            inputCol = r.nextInt(7);// any random value between zero to nine
            s.pType = State.PlayerType.Player;
        }


        return inputCol;
    }
}
