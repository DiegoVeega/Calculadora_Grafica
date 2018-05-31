package Main;

import GUI.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Main_Calculadora {
    
    public static void main(String[] args){
        JFrame ventana=new JFrame("Calculadora");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        
        
    }
}