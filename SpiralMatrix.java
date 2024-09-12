class Sprial{
    public static void printSpiral(int matrix[][]){
        //declare 4 variables
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
System.out.println("row: "+" "+ matrix.length+"col: "+matrix[0].length);
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
             for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // //bottom
              for(int j=endCol-1;j>=startCol;j--){
                //Special Condition
                // if(startCol == endCol){
                //     break;
                // }
                System.out.print(matrix[endRow][j]+" ");
              }
            //left
             for(int i=endRow-1;i>startRow;i--){
                //Special Condition
                // if(startRow == endRow){
                //     break;
                // }
                System.out.print(matrix[i][startCol]+" ");
              }

              //Updation
              startRow++;
              startCol++;
              endRow--;
              endCol--;
        }
    }
    public static void main(String[] args){
        int matrix[][] = {  {1,2,3},
                            {4,5,6},
                            {7,8,9} }; //Output would be: 1 2 3 6 9 8 7 4 
        printSpiral(matrix);
    }
}