package ListaEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaEncadeadinha<String> minhaListaEncadeada = new ListaEncadeadinha<>();


        minhaListaEncadeada.add("Teste1");
        minhaListaEncadeada.add("Teste2");
        minhaListaEncadeada.add("Teste3");
        minhaListaEncadeada.add("Teste4");
        minhaListaEncadeada.add("Teste5");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada.get(4));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(4));

        System.out.println(minhaListaEncadeada);
    }
}
