package sevices;

import view.TareaView;


import java.util.ArrayList;

public class DataTareas {
    public static void cargaTareas(ArrayList<TareaView> Tareas){
        Tareas.add(new TareaView("Lenguaje","Lectura","2:00","En progreso "));
        Tareas.add(new TareaView("Matematicas","Division y Multiplicación","5:30","Incompleto"));
        Tareas.add(new TareaView("Computación","Computadoras","9:45","Completadp"));
        Tareas.add(new TareaView("Ingles","Lengua Inglesa","10:20","En progreso"));
        Tareas.add(new TareaView("Naturales","Naturaleza","20:00","Completado"));

    }

    public void getListaTareas() {
    }

    public void eliminarTarea(String titulo) {
    }
}


