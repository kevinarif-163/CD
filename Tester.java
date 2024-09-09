package product;

public class Tester {
    //Buat object dari class CD
    public static void main(String[] args) {
        CD c1 = new CD();

        c1.setArtist("lady gaga");
        c1.setLabel("Sony Music");
        c1.setNumsong(10);
        c1.setNama("Reborn");
        c1.setPrice(2000.0);
        c1.setNumber(2);
        c1.setQuantity(12);

        c1.print();
        DVD d1 = new DVD();

        d1.setLength(300);
        d1.setRating("PG");
        d1.setStudio("Newline Cinema");

        d1.print();
    }
}
