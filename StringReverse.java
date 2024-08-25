class StringReverse{
    public static String reverseWord(String s){
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sbr = new StringBuilder();
            sbr.append(arr[i]);
            sb.append(sbr.reverse());
            sb.append(" ");
            
        }
        
        return sb.toString();
    }
      public static String reverse(String s){
        String[] arr = s.split("\\s+");
        String str = "";
        for(int i=0;i<arr.length;i++){
            String sb = arr[i];
            for(int j=sb.length()-1;j>=0;j--){
                str += sb.charAt(j);
            }
            str+= " ";
        }
        return str;
    }
    public static void main(String[] args){
        String s = "I love proagramming";
         System.out.println("By Using StringBuilder😎: " + reverseWord(s));
            System.out.print("By Using Loops😉: " + reverse(s));
         
    }
}