package LearnJava;

public class Operator1 {
	public static void main(String[] args)
	{
		int m = 7;
		int n = 4;
		
		//n++;  //n += 1; //n = n + 1;//n = n+m
//		++m;  // pre increment
	//	m++;  // post increment
		
		m = ++n;
		m = n++;
		
		System.out.println(n);
		System.out.println(m);
	}

}
