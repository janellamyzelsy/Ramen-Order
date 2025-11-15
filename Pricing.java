/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Janella Myzel B. Sy
 */
public interface Pricing {
    public final double EGG = 10.00;
    public final double SEAWEED = 40.00;
    public final double NOODLES = 70.00;
    
    public String Extras (int extra); 
    public double TotalPrice (String size); 
    public double TotalPrice (String size, int extra); 
}

