package com.directi.training.srp.exercise;

public class CarFilter
{
    public String formatCarNames()
    {
        cars = carDAO.getAllCars()
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
