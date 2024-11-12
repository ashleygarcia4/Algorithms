public class A5_P456_Change_GARCIA_ASHLEY  {

   public static String name = "GARCIA_ASHLEY";

   public static boolean testGreedy = true;
   public static boolean testSmarter = false;
   public static boolean testBruteForce = false;


//////////////////////////////////////////////////////////////////////
// Problem 4 -- Greedy Coin Change Algorithm

   public static int [] greedyAlgorithm(int n, int k, int [] D)  {

      int[] ans = new int[k + 1];
      int totalCoins = 0;

      for (int i = k; i >= 1; i--) {
         if (n >= D[i]) {
            int numCoins = n / D[i];
            ans[i] = numCoins;
            totalCoins += numCoins * D[i];
            n -= numCoins * D[i];
         }
      }

      // Check if the totalCoins is equal to the original n
      ans[0] = totalCoins == n ? totalCoins : -1;

      return ans;
   }

//////////////////////////////////////////////////////////////////////
// Problem 5 -- Smarter Greedy Algorithm

   public static int [] smarterGreedyAlgorithm(int n, int k, int [] D) {
      if (k == 0) {
         int[] baseResult = new int[D.length];
         return baseResult;
      }

      int[] bestResult = smarterGreedyAlgorithm(n, k, D);
      int[] tempResult = new int[k + 1];

      for (int i = 1; i <= k; i++) {
         int[] tempD = new int[i + 1];
         for (int j = 0; j <= i; j++) {
            tempD[j] = D[j];
         }
         tempResult = smarterGreedyAlgorithm(n, i, tempD);
         if (tempResult[0] < bestResult[0] || bestResult[0] == -1) {
            for (int j = 0; j <= k; j++) {
               bestResult[j] = tempResult[j];
            }
         }
      }

      return bestResult;
   }

//////////////////////////////////////////////////////////////////////
// Problem 6 -- Brute Force Algorithm for Optimal method
//
// Assumes D[1] = 1 and k = 5
// 

   public static int [] bruteForceOptimal(int n, int k, int [] D) {


      int[] ans = new int[n];
      int[] coinsUsed = new int[n];
      int[] minCoins = new int[n + 1];
      int[] lastCoin = new int[n + 1];

      minCoins[0] = 0;
      for (int i = 1; i <= n; i++)
      {
         minCoins[i] = Integer.MAX_VALUE;
         for (int j = 0; j < 5; j++)
         {
            if (i >= D[j] && minCoins[i - D[j]] + 1 < minCoins[i])
            {
               minCoins[i] = minCoins[i - D[j]] + 1;
               lastCoin[i] = j;
            }
         }
      }
      if (minCoins[n] > k)
      {
         ans[0] = -1;
         return ans;
      } else
      {
         ans[0] = minCoins[n];
         int i = n;
         while (i > 0)
         {
            int coinIndex = lastCoin[i];
            coinsUsed[coinIndex]++;
            i -= D[coinIndex];
         }
         for (int j = 1; j < 6; j++)
         {
            ans[j] = coinsUsed[j - 1];
         }
         return ans;
      }
   }


//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE  
//
//*********************************************************************   

	public static void main(String[] args)   {

      int [] D;
      int [] ans;
      int n, k, t, i;
      long start, end;
            
      sopln("\n" + name);
      sopln("A5_P456, Coin Changing Algorithms.");
      sopln();

      for (t = 0; t < data.length/2; t++)  {

         n = data[2*t][0];
         D = data[2*t + 1];
         k = D.length - 1;
         
         sopln("\n==================================================================");   
         sop("Test " + (t+1)+ ":  n = " + n + ", k = " + k + ", with denominations ");
         printDenoms(k, D);   
       
         if (testGreedy) {
            ans = greedyAlgorithm(n, k, D);
            sop("The greedy coin changing algorithm uses ");
            sopln(ans[0] + " coins: \n");
            for (i = 1; i <= k; i++)
               sopln(D[i] + "-cent coin(s):  " + ans[i]);     
            sopln();         
         }
         
         if (testSmarter) {
            ans = smarterGreedyAlgorithm(n, k, D);
            sop("The smarter greedy coin changing algorithm uses ");
            sopln(ans[0] + " coins: \n");
            for (i = 1; i <= k; i++)
               sopln(D[i] + "-cent coin(s):  " + ans[i]);     
            sopln();
         }
            
         if (testBruteForce) {
            sop("The brute-force optimal coin changing algorithm uses ");
            
            start = System.currentTimeMillis();
            ans = bruteForceOptimal(n, k, D);
            end = System.currentTimeMillis();
            
            sopln(ans[0] + " coins: \n");
            for (i = 1; i <= k; i++)
               sopln(D[i] + "-cent coin(s):  " + ans[i]);     
            sopln("\n(Brute force took " + (end - start) + " milliseconds.)");
         }
      }  // end for loop
   }  // end main 
                  
//*********************************************************************   

   public static final int NA = Integer.MIN_VALUE;
 
   public static int [][] data = {
   
      {68},
      {NA, 1, 5, 10, 12, 40},
       
      {90},
      {NA, 1, 6, 15, 40, 70},      
      
      {91},
      {NA, 1, 7, 15, 40, 70},  

      {105},
      {NA, 1, 9, 17, 30, 40},

      {148},
      {NA, 1, 8, 13, 19, 30},       

      {311},
      {NA, 1, 7, 19, 30, 42},
      
      {1001},
      {NA, 1, 7, 18, 27, 41},
      
      {3928},
      {NA, 1, 13, 31, 47, 85},
      
   };
         
       
   public static void printDenoms(int k, int [] D)  {
   
      for (int j = 1; j < k; j++)
         sop(D[j] + "c, ");
      sopln(D[k] + "c.");
         
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


} // end class

