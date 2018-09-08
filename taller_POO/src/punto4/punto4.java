package punto4;

class punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		int x;
		int x1;
		int x2;
		int e, et;
		int a = 1;
		int b = 2;
		int c = -8;
		int d; 
		
		d=b*b;
		
		x1 = (d - 4 * a *c);
		
		int raiz = (int) Math.sqrt(x1);
		
		x2 = -b + raiz;
		
		x = x2 / 2 * a;
		
		e = a * x;
		et = e*e; 
		y = et + b * x + c;
		
		
		System.out.println("en y equivale: "+y+" y se encuentra A y al despejar Y encontrar a X y esto da: "+x);
	}

}
