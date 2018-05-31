package Binario;

import Factorys.AbstractFactory;
import Operaciones.Operacion;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class FactoryBinario implements AbstractFactory{

    @Override
    public Operacion getOperacion(int a, int b, int op) {
        return null;
    }

    @Override
    public Binario getBinario(int c) {
        return new Binar();
    }
    
}
