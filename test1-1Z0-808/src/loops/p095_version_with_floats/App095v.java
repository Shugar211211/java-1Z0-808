package loops.p095_version_with_floats;

public class App095v {

	public static void main(String[] args) {
		float numbers[];
		numbers = new float[2];
		numbers[0] = 10;
		numbers[1] = 20;
		
		numbers = new float[4];
		numbers[2] = 30;
		numbers[3] = 40;
		for(float x : numbers) {
			System.out.print(" " + x);
		}
	}

}
