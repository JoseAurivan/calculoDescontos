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
public class Main {
    public static void main(String[] args) {
        Compra c = new Compra();
        c.setValorTotal(100);
        DescontoTabelado dt = new DescontoTabelado();
        DescontoAniversario da = new DescontoAniversario();
        DescontoProgressivo dp = new DescontoProgressivo();
        dt.calcularDesconto(c);
        da.calcularDesconto(c);
        dp.calcularDesconto(c);
        c.calcularValorFinal();
        System.out.println(c.getValorfinal());
        
    }
}
