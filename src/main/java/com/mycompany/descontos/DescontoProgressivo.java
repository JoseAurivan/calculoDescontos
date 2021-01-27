/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.descontos;

/**
 *
 * @author auriv
 */
public class DescontoProgressivo extends Descontos {
    
        
    @Override
    protected float calcularDesconto(Compra compra) {
        float valorDescontado = compra.getValorTotal()/25;
        if(valorDescontado >= compra.getValorTotal()/5){
            compra.setValorDescontado(compra.getValorTotal()/5);
            return compra.getValorDescontado();
        }else{
             compra.setValorDescontado(valorDescontado);
             return compra.getValorDescontado();
        }
    }

    
    
    
}
