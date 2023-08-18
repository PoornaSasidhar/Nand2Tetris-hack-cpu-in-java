class Dec {
 static int con(int[] a) {
     int m=0,n,f;
     for(int i=a.length-1; i>=0; i--) {
    	 n=(a.length-1)  - i;
    	 f= (int) Math.pow(2,n);
    	 m=m+(a[i] * f);  }
    	return m;
}
public static int Twos(int[] a) {
int msb=a[0];
int p=(int) Math.pow(2,(a.length - 1));
int[] q = new int[a.length-1];
for (int i=1; i<=a.length-1; ++i) {
	q[i-1]=a[i];
}
int twos = -(msb*p)+ Dec.con(q);
return twos;
}
}


