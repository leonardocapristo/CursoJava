import entities.Aluno;
import entities.Curso;
import entities.Instrutor;
import entities.Usuario;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario instrutor = new Instrutor(1);



        Curso Java = new Curso("Java", (Instrutor) instrutor);
        Curso GitHub = new Curso("GitHub", (Instrutor) instrutor);
        Curso SpringBoot = new Curso("Spring Boot", (Instrutor) instrutor);

        List<Curso> listaCursos = new ArrayList<>();

        listaCursos.add(Java);
        listaCursos.add(GitHub);
        listaCursos.add(SpringBoot);

        for (int i = 0; i < listaCursos.size(); i++) {

            System.out.println("Quantos alunos para o curso : " + listaCursos.get(i).getNome());
            int n = sc.nextInt();

            for (int j = 1; j <= n; j++) {

                System.out.println("Digite o id do aluno : " +  j);
                int id = sc.nextInt();

                Aluno aluno = new Aluno(id);

                aluno.getCursos().add(listaCursos.get(i));
                listaCursos.get(i).getAlunos().add(aluno);
                
            }
        }

        Set<Curso> setCursos = new HashSet<>();

        for (int i = 0; i < listaCursos.size(); i++) {
            setCursos.add(listaCursos.get(i));
        }

        int total= 0;


        Set<Aluno> alunosUnicos = new HashSet<>();



        for (Curso curso : listaCursos) {
            for (Aluno aluno : curso.getAlunos()) {
                alunosUnicos.add(aluno);
            }
        }





        System.out.println("Total de alunos únicos: " + alunosUnicos.size());











        sc.close();

    }
}
