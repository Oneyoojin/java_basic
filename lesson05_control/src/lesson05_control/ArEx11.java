package lesson05_control;

public class ArEx11 {
	public static void main(String[] args) {
		
		int[][][] arrInt = new int [3][3][3];
		
		int value = 0;
		for(int i = 0; i <arrInt.length; i++) {
			for (int j = 0; j<=2; j++) {
				for (int k = 0; k<=2; k++) {
					arrInt[i][j][k] = value++;
			}
		}
	}
		
		for(int i = 0; i<=2; i++) {
			for(int j = 0; j<=2; j++) {
				for(int k = 0; k<=2; k++) {
					System.out.println(arrInt[i][j][k]+"\t");
				}
				System.out.println();
			}
		}
	 // 향상된 for문
	for ( int [][] arr1 : arrInt) {
		for(int[] arr2 : arr1) {
			for(int num : arr2) {
				System.out.printf("%4d", num);
				
				
			}
		}

	  }
	}
 }

