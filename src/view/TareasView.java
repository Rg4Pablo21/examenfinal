package view;
import javax.swing.*;
import java.awt.*;

public class TareasView extends JFrame {

    private JPanel panelControles;
    private JPanel panelTareas;
    private JPanel panelNuevaTarea;
    private JPanel panelEliminarTarea;

    public TareasView() {
        setTitle("Gestor de Tareas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Panles
        panelControles = new JPanel();
        panelTareas = new JPanel();
        panelNuevaTarea = new JPanel();
        panelEliminarTarea = new JPanel();

        //Configuración
        panelControles.setLayout(new FlowLayout());
        panelTareas.setLayout(new BoxLayout(panelTareas, BoxLayout.Y_AXIS));
        panelNuevaTarea.setLayout(new GridLayout(3, 2));
        panelEliminarTarea.setLayout(new GridLayout(2, 2));


        add(panelControles, BorderLayout.NORTH);
        add(new JScrollPane(panelTareas), BorderLayout.CENTER);
        add(panelNuevaTarea, BorderLayout.EAST);
        add(panelEliminarTarea, BorderLayout.WEST);


        configurarInterfazControles();
        configurarPanelNuevaTarea();
        configurarPanelEliminarTarea();

        setVisible(true);
    }


    private void configurarInterfazControles() {
        JButton botonCrearTarea = new JButton("Crear Tarea");
        JButton botonEliminarTarea = new JButton("Eliminar Tarea");

        panelControles.add(botonCrearTarea);
        panelControles.add(botonEliminarTarea);


        botonCrearTarea.addActionListener(e -> {

        });

        botonEliminarTarea.addActionListener(e -> {

        });
    }


    private void configurarPanelNuevaTarea() {
        JLabel labelTitulo = new JLabel("Título:");
        JTextField campoTitulo = new JTextField(15);
        JLabel labelDescripcion = new JLabel("Descripción:");
        JTextField campoDescripcion = new JTextField(15);
        JLabel labelFechaLimite = new JLabel("Fecha Límite:");
        JTextField campoFechaLimite = new JTextField(10);

        panelNuevaTarea.add(labelTitulo);
        panelNuevaTarea.add(campoTitulo);
        panelNuevaTarea.add(labelDescripcion);
        panelNuevaTarea.add(campoDescripcion);
        panelNuevaTarea.add(labelFechaLimite);
        panelNuevaTarea.add(campoFechaLimite);

        JButton botonAgregarTarea = new JButton("Agregar Tarea");
        panelNuevaTarea.add(botonAgregarTarea);


    }



    private void configurarPanelEliminarTarea() {
        JLabel labelIdTarea = new JLabel("ID de Tarea:");
        JTextField campoIdTarea = new JTextField(10);
        JButton botonEliminarTarea = new JButton("Eliminar Tarea");

        panelEliminarTarea.add(labelIdTarea);
        panelEliminarTarea.add(campoIdTarea);
        panelEliminarTarea.add(botonEliminarTarea);



    }

    public static void main(String[] args) {
        new TareasView();
    }


}
