/**
 * @author: Danial Yunus
 * Student ID: 1212579067
 * Class ID: CSE360 M 9:40 70641
 * Assignment Number: 2
 * Description: Contains the AddingMachine Class which performs basic arithmetic operations
 */

package cse360assign2;

public class AddingMachine {
	
	/**
	 * int used to store the total result of arithmetic operations performed by the AddingMachine
	 */
	
	private int total;
	
	/**
	 * String used to store the history of arithmetic operations performed by the AddingMachine
	 */
	
	private String history = "0";
	
	/**
	 * Constructor which creates an Adding Machine
	 *  @return AddingMachine Object which performs basic arithmetic operations 
	 *  and stores a history of operations
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 *  @return returns the current total of the operations performed
	 */
	
	public int getTotal () {
			return total;
		}
	
	/**
	 *  @param takes a value to add
	 *  @return returns the new total with the value added to existing total
	 */
	
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 *  @param takes a value to subtract
	 *  @return returns the new total with the value subtraced from existing total
	 */
	
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 *  @return returns a string with the history of operations performed
	 */
	
	public String toString () {
		return history;
		}
	
	/**
	 *  clears the AddingMachine's total and history 
	 */
	
	public void clear() {
		total = 0;
		history = "0";
	}
	
}
