package punto9;

class punto9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidadHoras = 26;
		int minutos;
		int segundos;
		int dias;
		
		minutos = cantidadHoras * 60;
		
		segundos= cantidadHoras*3600;

		dias=cantidadHoras / 24;
		
		
		System.out.println("Segun la cantidad de horas que es: "+cantidadHoras+", el tiempo transcurrido es igual a: "+dias+" dia, "+minutos+" minutos, "+segundos+" segundos."); 
		

	}

}
