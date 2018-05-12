/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entregas;

import Interfaces.TipoEntregaInterface;

/**
 *
 * @author Gwestarb
 */
public class Sedex implements TipoEntregaInterface{

    @Override
    public Double calculaPrecoEntrega(double peso) {
        if(peso <= 500){
            return 12.50;
        }
        if(peso > 500 && peso <= 750){
            return 20.00;
        }
        if(peso > 750 && peso <=1200){
            return 30.00;
        }
        double valor = 45.00;
        double valorAuxiliar = Math.ceil((peso-2000.00)/100.00);
        for(double i = 0.0 ; i < valorAuxiliar; i++ ){
            valor += 1.50;
        }
        return valor;
    }
}
