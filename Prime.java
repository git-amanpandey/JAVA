import java.util.Scanner;
class Prime{
    public static boolean IsPrime(int n){ //(Osqrt(n))
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = sc.nextInt();
        System.out.println(IsPrime(n));
    }
}

