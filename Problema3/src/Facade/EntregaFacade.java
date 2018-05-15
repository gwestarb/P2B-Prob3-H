/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entregas.PAC;
import Entregas.RetiradaLocal;
import Entregas.Sedex;
import Enum.TipoEntrega;
import Interfaces.TipoEntregaInterface;

/**
 *
 * @author leoro
 */
public class EntregaFacade {
    
    public TipoEntregaInterface getTipoEntrega(TipoEntrega tipoEntrega){
        
        TipoEntregaInterface tipoEntregaObject;
        switch (tipoEntrega) {
            case PAC:
                tipoEntregaObject = new PAC();
                break;
            case SEDEX:
                tipoEntregaObject = new Sedex();
                break;
            default:
                tipoEntregaObject = new RetiradaLocal();
                break;
        }
        return tipoEntregaObject;
    }
}
