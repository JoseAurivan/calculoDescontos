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
public abstract class Descontos {
    protected float porcentDescont;

    protected void setPorcentDescont(float porcentDescont) {
        this.porcentDescont = porcentDescont;
    }
     
     
    
    protected float calcularDesconto(Compra compra){
        
        float valorparcial = compra.getValorTotal()*(porcentDescont/100);        
        compra.setValorDescontado(valorparcial);
        return compra.getValorDescontado();
    }
}
