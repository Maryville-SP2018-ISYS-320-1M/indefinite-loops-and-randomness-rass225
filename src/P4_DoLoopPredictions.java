/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 â€œzero,â€� â€œinfinity,â€� and â€œunknownâ€� are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats:
 Expected output:
 (b)
 Repeats:
 Expected output:
 (c)
 Repeats:
 Expected output:
 (d)
 Repeats:
 Expected output:
   
 */

/*
 Was your prediction correct?
 
 (a)
 (b)
 (c)
 (d)
ERROR AGAIN, Can't print the code!!
*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		int x = 1;
		do {
		    System.out.print( x + " ");
		    x = x + 10;
		} while( x < 100 );
		
				
		System.out.println("ENDING LOOP TEST");

	}

}
