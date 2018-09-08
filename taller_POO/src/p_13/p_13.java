package p_13;
import java.util.*;
class p_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner sc = new Scanner(System.in);
		int a,b,c;
	    int x1,x2;
		int p1,bb;
		int p2;
		
		System.out.println("ingrese el valor de a: ");
		a = sc.nextInt();
		System.out.println("ingrese el valor de b: ");
		b= sc.nextInt();
		System.out.println("ingrese el valor de c: ");
		c= sc.nextInt();
		
		sc.close();
		
		System.out.println("la ecuacion: "+a+"x^2 + "+b+"x + "+c+" = 0");
		
		bb=(int)Math.pow(b,2);
		p1=4*a*b-bb;
		
		p2=(int)Math.sqrt(p1);
		
		int p3=2*a;
		x1=b+p2/p3;
		x2=-b-p2/p3;
		
		System.out.println("el valor de x1 es: "+ x1);
		System.out.println("el valor de x2 es: "+ x2);
		
		

	}

}
