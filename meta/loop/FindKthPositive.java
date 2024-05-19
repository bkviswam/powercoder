package meta.loop;

public class FindKthPositive {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,4,7,11};
        int k = 5;
        System.out.println("kth positive missing number "+findKthPositive(arr, k));
    }

    private static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] - mid - 1 < k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start + k;
    }
}
