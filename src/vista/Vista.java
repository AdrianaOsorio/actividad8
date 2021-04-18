/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Vista extends JFrame {
    
    private JPanel principal;
    private JLabel nombre, vehiculo, servicio, opcion;
    private JLabel produccionServicio, produccionFuncionario, produccionRangosFecha;
    private JOptionPane produccion;
    public JButton botonConsultar,calcularValor;
    public JTextField tipoDeServicio;
    public JComboBox combo;
  
    Color azul = new Color(194, 224, 223);
    
    public Vista() {
        
     setBounds(0, 0, 560, 500);
     setDefaultCloseOperation(EXIT_ON_CLOSE);    
     setTitle("Centro de lavado de autos");
     this.setLocationRelativeTo(null);
        

     // getContentPane().setLayout(new BorderLayout());
      principal = new JPanel();
      principal.setLayout(null);
     
      nombre = new JLabel("La Estrella");
      servicio = new JLabel("<html>Servicios:<br> 1.Lavado Básico:Incluye lavado exterior, lavado interior y aspirada.<br> 2.Lavado Especial: Incluye lavado básico más polichado con maquina y las ceras. <br> 3.Desinfección Básica: Incluye maquina generadora de ozono.<br> 4.Desinfección Avanzada:Incluye desinfección básica y limpieza interior con máquina de vapor.<br> 5.Combos:<br> Combo 1: Lavado, polichado y desengrasante por debajo<br>  Combo 2: combo 1 + grafitado de chasis<br> Combo 3: combo 2 + tapicería desmontado de sillas para un aseo más profundo</html>") ;
      vehiculo = new JLabel("Elija el tipo de vehiculo:");
      opcion = new JLabel("Digite un numero de 1 a 5:");
      botonConsultar = new JButton("Consultar");
      calcularValor = new JButton("Valor");
      tipoDeServicio = new JTextField(50); 
      produccionServicio = new JLabel("Produccion Servicios");
      produccionFuncionario = new JLabel("Produccion Funcionario");
      produccionRangosFecha = new JLabel("Produccion Fecha");
      combo = new JComboBox();
      combo.addItem("Automovil");
      combo.addItem("Camioneta");
      
      
      
      nombre.setBounds(200, 30,200 , 25);
      servicio.setBounds(40, 60, 500,150);
      opcion.setBounds(50, 220, 250, 40);
      tipoDeServicio.setBounds(50, 250, 150, 40);
      botonConsultar.setBounds(220,370,100,40);
      calcularValor.setBounds(220,310,100,40);
      vehiculo.setBounds(350, 220, 150, 40);
      combo.setBounds(350, 250, 150, 40);
      
      
      principal.setBackground(azul);
      principal.setLayout(null);
      nombre.setForeground(Color.black);
      nombre.setFont(new Font("arial", Font.BOLD, 25));
      servicio.setForeground(Color.black);
      servicio.setFont(new Font("arial", Font.BOLD, 12));
      
      
      add(principal);
      principal.add(nombre);
      principal.add(servicio);
      principal.add(calcularValor);
      principal.add(tipoDeServicio);
      principal.add(produccionServicio);
      principal.add(produccionFuncionario);
      principal.add(produccionRangosFecha);
      principal.add(combo);
      principal.add(opcion);
      principal.add(vehiculo);
   
        
    }
   
   
    
    
    
    
    
    
    
    
}
