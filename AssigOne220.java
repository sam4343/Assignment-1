/*
 * KIT107 Assignment 1 SOLUTION
 *
 * Postcode Printer -- Driver
 *
 * Author: J. Dermoudy
 * Date: 21/7/2020
 */


public class AssigOne220
{
    /*
     * main() -- entry point
     *
     * @param args -- command line arguments
     */
    public static void main(String []args)
    {
        PostCodes pc;    // the organiser object
        
        pc=new PostCodes();    // initialise the PostCodes object
        
        pc.configure();    // get the user's preferences for printing
        pc.printTables();    // do the printing
    }
}