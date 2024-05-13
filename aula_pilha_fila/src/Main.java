public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragao"));
        System.out.println("Adicionando: " + fila.adicionar("Escola"));

        System.out.println("Is the queue empty? " + fila.isEmpty());

        System.out.println("Primeiro elemento da fila: " + fila.top());

        System.out.println("tamanho da fila: " + fila.tamanho());

        while (!fila.isEmpty()) {
            System.out.println("removendo da fila: " + fila.remover());
        }

        System.out.println("Is the queue empty? " + fila.isEmpty());


        // pilha

        Pilha pilha = new Pilha(5);
        System.out.println("Adicionando: " + pilha.empilhar("Abelha"));
        System.out.println("Adicionando: " + pilha.empilhar("Bernardo"));
        System.out.println("Adicionando: " + pilha.empilhar("Casa"));
        System.out.println("Adicionando: " + pilha.empilhar("Dragao"));
        System.out.println("Adicionando: " + pilha.empilhar("Escola"));

        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        System.out.println("Primeiro elemento da pilha: " + pilha.topElement());

        System.out.println("tamanho da pilha: " + pilha.tamanho());

        while (!pilha.isEmpty()) {
            System.out.println("removendo da pilha: " + pilha.desempilhar("Casa"));
        }

        System.out.println("A pilha está vazia? " + fila.isEmpty());

    }
}


