package Factorys;

import Binario.Binario;
import Binario.Binario;
import Operaciones.Operacion;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public interface AbstractFactory {
    Operacion getOperacion(int a, int b,int op);
    Binario getBinario(int c);
}
