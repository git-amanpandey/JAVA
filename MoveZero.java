import java.util.ArrayList;
class MoveZero{
    public static void main(String[] args){
        int arr[] = {1,0,3,0,0,0,8,0,0,0,0,5,5,0};
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }else{
                count++;
            }
        }
        while(count != 0){
            list.add(0);
            count--;
        }
        
        System.out.println(list);
    }
}