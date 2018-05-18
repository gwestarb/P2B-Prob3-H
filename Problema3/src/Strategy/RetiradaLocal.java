/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import ClassesProfessor.Pedido;
import Interfaces.TipoEntregaInterface;

/**
 *
 * @author Gwestarb
 */
public class RetiradaLocal implements TipoEntregaInterface {

    private static RetiradaLocal instance;

    private RetiradaLocal() {

    }

    public static RetiradaLocal getInstance() {
        if (instance == null) {
            instance = new RetiradaLocal();
        }
        return instance;
    }

    @Override
    public Double calculaPrecoEntrega(Pedido pedido) {
        return 0D;
    }
}
