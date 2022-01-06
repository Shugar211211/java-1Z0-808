package javamocks.t01.q65;

public class OCAJP {
	public static void main(String[] args) {
		L1: for(int x=5, y=0; x>0; x--) {
			System.out.println("x="+x+" y="+y);
			L2: for(; y<5; y++) {
				System.out.print(x+""+y+" ");
				if(x==0)
					continue L1;
			}
		}
	}
}
