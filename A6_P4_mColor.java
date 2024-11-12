import java.util.Scanner;
import java.io.*;         


public class A6_P4_mColor { 

   public static String name = "LASTNAME_FIRSTNAME";
   
   
   // set these to true individually to test each method,
   // but then set all of them to true before handing in.   
   

   public static int [] mColorable(int n, int [][] W, int m)  {
   
      int [] vcolor = new int[n+1];
      
      if (mColorableRec(0, n, W, m, vcolor))
         return vcolor;
      else
         return new int[]{};
   }  
   
   
   public static boolean mColorableRec(int i, int n, int [][] W, int m, int [] vcolor)  {
   
      if (promising(i, W, vcolor))  {
      
         if (i == n)
            return true;
         
         else
            for (int t = 1; t <= m; t++)  {
            
               vcolor[i+1] = t;
               if (mColorableRec(i+1, n, W, m, vcolor))
                  return true;
            }
      }
      
      return false;
   }
   
  
   
   public static boolean promising(int i, int [][] W, int [] vcolor)  {
   
      for (int j = 1; j < i; j++)  
         if (W[i][j] == 1  &&  vcolor[i] == vcolor[j])
            return false;
      
      return true;
   }  



   

//*******************************************************************************
// Do NOT change anything below this, EXCEPT that you may comment out the 
// "test_" methods below to test only the one method you arecurerntly working on.  
//
//*******************************************************************************
   
   
   public static void main(String [] args)  throws Exception   {
   
      System.out.println("\n" + name);
      System.out.println("A6, P467, Graph Coloring Methods.\n");
      
      int n, test = 1;
      int [][] W;
      
      setUpGraphs();
      W = getNextGraph();
      n = W.length - 1;
      
      
      while (n > 0)
      {
         System.out.println("===================================================================\n");
         System.out.println("Graph " + test + ", size = " + n + "\n");

         int [] vcolor = new int[n+1];
         int m = 1;
         long start, end;
         
         sopln("Backtracking...");
         
         do {
         
            vcolor = mColorable(n, W, m);
           
            if (vcolor.length == 0)  {
               System.out.println("This graph is NOT " + m + "-colorable.");
               m++;
            }
         }
         while (vcolor.length == 0);
         
         System.out.println("\n" + m + " colors are necessary for this graph:");
         printArray(n, vcolor);
   
         W = getNextGraph();
         n = W.length - 1;
         test++;
         sopln("\n");
      }
   }
        
        
         
//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE  
//
//*********************************************************************   


   public static Scanner input;

   public static void setUpGraphs() throws IOException {
            
      FileReader f = new FileReader("graphs.txt");
      input = new Scanner(f);
   }

   public static int [][] getNextGraph()  {

      int n = input.nextInt();
      
      int [][] W = new int[n+1][n+1];
 
      for (int i = 1; i <= n; i++)
         for (int j = 1; j <= n; j++)
            W[i][j] = input.nextInt();
      
      return W;
   }      
         
                 




   public static void printArray(int n, int [] A) {
      for (int i = 1; i <= n; i++)
         System.out.print(A[i] + " ");
      System.out.println();
   }


   

   public static void sop(int a)
   {
      System.out.print(a);
   }
   
   public static void sopln(int a)
   {
      System.out.println(a);
   }
   
   public static void sop(double a)
   {
      System.out.print(a);
   }
   
   public static void sopln(double a)
   {
      System.out.println(a);
   }

   public static void sop(byte a)
   {
      System.out.print(a);
   }
   
   public static void sopln(byte a)
   {
      System.out.println(a);
   }   
   
   public static void sop(boolean a)
   {
      System.out.print(a);
   }
   
   public static void sopln(boolean a)
   {
      System.out.println(a);
   }   
   
   
   public static void sop(String s)
   {
      System.out.print(s);
   }
   public static void sopln(String s)
   {
      System.out.println(s);
   }
   public static void sopln()
   {
      System.out.println();
   }



}
   


