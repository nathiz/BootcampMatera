package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String, String> contas = new HashMap<>();

        contas.put("Conta Corrente","Samuel");
        contas.put("Conta Pagamento","Karyn");
        contas.put("Conta Poupanca","Paula");
        contas.put("Conta Corrente","Samuel Cunha");

        System.out.println(contas);
        System.out.println(contas.get("Conta Corrente"));

        System.out.println(contas.keySet());
    }

}
