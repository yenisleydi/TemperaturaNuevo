package TablaConsulta;

import Pojo.Datos;
import Pojo.Titulos;
import Temperatura.Temperatura;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Tabla extends JFrame {
    private JTable jTable;
    private DefaultTableModel modelo;
    public Tabla (){
        initControl();
        configTable();
        configFrame();

    }

    private void initControl(){
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(Titulos.misTitulos);
        String [] fila = new String[7];
        ArrayList<Datos> lista = Temperatura.getElemento();
        for (Datos userTable : lista) {
            fila[0] = userTable.getNombre();
            fila[1] = userTable.getEdad();
            fila[2] = userTable.getCelcius();
            fila[3] = userTable.getFarenheit();

            modelo.addRow(fila);
        }
        jTable = new JTable(modelo);
    }
    private void configFrame(){
        setTitle("DATOS DEL PACIENTE");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(650, 200);
    }
    private void configTable(){
        jTable.setGridColor(new Color(88, 214, 141));
        jTable.setPreferredScrollableViewportSize(new Dimension(600, 70));

        JScrollPane scrollPane = new JScrollPane(jTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);


    }
}
