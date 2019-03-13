/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial13032019;

/**
 *
 * @author s204e15
 */
public abstract class Vehiculo {
    protected int numeroEje;

    public Vehiculo(int numeroEje) {
        this.numeroEje = numeroEje;
    }

    public int getNumeroEje() {
        return numeroEje;
    }

    public void setNumeroEje(int numeroEje) {
        this.numeroEje = numeroEje;
    }

    @Override
    public String toString() {
        return ", numeroEje=" + numeroEje + '}';
    }

   
    
    public abstract double valorPeaje();
    
}
