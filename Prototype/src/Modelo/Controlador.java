/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Creador.Clone;

/**
 *
 * @author personal
 */
public class Controlador {
    
    private Clone clon = new Clone();
    private Celula[] system = new Celula[8];
        
    public Controlador(){
        for(int i=0 ; i<=7; i++){
            system[i] = clon.retrieveCell();
            system[i].setColor(asignarColor());
            system[i].setVida(asignarVida());
        }
        
        for(int i=0 ; i<=7; i++)
            System.out.println(system[i].getColor()+" "+system[i].getVida());
    }
            
    public String asignarColor(){
        String[] colores = {"Red","Blue","Yellow","Black","White","Green"};
        return colores[(int) (Math.random() * 6)];
    }
    
    public int asignarVida(){
        return (int) (Math.random() * 50) + 25;
    }
    
}
