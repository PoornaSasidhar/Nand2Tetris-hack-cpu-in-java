class Or16way {
private  int[] a = new int[16];
private  int out;
private  Or o;
     Or16way(int[] a) {
    	 this.a=a;
     }
     public int run () {
    	 o=new Or();
    	 out=o.run(this.a[15],this.a[14]);
    	 for (int i=13; i>=0; --i) {
    		 out=o.run(this.a[i],out);
    	 }
    	 return out;
     }
}


