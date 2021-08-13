package strings;

public class StringFormat {

    public static void  main(String[] args){
        var nome = "André";
        var sobrenome = "Gomes";
        final var nomeCompleto = nome +sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente :" + nome);
        System.out.println("Nome completo do cliente :" + nomeCompleto);

        final var mensagem = String.format("O cliente %s é gay %s", nome, sobrenome);
        System.out.println(mensagem);

        System.out.println(String.format("Numero %.2f ",1.2345d));
    }

}

