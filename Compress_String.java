import java.util.Scanner;
class Solution {
    public static int compress(char[] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            Integer count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            s += chars[i];
            if (count > 1) {
                s += count.toString();
            }
        }
       for (int i=0;i<s.length();i++)
            chars[i]=s.charAt(i);

        System.out.println("Compress String: "+s);
        return s.length();        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        int n = sc.nextInt();
        char[] chars = new char[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter"+ " "+ (i+1) +" "+ "char: ");
            chars[i] = sc.next().charAt(0);
        }
        System.out.println();
        int result = compress(chars);
        System.out.println("Length of compressed string: "+ result);
    }
}