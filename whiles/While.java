package whiles;

public class While {

    public static void main(String[] args) {

        var x = 0;

        //testa a condição antes
        while (x < 3){
            System.out.println("dentro do while");
            x++;
        }

        var y = 0;

        //testa a condição depois
        do {
            System.out.printf("Dentro do While\n");
        } while (y++ < 2);



    }
}
