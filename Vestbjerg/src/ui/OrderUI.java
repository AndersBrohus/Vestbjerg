package ui;
import java.util.Scanner;

import ctr.*;
import mdl.*;

public class OrderUI {
	private OrderCtrl oCtr;
	
	public OrderUI() {
		oCtr = new OrderCtrl();
	}
	
	public void start()
	{
		orderMenu();
	}
	
	public void orderMenu() {
        boolean exit = false;
        while(!exit) { //that is: while exit is false

            int choise = writeOrderMenu(); 
            if(choise == 1) {
            	
            }
            else if(choise == 2) {

            }
            else if(choise == 3) {

            }
            else if(choise == 4) {

            }
            else if(choise == 5) {

            }
            else
            {exit = true;}
        }//end else    
    }//end while

    public int writeOrderMenu() { // makes an object keyboard to read input from the screen
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Order Menu ***");
        System.out.println(" (1) Create Order");
        System.out.println(" (2) Get Order");
        System.out.println(" (3) Find Order List");
        System.out.println(" (4) Add Part Order");
        System.out.println(" (5) Is finished");
        System.out.println(" (6) Back");
        System.out.print("\n Make your choice: ");

        int choise = keyboard.nextInt();
        if(choise > 6 || choise == 0)
        {
            System.out.println("WTF.. You choose " + choise +" this is not a valid number.......");
            return writeOrderMenu();
        }
        else {
            return choise;
        }
    }
}