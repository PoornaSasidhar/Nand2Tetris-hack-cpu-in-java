class Half_Adder {
private	 int a,b;
private  int s,c;
private  And x;
private  Xor y;
    Half_Adder(int a,int b){
    	 this.a=a;
    	 this.b=b;
     }
     public int sum () {
    	 y=new Xor();
    	 s=y.run(a, b);
    	 return s;
     }
     public int carry() {
    	 x=new And();
    	 c=x.run(a, b);
    	 return c;
     }
     
}


