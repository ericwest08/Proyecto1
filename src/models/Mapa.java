package models;

public class Mapa {
    private int posicionx;
    private int posiciony;
    private int largo;
    private int ancho;

    public Mapa(int x, int y, int l, int a){
        this.posicionx = x;
        this.posiciony= y;
        this.largo = l;
        this.ancho = a;
    }

    public void setPosicionx(int x){
        this.posicionx = x;
    }

    public int getPosicionx(){
        return this.posicionx;
    }

    public void setPosiciony(int y){
        this.posiciony = y;
    }

    public int getPosiciony(){
        return this.posiciony;
    }

    public void setLargo(int l){
        this.largo = l;
    }

    public int getLargo(){
        return this.largo;
    }

    public void setAncho(int a){
        this.ancho = a;
    }

    public int getAncho(){
        return this.ancho;
    }



}
