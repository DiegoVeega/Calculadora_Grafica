package Operaciones;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Division implements Operacion{
    @Override
    public int operar(int a, int b) {
        int division=a/b;
        return division;
    }
    
}