package Strategy;

import Interfaces.TipoEntregaInterface;

public class Context {

    private TipoEntregaInterface tipoEntrega;

    public Context(TipoEntregaInterface tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }
    
    public double executeTipoEntregaStrategy(double peso){
        return tipoEntrega.calculaPrecoEntrega(peso);
    }

}
