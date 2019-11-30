package models;

import java.util.LinkedList;
import java.util.List;

public class Tienda {

    List<Objeto> listaobjetos = new LinkedList<>();
    Usuario user;

    public void addObject(Objeto o){
        this.listaobjetos.add(o);
    }
    public void deleteObject(Objeto o){
        this.listaobjetos.remove(o);
    }

    public String buyObject (Objeto o) {
        String res = null;
        int monedas;

        for (Objeto objeto : listaobjetos) {

            if (objeto.getName().equals(o)) {
                monedas = user.getMonedas() - o.getPrecio();
                if (user.getMonedas() < o.getPrecio()) {
                    res = "No tienes suficientes monedas para comprar el objeto";
                }
                else {
                    res = "Has comprado un objeto por " + o.getPrecio() + " y te quedan " + monedas + " monedas";
                }

            }
            else {
                res = "El objeto que quieres comprar no está en la tienda.";
            }
        }
        return res;
    }








}
