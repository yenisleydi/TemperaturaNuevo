package Temperatura;

import Pojo.Datos;
import TablaConsulta.Tabla;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Temperatura extends JFrame{
    private static ArrayList<Datos> datos=new ArrayList<>();
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton guardarButton;
    private JButton consultarButton;

    public Temperatura(){
        setupFrame();
        initButton();
    }
    public void initButton(){
        guardarButton.addActionListener(new EventClick());
        consultarButton.addActionListener(e -> {
            this.setVisible(false);
            new Tabla().setVisible(true);
        });
    }
    private void setupFrame() {
        setTitle("Formulario");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 250);
        add(panel1);
    }

    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String opcion = boton.getText();
            if (opcion.equals("Guardar")) {
                String nombre = textField1.getText();
                String edad = textField2.getText();
                String celcius = textField3.getText();
                String fahrenheit = textField4.getText();

                // double celsiusValue = Double.parseDouble(celcius);
                // double fahrenheitValue = celsiusToFahrenheit(celsiusValue);

                //double fahrenheitValue = Double.parseDouble(fahrenheit);
                //double celsiusValue = fahrenheitToCelsius(fahrenheitValue);
                datos.add(new Datos(nombre, edad, celcius, fahrenheit));

                textField1.setText(" ");
                textField2.setText(" ");
                textField3.setText(" ");
                textField4.setText(" ");

            }
        }
    }

    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        new Temperatura();
    }
    public static ArrayList<Datos> getElemento (){
        return datos;
    }
}
