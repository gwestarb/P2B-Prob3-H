/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import ClassesProfessor.ItemPedido;
import ClassesProfessor.Pedido;
import ClassesProfessor.Produto;
import Factory.EntregaFactory;
import Strategy.PAC;
import Strategy.Sedex;
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
        Pedido p = new Pedido();
        Produto pr = new Produto("BANANA", 10, 20);
        p.incluirItem(pr, 100);
        EntregaFactory factory = new EntregaFactory();
        TipoEntregaInterface PAC = factory.getTipoEntrega("PAC");
        p.setTipoEntrega(PAC);
        
        System.out.println(p.getValorTotal());
        System.out.println(p.getValorEntrega());
        
        Produto pr1 = new Produto("Abacaxi", 100, 1);
        
        p.incluirItem(pr1, 100);
        System.out.println(p.getValorTotal());
        
        TipoEntregaInterface Sedex = factory.getTipoEntrega("Sedex");
        
        p.setTipoEntrega(Sedex);
        System.out.println(p.getValorTotal());
        Produto pr2 = new Produto("Abacaxi", 100, 1000);
    }
    
}
