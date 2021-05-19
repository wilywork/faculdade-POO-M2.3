/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.univali.formasgeometricas.formasgeometricas;

/**
 *
 * @author Alexandre Machado Azevedo, Vinicius dos Santos Moreira, Matheus Passold Carelli
 */
public class Quadrado extends FiguraPlana {

    public Ponto[] pontos;

    public Quadrado(Ponto inferiorEsquerda,Ponto superiorDireito) {
        this.pontos[pontos.length] = inferiorEsquerda;
        this.pontos[pontos.length] = superiorDireito;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
    
}
