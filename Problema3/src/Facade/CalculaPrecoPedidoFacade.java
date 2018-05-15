
package Facade;

import ClassesProfessor.Pedido;
import Interfaces.TipoEntregaInterface;


public class CalculaPrecoPedidoFacade {
    
    public void Calcular(Pedido pedido){
        TipoEntregaInterface entregaFacade = new EntregaFacade().getTipoEntrega(pedido.getTipoEntrega());
        pedido.calculaPesoTotal();
        pedido.setValorTotal(pedido.getValorPedido() + entregaFacade.calculaPrecoEntrega(pedido.getPesoTotal()));
    }
    
    
}
