public class SumOfMatrix {
    public static void main(String[] args) {
        int[][] array = {{1,2,4},{2,3,5}};
        sumOf(array);
        sumOfAlt(array);
    }
    public static void sumOf(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void sumOfAlt(int[][] array){
        int sum = 0;
        for (int[] row : array ){
            for (int col : row){
                sum += col;
            }
        }
        System.out.println(sum);
    }
}
