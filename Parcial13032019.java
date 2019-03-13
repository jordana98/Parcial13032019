/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial13032019;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s204e15
 */
public class Parcial13032019 {
static ArrayList<Vehiculo> vehiculo= new ArrayList<Vehiculo>();
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        llenarMoto();  //se llama al metodo de llenar moto
        llenarAutomovil(); //se llama al metodo de llenar automovil
        llenarCamion(); //se llama al metodo de llenar camion
        mostrarResultados(); //se llama al metodo para mostrar los resultados
    }
    
    //metodo para llenar 3 motos
    public static void llenarMoto(){
        String marca;
        String placa;
        double valor;
        int numeroEje;
       
        vehiculo.add(new Moto(placa="abc123", marca="hyundai", valor=7.0));
        vehiculo.add(new Moto(placa="345rft", marca="yamaha", valor=7.0));
        vehiculo.add(new Moto(placa="bts136", marca="honda", valor=7.0));
    }
    //metodo para llenar 4 automoviles
    public static void llenarAutomovil(){
        String marca;
        String placa;
        double valor;
        int numeroEje;
        vehiculo.add(new Automovil(placa="ert789", marca="hyundai", valor=7.0));
        vehiculo.add(new Automovil(placa="234sdf", marca="nissan", valor=7.0));
        vehiculo.add(new Automovil(placa="976axc", marca="audi", valor=7.0));
        vehiculo.add(new Automovil(placa="qew531", marca="ford", valor=7.0));
        
        
    }
    //metodo para llenar 4 camiones
    public static void llenarCamion(){
        String marca;
        String placa;
        double valor;
        int numeroEje;
        vehiculo.add(new Camion(placa="987edt", marca="hyundai", valor=7.0, numeroEje=1));
        vehiculo.add(new Camion(placa="abs345", marca="toyota", valor=7.0, numeroEje=2));
        vehiculo.add(new Camion(placa="892sdf", marca="nissan", valor=7.0, numeroEje=1));
        vehiculo.add(new Camion(placa="azx789", marca="kia", valor=7.0, numeroEje=2));
       
    }
    //metodo para mostrar
     public static void mostrarResultados(){
        for(Vehiculo vehi: vehiculo){
            System.out.println(vehi.toString());
            System.out.println("");
        }
    }
}
