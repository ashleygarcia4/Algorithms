public class A5_P10_GreedyPath_GARCIA_ASHLEY {

   public static String name = "GARCIA_ASHLEY";
   
      
   public static double greedyPathCost(int n, double [][] W, int s, int d) {
      int[] visited = new int[n];
      int[] path = new int[]{s};
      int pathLength = 1;
      double cost = 0.0;

      while (path[pathLength - 1] != d) {
         int current_vertex = path[pathLength - 1];
         double min_weight = INF;
         int next_vertex = -1;

         for (int i = 1; i <= n; i++) {
            if (visited[i - 1] == 0 && !Double.isNaN(W[current_vertex][i]) && W[current_vertex][i] < min_weight) {
               min_weight = W[current_vertex][i];
               next_vertex = i;
            }
         }

         if (next_vertex == -1) {
            return -1.0;
         }

         visited[next_vertex - 1] = 1;

         // Resize the path array
         int[] new_path = new int[pathLength + 1];
         System.arraycopy(path, 0, new_path, 0, pathLength);
         new_path[pathLength] = next_vertex;
         path = new_path;
         pathLength++;
         cost += min_weight;
      }

      return cost;
   }

//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE,  
//
//*********************************************************************   

	public static void main(String[] args)   {
      
      System.out.println("\n" + name);
      System.out.println("A4_P10, Greedy Path Cost.\n");
      
      for (int t = 0; t < data.length; t++) {
      
         double [][] W = data[t];
         int n = W.length - 1;
         double [][] D = new double[n+1][n+1];
         int [][] P = new int[n+1][n+1];
         double greedyCost;
         
         Floyd(n, W, D, P);

         System.out.println("\nGraph " + (t+1) + ":  n = " + n + ": \n");
        
         for (int i = 1; i <= n; i++)  {
            for (int j = 1; j <= n; j++)  {

               if (i != j) {
                  greedyCost = greedyPathCost(n, W, i, j);
                  sop("v_" + i + " to v_" + j + ":  ");
                  sop("Greedy Path Cost:  " + greedyCost);
                  sopln(".   Optimum Cost:  " + D[i][j] + ".");
               }
            }
            System.out.println();
         }
         
         sopln("===============================================================================");      
      }        
   }


   public static final double INF = Double.POSITIVE_INFINITY;
   public static final double NA = Double.NEGATIVE_INFINITY;

   public static double [][][] data =  {
      {
         {},
         {NA, 0,     10,   INF,     10,     50},
         {NA, 90,      0,     30,     20,   INF},
         {NA, INF,   INF,      0,     40,   INF},
         {NA, INF,   INF,     20,      0,     30},
         {NA, 30,   INF,   INF,     90,      0}
      },
       
      {
         {},
         {NA, 0,    220,     70,     40,     50,  INF,     80,    160,  INF,},
         {NA, 100,      0,  INF,     80,     70,     90,  INF,     80,    100},
         {NA, 70,  INF,      0,    110,  INF,     80,  INF,     70,  INF,},
         {NA, 40,     80,    110,      0,  INF,    100,     60,  INF,    150},
         {NA, 30,     20,     60,     80,      0,     10,     50,    120,     70},
         {NA, INF,     90,     80,     30,    150,      0,    130,  INF,    190},
         {NA, 80,  INF,  INF,     60,  INF,    130,      0,     20,    150},
         {NA, 160,     80,     70,  INF,    120,  INF,     20,      0,     60},
         {NA, INF,  INF,  INF,    150,  INF,    190,    150,     60,      0}
      },
      
      {
         {},
         {NA, 0,   INF,   INF,    200,     40,   INF,   INF,    140,   INF,},
         {NA, INF,      0,    100,   INF,   INF,   INF,   INF,     40,   INF,},
         {NA, INF,   INF,      0,   INF,   INF,   INF,     90,   INF,   INF,},
         {NA, INF,    180,   INF,      0,   INF,   INF,     50,   INF,   INF,},
         {NA, INF,   INF,     50,   INF,      0,   INF,   INF,   INF,     20},
         {NA, 140,   INF,   INF,   INF,   INF,      0,   INF,    200,   INF,},
         {NA, 30,   INF,   INF,    450,   INF,   INF,      0,   INF,   INF,},
         {NA, INF,    300,   INF,    150,   INF,    670,   INF,      0,   INF,},
         {NA, 170,   5550,     90,   INF,     50,   INF,     90,   INF,      0,}     
      },

   }; 
   

  
   public static void Floyd(int n, double [][] W, double [][] D, int [][] P) {

      int k, i, j, numUpdates = 0;

      for (i = 1; i <= n; i++)
         for (j = 1; j <= n; j++) {
            D[i][j] = W[i][j];
            P[i][j] = 0;
          }
      
      for (k = 1; k <= n; k++)  
         for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)  {
               double temp = D[i][k] + D[k][j];
               if (temp < D[i][j]) {
                  D[i][j] = temp;
                  P[i][j] = k;
                  numUpdates++;
               }
            } 
                         
   }  // end Floyd
   
   
   public static void printArray(int n, double [][] A) {
      int i, j;
      System.out.println();
      System.out.print("    ");
      
      for (i = 1; i <= n; i++)
         System.out.printf("%7d", i);
      System.out.println("\n");

      for (i = 1; i <= n; i++) {
         System.out.printf("%4d", i);
         for (j = 1; j <= n; j++)
            if (A[i][j] == INF)
               System.out.print("    INF");
            else
               System.out.printf("%7.0f", A[i][j]);

         System.out.println();
      }
      
      System.out.println();
   }
   
   
               
   public static void printArray(int n, int [][] A) {
      int i, j;
      System.out.println();
      System.out.print("    ");
      
      for (i = 1; i <= n; i++)
         System.out.printf("%7d", i);
      System.out.println("\n");

      for (i = 1; i <= n; i++) {
         System.out.printf("%4d", i);
         for (j = 1; j <= n; j++)
            System.out.printf("%7d", A[i][j]);
         System.out.println();
      }
      
      System.out.println();
   }

    
   public static void printArray(int n, int [] A)  {
   
      for (int j = 0; j < n; j++)
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

