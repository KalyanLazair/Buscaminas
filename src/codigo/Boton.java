/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.JButton;

/**
 *
 * @author Thomas
 */
public class Boton extends JButton {
    
    private int mina=0;
    private int i=0;
    private int j=0;
    
    private int numeroMinasAlrededor=0; //calcula el número de minas que hay alrededor de un punto.
    
    
    public Boton(int _i,int _j){
        i=_i;
        j=_j; //Son las posiciones x,y del botón.
        this.setBorder(null);
    
    }
//Getter y Setter. Botón derecho sobre "mina", getter y setter.
    public int getMina() {
        return mina;
    }

    public void setMina(int mina) {
        this.mina = mina;
    }

    public int getNumeroMinasAlrededor() {
        return numeroMinasAlrededor;
    }

    public void setNumeroMinasAlrededor(int numeroMinasAlrededor) {
        this.numeroMinasAlrededor = numeroMinasAlrededor;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
