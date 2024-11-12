public class A6_P6_Knapsack_Bound  {  

   public static String name = "LASTNAME_FIRSTNAME"; 


// method bound:
// Given that the first i of the n items have been considered, and
//  the current profit and weight are "profit" and "weight", the arrays
//  of profits and weights are p and w, and the capacity is "capacity",
//  use the greedy fractional knapsack algorithm starting with item i+1
//  to find an upper bound given the current situation.

   public static double bound(int i,
                              double profit,
                              double weight,
                              int n,
                              double [] p,
                              double [] w,
                              double capacity)  {

      int j;
      double boundSoFar = profit;
      double weightSoFar = weight;

      j = i+1;
      while (j <= n  &&  weight + w[j] <= capacity)  {
         
         weight += w[j];
         boundSoFar += p[j];
         j++;
      }
      
      if (j <= n)
         boundSoFar += (capacity - weight) * p[j]/w[j];
      
      return boundSoFar;
      
   } // end bound
   
   

 


//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE
//
//*********************************************************************   

	public static void main(String[] args)   {

      System.out.println("\n" + name);
      System.out.println("A6_P6, Knapsack bound method.\n");
      
      int i, n = 4;
      double profit, weight, capacity, upperbound;
      double [] p = {-1, 40, 30, 50, 10};
      double [] w = {-1, 2, 5, 10, 5};
            
      
      sopln("==================================================================");      
      sopln("The header for the 'bound' method is: \n");
      sopln("double bound(int i, double profit, double weight, int n, double [] p, double [] w, double capacity)\n");;

      sop("\nItem #:  ");
      printIndices(n);
      sop("profits: ");
      printArray(n, p);
      sop("weights: ");
      printArray(n, w);
      sopln("\n");

      
      i = 0; profit = 0; weight = 0; capacity = 23;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);
      
      i = 0; profit = 0; weight = 0; capacity = 19;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

      i = 0; profit = 0; weight = 0; capacity = 17;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

      i = 0; profit = 0; weight = 0; capacity = 15;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

      i = 0; profit = 0; weight = 0; capacity = 6;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

      i = 1; profit = 35; weight = 9; capacity = 23;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);
   
      i = 1; profit = 0; weight = 0; capacity = 20;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

      i = 1; profit = 10; weight = 14; capacity = 20;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);
    
      i = 1; profit = 50; weight = 7; capacity = 25;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

      i = 2; profit = 60; weight = 10; capacity = 18;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);
   
      i = 2; profit = 100; weight = 14; capacity = 23;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);
    
      i = 3; profit = 175; weight = 23; capacity = 23;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);
    
      i = 3; profit = 100; weight = 14; capacity = 18;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

      i = 3; profit = 115; weight = 10; capacity = 13;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);
   
      i = 4; profit = 84; weight = 16; capacity = 23;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

      i = 4; profit = 0; weight = 12; capacity = 20;
      upperbound = bound(i, profit, weight, n, p, w, capacity);
      sopln("bound(" + i + ", " + profit + ", " + weight + ", " + n + ", p, w, " + capacity + ") = " + upperbound);

    
   }  // end main
             
    
  
  
  
   public static void printItemNums(int n, double [] best)  {
      
      for (int i = 1; i <= n; i++)
         if (best[i] == 1)
            sop(" " + i);
   }

   public static void printIndices(int n) {

      for (int i = 1; i <= n; i++) 
         System.out.printf("%8d", i);
      sopln();
 
  //    sop("---------");
        sop("          ");
      for (int i = 1; i <= n; i++) 
         System.out.print("--------");
      sopln();

   }
   
      
  
      
      
      
          
           

   public static void printArray(int n, double [] A) {
   
      int i;

      for (i = 1; i <= n; i++) 
         System.out.printf("%8.1f", A[i]);
      sopln();
   }



   public static void printArray2(int n, int [] A)  {
   
      for (int j = 1; j <= n; j++)
         System.out.print(j + " ");
      System.out.println();

      for (int j = 1; j <= n; j++)
         System.out.print(A[j] + " ");
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

