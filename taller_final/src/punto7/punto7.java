package punto7;

class punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h;
		int a = 3;
		int b = 4;
		int c; //c es a elevado al cuadrado
		int d; //d es b elevado al cuadrado
		
		c = a * a;
		d = b * b;
		
		h = c + d;
		
		int hipotenusa = (int) Math.sqrt(h);
		
		System.out.println("Segun los datos del trianglo la hipotenusa es: "+hipotenusa);

	}

}
