class Not {
 private  Nand o1;
 private  int out;
  public int run(int a) {
	  o1=new Nand();
	  out = o1.run(a, a);
	  return out;
  }
}

