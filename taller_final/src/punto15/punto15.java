package punto15;

class punto15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=2;
		int c=3;
		
		if((a>b)&&(a>c)) {
			
			System.out.println("El mayor es A");
		}
		else {
			if((b>a)&&(b>c)) {
				System.out.println("El mayor es B");
			}
			else {
				if((c>a)&&(c>b)) {
					System.out.println("El mayor es C");
				}
				else {
					System.out.println("Son iguales");
				}
			}
		}

	}

}
