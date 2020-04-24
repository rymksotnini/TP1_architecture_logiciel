package com.directi.training.srp.exercise;

public class CarManager
{
    CarDAO carDAO = new CarDAO();
    CarFilter carFilter = new CarFilter();
    CarFilter carFormatter = new CarFormatter();
    public Car getCarById(final String carId)
    {
        return carDAO.getCarById();
    }

    public String getCarsNames()
    {
        return carFormatter.;
    }

    public Car getBestCar()
    {
        return carFilter.getBestCar();
    }
}
