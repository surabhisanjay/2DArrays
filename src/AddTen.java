public class AddTen {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 5}, {1, 2, 3}};
        addTen(matrix);
        int[][] mat = {{1, -1, -2, -2}, {-1, 1, 2, 3}};
        countNegs(mat);


    }

    public static void addTen(int[][] mat) {
        for (int j = 0; j < mat[0].length; j++) {
            mat[1][j] += 10;
        }
        print2DArray(mat);
    }

    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();
    }

    public static void countNegs(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            for (int elem : row) {
                if (elem < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
