package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario{

    public Aluno(Integer id) {
        super(id);
    }

    private List<Cursos> listaCursos = new ArrayList<>();


    public List<Cursos> getListaCursos() {
        return listaCursos;
    }

}
