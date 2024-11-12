public class A6_P1_nQueensCount { 

   public static String name = "LASTNAME_FIRSTNAME";
   
   
   public static int nQueensCount(int n)  {
   
      int [] col = new int[n+1]; 
      return nQueensCountRec(0, col, n);                                                        
   }
   

   public static int nQueensCountRec(int i, int [] col, int n) {
   
      if (nQueensPromising(i, col))  {
      
         if (i == n)  {
            return 1;
         }
         else  {
         
            int sum = 0;
            for (int g = 1; g <= n; g++)   {
            
               col[i+1] = g;
               sum += nQueensCountRec(i+1, col, n);
            }
            return sum;
            
         }  // end "else"
      } // end "if (nQueensPromising(i, col))"
      return 0;
 
   } // end "nQueensRec"
    
   
      
   public static boolean nQueensPromising(int i, int [] col)  {
   
      for (int j = 1; j < i; j++)
      {
         if (col[i] == col[j])
            return false;
         else if (i - col[i] == j - col[j])
            return false;
         else if (i + col[i] == j + col[j])
            return false;
      }
  
      return true;
   }
       

//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************   


   public static void main(String [] args)  {
   
      sopln("\n" + name);
      sopln("A6_P1 nQueensCount.\n");
      
      for (int n = 1; n <= 14; n++) {
         sop("Number of solutions to the " + n + "-Queens problem:  ");
         sopln(nQueensCount(n));
         sopln();
      }
   }
   

   public static void printArray(int n, int [] A) {
     
      for (int i = 1; i <= n; i++) 
         sop(A[i] + " ");
      sopln();
   }
      


   public static void printColArray(int n, int [] A) {
      
      int i;
      sop("    ");
      for (i = 1; i <= n; i++)
         sop(i + " ");
      
      sop("\ncol ");
      for (i = 1; i <= n; i++)
         sop(A[i] + " ");
      sopln();
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
   


