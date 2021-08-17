public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Moloko",75);
        vasyaBasket.add("Kola", 34);

        Basket petyaBasket = new Basket(300);
        petyaBasket.add("Bread", 40);
        petyaBasket.add("Sprite",350);

        Basket danilBasket = new Basket ("Стул",230);

        vasyaBasket.print("Petya Basket:");
        petyaBasket.print("Vasya Basket:");
        danilBasket.print("Danil Basket:");
    }
}
