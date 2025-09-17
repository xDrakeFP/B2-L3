import entities.*;

import java.time.LocalDate;
import java.util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List <Customer> Clienti = new ArrayList<>();
        List <Product> Prodotti = new ArrayList<>();
        List <Order> Ordini = new ArrayList<>();

        Clienti.add(new Customer(1L, "Mario Rossi", 2));
        Clienti.add(new Customer(2L, "Luca Bianchi", 2));
        Clienti.add(new Customer(3L, "Giulia Verdi", 1));
        Clienti.add(new Customer(4L, "Francesca Neri", 3));
        Clienti.add(new Customer(5L, "Alessandro Conti", 2));
        Clienti.add(new Customer(6L, "Chiara Romano", 1));
        Clienti.add(new Customer(7L, "Paolo De Santis", 2));
        Clienti.add(new Customer(8L, "Elena Ferri", 3));
        Clienti.add(new Customer(9L, "Giorgio Marchetti", 1));
        Clienti.add(new Customer(10L, "Sara Fontana", 2));

        Prodotti.add(new Product(1L, "Passeggino Chicco Liteway", "Baby", 179.99));
        Prodotti.add(new Product(2L, "Seggiolino Auto Isofix", "Baby", 249.99));
        Prodotti.add(new Product(3L, "Fasciatoio Portatile", "Baby", 39.99));
        Prodotti.add(new Product(4L, "Culla Next2Me", "Baby", 299.99));
        Prodotti.add(new Product(5L, "Set Biberon Avent", "Baby", 59.99));

        Prodotti.add(new Product(6L, "LEGO Star Wars X-Wing", "Boys", 89.99));
        Prodotti.add(new Product(7L, "Pallone da Calcio Adidas", "Boys", 29.99));
        Prodotti.add(new Product(8L, "Action Figure Spider-Man", "Boys", 24.99));
        Prodotti.add(new Product(9L, "Console Nintendo Switch", "Boys", 329.99));
        Prodotti.add(new Product(10L, "Hot Wheels Mega Garage", "Boys", 59.99));

        Prodotti.add(new Product(11L, "Barbie Dreamhouse", "Girls", 249.99));
        Prodotti.add(new Product(12L, "LOL Surprise! Dollhouse", "Girls", 149.99));
        Prodotti.add(new Product(13L, "Set Braccialetti Creativi", "Girls", 19.99));
        Prodotti.add(new Product(14L, "Cucina Giocattolo in Legno", "Girls", 129.99));
        Prodotti.add(new Product(15L, "Disney Frozen Elsa Doll", "Girls", 34.99));

        Prodotti.add(new Product(16L, "Il Piccolo Principe", "Books", 9.99));
        Prodotti.add(new Product(17L, "Harry Potter e la Pietra Filosofale", "Books", 114.99));
        Prodotti.add(new Product(18L, "Il Signore degli Anelli", "Books", 29.99));
        Prodotti.add(new Product(19L, "Orgoglio e Pregiudizio", "Books", 11.99));
        Prodotti.add(new Product(20L, "Pinocchio - Collodi", "Books", 117.99));


        Ordini.add(new Order(1L, "Spedito", LocalDate.of(2021, 3, 1), LocalDate.of(2023, 3, 5),
                Arrays.asList(Prodotti.get(0), Prodotti.get(4)), Clienti.get(0)));

        Ordini.add(new Order(2L, "Consegnato", LocalDate.of(2023, 3, 2), LocalDate.of(2023, 3, 7),
                Arrays.asList(Prodotti.get(6), Prodotti.get(7)), Clienti.get(1)));

        Ordini.add(new Order(3L, "In elaborazione", LocalDate.of(2021, 3, 3), LocalDate.of(2023, 3, 8),
                Arrays.asList(Prodotti.get(15), Prodotti.get(16)), Clienti.get(2)));

        Ordini.add(new Order(4L, "Spedito", LocalDate.of(2021, 3, 4), LocalDate.of(2023, 3, 9),
                Arrays.asList(Prodotti.get(8)), Clienti.get(3)));

        Ordini.add(new Order(5L, "Consegnato", LocalDate.of(2023, 3, 5), LocalDate.of(2023, 3, 10),
                Arrays.asList(Prodotti.get(2), Prodotti.get(19)), Clienti.get(4)));

        Ordini.add(new Order(6L, "Consegnato", LocalDate.of(2023, 3, 6), LocalDate.of(2023,3,17),
                Arrays.asList(Prodotti.get(5)), Clienti.get(5)));

        Ordini.add(new Order(7L, "Consegnato", LocalDate.of(2023, 3, 7), LocalDate.of(2023, 3, 12),
                Arrays.asList(Prodotti.get(12), Prodotti.get(14)), Clienti.get(6)));

        Ordini.add(new Order(8L, "In elaborazione", LocalDate.of(2021, 3, 8), LocalDate.of(2023, 3, 13),
                Arrays.asList(Prodotti.get(9)), Clienti.get(7)));

        Ordini.add(new Order(9L, "Spedito", LocalDate.of(2021, 7, 9), LocalDate.of(2023, 3, 15),
                Arrays.asList(Prodotti.get(11), Prodotti.get(13)), Clienti.get(8)));

        Ordini.add(new Order(10L, "Consegnato", LocalDate.of(2021, 3, 10), LocalDate.of(2023, 3, 14),
                Arrays.asList(Prodotti.get(17), Prodotti.get(18)), Clienti.get(9)));

//        for (Customer c : Clienti) {
//            System.out.println("ID: " + c.getId() +
//                    ", Nome: " + c.getName() +
//                    ", Tier: " + c.getTier());
//        }
//
//        for (Product p : Prodotti) {
//            System.out.println("ID: " + p.getId() +
//                    ", Nome: " + p.getName() +
//                    ", Categoria: " + p.getCategory() +
//                    ", Prezzo: " + p.getPrice() + "€");
//        }
//
//        for (Order o : Ordini) {
//            System.out.println("Ordine ID: " + o.getId() +
//                    ", Cliente: " + o.getCustomer().getName() +
//                    ", Prodotti: " + o.getProducts().size() +
//                    ", Stato: " + o.getStatus() +
//                    ", Data Ordine: " + o.getOrderDate() +
//                    ", Consegna: " + o.getDeliveryDate());
//        }

        List<Product> booksOver100 = Prodotti.stream().filter(p -> p.getCategory().equals("Books") && p.getPrice() >100).toList();

        System.out.println("");
        System.out.println("Esericio 1");
        System.out.println("Lista di prodotti che appartengono a Books e hanno un prezzo maggiore di 100");
        for(Product p:booksOver100){
            System.out.println(p);
        }

        // -----------------------------------------------------------------------------------------------------------------------------------------------------

        List<Order> babyOrder = Ordini.stream().filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("Baby"))).toList();

        System.out.println("");
        System.out.println("Esericio 2");
        System.out.println("Lista di ordini i quali prodotti appartengono a Baby");
        for(Order  o:babyOrder){
            System.out.println(o);
        }

        // -----------------------------------------------------------------------------------------------------------------------------------------------------

        List<Product> boysProducts = Prodotti.stream().filter(p -> p.getCategory().equals("Boys")).toList();

        System.out.println("");
        System.out.println("Esericio 3");
        System.out.println("Lista di ordini i quali prodotti appartengono a Boys");
        System.out.println("Pre-sconto del 10%");
        for(Product p:boysProducts){
            System.out.println(p);
        }

        System.out.println("");
        System.out.println("Post-sconto del 10%");
        for(Product p:boysProducts){
            double discountPrice = p.getPrice()-(p.getPrice() * 0.10);
            p.setPrice(discountPrice);
            System.out.println(p);
        }

        // -----------------------------------------------------------------------------------------------------------------------------------------------------

        LocalDate start = LocalDate.of(2021, 2, 1);
        LocalDate end   = LocalDate.of(2021, 4, 1);

        List<Order> ordini2021Tier2 = Ordini.stream()
                .filter(o ->
                        !o.getOrderDate().isBefore(start) &&
                                o.getOrderDate().isBefore(end)   &&
                                o.getCustomer().getTier() == 2)
                .toList();


        List<Product> prodottiEs4 = ordini2021Tier2.stream().flatMap(o -> o.getProducts().stream()).toList();

        System.out.println("");
        System.out.println("Esericio 4");
        System.out.println("Lista di prodotti ordinati tra il 1 Febbraio e il 1 Aprile 2021 da clienti Tier 2");
        System.out.println("Lista Ordini");
        for(Order o:ordini2021Tier2){
            System.out.println(o);
        }
        System.out.println("");
        System.out.println("Lista Prodotti all'interno");
        for(Product p:prodottiEs4){
            System.out.println(p);
        }


    }
}
