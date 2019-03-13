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
public class Camion extends Vehiculo{
    private String placa;
    private String marca;
    private double valor;

    public Camion(String placa, String marca, double valor, int numeroEje) {
        super(numeroEje);
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
    }

    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +"Camion{" + "placa=" + placa + ", marca=" + marca + ", valor=" + valor +super.toString()+ '}';
    }
    

    
    @Override
    public double valorPeaje(){
      return super.getNumeroEje()*valor;
    }
    
}
