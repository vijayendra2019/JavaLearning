package newpackage;

public class LoopsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * While - 3 
		 * For - 4 
		 * Do while - 5
		 * 
		 * 
		 * 
		 */
		
		int i = 0;
		int count = 0;
		while(i<3){
			for(int j=0;j<4;j++)
			{
				int k=0;
				do {
					System.out.println("i-----"+i+"j-----"+j+"k------"+k);
					k++;
					count++;
					}while(k<5);
			}i++;
			System.out.println("The count is :"+count );
		}
		
	}

}
