package punto27;

class punto27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2, 4, 6, 8, 10};
        int t = 0;
    
        for (int contador = 0; contador < a.length; contador++) {
        	
            t += a[contador];
                       
        }
        
        System.out.println("La suma de los elementos del vetor es "+t);
        
        System.exit(0);

	}

}
