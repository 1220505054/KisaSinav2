package org.example;
//Bina sinifi Konut sinifin aextend edilir
public class Bina extends Konut{
    //Odev aciklamasinda belirtilen degiskenler uygun sekilde tanimlanir
    private int numberOfFloors;
    //Bina constructor tanimlanir
    Bina(String adress,int numberOfFloors) {
        super(adress);
        this.setnumberOfFloors(numberOfFloors);
    }
    //Fonksiyon tanimlanir
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bina adresi : " + adress + "\tKat Numarasi: "+getnumberOfFloors());
    }
    //Sarmalama ilkesi kullanilir
    public int getnumberOfFloors() {
        return numberOfFloors;
    }

    public void setnumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }



}
