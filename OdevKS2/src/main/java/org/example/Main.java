package org.example;

public class Main {
    public static void main(String[] args) {
//Nesneler olusturulup degerler atandi

        Bina bina1 = new Bina("Edirne",15);
        Daire daire1 = new Daire("Günes Apt",5);
        Daire daire2 = new Daire("Kirklareli",8);
        EvSahibi evSahibi1 = new EvSahibi("Selcuk", "Yazar",bina1);
//Kiraci atandi
        Kiraci kiraci1 = new Kiraci("Melek","Oral",evSahibi1);

        //Evsahibi icin displayInfo() metotu cagrilir ve bilgiler gosterilir
        evSahibi1.displayInfo();

        //Degiskene daireler eklenir
        evSahibi1.daireEkle(daire1);
        evSahibi1.daireEkle(daire2);


        //Evsahibinin sahip oldugu daireleri listelenir
        System.out.println("Ev Sahibinin Daireleri:");
        for(Daire daire: evSahibi1.getMevcutDaireler()){
            daire.displayInfo();
        }

        //Kiraci1'in bilgileri yazdirilir
        kiraci1.displayInfo();
        //Kiracnin oturdugu evin bilgileri yazdirilir  baska bir deyisle bina1 ve daire1 yazdirilir.
        daire1.displayInfo();
        bina1.displayInfo();



    }
}
