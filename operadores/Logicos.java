package operadores;

public class Logicos {

    public static void main(String[] args) {
        final var numero = 2;
        final var letra = "A";

        //sort Circuit
        if (numero < 5 && letra.equals("A")){
            System.out.println("Atendeu a condição");
        }

        if (numero < 5 || letra.equals("A")){
            System.out.println("Atendeu a outracondição");
        }

        if ((10 - 5) > 1 && (5 - 3) > 1){
            System.out.println("doidera");
        }

        //Non Sort Circuit
        if (verifica(15) && verifica("A")){
            System.out.println("OK");
        }else {
            System.out.println("não está OK");
        }

    }

    private static boolean verifica(String letra){
        System.out.println("verificando letra...");
        return letra.equals("A");
    }

    private static boolean verifica(Integer numero){
        System.out.println("verificando numero...");
        return numero > 10;
    }
}
