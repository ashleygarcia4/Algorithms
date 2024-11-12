public class A2_P7_MostFrequent1_GARCIA_ASHLEY {

   public static String name = "GARCIA_ASHLEY";
   
   
   // What is the running time of your method mostFrequent1?
   // 
   // Answer:   Theta(n^2)

   public static int mostFrequent1(int n, int [] A) {
      int mostFrequent = 0;
      int maxFrequency = 0;

      for (int i = 1; i <= n; i++) {
         int num = A[i];
         int count = 1;

         for (int j = i + 1; j <= n; j++) {
            if (A[j] == num) {
               count++;
            }
         }

         if (count > maxFrequency) {
            maxFrequency = count;
            mostFrequent = num;
         }
      }

      return mostFrequent;
   }

            
//

//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************   


	public static void main(String[] args)   {
      
      System.out.println("\n" + name);
      System.out.println("A2_P7_MostFrequnt1.");
      System.out.println("Without declaring arrays,determine most frequent array element.");
      
      int [] answer;
      

      for (int j = 0; j < data.length; j++) {
  
         int [] A = data[j];
         int n = A.length-1;
          
         sopln("\n===============");
         System.out.print("Test " + (j+1) + ".  Array:  ");
         printArray(n, A);
         sopln();
         
         int ans = mostFrequent1(n, A);
         
         sopln(ans + " is the most frequent value in this array.");
         

      }
   }


//******************************************************
   
   public static final int NA = Integer.MIN_VALUE;
   
   public static int [][] data =  
   {


       {NA, 2, 1, 4, 2},
 
       {NA, 3, 8, 7, 3, 7, 5, 2, 7},

       {NA, 9, 1, 4, 1, 4, 8, 4, 7, 10, 3},
       
       {NA, 15, 9, 4, 7, 6, 8, 3, 14, 1, 12, 11, 10, 8, 2, 5},
 
       {NA, 14, 9, 12, 11, 5, 8, 2, 4, 6, 15, 7, 9, 11, 13, 1},
  
       {NA, 4, 10, 8, 13, 2, 18, 15, 12, 1, 20, 14, 11, 6, 9, 10, 17, 16, 19, 7, 5},

       {NA, 3, 4, 16, 6, 17, 10, 13, 15, 20, 9, 7, 13, 19, 8, 5, 18, 12, 17, 13, 6, 11},

       {NA, 4, 3, 2, 8, 11, 23, 18, 24, 17, 24, 22, 15, 8, 12, 21, 19, 5, 9, 16, 24, 20, 30, 28, 10, 7, 24, 4, 13, 8, 29},
 
       {NA, 63, 46, 12, 57, 21, 19, 58, 74, 32, 11, 51, 89, 61, 31, 98, 7, 37, 35, 85, 10, 100, 9, 73, 71, 17, 2, 50, 18, 3, 86, 92, 52, 47, 38, 45, 26, 70, 44, 88, 81, 49, 39, 80, 67, 33, 6, 65, 40, 4, 82, 69, 60, 8, 78, 24, 15, 36, 25, 93, 28, 64, 23, 91, 54, 53, 59, 62, 90, 94, 20, 95, 56, 30, 13, 84, 16, 1, 79, 97, 22, 77, 37, 27, 99, 87, 48, 14, 72, 5, 66, 75, 76, 43, 68, 42, 83, 41, 29, 55, 96},
 

   };    
   

   public static void printArray(int n, int [] A)  {
   
      sop("[");
      for (int j = 1; j < n; j++)
         System.out.print(A[j] + ", ");
      sop(A[n] + "]\n");
   }
   
   public static void sop(int a)
   {
      System.out.print(a);
   }
   
   public static void sopln(int a)
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

