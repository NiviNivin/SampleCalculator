package sample;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World!");
//			int a =10;
//			int b =12;
//			System.out.println(a+b);
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("sum of "+a+" and "+b+" is "+ (a+b) );
			System.out.println("diffrence of "+a+" and "+b+" is "+ (a - b) );
			System.out.println("multiplication of "+a+" and "+b+" is "+ (a*b));
			System.out.println("quotient of "+a+" and "+b+" is "+ (a/b) );
			
			
	}

}
