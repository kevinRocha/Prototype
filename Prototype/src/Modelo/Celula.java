/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author personal
 */
public class Celula implements Cloneable {
    
    private String color;
    private int vida;
    
    public Celula(String color, int vida) {
        this.color = color;
        this.vida = vida;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }    
    
    @Override
    public Celula clone(){
        Celula clonedCell = null;
        try{
            clonedCell = (Celula) super.clone();
            clonedCell.setColor(color);
            clonedCell.setVida(vida);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clonedCell;
    }
    
}
