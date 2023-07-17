public class Day74 {
    //2D Arrays ->>Spiral Matrix
    public static void ArraysSpiral(int array[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = array.length-1;
        int endCol = array[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(array[startRow][i] + " ");
            }//top
            for (int j = startRow+1; j <=endRow; j++) {
                System.out.print(array[j][endCol] + " ");
            }//right
            for (int i = endCol-1 ; i <=startCol; i--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(array[endRow][i] + " ");
            }//bottom
            for (int j = endRow-1; j <=startRow+1; j--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(array[j][startCol] + " ");
            }//left
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        ArraysSpiral(array);
    
    }
}
