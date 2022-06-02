// 1. Test for Inheritance Make a class Mother with int x and void show ( ) as its members. Now create another
// class Child that is derived from the Mother class. Create another class Application to test the inheritance.

public class Main{
    public static void main(String args[]){
        Mother m= new Mother ( );
        m.show( ); 
        Child ch=new Child ( );
        ch. show ( );
    }
}