package punto26;
import java.util.Scanner;

class punto26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double v;
		
		System.out.println("ingrese la velocidad del auto: ");
		
		v = sc.nextDouble();
		
		for(int i=1;i>400;i++) {
		
		if(v<=90) {
			
			System.out.println("BIEN");
			
		}else if(v>90) {
			
			System.out.println("RAPIDO");
			
		}else if(v>160) {
			
		}
		
	}
	sc.close();

	}

}
