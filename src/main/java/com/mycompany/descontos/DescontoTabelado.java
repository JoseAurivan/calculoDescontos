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
public class DescontoTabelado extends Descontos {
    protected float porcentDescont = 10; // valor esse que pode vir de um Banco de dados

    @Override
    protected float calcularDesconto(Compra compra) {
        super.porcentDescont = porcentDescont;
        return super.calcularDesconto(compra); //To change body of generated methods, choose Tools | Templates.
    }
    
}
