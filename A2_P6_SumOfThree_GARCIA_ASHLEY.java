public class A2_P6_SumOfThree_GARCIA_ASHLEY {

   public static String name = "GARCIA_ASHLEY";
   

   public static int [] sumOfThree(int n, int [] A, int g) {


      for (int i = 1; i <= n - 2; i++)
      {
         int j = i + 1;
         int k = n;

         while (j < k)
         {
            int sum = A[i] + A[j] + A[k];

            if (sum == g) {
               return new int[]{i, j, k};
            } else if (sum < g) {
               j++;
            } else {
               k--;
            }
         }
      }

      return new int[]{-1}; //if sum does not equal g , return -1
   }











//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************   


	public static void main(String[] args)   {
      
      sopln("\n" + name);
      sopln("A2_P6_SumOfThree.");
      sopln("In O(n^2) time, determine if three array elements have the desired sum.\n\n");
      
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
      
      {67}, 
      {NA, 5, 10, 15, 20, 25, 30}, 
      
      {96},
      {NA, 5, 8, 16, 22, 37, 44, 51, 82},
      
      {101},
      {NA, 5, 8, 16, 22, 37, 44, 51, 82},
      
      {229},
      {NA, 13, 17, 35, 51, 68, 79, 94, 102, 106, 115}, 
      
      {401},
      {NA, 12, 25, 43, 59, 70, 85, 89, 101, 112, 124, 137, 155, 167, 174, 185, 203, 217, 225, 235, 241}, 

      {890},
      {NA, 18, 25, 42, 51, 63, 81, 89, 97, 108, 116, 121, 131, 147, 154, 172, 176, 186, 191, 203, 208, 213, 230, 234, 252, 264, 277, 284, 290, 308, 315}, 

      {1000},
      {NA, 17, 23, 39, 46, 61, 77, 92, 102, 110, 128, 135, 153, 166, 173, 186, 196, 212, 220, 234, 244, 258, 276, 282, 295, 313, 324, 330, 338, 348, 353, 362, 371, 386, 401, 405, 422, 426, 441, 459, 470}, 

      {1102},
      {NA, 14, 18, 26, 37, 44, 57, 68, 85, 89, 107, 114, 128, 142, 153, 162, 178, 194, 212, 216, 231, 245, 262, 267, 271, 287, 296, 312, 325, 336, 353, 370, 385, 397, 405, 414, 431, 440, 446, 461, 467, 480, 487, 502, 506, 512, 528, 535, 550, 563, 575}, 

      {2504},
      {NA, 14, 24, 29, 33, 38, 50, 61, 75, 82, 98, 111, 124, 138, 156, 174, 188, 196, 204, 208, 213, 224, 232, 238, 246, 264, 269, 273, 288, 306, 318, 324, 334, 345, 350, 358, 366, 378, 382, 394, 398, 415, 426, 434, 447, 457, 471, 489, 504, 509, 515, 521, 530, 547, 562, 578, 589, 598, 605, 619, 628, 643, 653, 660, 675, 681, 689, 699, 717, 725, 730, 736, 747, 755, 765, 777, 789, 803, 809, 823, 828, 837, 843, 857, 874, 887, 898, 909, 923, 940, 946, 952, 957, 966, 973, 986, 992, 996, 1003, 1017, 1029}, 

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

