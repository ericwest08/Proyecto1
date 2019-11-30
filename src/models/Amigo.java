package models;

public class Amigo{

    private String text;
    private Objeto o;

    public Amigo(String t, Objeto o){
        this.text = t;
        this.o = o;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public void addObject(Objeto o){
        this.o = o;
    }


}
