public class ArraySort {
    public static void sorting(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("ASCENDING");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("DESCENDING");
        for (int i = n-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,45,732,2,1};
        int n = arr.length;
        sorting(arr, n);
        
    }
}
