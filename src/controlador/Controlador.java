/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Servicios;
import vista.Vista;



public class Controlador implements ActionListener{
    private Servicios servicios;
    private Vista vista;    
    
public Controlador(Servicios servicios,Vista vista) {
 this.servicios = servicios;
 this.vista = vista;
 this.vista.botonConsultar.addActionListener(this);
 this.vista.calcularValor.addActionListener(this);

 
}

public void Vista() {
 
vista.setTitle("Lavado de autos la estrella");
vista.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vista.calcularValor == e.getSource()) {
        if(!"".equals(vista.tipoDeServicio.getText())){
        if(!"".equals(vista.combo.getSelectedItem())){    
            
            
            double Costo = servicios.ValorServicios(vista.tipoDeServicio.getText(),vista.combo.getSelectedItem().toString());
 
            if(Costo != 0.0){
            JOptionPane.showMessageDialog(null,servicios.getCostoTotal());
             }

            
        }else if (vista.botonConsultar == e.getSource()) {
if(!"".equals(vista.tipoDeServicio.getText())) {
            
        }    
    }
        }
    }
}
}

    
    
    
    

