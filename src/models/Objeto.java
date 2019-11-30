package models;

public abstract class Objeto {

    private String name;
    private String description;
    private double peso;
    private int precio;

    public Objeto(){

    }
    public Objeto (String n, String d, double peso, int price){
        this.name = n;
        this.description = d;
        this.peso = peso;
        this.precio = price;
    }


    public void setName (String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription (String d){
        this.description = d;
    }

    public String getDescription(){
        return this.description;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPrecio(int p){
        this.precio=p;
    }

    public int getPrecio(){
        return this.precio;
    }

    public String toString(){
        return this.name;
    }

    public abstract String useObject();



}
