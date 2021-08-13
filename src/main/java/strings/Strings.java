package strings;

public class Strings {

    public static void main(String[] args){

        var nome = "André";
        var sobrenome = "Gomes";
        final var nomeCompleto = nome +sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente :" + nome);
        System.out.println("Nome completo do cliente :" + nomeCompleto);

        var string = new String(" Minha String ");

        System.out.println("Char na posição :" + string.charAt(4));
        System.out.println("quantidade=" + string.length());
        System.out.println("sem Trim [" + string + "]");
        System.out.println("com Trim [" + string.trim() + "]");
        System.out.println("Lower " + string.toLowerCase());
        System.out.println("upper " + string.toUpperCase());
        System.out.println("contém M?" + string.contains("M"));
        System.out.println("contem X?" + string.contains("X"));
        System.out.println("Replace " + string.replace("n", "@"));
        System.out.println("Equals? " + string.equals(" Minha String "));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" MInha StrIng "));
        System.out.println("subtring(1,6)= "+ string.substring( 1, 6));
    }
}
