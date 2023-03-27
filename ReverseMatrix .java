class ReverseMatrix{
static int M = 3;
static int N = 3;
static void reverseArray(int arr[][])
{
	for (int i = 0; i < M; i++) {
		int start = 0;
		int end = N - 1;
		while (start < end) {

			int temp = arr[i][start];
			arr[i][start] = arr[i][end];
			arr[i][end] = temp;
			start++;
			end--;
		}
	}
	for (int i = 0; i < M; i++) {
		for (int j = 0; j < N; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}

public static void main(String[] args)
{
	int arr[][] = { { 1, 2, 3 },
					{ 4, 5, 6 },
					{ 7, 8, 9 } };
	reverseArray(arr);
}
}