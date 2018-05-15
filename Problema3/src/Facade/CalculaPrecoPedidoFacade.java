
package Facade;

import ClassesProfessor.Pedido;
import Interfaces.TipoEntregaInterface;


public class CalculaPrecoPedidoFacade {

    public CalculaPrecoPedidoFacade() {
    }
    
    public void Calcular(Pedido pedido){
        TipoEntregaInterface tipoEntrega = pedido.getTipoEntrega();
        pedido.calculaPesoTotal();
        pedido.setValorTotal(pedido.getValorPedido() + tipoEntrega.calculaPrecoEntrega(pedido.getPesoTotal()));
    }
    
    
}
