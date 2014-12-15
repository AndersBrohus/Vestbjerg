package ui;
import java.util.Scanner;

import ctr.*;
import mdl.*;

public class CustomerUI {
	private CustomerCtrl cCtr;
	
	public CustomerUI() {
		cCtr = new CustomerCtrl();
	}
	
	public void start()
	{
		customerMenu();
	}
	
	public void customerMenu() {
        boolean exit = false;
        while(!exit) { //that is: while exit is false

            int choise = writeCustomerMenu(); 
            if(choise == 1) {
            	
            }
            else if(choise == 2) {

            }
            else if(choise == 3) {

            } 
            else if(choise == 4) {

            } 
            else
            {exit = true;}
        }//end else    
    }//end while

    public int writeCustomerMenu() { // makes an object keyboard to read input from the screen
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Customer Menu ***");
        System.out.println(" (1) Create Customer");
        System.out.println(" (2) Find Customer");
        System.out.println(" (3) Get Customer");
        System.out.println(" (4) Update Customer");
        System.out.println(" (5) Back");
        System.out.print("\n Make your choice: ");

        int choise = keyboard.nextInt();
        if(choise > 5 || choise == 0)
        {
            System.out.println("WTF.. You choose " + choise +" this is not a valid number.......");
            return writeCustomerMenu();
        }
        else {
            return choise;
        }
    }
}
