package Factory;

import Exception.TipoEntregaInvalido;
import Interfaces.TipoEntregaInterface;
import Strategy.Motoboy;
import Strategy.PAC;
import Strategy.RetiradaLocal;
import Strategy.Sedex;

/**
 *
 * @author gwestarb
 */
public class EntregaFactory {

    public static TipoEntregaInterface getTipoEntrega(String tipo) {
        switch (tipo) {
            case "RetiradaLocal":
                return RetiradaLocal.getInstance();
            case "PAC":
                return PAC.getInstance();
            case "Sedex":
                return Sedex.getInstance();
            case "Motoboy":
                return Motoboy.getInstance();
            default:
                throw new TipoEntregaInvalido();
        }
    }
}
