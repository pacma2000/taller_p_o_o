package punto19;
import java.util.Scanner;

class punto19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numeros[]=new int[10];
		
		int neg=0;
		int pos=0;
		int cero=0;
		int i=0;
		
		for(i=0; i<10; i++) {
			
			System.out.println("Introduce el numero "+(i+1)+" : ");
			numeros[i]= sc.nextInt();
			
			if(numeros[i]<0) {
				
				neg++;						
			}
			
			else {
				if(numeros[i]>0) {
					pos++;
				}
				else {
					if(numeros[i]==0) {
						cero++;
					}
				}
			}
		}
		
		System.out.println("la suma de los numeros positivos ingresados es: "+pos);
		System.out.println("la suma de los numeros negativos ingresados es: "+neg);
		System.out.println("la cantidad de ceros ingresados es: "+cero);
		
		
		

	}

}
