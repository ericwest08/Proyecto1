package models;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Usuario {
    private String id;
    private String name;
    private String nickname;
    private String password;
    private boolean conectado;
    private int monedas;
    Stack<Partida> partidas;
    private Jugador jugador;


    public Usuario (String idnt, String name, String nick, String pass, int monedas, boolean conectado){
        this.id = idnt;
        this.name=name;
        this.nickname=nick;
        this.password=pass;
        this.monedas = monedas;
        this.conectado = conectado;
        this.partidas = new Stack<>();
    }

    public Usuario(){

    }

    public void setId (String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setName (String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public void setNickname (String nick){
        this.nickname = nick;
    }

    public String getNickname(){
        return this.nickname;
    }

    public void setPassword(String pass){
        this.password=pass;
    }

    public String getPassword(){
        return this.password;
    }

    public void setMonedas(int monedas){
        this.monedas = monedas;
    }

    public int getMonedas(){
        return this.monedas;
    }

    public String toString(){
       return this.name;
    }

    public boolean getConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public int DameNumeroPartidas(){
        return this.partidas.size();
    }

}
