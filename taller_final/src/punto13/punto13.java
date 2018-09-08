package punto13;
import java.util.Scanner;

class punto13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		int C;
	    int x1,x2;
		int v1;
		int v3;
		int v2;
		int bb;
		
		
		System.out.println("Digite el valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Digite el valor de B: ");
		B= sc.nextInt();
		
		System.out.println("Digite el valor de C: ");
		C= sc.nextInt();
		
		sc.close();
		
		System.out.println("A partir de la ecuacion: "+A+"x^2+"+B+"x+"+C+"=0");
		
		bb=(int)Math.pow(B,2);
		v1=4*A*B-bb;
		
		v2=(int)Math.sqrt(v1);
		
		v3=2*A;
		
		x1=B+v2/v3;
		x2=-B-v2/v3;
		
		System.out.println("X1 es: "+ x1);
		System.out.println("X2 es: "+ x2);
		

	}

}
