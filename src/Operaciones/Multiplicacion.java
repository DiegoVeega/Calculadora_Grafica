package Operaciones;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Multiplicacion implements Operacion {
    @Override
    public int operar(int a, int b) {
        int mult=a*b;
        return mult;
    }
    
}
