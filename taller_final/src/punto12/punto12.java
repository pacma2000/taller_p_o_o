package punto12;

class punto12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	int x=0;
	int A=5;
	int B=10;
	int C=3;
	int D=2;
	int cat=0;
	
	if(x>0) {
		
		cat=(A+B)*(C+D);
		
	}
	else {
		if(x==0) {
			
			cat=(A+B)/(C+D);
			
		}
		else {
			if(x<0) {
				
				cat=A+B-C+D;
				
			}
		}
	}
	
	System.out.println("CAT es igual a: "+cat);

	}

}
