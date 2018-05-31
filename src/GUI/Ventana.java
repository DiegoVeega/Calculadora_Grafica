package GUI;

import Binario.Binario;
import Factorys.AbstractFactory;
import Factorys.FactoryProducer;
import Operaciones.Division;
import Operaciones.Multiplicacion;
import Operaciones.Resta;
import Operaciones.Suma;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Ventana extends JPanel{
    
    public int WIDTH =500,widthTF=120,widthB=80;
    public int HEIGTH=220,heightTF=30,heightB=30;
    public JTextField textF1,textF2,textF3;
    
    public JButton SUMA;
    public JButton RESTA;
    public JButton MULT;
    public JButton DIVI;
    public JButton BIN;
    
    public Ventana(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(40,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(40,100,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(190,150,widthTF,heightTF));
        //************************************************************
        //BOTONES
        SUMA = new JButton("SUMAR");
        SUMA.setBounds(new Rectangle(190,40,widthTF,heightTF));
        
        RESTA = new JButton("RESTAR");
        RESTA.setBounds(new Rectangle(190,100,widthTF,heightTF));
        
        MULT = new JButton("MULTIPLICAR");
        MULT.setBounds(new Rectangle(340,40,widthTF,heightTF));
        
        DIVI = new JButton("DIVIDIR");
        DIVI.setBounds(new Rectangle(340,100,widthTF,heightTF));
        
        BIN = new JButton("BINARIO");
        BIN.setBounds(new Rectangle(340,150,widthTF,heightTF));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        //*********************************************************
        SUMA.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                int num1= Integer.parseInt(textF1.getText());
                int num2= Integer.parseInt(textF2.getText());
                int sel=1;
                AbstractFactory factory;
                int op=1;
                factory =FactoryProducer.getFactory(sel);
                Suma suma=(Suma) factory.getOperacion(num1,num2, op);
                textF3.setText(Integer.toString(suma.operar(num1, num2)));
            }
        });
        //TRABAJAR RESTA
        RESTA.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                int num1= Integer.parseInt(textF1.getText());
                int num2= Integer.parseInt(textF2.getText());
                AbstractFactory factory;
                int sel=1;
                int op=2;
                factory =FactoryProducer.getFactory(sel);
                Resta resta=(Resta) factory.getOperacion(num1,num2, op);
                textF3.setText(Integer.toString(resta.operar(num1, num2)));
            }
        });
        
        MULT.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //int multi = Integer.parseInt(textF1.getText()*textF2.getText());
                //textF3.setText(""+multi);
                int num1= Integer.parseInt(textF1.getText());
                int num2= Integer.parseInt(textF2.getText());
                AbstractFactory factory;
                int sel=1;
                int op=3;
                factory =FactoryProducer.getFactory(sel);
                Multiplicacion mult=(Multiplicacion) factory.getOperacion(num1,num2, op);
                textF3.setText(Integer.toString(mult.operar(num1, num2)));
            }
        });
        
        DIVI.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //int divi = Integer.parseInt(textF1.getText()/textF2.getText());
                //textF3.setText(""+divi);
                int num1= Integer.parseInt(textF1.getText());
                int num2= Integer.parseInt(textF2.getText());
                AbstractFactory factory;
                int sel=1;
                int op=4;
                factory =FactoryProducer.getFactory(sel);
                Division div=(Division) factory.getOperacion(num1,num2, op);
                textF3.setText(Integer.toString(div.operar(num1, num2)));
            }
        });
        
        BIN.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int num3=Integer.parseInt(textF3.getText());
                AbstractFactory factory;
                int sel=2;
                factory=FactoryProducer.getFactory(sel);
                Binario bin=(Binario) factory.getBinario(num3);
                textF3.setText(Integer.toString(Integer.parseInt(bin.operar(num3))));
            }
            
        });
        
        add(textF1);
        add(textF2);
        add(textF3);
        add(SUMA);
        add(RESTA);
        add(MULT);
        add(DIVI);
        add(BIN);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGTH));
    }
}