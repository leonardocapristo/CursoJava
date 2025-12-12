import entities.Aluno;
import entities.Cursos;
import entities.Instrutor;
import entities.Usuario;

public class Application {

    public static void main(String[] args) {


        Usuario instrutor = new Instrutor(1);

        Cursos curso1 = new Cursos("Java", (Instrutor) instrutor);
        Cursos curso2 = new Cursos("GitHub", (Instrutor) instrutor);

        Usuario aluno1 = new Aluno(494);
        Usuario aluno2 = new Aluno(421);
        Usuario aluno3 = new Aluno(577);


        ((Aluno) aluno1).getListaCursos().add(curso1);




    }
}
