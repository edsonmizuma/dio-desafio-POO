import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Título curso java");
        curso1.setDescricao("Descrição Curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Título curso js");
        curso2.setDescricao("Descrição Curso js");
        curso2.setCargaHoraria(9);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Título  Mentoria java");
        mentoria1.setDescricao("Descrição Mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Título  Mentoria js");
        mentoria2.setDescricao("Descrição Mentoria js");
        mentoria2.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Edson");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredirBootcamp();
        dev1.progredirBootcamp();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Edson: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Edson: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("------------------------------------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp1);
        dev2.progredirBootcamp();
        dev2.progredirBootcamp();
        dev2.progredirBootcamp();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());

    }


}
