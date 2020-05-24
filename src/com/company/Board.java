package com.company;

public class Board
{
    String[][] A = new String[6][7];

    void InitBoard()
    {
        for(int i = 0;i<A.length;i++)
        {
            for(int j = 0;j<A[0].length;j++)
            {

                A[i][j] = null;
            }
        }
    }

    void InsertCoin(int column, State s)
    {
        for(int i = A.length-1;i>=0;i--)
        {
            if(A[i][column] == null)
            {
                // create a coin object here.
                Coin c = new Coin();
                System.out.println(s.pType);
                A[i][column] = c.getCoinText(s);

                break;
            }

        }
    }
    void DisplayBoard()
    {
        for(int i = 0;i<A.length;i++)
        {
            for(int j = 0;j<A[0].length;j++)
            {

                if(A[i][j] == null)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print(A[i][j]);
                }
            }
            System.out.println();
        }
        for(int i = 0;i<A.length;i++) {
            for (int j = 0; j < A[0].length; j++)
            {
                if(checkWin(i, j, 0))
                {
                    System.out.println("Winner");
                    System.exit(0);
                    break;
                }
            }
        }
        System.out.println();
    }

    boolean checkWin(int i, int j, int count)
    {
        if(count ==4) return true;
        if(j<0 || j>5) return false;
        if(i<0 || i>4) return false;

        if(A[i][j] == null) return false;

        if(A[i][j+1]!=null && A[i][j].compareTo(A[i][j+1]) !=0) return false;
        if(A[i+1][j]!=null && A[i][j].compareTo(A[i+1][j]) !=0) return false;

        return checkWin(i,j+1,count++) || checkWin(i+1,j,count++);
    }
}
