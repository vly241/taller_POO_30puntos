package punto24;

class punto24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dolar=24;
		double interes;
		for(int i=1; i<=3; i++) {
			
			interes=dolar*12/100;
			
			dolar=dolar+interes;
			
			
		}
		System.out.println("el capital de 24 dolares entre el año 1616 a 1976  es: "+ dolar +" dolares");
	}

}
