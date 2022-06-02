// 2. Test for Overriding Make a function with the same return type , name of the function, number and type of
// arguments in the Child class as they are in the Mother class. Change the string to be displayed on the screen.

public class Main
{
	public static void main(String[] args) {
		Mother m = new Mother();
		m.show();
		Child c = new Child();
		c.show();
	}
}
