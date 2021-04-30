/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_juanmembreno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Computadoras {

    private String modelo;
    private String numeroserie;
    private int capacidad;
    private int tamaño;
    private boolean tecladonumerico;
    private String tipoprocesador;
    private String tipotarjetagrafica;
    private String sistemaoperativo;
    private int horasdefab;
    private int bateria;
    private int horasdebateria;
    public Computadoras(){
        
    }
    public Computadoras(String ns,String m,int cap,int tam,boolean tcn,String tipop,String tipotar,String so,int horaf,int bat,int hbat){
        setnumeroserie(ns);
        setmodelo(m);
        setcapacidad(cap);
        settamaño(tam);
        settecladonumerico(tcn);
        settipoprocesador(tipop);
        settipotarjetagrafica(tipotar);
        setsistemaoperativo(so);
        sethorasdefab(horaf);
        setbateria(bat);
        sethorasdebateria(hbat);
      // this.numeroserie=numeroserie;
    }
    public Computadoras(String modelo){
        setmodelo(modelo);
    }
    public void setnumeroserie(String ns){
         numeroserie=ns;
    }
    public String getnumeroserie(){
        return numeroserie;
    }
    public void setmodelo(String m){
        modelo=m;
    }
    public String getmodelo(){
        return modelo;
    }
     public void setcapacidad(int cap){
        capacidad=cap;
    }
    public int getcapacidad(){
        return capacidad;
    }
      public void settamaño(int tam){
        tamaño=tam;
    }
    public int gettamaño(){
        return tamaño;
    }
    public void settecladonumerico(boolean t){
        tecladonumerico=t;
    }
    public boolean gettecladonumerico(){
        return tecladonumerico;
    }
    public void settipoprocesador(String tp){
        tipoprocesador=tp;
    }
    public String gettipoprocesador(){
        return tipoprocesador;
    }
      public void settipotarjetagrafica(String td){
        tipotarjetagrafica=td;
    }
    public String gettipotarjetagrafica(){
        return tipotarjetagrafica;
    }
    
     public void setsistemaoperativo(String so){
        sistemaoperativo=so;
    }
    public String getsistemaoperativo(){
        return sistemaoperativo;
    }
    public void sethorasdefab(int hf){
         horasdefab=hf;
    }
    public int gethorasdefab(){
        return horasdefab;
    }
      public void setbateria(int ba){
         bateria=ba;
    }
    public int getbateria(){
        return bateria;
    }
        public void sethorasdebateria(int tba){
         horasdebateria=tba;
    }
    public int gethorasdebateria(){
        return horasdebateria;
    }
    
    
    
    
    
    
    @Override
    public String toString(){
        return "Modelo:"+modelo+"  Serie:"+numeroserie+"  Capacidad:"+capacidad+"  Tamaño:"+tamaño+"  Teclado numerico:"+tecladonumerico+"  Tipo procesador:"+tipoprocesador+"  Tarjeta Grafica:"+tipotarjetagrafica+"  Sistema Operativo:"+sistemaoperativo+"  Horas Fabricacion:"+horasdefab+"  Capacidad bateria:"+bateria+"  Duracion de bateria:"+horasdebateria;
    }
    
}
