package functions;

public class Page_132 {
	static double area;
	int b=2, h=3;
	
	public static void main(String[] args) {
//		double p, b, h;	//line n1
		double p=0, b=0, h=0;	//line n1 - fix
		if(area == 0) {
			b=3;
			h=4;
			p=0.5;
		}
		area = p * b * h;	// line n2
		System.out.println("Area is: " + area);
	}
}
