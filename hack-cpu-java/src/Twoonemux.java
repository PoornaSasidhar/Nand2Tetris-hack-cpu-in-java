

class Twoonemux {
	private	 int out;
	private	 Not e; And f;  Or l;
public int run(int I0,int I1,int S0){
	       e=new Not();
	       f=new And();
	       l=new Or();
	       out=l.run(f.run(e.run(S0),I0),f.run(S0,I1));
	    return(out);
	   }
 }

