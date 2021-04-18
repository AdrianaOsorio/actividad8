/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import controlador.Controlador;
import modelo.Servicios;
import vista.Vista;


public class LaEstrella {

    
    public static void main(String[] args) {
        
        try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
 }
 catch (UnsupportedLookAndFeelException e) {
 }
 catch (ClassNotFoundException e) {
 }
 catch (InstantiationException e) {
 }
 catch (IllegalAccessException e) {
 }
        
Servicios servicios = new Servicios();
Vista vista = new Vista();
Controlador controlador = new Controlador(servicios, vista);
controlador.Vista();
}
}
    


