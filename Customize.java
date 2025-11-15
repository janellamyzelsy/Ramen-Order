/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Janella Myzel B. Sy
 */
public abstract class Customize {
    public int c_topping, c_spice; 
    protected String c_richness, c_sauce, c_garlic; 
    
    public Customize (){
        this.c_topping = 0; 
        this.c_spice = 0; 
    }
    
    public String spiceLevel(int c_spice){
        String spiciness;
        switch (c_spice) {
            case 0: 
                spiciness = "None"; 
                break; 
            case 1:
                spiciness = "Mild"; 
                break; 
            case 2:
                spiciness = "Medium"; 
                break; 
            case 3:
                spiciness = "Hot"; 
                break; 
            case 4:
                spiciness = "Extra Hot";
                break; 
            default: 
                spiciness = "Invalid Input" ; 
        }
        return spiciness; 
    }
    
    public String Toppings(int c_topping) {
        String topping;
        switch (c_topping) {
            case 0: 
                topping = "None";
                break;
            case 1:
                topping = "Green Onion";
                break;
            case 2:
                topping = "Bean Sprouts";
                break;
            case 3:
                topping = "Kikurage"; 
                break; 
            default:
                topping = "Invalid Choice.";
                break;
        }
        return topping; 
    }
    
    
    protected abstract String soupRichness(String c_richness); 
    protected abstract String soupSauce(String c_sauce);
    protected abstract String soupGarlic(String c_garlic);
}

