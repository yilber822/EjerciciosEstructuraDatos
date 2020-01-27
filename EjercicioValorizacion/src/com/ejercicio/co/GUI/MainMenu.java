/*
 * Created by JFormDesigner on Mon Jan 27 16:20:02 EST 2020
 */

package com.ejercicio.co.GUI;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class MainMenu extends JPanel {
    public MainMenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        MainMenuFrame = new JFrame();
        panel1 = new JPanel();
        Close = new JButton();
        Calculate = new JButton();
        SelectLabel = new JComboBox();
        TipoPredioLabel = new JLabel();

        //======== MainMenuFrame ========
        {
            MainMenuFrame.setMinimumSize(new Dimension(835, 450));
            var MainMenuFrameContentPane = MainMenuFrame.getContentPane();
            MainMenuFrameContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //======== panel1 ========
            {
                panel1.setMinimumSize(new Dimension(800, 380));
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
                ( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border
                . TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ), java. awt
                . Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
                propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( )
                ; }} );
                panel1.setLayout(null);

                //---- Close ----
                Close.setText("Close");
                panel1.add(Close);
                Close.setBounds(40, 330, 155, 40);

                //---- Calculate ----
                Calculate.setText("Calcute");
                panel1.add(Calculate);
                Calculate.setBounds(590, 330, 155, 40);
                panel1.add(SelectLabel);
                SelectLabel.setBounds(115, 50, 150, 35);

                //---- TipoPredioLabel ----
                TipoPredioLabel.setText("Tipo de Predio:");
                panel1.add(TipoPredioLabel);
                TipoPredioLabel.setBounds(10, 50, 100, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            MainMenuFrameContentPane.add(panel1, "cell 1 1");
            MainMenuFrame.pack();
            MainMenuFrame.setLocationRelativeTo(MainMenuFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        MainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenuFrame.setVisible(true);
        MainMenuFrame.setLocationRelativeTo(null);

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame MainMenuFrame;
    private JPanel panel1;
    private JButton Close;
    private JButton Calculate;
    private JComboBox SelectLabel;
    private JLabel TipoPredioLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
