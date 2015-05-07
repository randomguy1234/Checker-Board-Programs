class Checkers
   { public static void main (String[] args)
       {  char [][] checkerBoard= {{' ',' ',' ','w',' ',' ',' ',' '},
                                   {' ',' ',' ',' ',' ',' ',' ',' '},
                                   {' ',' ',' ','w',' ',' ',' ',' '},
                                   {'b',' ','w',' ','w',' ','w',' '},
                                   {' ','w',' ','b',' ','b',' ','b'},
                                   {'b',' ',' ',' ',' ',' ',' ',' '},
                                   {' ','w',' ','b',' ',' ',' ',' '},
                                   {'b',' ','b',' ',' ',' ',' ',' '}};
          
          System.out.println("*************************************************************************");
          
          for (int i= 0; i<checkerBoard[0].length; i++)
                {
                   System.out.println("*"+"        *        *        *        *        *        *        *        *");
                   System.out.print("*");
                   for (int g= 0; g<checkerBoard.length; g++)    System.out.print("    "+checkerBoard[i][g]+"   *"); 
                   System.out.println("");
                   System.out.println("*"+"        *        *        *        *        *        *        *        *");
                   System.out.println("*************************************************************************");
                }
       }
   }
                 