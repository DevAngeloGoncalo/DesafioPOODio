package com.dio.desafio;

import java.time.LocalDate;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Conteudo;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Lógica de Programação");
        curso1.setDescricao("Descrição Lógica de Programação");
        curso1.setCargaHoraria(40);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Estrutura de Dados");
        curso2.setDescricao("Descrição Estrutura de Dados");
        curso2.setCargaHoraria(40);

        Curso curso3 = new Curso();
        curso3.setTitulo("Desenvolvimento Web");
        curso3.setDescricao("Descrição Desenvolvimento Web");
        curso3.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Desenvolvimento Web");
        mentoria1.setDescricao("Descrição Mentoria Desenvolvimento Web");
        mentoria1.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(curso3);
        // System.out.println(mentoria1);

        // //Polimorfismo
        // Conteudo conteudo1 = new Curso();
        // Conteudo conteudo2 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA");
        bootcamp.setDescricao("Descrição Bootcamp JAVA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devTadeu = new Dev();
        devTadeu.setNome("Tadeu");
        devTadeu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tadeu: " + devTadeu.getConteudosInscritos());
        devTadeu.progredir();
        System.out.println("--------------------------------");
        System.out.println("Conteúdos Inscritos Tadeu: " + devTadeu.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Tadeu: " + devTadeu.getConteudosConcluidos());
        System.out.println("XP: " + devTadeu.calcularTotalXP());


        System.out.println("\n");


        Dev devLucia = new Dev();
        devLucia.setNome("Lucia");
        devLucia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucia: " + devLucia.getConteudosInscritos());
        devLucia.progredir();
        devLucia.progredir();
        System.out.println("--------------------------------");
        System.out.println("Conteúdos Inscritos Tadeu: " + devLucia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Tadeu: " + devLucia.getConteudosConcluidos());
        System.out.println("XP: " + devLucia.calcularTotalXP());

    }
}
