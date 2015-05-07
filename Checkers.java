class CheckersB
   { public static void main (String[] args)
       {  final int ELEMENT_NUMBER= 8;
          char [][] checkerBoard= new char [ELEMENT_NUMBER][ELEMENT_NUMBER];
          
          for (int i= 0; i<checkerBoard[0].length; i++)
                 for (int g= 0; g<checkerBoard.length; g++)
                       checkerBoard [i][g]= ' ';
          addValues(checkerBoard);
          System.out.println("*************************************************************************");
          for (int k= 0; k<ELEMENT_NUMBER; k++)
                {
                   System.out.println("*"+"        *        *        *        *        *        *        *        *");
                   System.out.print("*");
                   for (int j= 0; j<checkerBoard.length; j++)    System.out.print("    "+checkerBoard[k][j]+"   *"); 
                   System.out.println("");
                   System.out.println("*"+"        *        *        *        *        *        *        *        *");
                   System.out.println("*************************************************************************");
                }
       }
   
          static void addValues(char [][] x)
             {  
                x[0][3]= 'w';   x[2][3]= 'w';   x[3][0]= 'b';
                
                x[3][2]= 'w';   x[3][4]= 'w';   x[3][6]= 'w';
                
                x[4][1]= 'w';   x[4][3]= 'b';   x[4][5]= 'b';
                
                x[4][7]= 'b';   x[5][0]= 'b';   x[6][1]= 'w';
                
                x[6][3]= 'b';   x[7][0]= 'b';   x[7][2]= 'b';
             }
          
          
   }
                 