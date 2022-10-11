package bookStoreOOP;

public class EBook extends Book{

    String gownloadURL;

    public EBook(String name, String author, int id, double price, boolean isAvaliable, String url) {
        super(name, author, id, price, isAvaliable);
        this.gownloadURL = url;
    }


    public String getGownloadURL() {
        return gownloadURL;
    }

    public void setGownloadURL(String gownloadURL) {
        this.gownloadURL = gownloadURL;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("URL:" + gownloadURL);
    }
}


