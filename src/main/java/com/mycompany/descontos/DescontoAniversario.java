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
public class DescontoAniversario extends Descontos {
    protected float porcentDescont = 15;
    

    @Override
    protected float calcularDesconto(Compra compra) {
        super.porcentDescont = porcentDescont;
        return super.calcularDesconto(compra); //To change body of generated methods, choose Tools | Templates.
    }
       

    
}
