package p_12;

class p_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A=6,B=17,C=1,D=6;
		int cat=0;
		int x=0;
		
		
		if(x>0) {
			
			cat=(A+B)*(C+D);
			
		}
		else {
			if(x==0) {
				
				cat=(A+B)/(C+D);
				
			}
			else {
				if(x<0) {
					
					cat=A+B-C+D;
					
				}
			}
		}
		
		System.out.println("CAT es igual a: "+cat);

	}

}
