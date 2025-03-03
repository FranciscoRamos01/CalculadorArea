/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoranota;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraNota extends JFrame {
    private JTextField txtPrimerCorte;
    private JTextField txtSegundoCorte;
    private JTextField txtTercerCorte;
    private JTextField txtNotaFinal;
    private JButton btnCalcular;
    
    public CalculadoraNota() {
       
        setTitle("Calculadora de Nota Final");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        JLabel lblPrimerCorte = new JLabel("Primer Corte (30%):");
        lblPrimerCorte.setBounds(20, 20, 150, 25);
        add(lblPrimerCorte);
        
        JLabel lblSegundoCorte = new JLabel("Segundo Corte (30%):");
        lblSegundoCorte.setBounds(20, 60, 150, 25);
        add(lblSegundoCorte);
        
        JLabel lblTercerCorte = new JLabel("Tercer Corte (40%):");
        lblTercerCorte.setBounds(20, 100, 150, 25);
        add(lblTercerCorte);
        
        JLabel lblNotaFinal = new JLabel("Nota Final:");
        lblNotaFinal.setBounds(20, 180, 100, 25);
        add(lblNotaFinal);
        
        txtPrimerCorte = new JTextField();
        txtPrimerCorte.setBounds(180, 20, 150, 25);
        add(txtPrimerCorte);
        
        txtSegundoCorte = new JTextField();
        txtSegundoCorte.setBounds(180, 60, 150, 25);
        add(txtSegundoCorte);
        
        txtTercerCorte = new JTextField();
        txtTercerCorte.setBounds(180, 100, 150, 25);
        add(txtTercerCorte);
        
        txtNotaFinal = new JTextField();
        txtNotaFinal.setBounds(180, 180, 150, 25);
        txtNotaFinal.setEditable(false);
        add(txtNotaFinal);
        
        // Crear el botón de calcular
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 140, 100, 30);
        add(btnCalcular);
        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    double primerCorte = Double.parseDouble(txtPrimerCorte.getText());
                    double segundoCorte = Double.parseDouble(txtSegundoCorte.getText());
                    double tercerCorte = Double.parseDouble(txtTercerCorte.getText());
                    
                    
                    double notaFinal = (primerCorte * 0.30) + (segundoCorte * 0.30) + (tercerCorte * 0.40);
                    
                    
                    txtNotaFinal.setText(String.format("%.2f", notaFinal));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos para las notas.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraNota().setVisible(true);
            }
        });
    }
}