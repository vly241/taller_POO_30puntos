package p_18;
import java.util.*;
class p_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
		
	
    
		int horas;
		float costohora;
		float sueldo;
		float horaextra;
		String nameEmp;
		
		
		System.out.println("digite el nombre del empleado: ");
		nameEmp = sc.nextLine();
		
		System.out.println("digite la cantidad de horas trabajadas : ");
		horas = sc.nextInt();
		
		System.out.println("digite el valor sin puntos de la hora: ");
		costohora = sc.nextInt();
		sc.close();
		
		if(horas<=40) {
			
			sueldo=costohora*horas;
		}
		else {
			System.out.println("digite las horas extras: ");
			horaextra = sc.nextInt();
			
			sueldo = (float) (40 * costohora + horaextra * costohora* 1.5 /100);
		}
		
		System.out.println("El sueldo del empleado es de: "+sueldo);
		

	}

}
