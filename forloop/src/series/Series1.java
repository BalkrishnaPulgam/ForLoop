package series;

public class Series1 {
	
	//1 10 100 1000 10000 1000 100 10 1 
	
public static void main(String[] args) {
		
		for(int i=1; i<=10000; i=i*10) {
			System.out.print(i+" ");
		}
		for (int j=1000; j>0; j=j/10) {
			System.out.print(j+" ");
		}
		
		
	}
	

}
