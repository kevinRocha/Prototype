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
public class Cell implements Cloneable {
    
    private String color;
    private int vida;

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
    public Cell clone(){
        Cell clonedCell = null;
        String[] colores = {"Red","Blue","Yellow","Black","White","Green"};
        try{
            clonedCell = (Cell) super.clone();
            clonedCell.setColor(colores[(int) (Math.random() * 6)]);
            clonedCell.setVida((int) (Math.random() * 50) + 25);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clonedCell;
    }
    
}
