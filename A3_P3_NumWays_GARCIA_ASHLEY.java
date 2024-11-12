public class A3_P3_NumWays_GARCIA_ASHLEY {

   public static String name = "GARCIA_ASHLEY";
   
   
   
   public static long numWays(int n, int k, int [] D)   {
      if (n == 0) {
         return 1;
      }
      if (n < 0 ||  k <= 0) {
         return 0;
      }
      long last = numWays(n - D[k], k, D);
      long notLast = numWays(n, k - 1, D);

      return last + notLast ;
   }


//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************   


	public static void main(String[] args)   {
      
      System.out.println("\n" + name);
      System.out.println("A2_P5, Recursive number of ways to make change.\n");


      for (int j = 0; j < data.length; j++) {
  
         int [] D = data[j];
         int k = D.length - 1;
         int n = D[0];
         
         long ans = numWays(n, k, D);

         System.out.print("Test " + (j+1) + ". ");
         System.out.print("n = " + n + ", k = " + k + ", D is ");
         printArray(k, D);
         System.out.println(".  Number of ways is " + ans + ".\n");
      }

      System.out.println();  
   }



   public static void printArray(int n, int [] D)  {
     
      System.out.print("{");
      for (int j = 1; j <= n-1; j++)
         System.out.print(D[j] + ", ");
      System.out.print(D[n] + "}");
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
       
       {500, 1, 2, 3, 4, 5},
       
       {1000, 1, 5, 10, 25, 50, 100},
       
       {1000, 1, 2, 4, 7, 25, 32, 64}, 
 
     };    


} // end class

