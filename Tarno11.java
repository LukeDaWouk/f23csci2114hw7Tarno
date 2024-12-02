// 70600674
public class Tarno11 {
    public static void main(String[] args) {
        int[][] grid = {
            {8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8},
        };
        int maxProduct = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                maxProduct = Math.max(maxProduct, calculateProduct(grid, i, j));
            }
        }
        System.out.println(maxProduct);
    }

    private static int calculateProduct(int[][] grid, int i, int j) {
        int max = 0;
        if (j + 3 < 20)
            max = Math.max(max, grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3]);
        if (i + 3 < 20)
            max = Math.max(max, grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j]);
        if (i + 3 < 20 && j + 3 < 20)
            max = Math.max(max, grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3]);
        if (i - 3 >= 0 && j + 3 < 20)
            max = Math.max(max, grid[i][j] * grid[i - 1][j + 1] * grid[i - 2][j + 2] * grid[i - 3][j + 3]);
        return max;
    }
}
