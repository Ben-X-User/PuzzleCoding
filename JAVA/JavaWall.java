/**
 * @Author BenXUser
 * @Author Swee4T
<<<<<<< HEAD
=======
 * @Author BenXUser
>>>>>>> 75762b775ffd66625e1d70bd72ceb72dbd95977f
 * @File JavaWall.java
 * @Copyright BenXUser & Swee4T
 * @Brief TBA
 * @Date 07/09/2024
 */

public class JavaWall {

	/* ======= HAIKU =======
   	  	Entered in Java
   	  	I sent an invitation
   	  	Let's code a neat wall!
	*/
	public boolean confirmExit() {
		System.out.println("Are you sure? (YES or NO)");
		String option = input.nextLine().toLowerCase();

		if (options.equals("yes")) {
			System.out.println("Exiting...");
			return true;
		} else if (choice.equals("no")) {
			System.out.println("Returning to menu");
			return false;
		}

		System.out.prinln("Invalid option.");
		System.out.println("Returning to menu.");
		return false;
	}

	/* ======= HAIKU =======
		Are they listen? She acts
		disdained - "...o gajo está..."
		They listened while muted.
	*/
	public int retrieveArrayIndex(T[] array, T search){
		for (int index = 0; index < array.length; index++) {
			if (array[index].equals(search)) {
				return index;
			}
		}
		return -1;
	}

}
