package com.directi.training.srp.exercise;

public class CarFilter
{
    CarDAO carDAO = new CarDAO();

    public Car getBestCar()
    {   cars = carDAO.getAllCars()
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
