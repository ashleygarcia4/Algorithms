public class A3_P2_AverageRec_GARCIA_ASHLEY {

   public static String name = "GARCIA_ASHLEY";
   

   public static double averageRec(double [] A, int low, int high)   {

       if (low == high) {
           return A[low];
       } else {
           int mid = (low + high) / 2;
           double left = averageRec(A, low, mid);
           double right = averageRec(A, mid + 1, high);
           return (left + right) / 2;
       }
   }



//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************   


	public static void main(String[] args)   { 
      
      System.out.println("\n" + name);
      System.out.println("A3_P2, Recursive Average.\n");

      double [] B = {NA, 15, 10, 30, 25, 80, 70, 160, 90};
      
      test(1, B, 5, 8);
      test(2, B, 3, 6);
      test(3, B, 1, 4);
      test(4, B, 4, 5);
      test(5, B, 1, 8);
      
      
            

      for (int j = 0; j < data.length; j++) {
  
         double [] A = data[j];
         int f = (A.length - 1)/4;
          
         double avg = averageRec(A, f+1, 3*f);

         System.out.print("Test " + (j+6) + ".  ");
         System.out.println("Average is " + avg);
      }

      System.out.println();  
   }


   public static void test(int testNum, double [] A, int low, int high) {
   
      int i;
      sop("Test " + testNum + ".  A[" + low + "] to A[" + high + "]:  ");
      for (i = low; i < high; i++)
         sop(A[i] + ", ");
      sopln(A[high]);
      sopln("Average:  " +  averageRec(A, low, high));
      sopln();
   }
                    
               
               
   public static final int NA = Integer.MIN_VALUE;   
   
   public static double [][] data =  
     
     {
      
      {NA, 15, 10, 30, 25, 80, 70, 160, 90},
      
      {NA, 72, 99, 149, 5, 98, 312, 481, 19},
      
      {NA, -34, 98, -52, 0, 73, 5, 29, 14, -32, 100, 5, 9, 7, 17, 5, 5},

      {NA, 58, 11, 31, 52, 61, 50, 7, 62, 26, 47, 53, 22, 49, 57, 16, 60},
       
      {NA, 43, 116, 71, 23, 4, 121, 101, 30, 42, 1, 31, 108, 6, 21, 45, 62, -100, 49, 6, 17, 50, 76, 52, -84, 30, 50, 22, 50, 98, 119, 75, 59}, 
      
      {NA, 180, 112, 213, 58, 56, 161, 131, 19, 246, 124, 76, 92, 33, 126, 182, 22, 168, 125, 57, 76, 34, 190, 201, 70, 238, 178, 93, 112, 249, 192, 66, 85, 198, 115, 56, 218, 164, 60, 162, 164, 78, 128, 245, 123, 94, 86, 136, 76, 253, 184, 11, 154, 126, 108, 138, 51, 42, 175, 201, 139, 238, 40, 135, 188}, 
      
      {NA, 192, 217, 414, 156, -6303, 505, 461, 286, 324, 181, 21, 181, 56, 437, 57, -234, 84, 151, 259, 115, -152, 338, 105, 386, 117, 80, 282, 329, 496, 360, 12, 336, 126, 495, 304, 409, 77, 47, 400, 78, 425, 297, 382, 68, 128, 473, 244, 230, 158, 278, 442, 205, 252, 434, 262, 388, 8, 193, 326, 46, 359, 229, 206, 80, 438, 354, 214, 132, 312, 417, 109, 340, 360, 216, 156, 354, 506, 291, 350, 66, 391, 343, 447, 452, 132, 259, 295, 257, 157, 301, 342, 349, 336, 55, 447, 59, 83, 510, 81, 326, 395, 21, 453, 37, 445, 222, 238, 16, 488, 483, 119, 264, 378, 349, 266, 119, 56, 390, 452, 293, 445, 411, 383, 300, 264, 28, 23270, 506}, 
      
      {NA, 818, 261, 606, 318, 5496, 824, 546, 9858, 690, 618, 13323, 919, 189, 465, 136, 253, 668, 991, 681, 433, 510, 53, 537, 67, 855, 396, 904, 764, 487, 656, 220, 64, 182, 950, 490, 15, 924, 299, 778, 590, 693, 516, 951, 61, 493, 452, 120, 776, 643, 53, 194, 269, 390, 557, 221, 685, 927, 941, 498, 197, 211, 397, 682, 741, 20, 73, 367, 888, 13, 834, 886, 610, 181, 1023, 361, 828, 632, 1009, 512, 769, 701, 1020, 68, 137, 302, 817, 595, 142, 856, 862, 476, 843, 958, 537, 724, 223, 835, 779, 557, 980, 899, 267, 211, 439, 301, 986, 431, 137, 934, 305, 180, 402, 94, 990, 920, 557, 420, 130, 207, 656, 748, 408, 398, 116, 149, 369, 738, 435, 726, 951, 847, 1007, 128, 523, 583, 214, 104, 566, 919, 90, 687, 217, 272, 792, 416, 473, 426, 1020, 79, 201, 965, 495, 652, 357, 242, 271, 386, 20, 677, 136, 314, 105, 398, 491, 174, 342, 66, 1019, 313, 514, 472, 869, 1010, 282, 928, 128, 694, 715, 439, 694, 367, 347, 38, 733, 962, 1002, 241, 309, 665, 10, 875, 320, 934, 579, 430, 95, 703, 262, 44, 5, 1004, 984, 12, 1000, 410, 956, 701, 293, 349, 672, 755, 475, 47, 98, 468, 121, 59, 906, 276, 621, 1022, 157, 710, 924, 707, 428, 965, 444, 822, 911, 539, 485, 869, 370, 836, 361, 958, 326, 223, 943, 279, 299, 507, 751, 695, 487, 38, 60, 960, 56, 389, 407, 632, 360, 741, 610}, 
       
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

