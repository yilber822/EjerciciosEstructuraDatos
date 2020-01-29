/*
 * Created by JFormDesigner on Mon Jan 27 18:07:32 EST 2020
 */

package com.ejercicio.co.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class MainMenu extends JPanel implements ActionListener {
    public MainMenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        MainMenu = new JFrame();
        PredioRecidencial = new JButton();
        PredioComercial = new JButton();
        Cerrar = new JButton();

        //======== MainMenu ========
        {
            MainMenu.setTitle("Ministerio de Hacienda");
            MainMenu.setMinimumSize(new Dimension(420, 255));
            var MainMenuContentPane = MainMenu.getContentPane();
            MainMenuContentPane.setLayout(null);

            //---- PredioRecidencial ----
            PredioRecidencial.setText("Predio Residencial");
            MainMenuContentPane.add(PredioRecidencial);
            PredioRecidencial.setBounds(new Rectangle(new Point(145, 40), PredioRecidencial.getPreferredSize()));

            //---- PredioComercial ----
            PredioComercial.setText("Predio Comercial");
            MainMenuContentPane.add(PredioComercial);
            PredioComercial.setBounds(145, 95, 131, 30);

            //---- Cerrar ----
            Cerrar.setText("Cerrar");
            MainMenuContentPane.add(Cerrar);
            Cerrar.setBounds(145, 155, 131, 30);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < MainMenuContentPane.getComponentCount(); i++) {
                    Rectangle bounds = MainMenuContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = MainMenuContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                MainMenuContentPane.setMinimumSize(preferredSize);
                MainMenuContentPane.setPreferredSize(preferredSize);
            }
            MainMenu.pack();
            MainMenu.setLocationRelativeTo(MainMenu.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenu.setVisible(true);
        MainMenu.setLocationRelativeTo(null);
        addActionListener();
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame MainMenu;
    private JButton PredioRecidencial;
    private JButton PredioComercial;
    private JButton Cerrar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    private void addActionListener() {
        this.Cerrar.addActionListener(this);
        this.PredioComercial.addActionListener(this);
        this.PredioRecidencial.addActionListener(this);
    }

    private void closeProgram(){
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == this.Cerrar){
            this.closeProgram();
        }
        if(event.getSource() == this.PredioRecidencial){
            this.MainMenu.setVisible(false);
            PredioRecidencialInt guiPredioRecidencial = new PredioRecidencialInt();
        }

        if(event.getSource() == this.PredioComercial){
            this.MainMenu.setVisible(false);
            PredioComercialInt guiPredioComercial = new PredioComercialInt();
        }

    }
}
