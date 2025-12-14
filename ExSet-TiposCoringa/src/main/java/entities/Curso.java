package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    String nome;

    Instrutor instrutor;

    List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nome, curso.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
