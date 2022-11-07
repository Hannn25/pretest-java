public class Array {
    public static void main(String[] args) {
        int[] bil1 = {2,3,4,5};
        int[] bil2 = {1,3,5,7};
        for (int i : bil1) {
            for (int j : bil2) {
                if (i == j) {
                    System.out.print(i +  " "); 
         }
             } 
       }
     }
}