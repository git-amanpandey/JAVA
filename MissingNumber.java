class MissingNumber{
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};
        int no = arr.length+1;
        int n = arr.length;
        int sumNatural = (no*(no+1))/2;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.print("SumNatural: "+sumNatural+"\n"+"Sum: "+sum+"\n");
        System.out.print("Missing Number is: "+(sumNatural-sum));
    }
}