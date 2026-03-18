package LearnJava;

public class DataType {

	public static void main(String[] args) {
		long l = 5l;  	 //8 bytes 
		int i = 5;    	 // 4 bytes -> 32 bits
		short s = 5;  	 // 2 bytes -> 16 bits -> -32768 to 32767
		byte b = 5;   	 // 1 byte -> 8 bits -> -128 to 127
		float f = 5.5f;  // 4 bytes -> 32 bits
		double d = 5.5;  // 8 bytes
		char c = 'A';
		c = 35;          // American Standard code for information interchange
		System.out.println(c);
		double d1 = 5;   // implicit conversion 
		int k =(int)5.5; // type casting
		System.out.println(k);
								// byte -> short -> int -> long -> float -> double
	}									// char -> int

}
