class DiomondPattern{
  public static void main(String[] args){

// For symmetry diomond pattern:-
    //      *
    //     ***        
    //    *****       
    //   *******      
    //  *********     
    //  *********     
    //   *******      
    //    *****       
    //     ***        
    //      *

int n=10;

for(int i=1;i<=n;i++){
int star = 2*i-1;
int space = n-i;
  if(i>(n/2)){
    star = 2*n-(2*i-1);
    space = i-1;
  }
    //space
    for(int j=1;j<=space;j++){
      System.out.print(" ");
    }
    //star
    for(int k=1;k<=star;k++){
      System.out.print("*");
    }
    //space
    for(int j=1;j<=space;j++){
      System.out.print(" ");
    }
      System.out.println();
  }
 }
}