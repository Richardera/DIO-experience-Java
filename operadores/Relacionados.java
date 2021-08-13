package operadores;

public class Relacionados {

    public static void main(String[] args){
        final var numero = 4;

        if (numero > 20){
            System.out.println("o numero é maior que 20");
        } else  if (numero >= 10){
            System.out.println("O numero é maior ou igual a 10");
        } else  if (numero <= 5){
            System.out.println("numero menor ou igual a 5");
        }else {
            System.out.println("nenhuma está correta");
        }
    }
}
