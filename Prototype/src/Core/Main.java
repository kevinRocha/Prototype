/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Creador.Clone;
import Modelo.Cell;

/**
 *
 * @author personal
 */
public class Main {
    
    public static void main(String[] args){
        Clone clon = new Clone();
        
        
        Cell[] system = new Cell[8];
        
        for(int i=0 ; i<=7; i++)
            system[i] = clon.retrieveCell();
        
        for(int i=0 ; i<=7; i++)
            System.out.println(system[i].getColor()+" "+system[i].getVida());
//        Cell celula2 = new Cell();
//        Cell celula3 = new Cell();
//        Cell celula4 = new Cell();
//        Cell celula5 = new Cell();
//        
//        System.out.println(celula1.getColor()+" "+celula1.getVida());
//        System.out.println(celula2.getColor()+" "+celula2.getVida());
//        System.out.println(celula3.getColor()+" "+celula3.getVida());
//        System.out.println(celula4.getColor()+" "+celula4.getVida());
//        System.out.println(celula5.getColor()+" "+celula5.getVida());
        
    }
    
}
