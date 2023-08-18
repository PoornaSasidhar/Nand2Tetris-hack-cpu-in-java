class Bit_Reg {
private	int a;
private	int out=0;
private Mux m;

Bit_Reg(int a){
	this.a=a;
}
public int load(int l) {
      m=new Mux(out,this.a);
      DFF d =new DFF(m.sel(l));
      this.out= d.clocked();
      return out;
}


}


