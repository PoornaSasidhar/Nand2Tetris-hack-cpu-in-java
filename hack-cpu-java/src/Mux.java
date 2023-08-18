class Mux {
private	Not n;
private	And m;
private	Or  o;
private	int a,b;
	private		int out;
		Mux(int a, int b){
			this.a=a;
			this.b=b;
		}
 public int  sel (int  s) {
	 n=new Not();
	 m=new And();
	 o=new Or();
	 int i = n.run(s);
	 out = o.run(m.run(this.a, i), m.run(this.b, s));
return out ;
 }
}


