public class Model {
    public int id;
    public String name;
    public String type;
   public String model;
    public int perPrice;
    public int sale;
    public int stock;
    public int rom;
    public int ram;
    public int battery;
    public double screenSize;
    public String color;


    public Model(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Model(int id, String name, String type,String model, int perPrice, int sale, int stock, int rom, int ram, int battery, double screenSize, String color) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.model = model;
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
        return
                " Marka= " + name +
                ", Model= " + type +
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
