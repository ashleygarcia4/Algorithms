public class A4_P3_NumWaysDP_GARCIA_ASHLEY {

   public static String name = "GARCIA_ASHLEY";
   
   
   public static long numWaysDP(int n, int k, int [] D)   {
      long[][] dp = new long[k + 1][n + 1];
      for (int i = 0; i <= k; i++) {
         dp[i][0] = 1;
      }
      for (int i = 1; i <= k; i++) {
         for (int j = 1; j <= n; j++) {
            dp[i][j] = dp[i - 1][j];
            if (j >= D[i]) {
               dp[i][j] += dp[i][j - D[i]];
            }
         }
      }
      return dp[k][n];
   }

      
   public static long numWaysREC(int n, int k, int [] D)   {
   
      if (n < 0)
         return 0;
      else if (n == 0)
         return 1;
      else if (k == 1 && n % D[1] == 0)
         return 1;
      else if (k == 1)
         return 0;
      else
         return numWaysREC(n, k-1, D) + numWaysREC(n - D[k], k, D);
   }
               
 
 
//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************   


	public static void main(String[] args)   {
      
      sopln("\n" + name);
      sopln("A4_P3, Recursive number of ways to make change.");
      int [] D;
      int k, n;
      long ans, start, end;

      for (int j = 0; j < data.length; j++) {
  
         D = data[j];
         k = D.length - 1;
         n = D[0];

         sop("\nTest " + (j+1) + ". ");
         sop("n = " + n + ", k = " + k + ", D is ");
         printArray(k, D);
         sopln("\n");
         
         if (j < data.length - 2) {
            start = System.currentTimeMillis();
            ans = numWaysREC(n, k, D);         
            end = System.currentTimeMillis();
            sop("Number of ways using Divide and Conquer:  " + ans + ".  ");
            sopln("(This took " + (end - start) + " milliseconds.)");
         }
         
         start = System.currentTimeMillis();
         ans = numWaysDP(n, k, D);         
         end = System.currentTimeMillis();
         sop("Number of ways using Dynamic Programming: " + ans + ".  ");
         sopln("(This took " + (end - start) + " milliseconds.)");
         sopln("====================================================================");
      }
      


      sopln();  
   }



   public static void printArray(int n, int [] D)  {
     
      sop("{");
      for (int j = 1; j <= n-1; j++)
         sop(D[j] + ", ");
      sop(D[n] + "}");
   }

   
   
   public static int [][] data =  
     
     {
       {17, 1, 5, 10},
       
       {17, 3, 6, 10},
       
       {8, 1, 2, 3},
       
       {15, 2, 3, 4},       
       
       {21, 1, 7, 9},
       
       {18, 1, 7, 9},
       
       {93, 10, 15, 35, 57},
       
       {100, 3, 17, 29, 51, 53, 79},
       
       {100, 1, 5, 10, 25, 50},
      
       {100, 1, 2, 3, 4, 5},
       
       {1000, 1, 5, 10, 25, 50, 100},

       {500, 1, 2, 3, 4, 5},
       
       {1000, 1, 2, 4, 8, 16, 32, 64}, 
       
       {1200, 1, 2, 4, 8, 16, 32, 64}, 

       {1200, 1, 2, 4, 8, 16, 32, 64, 128}, 

       {2000, 1, 2, 4, 8, 16, 32, 64, 128, 256}, 
       
       {5000, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 
     };    



   

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


} // end class

