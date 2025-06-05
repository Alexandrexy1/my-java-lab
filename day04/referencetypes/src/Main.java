public class Main {
    public static void main(String[] args) {
        // p1 e p2 são variáveis de referência e estão armazenadas na memória Stack (Pilha)
        Product p1, p2;

        // Um novo objeto Product é criado na Heap, e p1 armazena a referência para esse objeto
        p1 = new Product("Gloves", 4.99);

        // p2 passa a apontar para o mesmo objeto que p1, ambas as variáveis referenciam o mesmo endereço na Heap
        p2 = p1;
    }
}