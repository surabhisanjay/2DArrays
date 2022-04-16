public class Declarations {
    public static void main(String[] args) {
        int[][] arr2D= new int[2][3];
        int[][] matrix = {{1,2,3},{1,2,4}};

    }


}
class Traversal{
    public static void rowWisetraversal(int[][] arr2D){
        for (int r = 0; r < arr2D.length; r++){
            for(int j = 0; j < arr2D[0].length; j++){
                //process elements
            }
        }
    }
    public static void colWiseTraversal(int[][] arr){
        for (int j = 0; j < arr[0].length; j++){
            for( int i = 0; i < arr.length; i++){
                //process ELements
            }
        }
    }

}


