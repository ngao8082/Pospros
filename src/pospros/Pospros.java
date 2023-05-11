/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pospros;
import pospros.Category;
/**
 *
 * @author Osman
 */
public class Pospros {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        // TODO code application logic here
    });
    
}
}
