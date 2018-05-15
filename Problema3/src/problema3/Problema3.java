/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import ClassesProfessor.ItemPedido;
import ClassesProfessor.Pedido;
import ClassesProfessor.Produto;
import Entregas.PAC;
import Entregas.Sedex;
import Facade.CalculaPrecoPedidoFacade;
import Interfaces.TipoEntregaInterface;

/**
 *
 * @author Gwestarb
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pedido p = Pedido.getInstancia();
        Produto pr = new Produto("BANANA", 10, 20);
        p.incluirItem(pr, 100);
        TipoEntregaInterface PAC = new PAC();
        p.setTipoEntrega(PAC);
        CalculaPrecoPedidoFacade facade = new CalculaPrecoPedidoFacade();
        facade.Calcular(p);
        System.out.println(p.getValorTotal());
        
        
        TipoEntregaInterface Sedex = new Sedex();
        p.setTipoEntrega(Sedex);
        facade.Calcular(p);
        System.out.println(p.getValorTotal());
      
        
        
        
    }
    
}
