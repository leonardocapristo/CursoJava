package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Usuario{

    public Aluno(Integer id) {
        super(id);
    }

    private List<Curso> cursos = new ArrayList<>();


    public List<Curso> getCursos() {
        return cursos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;
        return Objects.equals(this.id, aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }



}
