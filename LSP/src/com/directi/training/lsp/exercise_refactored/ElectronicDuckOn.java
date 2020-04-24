package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuckOn implements IDuck{

    private boolean _on = true;

    private ElectronicDuck electronicDuck;

    public void quack()
    {
        System.out.println("Electronic duck quack...");
    }

    public void swim()
    {
        System.out.println("Electronic duck swim");
    }

    public void turnOff(){
        return electronicDuck.off();
    }
}
