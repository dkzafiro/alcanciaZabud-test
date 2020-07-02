/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author branz
 */
public class Alcancia implements Serializable {
    
   
    
    private int ncoin50;
    private int ncoin100;
    private int ncoin200;
    private int ncoin500;
    private int ncoin1000;

    public int getNcoin50() {
        return ncoin50;
    }

    public int getNcoin100() {
        return ncoin100;
    }

    public int getNcoin200() {
        return ncoin200;
    }

    public int getNcoin500() {
        return ncoin500;
    }

    public int getNcoin1000() {
        return ncoin1000;
    }

    public void setNcoin50(int ncoin50) {
        this.ncoin50 = ncoin50;
    }

    public void setNcoin100(int ncoin100) {
        this.ncoin100 = ncoin100;
    }

    public void setNcoin200(int ncoin200) {
        this.ncoin200 = ncoin200;
    }

    public void setNcoin500(int ncoin500) {
        this.ncoin500 = ncoin500;
    }

    public void setNcoin1000(int ncoin1000) {
        this.ncoin1000 = ncoin1000;
    }

    public Alcancia() {
        ncoin50 = 0;
        ncoin100 = 0;
        ncoin200 = 0;
        ncoin500 = 0;
        ncoin1000 = 0;
    }

    /**
     * Agrego de monedas por denominación
     */
    public void addncoin50() {
        ncoin50 = ncoin50 + 1;
    }

    public void addncoin100() {
        ncoin100 = ncoin100 + 1;
    }

    public void addncoin200() {
        ncoin200 = ncoin200 + 1;
    }

    public void addncoin500() {
        ncoin500 = ncoin500 + 1;
    }

    public void addncoin1000() {
        ncoin1000 = ncoin1000 + 1;
    }

    public void doNothing() {

    }

    /**
     * Cantidad de monedas dentro de la alcancía
     *
     * @return
     */
    public int cantcoin() {
        int totalcoin = ncoin50 + ncoin100 + ncoin200 + ncoin500 + ncoin1000;
        return totalcoin;
    }

    /**
     * Cantidad de dinero total dentro de la alcancía
     *
     * @return
     */
    public int cantdinero() {
        int totaldinero = ncoin50 * 50 + ncoin100 * 100 + ncoin200 * 200 + ncoin500 * 500 + ncoin1000 * 1000;
        return totaldinero;
    }

    /**
     * Cantidad de dinero dentro de la alcancía con monedas de 50
     *
     * @return
     */
    public int cantdinero50() {
        int totaldinero50 = ncoin50 * 50;
        return totaldinero50;
    }

    /**
     * Cantidad de dinero dentro de la alcancía con monedas de 100
     *
     * @return
     */
    public int cantdinero100() {
        int totaldinero100 = ncoin100 * 100;
        return totaldinero100;
    }

    /**
     * Cantidad de dinero dentro de la alcancía con monedas de 200
     *
     * @return
     */
    public int cantdinero200() {
        int totaldinero200 = ncoin200 * 200;
        return totaldinero200;
    }

    /**
     * Cantidad de dinero dentro de la alcancía con monedas de 500
     *
     * @return
     */
    public int cantdinero500() {
        int totaldinero500 = ncoin500 * 500;
        return totaldinero500;
    }

    /**
     * Cantidad de dinero dentro de la alcancía con monedas de 1000
     *
     * @return
     */
    public int cantdinero1000() {
        int totaldinero1000 = ncoin1000 * 1000;
        return totaldinero1000;
    }
}
