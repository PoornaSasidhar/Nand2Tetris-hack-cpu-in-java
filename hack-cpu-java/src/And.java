class And  {
	private Nand k;
	private int out;
	public int run(int a, int b) {
	   k=new Nand();
	   out=(k.run(a, b)==0)?1:0 ;
	return out ;
		}
}

