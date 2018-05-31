package Factorys;

import Binario.FactoryBinario;
import Operaciones.FactoryOperacion;
/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int sel){
        switch(sel){
            case 1:
                return new FactoryOperacion();
            case 2:
                return new FactoryBinario();
        }
        return null;
    }
}