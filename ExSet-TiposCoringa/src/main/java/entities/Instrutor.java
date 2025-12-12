package entities;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Usuario{



    List<Cursos> cursos = new ArrayList<>();


    public Instrutor(Integer id) {
        super(id);
    }

    public List<Cursos> getCursos() {
        return cursos;
    }


}
