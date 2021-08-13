package iFS;

public class IF {

    public static void main (String[] args){

        final var condicao = true;

        if (condicao){
            System.out.println("True");
        }else {
            System.out.println("false");
        }

        if (condicao){
            System.out.println("uma linha");

            final var ternario = condicao ? "è verdadeira" : "è falsa";

            System.out.println(ternario);
        }
    }
}
