package com.company;

public class State
{
    // Container that can store some names/state
    enum PlayerType
    {
        Player,
        AI,
    }

    // Container that can store some names/state
    enum GameType
    {
        SinglePlayer,
        MultiPlayer,
    }

    PlayerType pType;
    GameType gType;


}
