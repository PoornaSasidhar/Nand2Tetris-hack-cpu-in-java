class CPU {
	// Inputs : 
	 private  int[] inM=Bin.con(0);
	 private int reset;
	 private int[] inst =Bin.con(0);
    // Outputs : 
	private int[] outM = Bin.con(0);
	private int[] addressM=new int[15] ;
	private int writeM;
	private int[] pc =new int[15];
    // Registers :
    private int[] D=Bin.con(0);
 private int[] A=Bin.con(0);
    private Alu t; // ALU 

public void Run (int[] x,int[] y, int z)    {
	this.inM = x;
	this.inst=y;
	this.reset=z;
	address();
	outtM();
	write();
	pcounter();
	output();
}
private int[] address() {
	Not q=new Not();
	Mux16 m=new Mux16(outM,inst); 
	int[] o1=m.sel(q.run(inst[0]));
	Or w=new Or();
	ARegister e=new ARegister(o1);
	this.A =e.load( w.run(q.run(inst[0]),inst[10]) );
	for (int i=1; i<=15; ++i)   {
		this.addressM[i-1]=A[i];     }
	return this.addressM;
}
private int[] outtM() {
	And r=new And();
	Mux16 m1=new Mux16(A,inM);
	int[] o3 = m1.sel(r.run(inst[0], inst[3]));
	this.t =new Alu(D,o3);
	this.outM = t.optr(inst[4], inst[5], inst[6], inst[7], inst[8], inst[9]);
	return this. outM;
}
private int write() {
	And r =new And();
	DRegister e=new DRegister(outtM());
	this.D=e.load(r.run(inst[0], inst[11]));
	And r1=new And();
	this.writeM=r1.run(inst[0], inst[12]);
	return this.writeM;
}
private int[] pcounter() {
	Not  q=new Not();
	And r1=new And();
	And r2=new And();
	And r3=new And();
	And r4=new And();
	And r5=new And();
	And r6=new And();
	And r7=new And();
	And[] r= {r1,r2,r3,r4,r5,r6,r7};
	int ld1= r[2].run( r[0].run(inst[0], inst[15]) ,  r[1].run(q.run(t.Check_ng()), t.Check_zr())    );
	int ld2= r[3].run( r[4].run(inst[0],inst[14]), t.Check_zr());
	int ld3= r[5].run( r[6].run(inst[0],inst[13]), t.Check_ng());
	Or w1 = new Or();
	Or w2 = new Or();
	Or[] w= {w1,w2};
	int ldt=w[0].run(ld1, ld2);
	int ld=w[1].run(ld3, ldt);
	PC p =new PC(this.A);
	int[] o4=p.optr(1, ld, this.reset);
	for (int i=1; i<=15; ++i) {
		this.pc[i-1]=o4[i];
	}
	return this.pc;
}

private void output() {
	System.out.println("Output pins : ");
	System.out.println("-------------------");
	System.out.printf("outM[16]     = %d\n",Dec.Twos(this.outM));
	System.out.printf("writeM       = %d\n",this.writeM);
	System.out.printf("addressM     = %d\n",Dec.Twos(this.addressM));
	System.out.printf("pc[15]       = %d\n",Dec.Twos(this.pc));
	System.out.println("-------------------");
	System.out.printf("A            = %d\n",Dec.Twos(this.A));
	System.out.printf("D            = %d\n\n",Dec.Twos(this.D));
	
}
}
