package javaDate;

import java.util.Date;

public class Exemplo002 {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1413124824691L);
        Date dataNoFuturo = new Date(1413124897691L);
        Date MesmaDataNoFuturo = new Date(1413124897691L);

        boolean isEquals = dataNoFuturo.equals(dataNoFuturo);

        System.out.println(isEquals);

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado = futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro = passado

        int compareCase3 = dataNoFuturo.compareTo(MesmaDataNoFuturo); //datas equivalentes

        System.out.println(compareCase1);
        System.out.println(compareCase2);
        System.out.println(compareCase3);
    }
}
