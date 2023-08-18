class And16 {
private  int[] a = new int[16];
private  int[] b = new int[16];
private  int[] out = new int[16];
  And x;
  And16(int[] a, int[] b ) {
	  this.a=a;
	  this.b=b;
  }
  public int[] run() {
	  x=new And();
	  for (int i=15; i>=0; --i) {
		 out[i]=x.run(this.a[i], this.b[i]); 
	  }
	  return out;
  }
}


