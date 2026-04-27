package Phase0;

public class RecursionDFS {
	public static void main(String[] args) {

		int n = 5;

		System.out.println(factorial(n));
		System.out.println(fibonacci(n));

		int[][] arr = {{2, 1, 1, 1, 1},
						{2, 1, 1, 1, 1},
						{2, 2, 2, 2, 1},
						{1, 1, 1, 2, 1},
						{1, 1, 1, 2, 2}};

		dfs(arr, 0, 0);

		for (int[] innerArr : arr) {
			for (int i : innerArr) {
				System.out.print(i + ",");
			}
			System.out.println();
		}
	}

	public static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	// 근데 이 코드는 비효율적이다 fibonacci(2)와 같은 메서드를 너무 많이 실행하기 때문
	// 이때 DP를 사용하면 효율적이다
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// DFS
	public static void dfs(int[][] grid, int x, int y) {
		int n = grid.length;
		int m = grid[0].length;

		if (x < 0 || y < 0 || x >= n || y >= m)
			return;
		if (grid[x][y] == 0 || grid[x][y] == 1)
			return;

		grid[x][y] = 0; // 방문 처리

		dfs(grid, x + 1, y);
		dfs(grid, x - 1, y);
		dfs(grid, x, y + 1);
		dfs(grid, x, y - 1);
	}
}
