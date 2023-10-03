public class ArrayEx{
    public static void main(String[] args) {
        int[][] arr =  {
        {2,3,4},
        {4,5,6}
        };
    
//by for loop 
    for(int i=0;i<2;i++){
        for(int j=0;j<=2;j++){
            System.out.print(arr[i][j]+" ");
        }
    }
System.out.println();
   //by enhanced for loop
   for(int[] i:arr){
    for(int j:i){
        System.out.print(j+" ");
    }
    }
    int sum =0;
    //Addition
    for(int[] i:arr){
    for(int j:i){
        sum = sum+j;
    }
    }
    System.out.println();
    System.out.println("sum: "+sum);
   }
}
