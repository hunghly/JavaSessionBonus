package models;

public class Item {
    private long id;
    private String name;
    private int priceInCents;

    public Item(long id, String name, int priceInCents) {
        this.id = id;
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public Item(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPriceInCents() {
        return this.priceInCents;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

}
