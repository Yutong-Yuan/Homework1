package packet;

import java.math.BigInteger;



public class Fb{
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		
	}
}


class Fibonacci
{
	Fibonacci(){
		int i;
		BigInteger a=new BigInteger("1");
		BigInteger b=new BigInteger("1");
		BigInteger c;
		System.out.println("Fibonacci(1)=1");
		System.out.println("Fibonacci(2)=1");
		for(i=3;i<201;i++)
		{
			c=a.add(b);
			System.out.println("Fibonacci("+i+")="+c);
			a=b;
			b=c;
		}
	}
}