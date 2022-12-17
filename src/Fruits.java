public class Fruits extends  Product{

    public Fruits(String name, double price, String size, String taste) {
        super(name, price);
        this.setType(size);
        this.setFlavor(taste);
    }

    private String size;
    private String taste;


    public String getType() {
        return size;
    }

    public String getFlavor() {
        return taste;
    }

    public void setType(String size) {
        this.size = size;
    }

    public void setFlavor(String taste) {
        this.taste = taste;
    }
    public String toString()  {
        return String.format("%s - %s - %s", super.toString(), size, taste);
    }
}
