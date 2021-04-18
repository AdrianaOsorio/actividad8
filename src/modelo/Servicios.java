/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class Servicios {

  
    private String tipoServicio;
    private double costoTotal;

    public Servicios() {

    }

    public Servicios(String tipoDeVehiculo, String tipoServicio, double costoTotal) {
        
        this.tipoServicio = tipoServicio;
        this.costoTotal = costoTotal;
    }
    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double ValorServicios(String tipoServicio, String Combo) {

        double costoServicio;
        String Valida = "S";
        switch (tipoServicio) {

            case "1":
                costoServicio = 15000;
                this.costoTotal = costoServicio;
                break;

            case "2":
                costoServicio = 20000;
                this.costoTotal = costoServicio;
                break;

            case "3":
                costoServicio = 25000;
                this.costoTotal = costoServicio;
                break;

            case "4":
                costoServicio = 30000;
                this.costoTotal = costoServicio;
                break;

            case "5":

                String opcion;
                
                opcion = JOptionPane.showInputDialog(null, "Digite el numero del combo que desea");
                
                
                switch (opcion) {
                  
                    case "1":
                        costoServicio = 35000;
                        this.costoTotal = costoServicio;
                        break;

                    case "2":
                        costoServicio = 40000;
                        this.costoTotal = costoServicio;
                        break;

                    case "3":
                        costoServicio = 45000;
                        this.costoTotal = costoServicio;
                        break;
                      default:
                      costoTotal = 0;
                      Valida = "N";
                      JOptionPane.showMessageDialog(null, "Opcion no Existente");
                      break;
            
 
                }
      
 

        }
        if (Valida.equals("S")) {
            switch (Combo) {

                case "Automovil":
                    costoServicio = 5000;
                    this.costoTotal += costoServicio;
                    break;

                case "Camioneta":
                    costoServicio = 15000;
                    this.costoTotal += costoServicio;
                    break;

            }
            
            
        }
        return costoTotal;

    }

}
