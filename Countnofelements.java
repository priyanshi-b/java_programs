public class Countnofelements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 50};
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int countMax = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max) {
                countMax++;
            }
        }

        
        System.out.println("count="+ countMax);
    }
}
