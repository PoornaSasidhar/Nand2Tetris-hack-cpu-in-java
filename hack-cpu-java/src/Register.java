class Register  {
private	int[] a= new int[16];
private	int[] out= new int[16];
Bit_Reg bit;	
Register(int[] a) {
		this.a=a;
	}
public int[] load(int l) {
	for(int i=15; i>=0; --i) {
	bit = new Bit_Reg(this.a[i]);
	out[i]=bit.load(l);
	}
	return out;
}
}


class ARegister extends Register {
	ARegister(int[] a){
	super(a);
	}
}

class DRegister extends Register{
	DRegister(int[] a){
	super(a);
	}
}

