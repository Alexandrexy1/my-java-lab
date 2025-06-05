public class Main {
    public static void main(String[] args) {
        // p1 e p2 estão guardados em um local da memória chamado "Stack"
        Product p1, p2;

        // p1 não recebe o objeto, mas sim guarda o endereço de memória na "Stack", endereçado na Heap
        p1 = new Product("Gloves", 4.99);

        // Agora p2 está apontando o mesmo endereço que p1, e não criando uma nova classe
        p2 = p1;
    }
}