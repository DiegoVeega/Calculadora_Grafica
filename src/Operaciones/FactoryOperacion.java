package Operaciones;

import Binario.Binario;
import Factorys.AbstractFactory;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class FactoryOperacion implements AbstractFactory{

    @Override
    public Operacion getOperacion(int a, int b,int op){
        switch(op){
            case 1:
                return new Suma();
            case 2:
                return new Resta();
            case 3:
                return new Multiplicacion();
            case 4:
                return new Division();
        }
        return null;
    }

    @Override
    public Binario getBinario(int c) {
        return null;
    }
}