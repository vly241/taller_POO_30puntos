package punto27;

class punto27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


int[] vector = new int[5];
		int total=0;
		
		for(int x=0;x<vector.length;x++) {
			vector[x] = (int) (Math.random()*20)+1;
			
			total += vector[x];
			System.out.println(vector[x]+ "+");
		}
		System.out.println("total del vector: "+total);

	}

	

}
