/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivityteam9;

import java.util.*;

/**
 *
 * @author 1895324
 */
public class OrderDetails {
 
    int quantity;
    String taxstatus;
    Order o = new Order();
    Item i = new Item();
    
    public void SubTotal()
    {
    
        System.out.println("Sub total of order");
    
    }
    
    public void weight()
    {
    
        System.out.println("weight of order");
    
    }
    
    public void Tax()
    {
    
        System.out.println("Tax of order");
    
    }
    
}
