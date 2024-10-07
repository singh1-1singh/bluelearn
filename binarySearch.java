import java.util.*;

class binarySearch {

    public static boolean targetCheck(int size, int[][] array, int target) {
        for(int i=0; i<size; i++) {
            if(array[i][0] < target || array[i][0] == target) { 
                int mid = size/2;       // middile element in ith row
                // search in right side of the array
                if(array[i][mid] < target || array[i][mid] == target) { 
                    for(int j=mid; j<size; j++) {
                        if (array[i][j] == target)
                            return true;
                    }
                        
                }
                //search in left side of the array
                else {
                    for(int j=0; j<mid; j++) {
                        if (array[i][j] == target)
                            return true;
                    
                    }
                }
                
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        boolean result = targetCheck(size, array, target);
        System.out.println(result);

    }
}
