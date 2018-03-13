/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creador;

import Modelo.Celula;

/**
 *
 * @author personal
 */
public class Clone {
    
    private Celula celula;

    public Clone(){
        
        celula = new Celula("White",25);
    }
    
    public Celula retrieveCell(){
        return celula.clone();
    }
}
