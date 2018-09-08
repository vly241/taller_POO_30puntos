package p_16;

class p_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int monto = 800000;
		int pago = 600000;
		int credito;
		int deuda;
		int interes;
		int total;
		
		if(monto==pago) {
			
			System.out.println("El monto era de "+monto+"\n se pago "+pago+",\n esta a paz y salvo.");
		}
		else {
			if(pago>monto) {
				
				credito=pago-monto;
				
				System.out.println("El monto era de: "+monto+"\n se pago "+pago+",\n  usted tiene un credito por un valor de "+credito);
			}
			else {
				if(pago<monto) {
					
					deuda=monto-pago;
					interes=deuda*3/100;
					total=deuda+interes;
					
					System.out.println("El monto era de "+monto+"\n se pago "+pago+",\n el nuevo monto adeudado es "+deuda+", mas el interes del 3% que es "+interes+", el total del monto es: "+total);
				}
			}
		}
		
	}

}
