package com.dio.desafio;

import java.time.LocalDate;
import java.util.Currency;

import com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);
    }
}
