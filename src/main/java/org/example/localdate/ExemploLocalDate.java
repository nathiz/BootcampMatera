package org.example.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDate {

    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.now();
        System.out.println("Dia da semana: " + data.getDayOfWeek().name());
        System.out.println("Mes: " + data.getMonthValue());
        System.out.println("Mes: " + data.getMonth());
        System.out.println("Ano: " + data.getYear());
        System.out.println("Hora: " + data.getHour());
        System.out.println("Minutos: " + data.getMinute());
        System.out.println("Segundos: " + data.getSecond());

        LocalDate outraData = LocalDate.of(2025, Month.MARCH, 10);
        System.out.println(outraData);
        System.out.println(outraData.isLeapYear());
        System.out.println(outraData.lengthOfMonth());

    }

}
