class Testing_Cpu {

	
	public static void main(String[] args) {
		int[] a=Bin.con(9);
		int[] b=Bin.con(8);
 Alu obj=new Alu(a,b);
 int[] c= obj.optr(0, 0, 0, 0, 0, 0);
 System.out.println(Dec.con(c));



		
	}
}

