package Operaciones;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Resta implements Operacion{
    @Override
    public int operar(int a, int b) {
        int resta=a-b;
        return resta;
    }
    
}
