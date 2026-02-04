public class EquilibriumCount {

    public static void main(String[] args) {
        int[] arr = {3,-1,2,-1,1,2,1};
        int n = arr.length;

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int leftsum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftsum - arr[i];
            if (leftsum == rightSum) {
               // System.out.println("Equilibrium index: " + i);
                count++;
            }
            leftsum += arr[i];
        }
        System.out.println("Total equilibrium index: " + count);
    }
}