public class A6_P7_Knapsack_Rec  {  

   public static String name = "LASTNAME_FIRSTNAME"; 
 
   
// After the following method is called, best[0] gives the opimtal profit for the instance of the 
// 0-1 knapsack problem given n, p, w, and capacity. For the other cells, best[i] = 1.0 if
// item i should be taken, and best[i] = 0.0 if item i should not be taken.
// Also, after this method is called, the global variable "numNodesVisited" will contain
// the number of nodes visited to solve this instance. 
// This method will call your "knapsack_rec" method below.

   public static double [] knapsack (int n, double [] p, double [] w, double capacity)
   {
   	int [] include = new int[n+1];					// indexed 1 to n, 0-1 array to store possible solutions (subsets).		
   	double [] best = new double[n+1];				// after knapsackRec, has optimal solution and maxProfit in best[0].
   	knapsackRec(0, 0, 0, n, p, w, capacity, include, best);
   	return best; 
   } 


   public static void knapsackRec (
   
      int i,				// i = # of items considered (taken or left) so far.
            
		double profit,	   // the profit we have so far, after considering first i items.
		double weight,	   // the weight we have so far, after considering first i items.

      int n,			   // the number of items.
		double [] p,		// array indexed from 1 to n, where  p[i]  is the profit obtained by taking item i.
		double [] w,		// array indexed from 1 to n, where  w[i]  is the weight obtained by taking item i.
								// (arrays p and w sorted in decreasing order by p[i]/w[i]).
		double capacity,	// capacity of the knapsack.
		int [] include,	// indexed from 1 to n, used to generate all 0-1 arrays of length n (subsets).
		double [] best)	// indexed from 0 to n, stores optimal solution and profit.
   {


      
      if (weight <= capacity && profit > best[0])  {
      
         best[0] = profit;
         for (int t = 1; t <= i; t++)
            best[t] = include[t];
         for (int t = i+1; t <= n; t++)
            best[t] = 0;

         if (weight < capacity && bound(i, profit, weight, n, p, w, capacity) > best[0])  {

            include[i+1] = 1;
            knapsackRec(i+1, profit + p[
      }i+1], weight + w[i+1], n, p, w, capacity, include, best);
          
         include[i+1] = 0;
         knapsackRec(i+1, profit, weight, n, p, w, capacity, include, best);
      }

   } // end knapsack_rec



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
      System.out.println("A6_P7, Knapsack_Recursive.\n");

      sopln("==================================================================");      


      for (int i = 0; i < data.length/3; i++)  {
//      for (int i = 0; i < 1; i++)  {
      
         double capacity = data[3*i][0];
         double [] p = data[3*i + 1];
         double [] w = data[3*i + 2];
         int n = p.length - 1;

         double [] best = new double[n+1];
         
         double maxProfit = 0;
         
         sopln("Test # " + (i+1) + ", n = " + n + ", and capacity = " + capacity + ":\n");
         sop("Item #:  ");
         printIndices(n);
         sop("Profits: ");
         printArray(n, p);
         sop("Weights: ");
         printArray(n, w);

         best = knapsack(n, p, w, capacity);

         sopln();                          
         System.out.printf("The maximum profit is  $%.2f:", best[0]);
         sopln();
         sop("Take item(s): ");
         printItemNums(n, best);
         sopln("\n==================================================================\n");      
         
      } // test loop i
   }  // end test_method_knapsackRec


   public static void printItemNums(int n, double [] best)  {
      
      for (int i = 1; i <= n; i++)
         if (best[i] == 1)
            sop(" " + i);
   }

   public static void printIndices(int n) {

      for (int i = 1; i <= n; i++) 
         System.out.printf("%8d", i);
      sopln();
 
        sop("          ");
      for (int i = 1; i <= n; i++) 
         System.out.print("--------");
      sopln();

   }
   
      

   public static double [][] data = {
   
      {16}, {-1, 40, 30, 50, 10},      // capacity, array p
            {-1, 2, 5, 10, 5},         //           array w
      
      {11}, {-1, 20, 30, 35, 12, 3}, 
            {-1, 2, 5, 7, 3, 1},
      
      {13}, {-1, 20, 30, 35, 12, 3}, 
            {-1, 2, 5, 7, 3, 1},
            
      {25}, {-1, 18, 30, 40, 21, 24}, 
            {0, 3, 6, 10, 7, 12},
      
      {24}, {-1, 100, 81, 64, 49, 39}, 
            {-1, 10, 9, 8, 7, 6.5},
      
      {405}, {-1, 320, 350, 900, 700, 650, 420, 504, 600, 150, 120}, 
             {-1, 85, 95, 250, 200, 195, 140, 170, 230, 60, 50},
             
      {500}, {-1, 320, 350, 900, 700, 650, 420, 504, 600, 150, 120}, 
             {-1, 85, 95, 250, 200, 195, 140, 170, 230, 60, 50},             
             
      {13}, {-1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 13},
            {-1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 13},       
            
   
   };
             
    
  
  
  
  
      
      
      
          
           

   public static void printArray(int n, double [] A) {
   
      int i;

      for (i = 1; i <= n; i++) 
         System.out.printf("%8.1f", A[i]);
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

