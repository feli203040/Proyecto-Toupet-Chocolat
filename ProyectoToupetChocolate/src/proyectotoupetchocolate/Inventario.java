/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotoupetchocolate;

/**
 *
 * @author crome
 */
public class Inventario {
    
    private int parlante, microfono, inflaGlobos, vasos, pelotas, maquinaCanguil, maquinaEspuma,
            gorra, camiseta, mochilla;

    public Inventario(int parlante, int microfono, int inflaGlobos, int vasos, int pelotas, int maquinaCanguil, int maquinaEspuma, int gorra, int camiseta, int mochilla) {
        this.parlante = parlante;
        this.microfono = microfono;
        this.inflaGlobos = inflaGlobos;
        this.vasos = vasos;
        this.pelotas = pelotas;
        this.maquinaCanguil = maquinaCanguil;
        this.maquinaEspuma = maquinaEspuma;
        this.gorra = gorra;
        this.camiseta = camiseta;
        this.mochilla = mochilla;
    }
    
    public String imprimirDatos(){//Imprime los objetos enumerados
        String listaCosas;
        listaCosas="\n1.Parlantes: " + parlante+"\n2.Microfonos: " + microfono+"\n3.Infladores de Globos: " + inflaGlobos+
                "\n4.Vasos: " + vasos+"\n5.Pelotas: " + pelotas+"\n6.Maquinas de Canguil: " + maquinaCanguil+
                "\n7.Maquina de Espuma" + maquinaEspuma+"\n8.Gorras: " + gorra+"\n9.Camisetas: " + camiseta+"\n10.Mochilas: " + mochilla;
                
        System.out.println("1.Parlantes: " + parlante);
        System.out.println("2.Microfonos: " + microfono);
        System.out.println("3.Infladores de Globos: " + inflaGlobos);
        System.out.println("4.Vasos: " + vasos);
        System.out.println("5.Pelotas: " + pelotas);
        System.out.println("6.Maquinas de Canguil: " + maquinaCanguil);
        System.out.println("7.Maquina de Espuma" + maquinaEspuma);
        System.out.println("8.Gorras: " + gorra);
        System.out.println("9.Camisetas: " + camiseta);
        System.out.println("10.Mochilas: " + mochilla);
        return listaCosas;
    }

    public int getParlante() {
        return parlante;
    }

    public void setParlante(int parlante) {
        this.parlante = parlante;
    }

    public int getMicrofono() {
        return microfono;
    }

    public void setMicrofono(int microfono) {
        this.microfono = microfono;
    }

    public int getInflaGlobos() {
        return inflaGlobos;
    }

    public void setInflaGlobos(int inflaGlobos) {
        this.inflaGlobos = inflaGlobos;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getPelotas() {
        return pelotas;
    }

    public void setPelotas(int pelotas) {
        this.pelotas = pelotas;
    }

    public int getMaquinaCanguil() {
        return maquinaCanguil;
    }

    public void setMaquinaCanguil(int maquinaCanguil) {
        this.maquinaCanguil = maquinaCanguil;
    }

    public int getMaquinaEspuma() {
        return maquinaEspuma;
    }

    public void setMaquinaEspuma(int maquinaEspuma) {
        this.maquinaEspuma = maquinaEspuma;
    }

    public int getGorra() {
        return gorra;
    }

    public void setGorra(int gorra) {
        this.gorra = gorra;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public int getMochilla() {
        return mochilla;
    }

    public void setMochilla(int mochilla) {
        this.mochilla = mochilla;
    }

   
}
