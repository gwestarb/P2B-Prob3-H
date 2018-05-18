package Strategy;

import ClassesProfessor.Pedido;
import Interfaces.TipoEntregaInterface;

public class Context {

    private TipoEntregaInterface tipoEntrega;

    public Context(TipoEntregaInterface tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }
    
    public double executeTipoEntregaStrategy(Pedido pedido){
        return tipoEntrega.calculaPrecoEntrega(pedido);
    }

}
