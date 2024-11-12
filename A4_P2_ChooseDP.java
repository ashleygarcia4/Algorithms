public class A4_P2_ChooseDP { 

   public static String name = "LASTNAME_FIRSTNAME";
   
   
   public static long chooseDP(int n, int k)   { 
   
      long [][] A = new long[n+1][k+1];
      int i, j;
      
      for (i = 0; i <= n; i++)
         A[i][0] = 1;

      for (i = 1; i <= k; i++)
            A[i][i] = 1;

      for (i = 2; i <= n; i++)
         for (j = 1; j <= Math.min(i-1, k); j++)  
            A[i][j] = A[i-1][j] + A[i-1][j-1];
      
      return A[n][k];
   }
   

 
//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************   


	public static void main(String[] args)   {
      
      sopln("\n" + name);
      sopln("A4_P2, Combinations, Dynamic Programming.");
      sopln(); 
      int n, k;
      
      for (n = 0; n <= 10; n++)  {
         for (k = 0; k <= n; k++)  
            sop(chooseDP(n, k) + "  ");
         sopln();
      }
         
      sopln("\n");
      sopln("choose(50, 10) = " + chooseDP(50, 10));
      sopln("choose(300, 10) = " + chooseDP(300, 10));
      sopln();
      
      sopln("Max long:");
      sopln("                   9223372036854775807\n");
      sopln("choose(100, 19) =  " + chooseDP(100, 19));
      sopln("choose(100, 20) =  " + chooseDP(100, 20));
      sopln("choose(100, 21) = " + chooseDP(100, 21));
      sopln();
      
      
      sopln("                  7500433758922130000000000000000");
      sopln("choose(300, 20) = " + chooseDP(300, 20));
      
      
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

