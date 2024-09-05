public class BubbleSort {
    
    public void BubbleSortt(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
              temp  =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    public static void main(String[]args){
        int arr[]={2,4,6,7,1,5,8};
        System.out.print(BubbleSortt(arr[]));
    }
}
