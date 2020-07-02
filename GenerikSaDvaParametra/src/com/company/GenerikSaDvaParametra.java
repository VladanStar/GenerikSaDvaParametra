package com.company;

public class GenerikSaDvaParametra <U,V>{
    private U objUreff;
    private V objVreff;

    public GenerikSaDvaParametra() {
    }

    public GenerikSaDvaParametra(U objUreff, V objVreff) {
        this.objUreff = objUreff;
        this.objVreff = objVreff;
    }
    public void printTypes(){
        System.out.println("U Type: " +this.objUreff.getClass().getName());
        System.out.println("V Type: " + this.objVreff.getClass().getName());

    }
}
