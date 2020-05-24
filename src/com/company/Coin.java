package com.company;

// User defined data type
// Data Type: type of the data we are trying to store.

// Something it has - its property / characteristics / attributes
// something it does - Methods.
public class Coin
{
    public String ANSI_RED = "\u001B[31m";
    public String ANSI_GREEN = "\u001b[32m";
    public String ANSI_RESET = "\u001B[0m";


    // this is a method. Methods are just like functions.
    // We do stuff inside method and then calling them from
    // other class will do all the stuff inside the method.
    public String getCoinText(State s)
    {
        String colour = "";
        //  if the type is player
        //colour will be ANSI_RED + "0" + ANSI_RESET;
        if (s.pType == State.PlayerType.Player)
        {
            colour =  ANSI_RED + "0" + ANSI_RESET;
    }
        else if (s.pType == State.PlayerType.AI)
        {
            colour = ANSI_GREEN + "0" +ANSI_RESET;
        }
        // return statement tell what the function's output/value will be.
        return colour;
    }
    public String getCoinText()
    {
        String colour = "";
        colour =  ANSI_RED + "0" + ANSI_RESET;
        return colour;
    }
}
