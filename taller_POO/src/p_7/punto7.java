package p_7;

class punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h;
		int a = 3;
		int b = 4;
		int c; 
		int d; 
		
		c = (int)Math.pow(a,2);
		d = (int)Math.pow(b,2);
		
		h = c + d;
		
		int hipotenusa = (int) Math.sqrt(h);
		
        System.out.println("datos del triangulo lados:"+a+", "+b);
		
		System.out.println(" la hipotenusa es: "+hipotenusa);
	}

}
