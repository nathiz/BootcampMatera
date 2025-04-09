package org.example.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploFormatarDatas {

    public static void main(String[] args) {
        // Pega a data atual
        LocalDate hoje = LocalDate.now();

        // Formatador com barra (ex: 09/04/2025)
        DateTimeFormatter formatadorComBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatador com traço (ex: 09-04-2025)
        DateTimeFormatter formatadorComTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Exibe as datas formatadas
        System.out.println("Data com barra: " + hoje.format(formatadorComBarra));
        System.out.println("Data com traco: " + hoje.format(formatadorComTraco));
    }
}