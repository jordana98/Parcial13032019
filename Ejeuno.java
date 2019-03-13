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
public class Ejeuno extends Camion{

    public Ejeuno(String placa, String marca, double valor) {
        super(placa, marca, valor, 1);
    }

    @Override
    public String toString() {
        return super.toString()+", eje uno"+ '}';
    }

   
    

   
    
    
    
}
