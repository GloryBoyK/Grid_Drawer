//import sun.awt.X11ComponentPeer;
import java.util.Scanner;

class Main {
    public static void printGrid(boolean[][] test)
    {
      System.out.print("  ");
      for (int a=0; a<test.length; a++)
      {
        System.out.print(a+" ");
      }
      System.out.println();

      for (int i=0;i<test.length; i++)
      {
        System.out.print(i+" ");
        for (int j=0; j<test[i].length; j++)
        {
          if(test[i][j]==false){
            System.out.print("- ");
  
          }
          else{
            System.out.print("X ");
          }
        }
        System.out.println();
      }
    }
  public static void main(String[] args) {





    boolean [][] grid=new boolean[10][10];
    Scanner s=new Scanner(System.in);
    //grid[0][9]=true;
    //printGrid(grid);
    while(true)
    {
      printGrid(grid);
      System.out.println("Enter a row to place a marker. Or enter -1 to stop");
      int row=s.nextInt();

      System.out.println("Enter a coloumn to place a marker. Or enter -1 to stop");
      int col=s.nextInt();

      if (row==-1 || col==-1)
      {
        break;
      }

      grid[row][col]=true;

      
    }

  }
}