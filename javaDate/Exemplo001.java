package javaDate;

import java.util.Date;

public class Exemplo001 {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
//        1627585553284

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
//        Thu Jul 29 16:05:53 BRT 2021
    }
}
