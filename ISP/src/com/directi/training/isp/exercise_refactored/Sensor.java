package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(ISensingDoor sensingDoor)
    {
        while (true) {
            if (isPersonClose()) {
                sensingDoor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
