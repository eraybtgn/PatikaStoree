import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MarkaModel phone2 = new MarkaModel(123,"Samsung","Samsung S22",16999,10,1000,128,8,5000,6.1,"Mavi");
        MarkaModel noteBook1 = new MarkaModel(1234,"Lenovo","Idea pad",12000,15,250,256,8,51000,15.6,"Gümüş");
        MarkaModel phone1 = new MarkaModel(12,"Apple","İphone 14",30999,0,100,128,6,3215,6.1,"Siyah");
        MarkaModel noteBook2 = new MarkaModel(12345,"Huawei","Matebook",12000,15,250,256,8,51000,15.6,"Gümüş");
        MarkaModel noteBook3 = new MarkaModel(123456,"Casper","Excalibur",18000,0,200,512,16,49000,15.6,"Siyah");
        MarkaModel noteBook4 = new MarkaModel(1234567,"Asus","TUF GAMİNG",18000,0,200,512,16,49000,15.6,"Siyah");
        MarkaModel noteBook5 = new MarkaModel(12345678,"HP","VİCTUS",18000,0,200,512,16,49000,15.6,"Siyah");
        MarkaModel phone3 = new MarkaModel(123456789,"Xiaomi","Mİ 12",18000,0,200,128,8,4900,6.7,"Siyah");
        MarkaModel noteBook6 = new MarkaModel(1234567890,"Monster","Abra a5 V15.2",18000,10,1000,512,16,48000,15.6,"Siyah");

        int choice;
        System.out.println("Patika Store'a hoşgeldiniz.");
        System.out.println("Yeni açıldığımız için çok falza ürün mevcut değil :)\n"
                           +"Anlayışınız için teşekkür ederiz.");
        System.out.println("Bugün sizinle ben ilgileneceğim, nasıl yardımcı olabilirim.\n"
                           +"Cep telefonları için 1'e, Notebooklar için lütfen 2'ye basın.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Yanıtınız:");
        choice= scan.nextInt();
        if (choice==1 || choice==2){
            switch (choice){
                case 1:
                    System.out.println(phone1);
                    System.out.println(phone2);
                    System.out.println(phone3);

                    break;
                case 2:
                    System.out.println(noteBook1);
                    System.out.println(noteBook2);
                    System.out.println(noteBook3);
                    System.out.println(noteBook4);
                    System.out.println(noteBook5);
                    System.out.println(noteBook6);
                    break;

            }
        }else {
                System.out.println("Lütfen 1' veya 2'ye basınız.");
                System.out.print("Yanıtınız:");
                choice=scan.nextInt();

        }

    }
}
