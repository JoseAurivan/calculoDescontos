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
class Compra {
    private float valorTotal;
    private float valorfinal;
    private float valorDescontado = 0;

    public float getValorDescontado() {
        return valorDescontado;
    }

    public void setValorDescontado(float valorDescontado) {
        this.valorDescontado += valorDescontado;
        System.out.println(this.valorDescontado);
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorfinal() {
        return valorfinal;
    }

    
    public void calcularValorFinal(){
        this.valorfinal = getValorTotal() - getValorDescontado();
    }
    
    
    
}
