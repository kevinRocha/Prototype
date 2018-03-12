/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creador;

import Modelo.Cell;

/**
 *
 * @author personal
 */
public class Clone {
    
    private Cell celula;

    public Clone(){
        
        celula = new Cell();
        String[] colores = {"Red","Blue","Yellow","Black","White","Green"};
        
        celula.setColor(colores[(int) (Math.random() * 6)]);
        celula.setVida((int) (Math.random() * 50) + 25);
    }
    
    public Cell retrieveCell(){
        return celula.clone();
    }
}
