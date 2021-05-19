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
public class Ponto extends FormaGeometrica {
    
    private Integer posX;
    private Integer posY;
    
    public Ponto(Integer x, Integer y){
        this.posX = x;
        this.posY = y;
    }

    public double distanciaAte() {
        return 0;
    }
}
