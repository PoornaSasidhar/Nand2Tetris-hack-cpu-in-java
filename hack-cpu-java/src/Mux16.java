class Mux16 {
	private int a[],b[];
	private Mux m;
	private int [] out =new int[16];
	Mux16(int[] a, int[]  b){
		this.a=a;
		this.b=b;
	}
	public int[] sel (int s) {
		for (int i=15; i>=0; --i) {
			m=new Mux(this.a[i],this.b[i]);
			out[i]=m.sel(s);
			}
		return out;
	}
	


}



