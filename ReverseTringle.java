class ReverseTringle{
  public static void main(String[] args){
    int n = 10;
    for(int i=1;i<=n;i++){
    for(int j=1;j<=i-1;j++){
        System.out.print(" ");
    } 
    for(int k=1;k<=2*n-(2*i-1);k++){
     System.out.print("*");
    }
    for(int j=1;j<=i-1;j++){
        System.out.print(" ");
    } 
   System.out.println();
   }
  }
}
// For reverse full pyramid----->
// *********
//  *******
//   *****
//    ***
//     *