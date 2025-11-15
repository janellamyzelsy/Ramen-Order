/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs0070.ts21.sa2;

/**
 *
 * @author Janella Myzel B. Sy
 */
import java.util.Scanner; 

public class Ramen extends Customize implements RamenBase, Pricing {
    private String customerName; 
    protected String r_Flavor, r_Size; 
    int r_Extra;
    public int paymentMethod; 
    public static int order=1; 

//CONSTRUCTOR 1    
    public Ramen (String customerName, int paymentMethod, String r_Flavor, String r_Size, String c_richness, String c_sauce, String c_garlic, int r_Extra) {
        this.customerName = customerName;  
        this.r_Size = r_Size; 
        this.r_Flavor = r_Flavor; 
        this.r_Extra = r_Extra; 
        this.paymentMethod = paymentMethod; 
        this.c_richness = c_richness; 
        this.c_sauce = c_sauce; 
        this.c_garlic = c_garlic; 
    }

//CONSTRUCTOR 2 
    public Ramen (String customerName, int paymentMethod, String r_Flavor, String r_Size) {
        this.customerName = customerName;  
        this.r_Size = r_Size; 
        this.r_Flavor = r_Flavor; 
        this.paymentMethod = paymentMethod; 
    }

//ABSTRACT     
    @Override 
    protected String soupRichness(String c_richness) {
        String richness; 
        switch (c_richness) {
            case "R": case "r": 
                richness = "Reduced"; 
                break; 
            case "N": case "n":
                richness = "Normal"; 
                break; 
            case "H": case "h":
                richness = "Heavy"; 
                break; 
            default:
                richness = "Invalid Input"; 
        }
        return richness; 
    }
    
    @Override 
    protected String soupSauce(String c_sauce) {
        String sauce; 
        switch (c_sauce) {
            case "R": case "r":
                sauce = "Reduced"; 
                break; 
            case "N": case "n":
                sauce = "Normal"; 
                break; 
            case "H": case "h":
                sauce = "Heavy"; 
                break; 
            default:
                sauce = "Invalid Input"; 
        }
        return sauce; 
    }
    
    @Override
    protected String soupGarlic(String c_garlic) {
        String garlic; 
        switch (c_garlic) {
            case "R": case "r":
                garlic = "Reduced"; 
                break; 
            case "N": case "n": 
                garlic = "Normal"; 
                break; 
            case "H": case "h":
                garlic = "Heavy"; 
                break; 
            default:
                garlic = "Invalid Input"; 
        }
        return garlic; 
    }
 
//INTERFACE 
    @Override 
    public String Flavor (String r_Flavor) {
        String ramenFlavor; 
        switch (r_Flavor) {
            case "B": case "b": 
                ramenFlavor = "Beef"; 
                break; 
            case "P": case "p": 
                ramenFlavor = "Pork"; 
                break; 
            case "C": case "c": 
                ramenFlavor = "Chicken"; 
                break; 
            default:
                ramenFlavor = "Invalid Input"; 
        }
        return ramenFlavor; 
    }
    
    @Override  
    public String Size (String r_Size) {
        String ramenSize; 
        switch (r_Size) {
            case "S": case "s": 
                ramenSize = "Small"; 
                break; 
            case "M": case "m":
                ramenSize = "Medium"; 
                break; 
            case "L": case "l": 
                ramenSize = "Large"; 
                break; 
            default:
                ramenSize = "Invalid Input"; 
        }
        return ramenSize; 
    }
    
    @Override 
    public String Extras (int r_Extra) {
        String extraDish; 
        switch (r_Extra) {
            case 0: 
                extraDish = "None";
                break; 
            case 1: 
                extraDish = "Tamago"; 
                break; 
            case 2:
                extraDish = "Seaweed"; 
                break; 
            case 3:
                extraDish = "Noodles"; 
                break; 
            default:
                extraDish = "Invalid Input"; 
        }
        return extraDish; 
    }
    
    @Override 
    public double TotalPrice (String r_size) {
        double amount; 
        switch(r_size) {
            case "S": case "s": 
                amount = SMALL; 
                break; 
            case "M": case "m":
                amount = MEDIUM; 
                break; 
            case "L": case "l": 
                amount = LARGE; 
                break; 
            default:
                amount = 0; 
        }
        return amount; 
    }
    
    @Override 
    public double TotalPrice (String r_Size, int r_Extra) {
        double amount; 
        switch(r_Size) {
            case "S": case "s": 
                if (r_Extra == 0) {
                    amount = SMALL;
                }
                else {
                    switch (r_Extra) {
                        case 1:
                            amount = SMALL + EGG; 
                            break; 
                        case 2:
                            amount = SMALL + SEAWEED; 
                            break;
                        case 3:
                            amount = SMALL + NOODLES; 
                            break;
                        default:
                            amount = 0; 
                    }
                }
                break; 
            case "M": case "m":
                if (r_Extra == 0) {
                    amount = MEDIUM;
                }
                else {
                    switch (r_Extra) {
                        case 1:
                            amount = MEDIUM + EGG; 
                            break; 
                        case 2:
                            amount = MEDIUM + SEAWEED; 
                            break;
                        case 3:
                            amount = MEDIUM + NOODLES; 
                            break;
                        default:
                            amount = 0; 
                    }
                }  
                break; 
            case "L": case "l": 
                if (r_Extra == 0) {
                    amount = LARGE;
                }
                else {
                    switch (r_Extra) {
                        case 1:
                            amount = LARGE + EGG; 
                            break; 
                        case 2:
                            amount = LARGE + SEAWEED; 
                            break;
                        case 3:
                            amount = LARGE + NOODLES; 
                            break;
                        default:
                            amount = 0; 
                    }
                }  
                break; 
            default:
                amount = 0; 
        }
        return amount; 
    }

//LOCAL METHODS     
    public String methodPayment(int payment){
        String method=null; 
        switch (payment) {
                case 1:
                    method = "Cash"; 
                    break; 
                case 2:
                    method = "GCash"; 
                    break; 
                case 3:
                    method = "Credit Card"; 
                    break; 
                case 4:
                    method = "Debit Card"; 
                    break; 
                default:
                    System.out.println("\tInvalid input. Please try again:");
        }         
        return method; 
    }

    public void origMenu() {
        Scanner input = new Scanner (System.in); 
        
        System.out.println("\t =========================================================");
        System.out.println("\t||\tCheck out our: \t\t\t\t\t ||");
        System.out.println("\t||   \t\t- Original Fusion Ramen -\t\t ||");
        System.out.println("\t||   \t\t\tRichness: " + this.soupRichness(c_richness) + "\t\t ||");
        System.out.println("\t||   \t\t\tSauce: " + this.soupSauce(c_sauce) + "\t\t\t ||");
        System.out.println("\t||   \t\t\tGarlic: " + this.soupGarlic(c_garlic) + "\t\t\t ||");
        System.out.println("\t||   \t\t\tSpice: " + this.spiceLevel(c_spice) + "\t\t\t ||");
        System.out.println("\t||   \t\t\tToppings: " + this.Toppings(c_topping) + "\t\t\t ||");
        System.out.println("\t||   \t\t\tExtras: " + this.Extras(r_Extra) + "\t\t\t ||");
        System.out.println("\t =========================================================");
        
        double price1 = TotalPrice(r_Size); 
        
        // input validation 
        int x = 0, temp, orderOrig = 0; 
        while (x < 1) {
            System.out.println("\t\t   [1] Order the Original Fusion\t\t\n\t\t   [2] Order Custom Ramen\t\t\t");
            System.out.print("\t\t\t  Enter Selection: ");
            temp = input.nextInt(); 
            if (temp == 1 || temp == 2) {
                orderOrig = temp;
                x++; 
            }
            else 
                System.out.println("Invalid input. Please try again:");
        }
        switch (orderOrig) {
            case 1:
                receipt(c_richness, c_sauce, c_garlic, c_topping, c_spice, r_Extra, price1);
                break; 
            case 2:
                order++;    // back to main then to order form 
        }  
    }
    
    public void orderform() {
        Scanner input = new Scanner (System.in); 
        String temp=null, a=null, b=null, c=null; 
        int temp2=0, d=0, e=0, f=0; 
        int x=0;
        double price2=0.0; 
        System.out.println("\nEnter Custom Order");
        System.out.println("Soup Base:");
        
        while (x < 1) {     //Richness 
            System.out.print("\tRichness [R/N/H]: ");
            temp = input.nextLine(); 
            if (temp.equals("R")|| temp.equals("r") || temp.equals("N") || temp.equals("n") || temp.equals("H") || temp.equals("h")) {
                a = temp; 
                x++; 
            }
            else 
                System.out.println("\t\tInvalid input. Please try again:");
        } x--; 
        
        while (x < 1) {     //Sauce 
            System.out.print("\tSauce [R/N/H]: ");
            temp = input.nextLine(); 
            if (temp.equals("R")|| temp.equals("r") || temp.equals("N") || temp.equals("n") || temp.equals("H") || temp.equals("h")) {
                b = temp; 
                x++; 
            }
            else 
                System.out.println("\t\tInvalid input. Please try again:");
        } x--;
        
        while (x < 1) {     //Garlic 
            System.out.print("\tGarlic [R/N/H]: ");
            temp = input.nextLine(); 
            if (temp.equals("R")|| temp.equals("r") || temp.equals("N") || temp.equals("n") || temp.equals("H") || temp.equals("h")) {
                c = temp; 
                x++; 
            }
            else 
                System.out.println("\t\tInvalid input. Please try again:");
        } x--;
        
        while (x < 1) {     //Spice 
            System.out.print("\nSpice [0-4]: ");
            temp2 = input.nextInt(); 
            if (temp2 >= 0 && temp2 < 5) {
                d = temp2; 
                x++; 
            }
            else 
                System.out.print("\tInvalid input. Please try again:");
        } x--;
        
        while (x < 1) {     //Toppings 
            System.out.print("\nToppings [0-3]: ");
            temp2 = input.nextInt(); 
            if (temp2 >= 0 && temp2 < 4) {
                e = temp2; 
                x++; 
            }
            else 
                System.out.print("\tInvalid input. Please try again:");
        } x--;
        
        while (x < 1) {     //Extras 
            System.out.print("\nExtras [0-3]: ");
            temp2 = input.nextInt(); 
            if (temp2 >= 0 && temp2 < 4) {
                f = temp2; 
                x++; 
            }
            else 
                System.out.print("\tInvalid input. Please try again:");
        } 
        
        if (f == 0) {
            price2 = TotalPrice(r_Size);
        }
        else {
            price2 = TotalPrice(r_Size, f);
        }
        
        
        receipt(a, b, c, d, e, f, price2); 
    }
    
    public void receipt(String a, String b, String c, int d, int e, int f, double price) {
        System.out.println("\n\n-- Ramen Successfully Purchased. --\n");
        System.out.println("\n\n\t----------------------------- Receipt -----------------------------");
        System.out.println("\t  Customer: " + customerName + "\n\t");
        System.out.println("\t  - " + Flavor(r_Flavor) + " Ramen -");
        System.out.println("\t\tSize:\t\t" + Size(r_Size));
        System.out.println("\t\tRichness:\t" + this.soupRichness(a));
        System.out.println("\t\tSauce:\t\t" + this.soupSauce(b));
        System.out.println("\t\tGarlic:\t\t" + this.soupGarlic(c));
        System.out.println("\t\tSpice:\t\t" + this.spiceLevel(d));
        System.out.println("\t\tToppings:\t" + this.Toppings(e));
        System.out.println("\t\tExtra:\t\t" + this.Extras(f));
        System.out.println("\t\n\t  Total Amount:\tPHP " + price);
        System.out.println("\t\n\t  Payment Method:\t" + this.methodPayment(paymentMethod));
        System.out.println("\t\n\t Thank You! Enjoy your hot, tasty, and memorable bowl of ramen!\n");
        System.out.println("\t-------------------------------------------------------------------\n");
    }
    
    static void home(){
        System.out.println("WELCOME TO RAMEN-NETWORK");
        System.out.println("Order Ramen One Bowl At A Time\n\n");
        System.out.println("- O U R  R A M E N -\n");
        System.out.println("FLAVORS (with real meat)\t\tSIZES");
        System.out.println("   [B] Beef\t\t\t\t   [S] Small\t  PHP " + SMALL);
        System.out.println("   [P] Pork\t\t\t\t   [M] Medium\t  PHP " + MEDIUM);
        System.out.println("   [C] Chicken\t\t\t\t   [L] Large\t  PHP " + LARGE + "\n"); 
        System.out.println("SOUP BASE");
        System.out.println("   Richness of Taste:");
        System.out.println("\t[R] Reduced\t[N] Normal\t[H] Heavy");
        System.out.println("   Special Sauce:");
        System.out.println("\t[R] Reduced\t[N] Normal\t[H] Heavy");
        System.out.println("   Garlic:");
        System.out.println("\t[R] Reduced\t[N] Normal\t[H] Heavy\n");
        System.out.println("SPICE LEVEL\t\t\t\tTOPPINGS\t\t\t\tEXTRAS (with additional fees)");
        System.out.println("   [0] Not Spicy\t\t\t   [0] None\t\t\t\t   [0] None");
        System.out.println("   [1] Mild\t\t\t\t   [1] Green Onions\t\t\t   [1] Tamago\t   PHP " + EGG);
        System.out.println("   [2] Medium Hot\t\t\t   [2] Bean Sprouts\t\t\t   [2] Seaweed\t   PHP " + SEAWEED);
        System.out.println("   [3] Hot\t\t\t\t   [3] Kikurage\t\t\t\t   [3] Noodles\t   PHP " + NOODLES);
        System.out.println("   [4] Extremly Hot\n");
    }
    
    
    public static void main(String args[]) { 
        Scanner input = new Scanner (System.in); 
        int x=0, temp1=0, payment=0, choice=0; 
        String temp2=null, flavor=null, size=null; 
        home(); 
        
        System.out.println("\t\t\t[1] Proceed to order\n\t\t\t[2] Exit");
        
        while (x < 1) {      
            System.out.print("\t\t\t  Enter Selection: ");
            temp1 = input.nextInt(); 
            if (temp1 > 0 && temp1 < 3) {
                choice = temp1; 
                x++; 
            }
            else 
                System.out.println("\t\t\t\tInvalid input. Please try again:");
        } x--;
        
        switch (choice) {
            case 1:
                break; 
            case 2:
                System.out.println("\n\t\t\tThank You!\n");
                System.exit(0);
        }
         
        input.nextLine();
        System.out.print("\nEnter Customer Name: "); 
        String name = input.nextLine();      
        
        while (x < 1) {     //Payment 
            System.out.println("\n[1] Cash \t[2] GCash \t[3] Credit Card \t[4] Debit Card");
            System.out.print("Enter Mode of Payment [1-4]: ");
            temp1 = input.nextInt(); 
            if (temp1 > 0 && temp1 < 5) {
                payment = temp1; 
                x++; 
            }
            else 
                System.out.println("\tInvalid input. Please try again:");
        } x--; 
        input.nextLine(); 
        
        System.out.println("\n--------------\n");
        
        while (x < 1) {     //Flavor  
            System.out.print("Enter Ramen Flavor [B/P/C]: ");
            temp2 = input.nextLine(); 
            if (temp2.equals("B")|| temp2.equals("b") || temp2.equals("P") || temp2.equals("p") || temp2.equals("C") || temp2.equals("c")) {
                flavor = temp2; 
                x++; 
            }
            else 
                System.out.println("\tInvalid input. Please try again:");
        } x--; 
        
        while (x < 1) {     //Size  
            System.out.print("Enter Ramen Size [S/M/L]: ");
            temp2 = input.nextLine(); 
            if (temp2.equals("S")|| temp2.equals("s") || temp2.equals("M") || temp2.equals("m") || temp2.equals("L") || temp2.equals("l")) {
                size = temp2; 
                x++; 
            }
            else 
                System.out.println("\tInvalid input. Please try again:");
        } x--; 

 
        System.out.println("\n");
        
        Ramen original = new Ramen(name, payment, flavor, size, "N", "N", "N",0); 
        Ramen customOrder = new Ramen(name, payment, flavor, size); 
        
        original.origMenu();
        if (order == 2) {
            customOrder.orderform();
        }

    }
}
