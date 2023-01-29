package ru.duester.patterns.observer;

import ru.duester.patterns.observer.listener.CallOwnerListener;
import ru.duester.patterns.observer.listener.CallPoliceListener;
import ru.duester.patterns.observer.listener.TakePhotoListener;
import ru.duester.patterns.observer.publisher.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        CallOwnerListener callOwnerListener = new CallOwnerListener("+79001234567");
        CallPoliceListener callPoliceListener = new CallPoliceListener();
        TakePhotoListener takePhotoListener = new TakePhotoListener();

        car.subscribe(Car.Event.SNOW, callOwnerListener);

        car.subscribe(Car.Event.HACK, callOwnerListener);
        car.subscribe(Car.Event.HACK, callPoliceListener);
        car.subscribe(Car.Event.HACK, takePhotoListener);

        System.out.println("Неожиданно пришла зима...");
        car.letItSnow();
        System.out.println("");

        System.out.println("Это кто там крадётся?..");
        car.hack();
    }
}
