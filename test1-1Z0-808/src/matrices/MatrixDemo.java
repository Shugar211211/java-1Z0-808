package matrices;

public class MatrixDemo {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		
		arr[0] = new int[] {1, 2};
		arr[1] = new int[] {3, 4, 7, 8, 9};
		arr[2] = new int[] {5, 6, 0};
		
		System.out.println("Basic loops:");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("\nEnchanced loops:");
		for(int[] iArr : arr) {
			for(int jVal : iArr)
				System.out.print(jVal+" ");
			System.out.println();
		}
	}
}
