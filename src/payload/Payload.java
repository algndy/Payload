/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payload;

import java.util.Scanner;

/**
 *
 * @author Mohamed Kamal Abdelaziz Ahmed
 */
public class Payload 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        //VARIABLES
        char passclass;
        double exprice , bagweight;
        int economy,nop;
        
        //PROCESSING
        System.out.print("Enter the number of passengers.\n"
                         + "==>");
        nop=input.nextInt();
        
        for(int i=1;i<=nop;)
        {
            System.out.println("Please Enter the Class for passenger " + i);
            System.out.println("'E' for Ecomony Class,");
            System.out.println("'F' for First Class,");
            System.out.println("'B' for Business Class");
            System.out.print("==>");
            //NOTE--> next() make String and charAt(0) take the first letter from the word. 
            passclass = input.next().charAt(0);
            
            if(passclass== 'e'||passclass== 'E'||passclass== 'f'||passclass== 'F'||passclass== 'b'||passclass== 'B')
            {
                System.out.print("Please Enter bag weight\n==>");
                bagweight=input.nextDouble();
                


                switch(passclass)
                {
                    //First Class
                    case 'F':
                    case 'f':
                    {
                        System.out.println("First Class.");
                        if(bagweight>30)
                        {
                            exprice= (bagweight-30)*10;
                            System.out.println("Extra price is "+exprice+"$");
                        }
                        else 
                        {
                            System.out.println("Not there extra price.");  
                        }
                        

                    }
                    break;

                    case 'B':
                    case 'b':
                    {
                        //Businessman class
                        System.out.println("Businessman class.");
                        if(bagweight>25)
                        {
                            exprice= (bagweight-25)*10;
                            System.out.println("Extra price is "+exprice);
                        }
                        else
                        {
                            System.out.println("Not there extra price.");  
                        }

                    }
                    break;

                    //economy class
                    case 'E':
                    case 'e':
                    {
                        System.out.print("Enter the kind of Economy Class:\n"
                                + "'1' for Premium Economy Class\n"
                                + "'2' for Ordinary Economy Class\n"
                                + "==>");
                       
                        economy= input.nextInt();
                        switch(economy)
                        {
                            case 1:
                            System.out.println("Premium economy class.");
                            if(bagweight>20)
                            {
                                exprice= (bagweight-20)*10;
                                System.out.println("Extra price is "+exprice);
                            }
                            else
                            {
                                System.out.println("Not there extra price.");  
                            }
                            break;

                            case 2:
                            System.out.println("Ordinary economy class.");
                            if(bagweight>15)
                            {
                                exprice= (bagweight-15)*10;
                                System.out.println("Extra price is "+exprice);
                            }
                            else
                            {
                                System.out.println("Not there extra price.");  
                            }
                            break;

                        }//end switch economy
                    }//end case e
                    break;   
                }//end switch passclass    
                System.out.println("==============================================\n");
            i++;        
            }//end if
            else
            {
                System.out.println("class entry error");
                continue;
            }
        }// end for
        
    }
    
}
