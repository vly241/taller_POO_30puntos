package p_15;

class p_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=21;
		int n2=5;
		int n3=76;
		
		if((n1>n2)&&(n1>n3)) {
			
			System.out.println("El mayor es: "+n1);
		}
		else {
			if((n2>n1)&&(n2>n3)) {
				System.out.println("El mayor es: "+n2);
			}
			else {
				if((n3>n1)&&(n3>n2)) {
					System.out.println("El mayor es: "+3);
				}
				else {
					System.out.println("Son iguales");
				}
			}
		}
	
if((n1<n2)&&(n1<n3)) {
			
			System.out.println("El menor es: "+n1);
		}
		else {
			if((n2<n1)&&(n2<n3)) {
				System.out.println("El menor es: "+n2);
			}
			else {
				if((n3<n1)&&(n3<n2)) {
					System.out.println("El menor es: "+3);
				}
				else {
					System.out.println("Son iguales");
				}
			}
		}
	}

}
