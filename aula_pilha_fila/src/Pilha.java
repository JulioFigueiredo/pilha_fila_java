public class Pilha {
    private Object[] elementos;
    private int tamanho;
    private int capacidade;
    private int top;

    public Pilha(int capacidade) {
        this.capacidade=capacidade;
        this.elementos=new Object[capacidade];
        this.tamanho = 0;
        this.top = -1;
    }

    public Object empilhar(Object elemento) {
        if (tamanho==capacidade) {
            throw new IllegalStateException("A pilha está cheia! ");
        }
        top++;
        elementos[top] = elemento;
        tamanho++;
        return elemento;
    }

    public Object desempilhar(Object elemento) {
        if (tamanho==0)
            throw new IllegalStateException("A pilha está vazia! ");
        Object removido = elementos[top];
        top--;
        tamanho--;

        return removido;
    }

    public Object topElement() {
        if (tamanho==0)
            throw new IllegalStateException("A pilha está vazia! ");
        return elementos[top];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
