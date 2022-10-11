package bookStoreOOP;

public class AudioBook extends Book{

    String format;
    int bitRate;
    String readerName;

    public AudioBook(String name, String author, int id, double price, boolean isAvaliable,String format, int bitRate,String reader) {
        super(name, author, id, price, isAvaliable);
        this.format = format;
        this.bitRate = bitRate;
        this.readerName = reader;

    }
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    @Override
    public void printBookDetails() {

        super.printBookDetails();
        System.out.println("Format:" + format);
        System.out.println("Bitrate:" + bitRate);
        System.out.println("Reader name:" + readerName);
    }
}
