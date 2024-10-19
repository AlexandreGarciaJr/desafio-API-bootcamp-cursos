import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria em java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Alexandre" + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Alexandre" + devAlexandre.getConteudosInscritos());
        System.out.println("Conteudos concluídos Alexandre" + devAlexandre.getConteudosConcluidos());
        System.out.println("XP: " + devAlexandre.calcularTotalXp());

        System.out.println("-----------");

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jorge " + devJorge.getConteudosInscritos());
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Jorge " + devJorge.getConteudosInscritos());
        System.out.println("Conteudos concluídos Jorge " + devJorge.getConteudosConcluidos());
        System.out.println("XP: " + devJorge.calcularTotalXp());

    }
}
