import java.util.*;
class Sorting{
    //Bubble Sort code
    public static void bubbleSort(int arr[]){
        System.out.println("----------Bubble Sort------------");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                //Compare and swap
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //Selection Sort
    public static void selectionSort(int arr[]){
        System.out.println("----------Selection Sort------------");
        for(int i=0;i<arr.length-1;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] =temp;
        }
    }
    //Insertion Sort
    public static void insrtionSort(int arr[]){
        System.out.println("----------Insertion Sort------------");
        for(int i=1;i<arr.length-1;i++){
            int curr = i;
            int prev = i-1;
            while(prev >= 0 && arr[prev] > arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1] = arr[curr];
        }
    }
    //Printing the array result
    public static void printArray(int arr[]){
         System.out.print("Sorted Array: ");
         for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
    //Main Function
    public static void main(String[] args){
        int arr[] = {3,1,5,4,7,8,6,2};
        System.out.println("Length of Array: "+arr.length);
        bubbleSort(arr);
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
        insrtionSort(arr);
        printArray(arr);
    }
}