import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Model> list = new ArrayList<Model>();

        Model phone2 = new Model(123, "Samsung", "Samsung S22","Phone", 16999, 10, 1000, 128, 8, 5000, 6.1, "Mavi");
        Model noteBook1 = new Model(1234, "Lenovo", "Idea pad","Notebook", 12000, 15, 250, 256, 8, 51000, 15.6, "Gümüş");
        Model phone1 = new Model(12, "Apple", "İphone 14","Phone", 30999, 0, 100, 128, 6, 3215, 6.1, "Siyah");
        Model noteBook2 = new Model(12345, "Huawei", "Matebook","NoteBook", 12000, 15, 250, 256, 8, 51000, 15.6, "Gümüş");
        Model noteBook3 = new Model(123456, "Casper", "Excalibur","Notebook", 18000, 0, 200, 512, 16, 49000, 15.6, "Siyah");
        Model noteBook4 = new Model(1234567, "Asus", "TUF GAMİNG","Notebook" ,18000, 0, 200, 512, 16, 49000, 15.6, "Siyah");
        Model noteBook5 = new Model(12345678, "HP", "VİCTUS","Notebook", 18000, 0, 200, 512, 16, 49000, 15.6, "Siyah");
        Model phone3 = new Model(123456789, "Xiaomi", "Mİ 12","Notebook", 18000, 0, 200, 128, 8, 4900, 6.7, "Siyah");
        Model noteBook6 = new Model(1234567890, "Monster", "Abra a5 V15.2","Notebook", 18000, 10, 1000, 512, 16, 48000,15.6, "Siyah");

        list.add(noteBook1);
        list.add(noteBook2);
        list.add(noteBook3);
        list.add(noteBook4);
        list.add(noteBook5);
        list.add(noteBook6);
        list.add(phone1);
        list.add(phone2);

        list.add(phone3);
        /*
         * // new Model
         * list.add(new Model(0, null, null, 0, 0, 0, 0, 0, 0, 0, null));
         * // Model silme
         * list = removeModel(123, list);
         *
         * // ıd ye göre getirme
         * getId(1, list);
         * // markaya göre getirme
         * List<Model> markaList = new ArrayList<>();
         * markaList= getMarka("apple", markaList);
         */
        System.out.println("Patika Store'a hoşgeldiniz.");
        System.out.println("Yeni açıldığımız için çok falza ürün mevcut değil :)\n"
                + "Anlayışınız için teşekkür ederiz."
                + "Bugün sizinle ben ilgileneceğim, nasıl yardımcı olabilirim.\n");

        while (true) {
            String choice;
            System.out.println("Cep telefonları için 1'e, Notebooklar için lütfen 2'ye basın.");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Ürün eklemek için 3'e, Ürün silmek için 4'e basın.");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Markaya göre ürün listelemek için 5'e, İd numarasına göre listelemek için 6'ya basın.");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Bütün ürünleri listelemek için lütfen 7'ye basın.");
            System.out.println("--------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);
            System.out.print("Yanıtınız:");
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    listprintPhone(list);
                    break;
                case "2":
                    listprintNoteBook(list);
                    break;
                case "3":
                    System.out.print("Id");
                    int Id = scan.nextInt();
                    System.out.print("Name");
                    String name = scan.nextLine();
                    System.out.println(" ");
                    System.out.print("Model");
                    String type = scan.nextLine();
                    System.out.print("Tür");
                    String model = scan.nextLine();
                    System.out.print("Fiyat");
                    int perPrice = scan.nextInt();
                    System.out.print("İndirim");
                    int sale = scan.nextInt();
                    System.out.print("Stok");
                    int stock = scan.nextInt();
                    System.out.print("Hafıza");
                    int rom = scan.nextInt();
                    System.out.print("Ram");
                    int ram = scan.nextInt();
                    System.out.print("Pil");
                    int battery = scan.nextInt();
                    System.out.print("Ekran B.");
                    double screenSize = scan.nextDouble();
                    System.out.print("Renk");
                    String color = "Mavi";
                    Model addM = new Model(Id, name, type,model, perPrice, sale, stock, rom, ram, battery, screenSize, color);
                    list.add(addM);

                    listprint(list);
                    break;
                case "4":
                    int id = scan.nextInt();
                    list = removeModel(id, list);
                    listprint(list);
                    break;
                case "5":
                    System.out.println("Lütfen marka adı girin ör:Apple.");
                    String marka = "Apple";
                    List<Model> markaList = new ArrayList<Model>();
                    markaList = getMarka(marka, list);
                    listprint(markaList);

                    break;
                case "6":
                    int id2 = scan.nextInt();
                    System.out.println(getId(id2, list).toString());
                    break;
                case "7":
                    listprint(list);
                    break;

                default:
                    System.out.println("Yanlış değer girdiniz.");
                    System.out.println("Tekrardan..");
                    continue;

            }
            break;
        }

    }
                    //Ürün silme fonkisyonu
    public static List<Model> removeModel(int id, List<Model> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == id) {
                list.remove(i);
            }
        }
        return list;
    }
                    //Ürün id'lerini çekme fonksiyonu
    public static Model getId(int id, List<Model> list) {
        for (Model Model : list) {
            if (Model.id == id) {
                return Model;
            }
        }
        return null;
    }
                    //Ürün markasını çekme fonksiyonu
    public static List<Model> getMarka(String marka, List<Model> list) {
        List<Model> markaList = new ArrayList<>();
        for (Model Model : list) {
            if (Model.name == marka) {
                markaList.add(Model);
            }
        }
        return markaList;
    }
                    //Ürün listeleme fonksiyonu
    public static void listprint(List<Model> list) {
        for (Model Model : list) {
            System.out.println(Model.toString());
            System.out.println("--------------------------------------------------");
        }
    }
                    //Sadece telefonları listele
    public static void listprintPhone(List<Model> list) {
        for (Model Model : list) {
            if (Model.model == "Phone") {
                System.out.println(Model.toString());
                System.out.println("--------------------------------------------------");
            }
        }
    }
                    //Sadece notebookları listele
    public static void listprintNoteBook(List<Model> list) {
        for (Model Model : list) {
            if (Model.model == "Notebook") {
                System.out.println(Model.toString());
                System.out.println("--------------------------------------------------");
            }
        }
    }
}


