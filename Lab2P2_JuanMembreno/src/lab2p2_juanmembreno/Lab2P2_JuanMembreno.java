/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_juanmembreno;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab2P2_JuanMembreno {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        ArrayList<Computadoras> lista = new ArrayList();

        while (op != 8) {
            System.out.println("-----Meu------");
            System.out.println("1)Ingresa Computadora");
            System.out.println("2)Eliminar Computadora ");
            System.out.println("3)Listar Computadoras");
            System.out.println("4)Modificar computadora");
            System.out.println("5)Informe 1");
            System.out.println("6)Informe 2");
            System.out.println("7)Informe 3");
            System.out.println("8)Salir");
            op = leer.nextInt();
            switch (op) {
                case 1: {
                    int capacidad, tamaño, horasf, bateria, hobat;
                    String numero, modelo, tipro, tipotar, so;
                    String vt;
                    boolean tcn = true;

                    System.out.println("Ingrese el numero de serie de la Computadoras");
                    numero = leer.nextLine();
                    numero = leer.nextLine();
                    // lista.add(new Computadoras(numero));
                    System.out.println("Ingrese el modelo de la computadora");
                    modelo = leer.nextLine();
                    //modelo = leer.nextLine();
                    System.out.println("Ingrese la capacidad de la computadora en (GB)");
                    capacidad = leer.nextInt();
                    System.out.println("Ingrese tamaño de la  computadora");
                    tamaño = leer.nextInt();
                    System.out.println("Tiene teclado numerico (si o no)");
                    vt = leer.nextLine();
                    vt = leer.nextLine();
                    vt = vt.toLowerCase();
                    while (!vt.equals("si") & !vt.equals("no")) {
                        System.out.println("Ingrese un respuesta correcta");
                        vt = leer.nextLine();
                        vt = leer.nextLine();
                    }
                    if (vt.equals("si")) {
                        tcn = true;
                    } else if (vt.equals("no")) {
                        tcn = false;
                    }
                    System.out.println("Ingrese el tipo de procesador(basico ,pro u otro)");
                    tipro = leer.nextLine();
                    // tipro = leer.nextLine();
                    System.out.println("Ingrese el tipo de tarjeta grafica(normal o gamer)");
                    tipotar = leer.nextLine();
                    //tipotar = leer.nextLine();
                    tipotar = tipotar.toLowerCase();
                    while (!tipotar.equals("normal") & !tipotar.equals("gamer")) {
                        System.out.println("Ingrese un tipo valido");
                        tipotar = leer.nextLine();
                        tipotar = tipotar.toLowerCase();
                    }
                    System.out.println("Ingrese tipo de Sistema Operativo(Windows o ChromeOS)");
                    so = leer.nextLine();
                    //so = leer.nextLine();
                    so = so.toLowerCase();
                    while (!so.equals("windows") & !so.equals("chromeos")) {
                        System.out.println("Ingrese un Sistema Operativo valido");
                        so = leer.nextLine();
                        so = so.toLowerCase();
                    }
                    System.out.println("Ingrese horas de fabricacion");
                    horasf = leer.nextInt();
                    System.out.println("Ingrese capacidad de bateria en Miliampers");
                    bateria = leer.nextInt();
                    System.out.println("Ingrese horas de duracion de la bateria en horas ");
                    hobat = leer.nextInt();
                    lista.add(new Computadoras(numero, modelo, capacidad, tamaño, tcn, tipro, tipotar, so, horasf, bateria, hobat));
                }
                break;
                case 2: {

                    System.out.println("Ingrese la serie de la computadora que desea eliminar");
                    int serie = leer.nextInt();

                    for (int i = 0; i < lista.size(); i++) {
                        lista.get(i).getnumeroserie().equals(serie);
                        lista.remove(i);
                    }

                }
                break;
                case 3: {
                    String salida = "";
                    for (Object t : lista) {
                        if (t instanceof Computadoras) {
                            salida += lista.indexOf(t) + ")" + t + "\n";
                        }
                    }
                    System.out.println(salida);
                }
                break;
                case 4: {
                    int indice = 0;
                    System.out.println("Ingrese el indice de la computadora a modificar");
                    indice = leer.nextInt();
                    lista.remove(indice);
                    while (indice < lista.size() || indice > lista.size()) {
                        System.out.println("Ingrese un indice valido");
                        indice = leer.nextInt();
                    }
                    // String modifica;
                    System.out.println("1)Modelo");
                    System.out.println("2)Capacidad");
                    System.out.println("3)Tamaño");
                    System.out.println("4)Teclado num");
                    System.out.println("5)Tipo procesador");
                    System.out.println("6)Tarjeta grafica");
                    System.out.println("7)sistema operativo");
                    System.out.println("8)Horas f");
                    System.out.println("9)Capacidad bateria");
                    System.out.println("10)Duracion bateria");
                    int op2 = leer.nextInt();
                    switch (op2) {
                        case 1: {
                            System.out.println("Ingrese modelo ");
                            String modelo = leer.nextLine();
                            lista.get(indice).setmodelo(modelo);
                        }
                        break;
                        case 2: {
                            System.out.println("Ingrese capacidad ");
                            int cap = leer.nextInt();
                            lista.get(indice).setcapacidad(cap);
                        }
                        break;
                        case 3: {
                            System.out.println("Ingrese tamaño ");
                            int tam = leer.nextInt();
                            lista.get(indice).settamaño(tam);
                        }
                        break;
                        case 4: {
                            boolean tcn = true;
                            System.out.println("Ingrese teclado numerico ");
                            System.out.println("Tiene teclado numerico (si o no)");
                            String vt = leer.nextLine();
                            vt = leer.nextLine();
                            vt = vt.toLowerCase();
                            while (!vt.equals("si") & !vt.equals("no")) {
                                System.out.println("Ingrese un respuesta correcta");
                                vt = leer.nextLine();
                                vt = leer.nextLine();
                            }
                            if (vt.equals("si")) {
                                tcn = true;
                            } else if (vt.equals("no")) {
                                tcn = false;
                            }
                            lista.get(indice).settecladonumerico(tcn);
                        }
                        break;
                        case 5: {
                            System.out.println("Ingrese el tipo de procesador(basico ,pro u otro)");
                            String tipro = leer.nextLine();
                            lista.get(indice).settipoprocesador(tipro);
                        }
                        break;
                        case 6: {
                            System.out.println("Ingrese el tipo de tarjeta grafica(normal o gamer)");
                            String tipotar = leer.nextLine();
                            //tipotar = leer.nextLine();
                            tipotar = tipotar.toLowerCase();
                            while (!tipotar.equals("normal") & !tipotar.equals("gamer")) {
                                System.out.println("Ingrese un tipo valido");
                                tipotar = leer.nextLine();
                                tipotar = tipotar.toLowerCase();
                            }
                            lista.get(indice).setsistemaoperativo(tipotar);
                        }
                        break;
                        case 7: {
                            System.out.println("Ingrese tipo de Sistema Operativo(Windows o ChromeOS)");
                            String so = leer.nextLine();
                            //so = leer.nextLine();
                            so = so.toLowerCase();
                            while (!so.equals("windows") & !so.equals("chromeos")) {
                                System.out.println("Ingrese un Sistema Operativo valido");
                                so = leer.nextLine();
                                so = so.toLowerCase();
                            }
                        }
                        break;
                        case 8: {
                            System.out.println("Ingrese horas de fabricacion");
                            int horasf = leer.nextInt();
                        }
                        break;
                        case 9: {
                            System.out.println("Ingrese capacidad de bateria en Miliampers");
                            int bateria = leer.nextInt();

                        }
                        break;
                        case 10: {
                            System.out.println("Ingrese horas de duracion de la bateria en horas ");
                            int hobat = leer.nextInt();
                        }
                        break;
                    }
                }

                break;

                case 5: {
                    //gamer
                    ArrayList listagamer = new ArrayList();
                    int tipo;
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).gettipotarjetagrafica().equals("gamer") & lista.get(i).gettamaño() > 17 & lista.get(i).gettecladonumerico() == true) {
                            listagamer.add(i);
                        }
                    }
                    System.out.println("Informe gamer");
                    System.out.println(listagamer);
                    // lista.get(i).getnumeroserie().equals(serie);

                }
                break;
                case 6: {
                    ArrayList listaeducativas = new ArrayList();
                    int tipo;
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getcapacidad() > 300 & lista.get(i).getsistemaoperativo().equals("chromeos") & lista.get(i).gettamaño() < 13) {
                            listaeducativas.add(i);
                        }
                    }
                    System.out.println("Informe Computadoras educativas");
                    System.out.println(listaeducativas);
                }
                break;
                case 7: {
                    ArrayList pocouso = new ArrayList();
                    int tipo;
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).gethorasdefab() > 2 & lista.get(i).gethorasdebateria() < 1 & lista.get(i).getsistemaoperativo().equals("windows")) {
                            pocouso.add(i);
                        }
                    }
                    System.out.println("Informe Computadoras Poco Uso");
                    System.out.println(pocouso);
                }
                break;
                case 8: {
                    System.out.println("Se salio del menu");
                }
                break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

}
