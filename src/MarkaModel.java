import java.util.Scanner;
public class MarkaModel {
    public int Id;
    public String Name;
    public String Phone;
    public String Notebook;
    public int perPrice;
    public int sale;
    public int stock;
    public int rom;
    public int ram;
    public int battery;
    public double screenSize;
    public String color;


    public MarkaModel(int id, String name, String phone) {
        Id = id;
        Name = name;
        Phone = phone;
    }

    public MarkaModel(int id, String name, String phone, int perPrice, int sale, int stock, int rom, int ram, int battery, double screenSize, String color) {
        Id = id;
        Name = name;
        Phone = phone;
        this.perPrice = perPrice;
        this.sale = sale;
        this.stock = stock;
        this.rom = rom;
        this.ram = ram;
        this.battery = battery;
        this.screenSize = screenSize;
        this.color = color;
    }

    @Override
    public String toString() {
        return "İşte ürünlerimiz= " +
                " Marka= " + Name +
                ", Model= " + Phone +
                ", Fiyat= " + perPrice +" TL" +
                ", İndirim= %" + sale +
                ", Stok adedi= " + stock +
                ", Hafıza= " + rom +" GB" +
                ", Ram=" + ram +" GB" +
                ", Pil= " + battery +" Mah." +
                ", Ekran Boyutu= " + screenSize +
                ", Renk= " + color
                ;
    }
}
