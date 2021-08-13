package noDuplo;

public class Noduplo<T> {

    private T conteudo;
    private Noduplo<T> noProximo;
    private Noduplo<T> noPrevio;

    public Noduplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Noduplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(Noduplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public Noduplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(Noduplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "[Noduplo{" + "conteudo=" + conteudo + "}]";
    }
}
