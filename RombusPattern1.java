class RombusPattern1{
  public static void main(String[] args){
  int n= 7;
  for(int i=1;i<=n;i++){
    //space
    for(int j=1;j<=n-i+1;j++){
      System.out.print(" ");
    }

    //star
     for(int j=1;j<=n;j++){
      System.out.print("*");
    }
    System.out.println();
  }
 }
}