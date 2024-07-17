import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria JS", "Descrição Mentoria JS", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println("\n" + mentoria1);
        System.out.println(mentoria2);

    }


}
