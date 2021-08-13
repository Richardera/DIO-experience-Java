package ListaEncadeada;

public class ListaEncadeadinha<T> {

    No<T> refenciaEntrada;

    public ListaEncadeadinha(){
        this.refenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            refenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = refenciaEntrada;
        for (int i = 0; i<this.size() -1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = refenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i<= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if (index == 0){
            refenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();

    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = refenciaEntrada;
        while(true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não existem conteudo no indice " + index + " desta lista. esta lista só vai até o indice "+ ultimoIndice + ".");
        }
    }

    public boolean isEmpty(){
        return refenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo()+"}--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
