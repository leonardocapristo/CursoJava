package entities;

import java.util.ArrayList;
import java.util.List;

public class Cursos {

    String nome;

    Instrutor instrutor;

    List<Aluno> alunos = new ArrayList<>();

    public Cursos(String nome, Instrutor instrutor) {
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
}
