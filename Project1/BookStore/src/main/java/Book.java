public class Book {

    //describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR Price of book
    // using conversion rate, calculate RUB Price of book
    // print all the books details including prices

    String euro = "EUR";
    String ruble = "RUB";

    public static void main(String[] args) {
//        String bookName = "Harry Potter";
//        String authorName = "J.K. Rowling";
//        int id = 1;
//        double priceInUSD = 10.5;
//        boolean isAvailable = true;

        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K. Rowling", 1, 10.5, false);
        book1.createNewBook("Anna Karenina", "l.Tolstoy", 2, 20, true);

    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvaliable) {

        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInRubles = calculatePrice(priceInUSD, ruble);


        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + " EUR, " + priceInRubles + " RUB");
        System.out.println("Book is available: " + isAvaliable);

    }

    public double calculatePrice(double priceInUSD, String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error: unkniwn currency, USD price will be returned");
        }
        double priceAfetrConvertion = priceInUSD * rate;
        return priceAfetrConvertion;


    }
}
