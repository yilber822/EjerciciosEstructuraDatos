/*
 * Created by JFormDesigner on Mon Jan 27 16:20:02 EST 2020
 */

package com.ejercicio.co.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.ejercicio.co.Entities.*;

import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class PredioResidencialInt extends JPanel implements ActionListener {
    public PredioResidencialInt() {
        initComponents();
        this.addActionListener();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        AvaluoRecidencial = new JFrame();
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

        //======== AvaluoRecidencial ========
        {
            AvaluoRecidencial.setMinimumSize(new Dimension(480, 450));
            AvaluoRecidencial.setName("Ministerio de Hacienda");
            AvaluoRecidencial.setTitle("Avaluo Residencial");
            var AvaluoRecidencialContentPane = AvaluoRecidencial.getContentPane();
            AvaluoRecidencialContentPane.setLayout(new MigLayout(
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
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
                javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
                . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
                .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
                . Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans.
                PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
                equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
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
                MetrajeLabel.setText("Metraje:");
                panel1.add(MetrajeLabel);
                MetrajeLabel.setBounds(125, 175, 60, 21);

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
            AvaluoRecidencialContentPane.add(panel1, "cell 1 1");
            AvaluoRecidencial.pack();
            AvaluoRecidencial.setLocationRelativeTo(AvaluoRecidencial.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        AvaluoRecidencial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AvaluoRecidencial.setVisible(true);
        AvaluoRecidencial.setLocationRelativeTo(null);

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame AvaluoRecidencial;
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
            this.AvaluoRecidencial.setVisible(false);
            MainMenu menu = new MainMenu();
        }
        if(event.getSource() == this.Calculate){
            callPredioRecidencial();
        }
    }

    private void callPredioRecidencial() {
        //TODO Here you will call the object to perform the "Avaluo" process"
    	String registro = this.RegistroTextField.getText();
		String direccion = this.DireccionTextField.getText();
		long montoAvaluo =Long.parseLong(this.MontoAvaluoTextField4.getText());
		float dimension =Float.parseFloat(this.MetrajeTextField3.getText());
		Predio predio;
		predio = new PredioResidencial();
		
		
		
		predio.setDireccion(direccion);
		predio.setMontoAvaluo(montoAvaluo);
		predio.setRegistro(registro);
		((PredioResidencial)predio).setDimension(dimension);
		
		this.MetrajeTextField4.setText("$ "+((PredioResidencial)predio).calcularValorizacion());
		
		JOptionPane.showMessageDialog(null, ((PredioResidencial)predio).toString());
    }
}
