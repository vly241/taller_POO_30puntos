package punto28;

import java.util.Random;
import java.util.Scanner;

class punto28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Random r=new Random();  
	      Scanner sc=new Scanner(System.in);  
	      System.out.print("Alto de la matriz: ");  
	      int f=sc.nextInt();  
	     System.out.print("Ancho de la matriz: ");  
	       int c=sc.nextInt();  
	      int mat[][]=new int[f][c];  
	      int sumf;  
	       int sumc;  
	      int sumd=0;  
	     int sumdi=0;  
	      //Rellenar Matriz  
	       for (int i = 0; i < mat.length; i++) {  
	         for (int j = 0; j < mat[0].length; j++) {  
	          mat[i][j]=r.nextInt(5)+1;  
	        }  
	       }  
	       //Mostrar Matriz  
	       for (int i = 0; i < mat.length; i++) {  
	         for (int j = 0; j < mat[0].length; j++) {  
	           System.out.print(mat[i][j]+"\t");  
	         }  
	         System.out.println("");  
	       }  
	       //Suma filas  
	      for (int i = 0; i < mat.length; i++) {  
	        sumf=0;  
	        for (int j = 0; j < mat[i].length; j++) {  
	         sumf=sumf+mat[i][j];  
	         }  
	       System.out.println("La suma de los valores de la fila "+(i+1)+" es:      "+sumf);  
	       }  
	      System.out.println("");  
	      //Suma columnas  
	      for (int i = 0; i < mat[0].length; i++) {  
	         sumc=0;  
	         for (int j = 0; j < mat.length; j++) {  
	          sumc=sumc+mat[j][i];  
	       }  
	         System.out.println("La suma de los valores de la columna "+(i+1)+" es: "+sumc);  
	       }  
	       System.out.println("");  
	     //Suma diagonal  
	       if (f-c==0){  
	         for (int i = 0; i < mat.length; i++) {     
	          sumd=sumd+mat[i][i];   
	        }  
	         System.out.println("La suma de la diagonal principal es: "+sumd);  
	       }  
	       System.out.println("");  
	      
	      if (f-c==0){  
	        for(int i = 0; i < mat.length; i++){  
	          for(int j = 0; j < mat[i].length; j++){  
	            if( i+j == mat.length - 1){  
	              sumdi = sumdi + mat[i][j];  
	           }  
	         }  
	       }  
	        System.out.println("La suma de la diagonal secundaria es: "+sumdi);  
	        sc.close();

		}
	}

}
