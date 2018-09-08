package punto27;

class punto27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arreglo[] = {1, 47, 7, 41, 52};
        int total = 0;
    
        for (int contador = 0; contador < arreglo.length; contador++) {
            total += arreglo[contador];
            System.out.println(arreglo[contador]+"=="+total+"+");
        }
           System.exit(0);
	}

	

}
