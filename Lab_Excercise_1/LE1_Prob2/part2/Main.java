// 2. Write a program in Java to print these patterns:

//  * * * * * * 
//   * * * * * 
//   * * * * 
//     * * * 
//      * * 
//       * 

public class Main
{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=0;i--){
		    for(int j=n;j>=i;j--){
	            System.out.print(" ");
	        }
	        for(int j=i;j>=0;j--){
	            System.out.print("* ");
	        }
	        System.out.println();
		}
	}
}

