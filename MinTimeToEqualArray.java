public class MinTimeToEqualArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n =arr.length;
        int max =arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element="+max);
        int time=0;
        for(int i=0;i<n;i++){
            time=time+max-arr[i];
        }
        System.out.println("Minimum time="+time);
    }
}
