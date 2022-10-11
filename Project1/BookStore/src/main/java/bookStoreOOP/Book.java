package bookStoreOOP;

public abstract class Book {

    String bookName;
    String authorName;
    int id;
    double usdPrice;
    boolean isAvaliable;

    String euro = "EUR";
    String ruble = "RUB";

    public Book(String name, String author, int id, double price, boolean isAvaliable){
        this.bookName = name;
        this.authorName = author;
        this.id = id;
        this.usdPrice = price;
        this. isAvaliable = isAvaliable;

    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUsdPrice() {
        return usdPrice;
    }

    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }

    public double convertPrice(String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error: unkniwn currency, USD price will be returned");
        }
        double priceAfetrConvertion = usdPrice * rate;
        return priceAfetrConvertion;
    }
public void printBookDetails() {
    System.out.println("********");
    System.out.println("Book name is: " + bookName);
    System.out.println("Book id is: " + id);
    System.out.println("Book price: " + usdPrice + " USD, " + convertPrice(euro) + " EUR, " + convertPrice(ruble) + " RUB");
    System.out.println("Book is available: " + isAvaliable);
}

    }
