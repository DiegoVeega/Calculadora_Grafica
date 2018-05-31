package Operaciones;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Suma implements Operacion{
    @Override
    public int operar(int a, int b) {
        int suma=a+b;
        return suma;
    }
}
