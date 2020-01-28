/*
 * Created by JFormDesigner on Mon Jan 27 16:20:02 EST 2020
 */

package com.ejercicio.co.GUI;

import com.ejercicio.co.GUI.MainMenu;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author unknown
 */
public class PredioComercial extends JPanel implements ActionListener {
    public PredioComercial() {
        initComponents();
        this.addActionListener();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        AvaluoComercial = new JFrame();
        panel1 = new JPanel();
        Back = new JButton();
        Calculate = new JButton();
        RegistroLabel = new JLabel();
        DireccionLabel = new JLabel();
        MetrajeLabel = new JLabel();
        MontoDeLabel = new JLabel();
        MontoAvaluo = new JLabel();
        RegistroTextField = new JTextField();
        DireccionTextField = new JTextField();
        MetrajeTextField3 = new JTextField();
        MontoAvaluoTextField4 = new JTextField();
        MetrajeLabel2 = new JLabel();
        MetrajeTextField4 = new JTextField();

        //======== AvaluoComercial ========
        {
            AvaluoComercial.setMinimumSize(new Dimension(480, 450));
            AvaluoComercial.setName("Ministerio de Hacienda");
            AvaluoComercial.setTitle("Avaluo Comercial");
            var AvaluoComercialContentPane = AvaluoComercial.getContentPane();
            AvaluoComercialContentPane.setLayout(new MigLayout(
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
                panel1.setMinimumSize(new Dimension(480, 380));
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
                EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing
                . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
                java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
                { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () ))
                throw new RuntimeException( ); }} );
                panel1.setLayout(null);

                //---- Back ----
                Back.setText("Atras");
                panel1.add(Back);
                Back.setBounds(40, 330, 155, 40);

                //---- Calculate ----
                Calculate.setText("Calcular");
                panel1.add(Calculate);
                Calculate.setBounds(280, 330, 155, 40);

                //---- RegistroLabel ----
                RegistroLabel.setText("Registro:");
                panel1.add(RegistroLabel);
                RegistroLabel.setBounds(125, 60, 60, 21);

                //---- DireccionLabel ----
                DireccionLabel.setText("Direccion:");
                panel1.add(DireccionLabel);
                DireccionLabel.setBounds(125, 120, 60, 21);

                //---- MetrajeLabel ----
                MetrajeLabel.setText("Ingresos Reportados:");
                panel1.add(MetrajeLabel);
                MetrajeLabel.setBounds(65, 175, 120, 21);

                //---- MontoDeLabel ----
                MontoDeLabel.setText("Monto de");
                panel1.add(MontoDeLabel);
                MontoDeLabel.setBounds(125, 215, 70, 20);

                //---- MontoAvaluo ----
                MontoAvaluo.setText("Avaluo");
                panel1.add(MontoAvaluo);
                MontoAvaluo.setBounds(130, 235, 45, 20);
                panel1.add(RegistroTextField);
                RegistroTextField.setBounds(190, 55, 145, 35);
                panel1.add(DireccionTextField);
                DireccionTextField.setBounds(190, 115, 145, 30);
                panel1.add(MetrajeTextField3);
                MetrajeTextField3.setBounds(190, 170, 145, 30);
                panel1.add(MontoAvaluoTextField4);
                MontoAvaluoTextField4.setBounds(190, 220, 145, 30);

                //---- MetrajeLabel2 ----
                MetrajeLabel2.setText("Valorizacion Total:");
                panel1.add(MetrajeLabel2);
                MetrajeLabel2.setBounds(75, 280, 110, 21);

                //---- MetrajeTextField4 ----
                MetrajeTextField4.setEditable(false);
                MetrajeTextField4.setText("0");
                panel1.add(MetrajeTextField4);
                MetrajeTextField4.setBounds(190, 275, 145, 30);

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
            AvaluoComercialContentPane.add(panel1, "cell 1 1");
            AvaluoComercial.pack();
            AvaluoComercial.setLocationRelativeTo(AvaluoComercial.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        AvaluoComercial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AvaluoComercial.setVisible(true);
        AvaluoComercial.setLocationRelativeTo(null);

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame AvaluoComercial;
    private JPanel panel1;
    private JButton Back;
    private JButton Calculate;
    private JLabel RegistroLabel;
    private JLabel DireccionLabel;
    private JLabel MetrajeLabel;
    private JLabel MontoDeLabel;
    private JLabel MontoAvaluo;
    private JTextField RegistroTextField;
    private JTextField DireccionTextField;
    private JTextField MetrajeTextField3;
    private JTextField MontoAvaluoTextField4;
    private JLabel MetrajeLabel2;
    private JTextField MetrajeTextField4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void addActionListener(){
        this.Back.addActionListener(this);
        this.Calculate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == this.Back){
            this.AvaluoComercial.setVisible(false);
            MainMenu menu = new MainMenu();
        }
        if(event.getSource() == this.Calculate){
            callPredioRecidencial();
        }
    }

    private void callPredioRecidencial() {
        //TODO Here you will call the object to perform the "Avaluo" process"
    }
}
