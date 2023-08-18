

class Bin4 {
	public static int[] con (int a) {
		int m=1;
		int[] bit =new int [4];
		for (int i=3;i>=0;i--) {
			int temp = a>>i;
			bit[i] = temp&m;
			
		}
		return bit;
	}
}
