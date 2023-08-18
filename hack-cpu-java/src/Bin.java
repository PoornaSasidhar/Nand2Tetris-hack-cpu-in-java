class Bin {
	public static int[] con (int a) {
		if((a<=32767) && (a>=-32768)) {
		int m=1;
		int[] bit =new int [16];
		for (int i=14;i>=0;i--) {
			int temp = a>>i;
			bit[15-i] = temp&m;
			
			}
		return bit;
		}
		else { throw new ArithmeticException("Illegal value");  }
		
	}

}


