package multiply;

public class MultiplicatTbale {
	public static void main(String args[]) {
		multiply();
	}
	public static void multiply() {
		//Modificaremos la tabla de multiplicar a 10 
		for(int i=1; i<=10; i++) {
			for (int j=0; j<=10; j++ ) {
				//Ahora se nos presentara la nueva tabla 
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
