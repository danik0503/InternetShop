public class Main {

    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(100);
         vasyaBasket.add("Хлеб",34, 1,100);
         vasyaBasket.add("Молоко ",123,1,500);

         Basket petyaBasket = new Basket();
         petyaBasket.add("Жевачка",34,20,20);
         petyaBasket.add("Чипсы",90,1,140);

         Basket mashaBasket = new Basket("Стол",5000,2000);

         vasyaBasket.print("Корзина Васи:");
         petyaBasket.print("Корзина Пети:");
         mashaBasket.print("Корзина Маши");
    }
    /*private static String items = "";
    private static int totalPrice = 0;

    public static void main(String[] args) {
        add("Колбаса", 76);
        add("Молоко", 87);
        add("Масло", 125);
        print("Содержимое корзины");
        System.out.println(getTotalPrice());
        clear();
        print("Содержимое корзины");
        System.out.println(getTotalPrice());
    }

    public static void add(String name, int price){
        if(contains(name)){
            return;
        }
        items = items + "\n" + name + "-" + price;
        totalPrice = totalPrice + price;
    }
    public static void clear() {
        items = "";
        totalPrice = 0;

    }
    public static int getTotalPrice(){
        return totalPrice;
    }
    public static boolean contains(String name){
        return (items.contains(name));
    }

    public static void print(String title){
        System.out.println(title);
        if (items.isEmpty()){
            System.out.println("Корзина пуста");
        }else {
            System.out.println(items);
        }

    }*/
}

  /*      public static void main(String[] args) {
            Basket danilBasket = new Basket();
            danilBasket.add("Milk", 40,4,40.0);
            danilBasket.print("Milk");


        }
    }
       *//* public static void main(String[] args) {
        Basket vasyaBasket = new Basket(800);
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
}*//*
*/