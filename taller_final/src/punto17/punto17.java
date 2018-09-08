package punto17;
import java.util.Scanner;

class punto17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 
		char letra;
		System.out.println("Introduzca algun caracter: ");
		letra = sc.next().charAt(0);
		
		if( letra == 'a' || letra == 'A' ||
		    letra == 'e' || letra == 'E' ||
		    letra == 'i' || letra == 'I' ||
		    letra == 'o' || letra == 'O' ||
		    letra == 'a' || letra == 'U' ) {
			
			System.out.println("ES UNA VOCAL");
		}
		else {
			
			System.out.println("ES UN NUMERO");
			
		}
		       
	}

}
