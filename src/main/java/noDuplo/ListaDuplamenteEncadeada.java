package noDuplo;

import ListaEncadeada.No;

public class ListaDuplamenteEncadeada<T> {

    private Noduplo<T> primeiroNo;
    private  Noduplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada (){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        Noduplo<T> novoNo = new Noduplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        }
        if (ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index,T elemento){
        Noduplo<T> noAuxiliar = getNo(index);
        Noduplo<T> novoNo = new Noduplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if (index ==0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            Noduplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if (noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoProximo());
            }else{
                ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    private Noduplo<T> getNo(int index){
        Noduplo<T> noAuxiliar = primeiroNo;
        for (int i = 0;(i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        Noduplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo()+"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
