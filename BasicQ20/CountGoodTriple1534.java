package BasicQ20;

public class CountGoodTriple1534 {
    public static void main(String[] args) {
        CountGoodTriple countGoodTriple = new CountGoodTriple();
        int[] arr = {3,0,1,1,9,7};
        System.out.println(countGoodTriple.countGoodTriplets(arr, 7, 2, 3));
    }
}

class CountGoodTriple {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;

        // i = 0 , i < 4 (0, 1, 2)
        for (int i = 0; i < arr.length - 2; i++) {
            // j = 1 , j < 5 (1, 2, 3)
            for (int j = i + 1; j < arr.length - 1; j++) {
                // arr[0] - arr[1] = 3-0 = 3 <=7
                // arr[1] - arr[2] = 0-1 = 1 <=7
                // arr[2] - arr[3] = 1-1 = 0 <=7
                if (Math.abs(arr[i] - arr[j]) > a) continue; // Pruning

                // k = 2 , k < 6 （3，4，5）
                for (int k = j + 1; k < arr.length; k++) {
                    if ((Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c))  {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}