package operadores;

public class Igualdade {

    public static void main(String[] args){

        final var numero = 11;

        if (numero == 10){
            System.out.println("O numero é 10");
        }else{
            System.out.println("O numero é :" + numero);
        }

        if (numero != 10){
            System.out.println("O numero não é 10");
        }else{
            System.out.println("O numero é :" + numero);
        }

        final var letra = "A";

        if ("A".equals(letra)){
            System.out.println("É a letra A");
        }

        if (!letra.equals("A")){
            System.out.println("não é a letra A");
        }
    }
}
