package LearnJava;

public class Switch {

	public static void main(String[] args) {
		 String s = "abc";
		
//		if(n==1)
//			System.out.println("One");
//		else if(n==2)
//			System.out.println("Two");
//		else if(n==3)
//			System.out.println("Three");
//		else if(n==4)
//			System.out.println("Four");
//		else
//			System.out.println("Five");
		
		switch(s)
		{
//		case 1:
//			System.out.println("One");
//			break;
//		case 2:
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//			break;
//		case 4:
//			System.out.println("Four");
//			break;
//		case 5:
//			System.out.println("Five");
//			break;
		
		
		case "abc":
			System.out.println("One");
			break;
		case "def":
			System.out.println("Two");
			break;
		default:
			System.out.println("No Match");
		
		}
		
		
	}

}
