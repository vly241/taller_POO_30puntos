package punto19;
import java.util.*;
class punto19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
Scanner sc = new Scanner(System.in);
		
		int vector[] = new int[10];
		int s_positivos=0;
		int s_negativos=0;
		int ceros=0;
		
		
		System.out.println("ingrese los 10 valores: ");
		
		for(int x=0; x<vector.length; x++) {
			
			vector[x]=sc.nextInt();
			
			if(vector[x]==0) {
				ceros++;
			}else if(vector[x]>0) {
				s_positivos+=vector[x];
			}else {
				s_negativos+=vector[x];
			}
		}
		sc.close();
		System.out.println("la suma de los positivos  es:  "+s_positivos);
		System.out.println("la suma de los negativos es: "+s_negativos);
		System.out.println("y la cantidad de ceros (0) es: "+ceros);

	}

}
