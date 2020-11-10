package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes [0] = new Bike("Test",12);
        bikes [1] = new Bike("kiki",99);
        bikes [2] = new Bike("buby",66);
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        person [0] = new Person("pay kuy","ter bill");
        person [1] = new Person("sunshine","marbell");
        person [2] = new Person("kinraiyoung","youngjaa");
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels [0] = new Parcel(20,ParcelStatus.SHIPPING,new Location(1,1));
        parcels [1] = new Parcel(21,ParcelStatus.SHIPPING,new Location(1,2));
        parcels [2] = new Parcel(22,ParcelStatus.SHIPPING,new Location(1,3));
        parcels [3] = new Parcel(23,ParcelStatus.SHIPPING,new Location(1,4));
        parcels [4] = new Parcel(24,ParcelStatus.SHIPPING,new Location(1,5));
        parcels [5] = new Parcel(25,ParcelStatus.SHIPPING,new Location(1,6));
        parcels [6] = new Parcel(26,ParcelStatus.SHIPPING,new Location(1,7));
        parcels [7] = new Parcel(27,ParcelStatus.SHIPPING,new Location(1,8));
        parcels [8] = new Parcel(28,ParcelStatus.SHIPPING,new Location(1,9));
        parcels [9] = new Parcel(29,ParcelStatus.SHIPPING,new Location(1,10));
        // your code

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
