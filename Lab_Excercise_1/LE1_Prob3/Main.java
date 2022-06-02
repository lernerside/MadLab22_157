// 3. Write a program in Java to print the table of a number received through command
// line argument, e.g.

public class Main
{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
		    System.out.println(Integer.parseInt(args[0]) + " * " + i + " = " + Integer.parseInt(args[0])*i);
		}
	}
}

