/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import ClassesProfessor.Pedido;
import Exception.TipoEntregaInvalido;
import Interfaces.TipoEntregaInterface;

/**
 *
 * @author gwestarb
 */
public class Motoboy implements TipoEntregaInterface {

    private static Motoboy instance;

    private Motoboy() {

    }

    public static Motoboy getInstance() {
        if (instance == null) {
            instance = new Motoboy();
        }
        return instance;
    }

    @Override
    public Double calculaPrecoEntrega(Pedido pedido) {
        if (pedido.calculaPesoTotal() < 25000 && pedido.getQuantidadeItens() < 30) {
            return 7D;
        } else {
            throw new TipoEntregaInvalido();
        }
    }
}
