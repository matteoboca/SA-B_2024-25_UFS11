package com.mycompany.app;

import java.time.LocalDate;
public class Veicoli {
    private int cilindrata,prezzo,anno;
    private float assicurazione=100005;
    private String motore,marca,tipologia,modello;
    public Veicoli( int cilindrata, int prezzo, String motore, String marca, String tipologia, String modello,int anno) {

        this.cilindrata = cilindrata;
        this.prezzo = prezzo;
        this.motore = motore;
        this.marca = marca;
        this.tipologia = tipologia;
        this.modello = modello;
        this.anno = anno;
    }


    public int getAnno() {
        return anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public float getAssicurazione() {
        return assicurazione;
    }

    public String getMotore() {
        return motore;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipologia() {
        return tipologia;
    }

    public String getModello() {
        return modello;
    }
    public int valoreFinale(){
        float valore=prezzo;
        for(int annoAttuale= LocalDate.now().getYear(); anno<annoAttuale; annoAttuale --){
            valore = valore- (valore*10)/100;
        }
        if(getClass().getSimpleName().equals("Auto")){
            if(motore.toLowerCase().equals("elettrica")){
                if((valore*20)/100<500000){
                    valore=valore-(valore*20)/100;
                }else {
                    valore-=500000;
                }
            }
        }
        valore= valore/100;
        return (int)valore;
    }

    public float calcoloAssicurazione(){
        if(getClass().getSimpleName().equals("Auto")){
            if(tipologia.toLowerCase().equals("sportiva")){
                assicurazione=assicurazione+(assicurazione*20)/100;
            }
        }else{
            if(cilindrata>600){
                assicurazione=assicurazione+(cilindrata*20)/100;
            }
        }
        assicurazione=assicurazione/100;
        return assicurazione;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " marca:" +getMarca()+" anno:"+getAnno()+ " modello:" +getModello()+ " tipologia:" +getTipologia()+" motore:" +getMotore()+" cilindrata:"+getCilindrata()+" prezzo:"+getPrezzo()+"\n";
    }
}
