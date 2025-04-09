package org.example.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDate {

    public static void main(String[] args) {

        // Pega a data e hora atual
        LocalDateTime data = LocalDateTime.now();

        // Mostra o dia da semana atual (ex: WEDNESDAY)
        System.out.println("Dia da semana: " + data.getDayOfWeek().name());

        // Mostra o número do mês (1 a 12)
        System.out.println("Mes: " + data.getMonthValue());

        // Mostra o nome do mês (ex: APRIL)
        System.out.println("Mes: " + data.getMonth());

        // Mostra o ano atual
        System.out.println("Ano: " + data.getYear());

        // Mostra hora, minutos e segundos
        System.out.println("Hora: " + data.getHour());
        System.out.println("Minutos: " + data.getMinute());
        System.out.println("Segundos: " + data.getSecond());


        // Criando uma data específica: 10 de março de 2025
        LocalDate outraData = LocalDate.of(2025, Month.MARCH, 10);

        // Mostra essa data
        System.out.println(outraData);

        // Verifica se o ano dessa data é bissexto
        System.out.println(outraData.isLeapYear());

        // Mostra quantos dias tem o mês dessa data
        System.out.println(outraData.lengthOfMonth());
    }

}