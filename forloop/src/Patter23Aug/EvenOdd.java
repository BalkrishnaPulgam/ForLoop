package Patter23Aug;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		
		int a =20;
		int b=10;
		
		System.out.println(a&=b);
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a/=b);
		System.out.println(a*=b);
		System.out.println(a%=b);
		
		
		
		//&& operator
		System.out.println((5>3)&&(8>5));
		System.out.println((5>3)&&(8<5));
		
		//or operator
		System.out.println((5<3)||(8>5));
		System.out.println((5>3)||(8<5));
		System.out.println((5<3)||(8<5));
		
		//! operator
		System.out.println(!(5==3));
		System.out.println(!(5>3));
		
		
	}

}
