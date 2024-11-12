public class A1_P4_SumOfThree_GARCIA_ASHLEY {

   public static String name = "GARCIA_ASHLEY";
   

   public static int [] sumOfThree(int n, int [] A, int g)   {

      for (int i = 1; i <= n - 2; i++) {
         for (int j = i + 1; j <= n - 1; j++) {
            for (int k = j + 1; k <= n; k++) {

               int num1 = A[i];
               int num2 = A[j];
               int num3 = A[k];

               if (num1 + num2 + num3 == g)
                  return new int[]{k, i, j};

            }
         }
      }
      // No valid combination found
      return new int[]{-1, -1, -1};
   }

//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************   


	public static void main(String[] args)   {
      
      sopln("\n" + name);
      sopln("A1_P4_SumOfThree.");
      sopln("Find three array elements with desired sum.\n\n");
      
      int [] answer;
      

      for (int j = 0; j < data.length/2; j++) {
  

         int g = data[2*j][0];
         int [] A = data[2*j + 1];
         int n = A.length-1;
          
         sop("Test " + (j+1) + ",  ");
         sop("n = " + n + ", g = " + g + ":  ");
         
         answer = sumOfThree(n, A, g);
         
         if (answer[0] == -1)  
            sopln("No three elements in A sum to " + g + ".\n");
        

         else
            sopln("A[" + answer[0] + "] = " + A[answer[0]] + ", " +
                               "A[" + answer[1] + "] = " + A[answer[1]] + ", and " + 
                               "A[" + answer[2] + "] = " + A[answer[2]] + " sum to " + g + ".\n");
                               
 
   
      }
   }


//******************************************************
   
   public static final int NA = Integer.MIN_VALUE;
   
   public static int [][] data =  
   {
      {24}, 
      {NA, 1, 3, 6, 10, 15},
      
      {220},
      {NA, 10, 50, 60, 150},
      
      {67}, 
      {NA, 5, 10, 15, 20, 25, 30}, 
      
      {96},
      {NA, 5, 8, 16, 22, 37, 44, 51, 82},
      
      {113},
      {NA, 5, 8, 16, 22, 37, 44, 51, 82},
      
      {229},
      {NA, 13, 17, 35, 51, 68, 79, 94, 102, 106, 115}, 
      
      {475},
      {NA, 12, 25, 43, 59, 70, 85, 89, 101, 112, 124, 137, 155, 167, 174, 185, 203, 217, 225, 235, 241}, 

      {890},
      {NA, 18, 25, 42, 51, 63, 81, 89, 97, 108, 116, 121, 131, 147, 154, 172, 176, 186, 191, 203, 208, 213, 230, 234, 252, 264, 277, 284, 290, 308}, 

      {1128},
      {NA, 17, 23, 39, 46, 61, 77, 92, 102, 110, 128, 135, 153, 166, 173, 186, 196, 212, 220, 234, 244, 258, 276, 282, 295, 313, 324, 330, 338, 348, 353, 362, 371, 386, 401, 405, 422, 426, 441, 459, 470}, 


      {2130},
      {213, 246, 288, 318, 345, 350, 394, 398, 415, 426, 471, 489,  521, 530, 547, 562, 578, 619, 699, 730, 789, 803, 823, 828, 857, 874, 940, 946, 973, 986, 992, 1029}, 

      {2144},
      {213, 246, 288, 318, 345, 350, 394, 398, 415, 426, 471, 489,  521, 530, 547, 562, 578, 619, 699, 730, 789, 803, 823, 828, 857, 874, 940, 946, 973, 986, 992, 1029}, 

   };    
   



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

