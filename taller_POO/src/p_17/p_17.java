package p_17;
import java.util.*;
class p_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 
		char letra;
		System.out.println("Introduzca algun caracter: ");
		letra = sc.next().charAt(0);
		
		sc.close();
		
		if( letra == 'a' || letra == 'A' ||
		    letra == 'e' || letra == 'E' ||
		    letra == 'i' || letra == 'I' ||
		    letra == 'o' || letra == 'O' ||
		    letra == 'a' || letra == 'U' 
		    
		    ) {
			
			System.out.println(" ES UN CARACTER Y ES VOCAL");
		}
		else if( letra == 'q' || letra == 'Q' ||
		    letra == 'w' || letra == 'W' ||
		    letra == 'r' || letra == 'R' ||
		    letra == 't' || letra == 'T' ||
		    letra == 'y' || letra == 'Y' ||
		    letra == 'p' || letra == 'P' ||
		    letra == 's' || letra == 'S' ||
		    letra == 'd' || letra == 'D' ||
		    letra == 'f' || letra == 'F' ||
		    letra == 'g' || letra == 'G' ||
		    letra == 'h' || letra == 'H' ||
		    letra == 'j' || letra == 'J' ||
		    letra == 'k' || letra == 'K' ||
		    letra == 'l' || letra == 'L' ||
		    letra == 'ñ' || letra == 'Ñ' ||
		    letra == 'z' || letra == 'Z' ||
		    letra == 'x' || letra == 'X' ||
		    letra == 'c' || letra == 'C' ||
		    letra == 'v' || letra == 'V' ||
		    letra == 'b' || letra == 'B' ||
		    letra == 'N' || letra == 'n' ||
		    letra == 'M' || letra == 'm' ){
			
			System.out.println(" ES UN CARACTER");
			
		}else {
			System.out.println(" NUMERO");
		}
	}

}
