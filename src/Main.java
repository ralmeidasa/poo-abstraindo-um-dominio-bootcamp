import desafioDio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1 + "\n");
        System.out.println(curso2 + "\n");
        System.out.println(mentoria1 + "\n");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRafa = new Dev();
        devRafa.setNome("Rafael");
        devRafa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Rafael: " + devRafa.getConteudosInscritos());
        devRafa.progredir();
        devRafa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Rafael: " + devRafa.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Rafael: " + devRafa.getConteudosConcluidos());
        System.out.println("XP: " + devRafa.calcularTotalXp());

        System.out.println("-----------------------------------------");

        Dev devIori = new Dev();
        devIori.setNome("Iori");
        devIori.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Iori: " + devIori.getConteudosInscritos());
        devIori.progredir();
        devIori.progredir();
        devIori.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Iori: " + devIori.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Iori: " + devIori.getConteudosConcluidos());
        System.out.println("XP: " + devIori.calcularTotalXp());



    }
}