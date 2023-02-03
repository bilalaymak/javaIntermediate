package day21inheritanceoverriding.vehicle;

public class Civic extends Vehicle{

    public void ecoSystem(){
        System.out.println("Using Civic is not expensive...");
    }

    public Civic() {
        super(String.valueOf(2022));
        System.out.println("Civic constructor...");
    }

    public Civic(boolean hybrid){
        this();
        System.out.println("Civic constructor with boolean parameters");
    }











}
