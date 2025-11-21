package com.mycompany.app;
import java.util.ArrayList;

public class Concessionaria {
    private String nome;
    private ArrayList<Veicoli> inventario;

    public Concessionaria(String nome) {
        this.nome = nome;
        inventario = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Veicoli> getInventario() {
        return inventario;
    }
    public void addinventario(Veicoli veicolo){
        inventario.add(veicolo);
    }
    public int valoreInventario(){
        float valore=0;
        for(Veicoli v:inventario){
            valore=v.getPrezzo()+valore;
        }
        valore=valore/100;
        return (int)valore;
    }
    public void filtra(){

    }
}
