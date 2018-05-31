package Binario;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Binar implements Binario{

    @Override
    public String operar(int c) {
        String binario = Integer.toBinaryString(c);
        return binario;
    }
    
}
