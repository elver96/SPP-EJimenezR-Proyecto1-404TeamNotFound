/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.proyecto1.pkg404teamnotfound;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRProyecto1404TeamNotFound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de conversiones");
        //Variables
        int opEntrada;
        double lit, gal, cm, in, m, ft, km, mi, tc, tf, g, lb;
        Scanner kb= new Scanner(System.in);
        //Solicitamos el tipo de cambio: liquidos, temperaturas, distancias o pesos
        System.out.println("Converir:  ");
        System.out.println("1.Líquidos");
        System.out.println("2.Distancias");
        System.out.println("3.Temperaturas");
        System.out.println("4.Pesos");
        System.out.println("Salir de la calculadora");
        opEntrada= kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al convertor de líquidos");
                System.out.println("Introduce el sistema original");
                System.out.println("1.Sistema Métrico (litros a galones)");
                System.out.println("2.Sistema Inglés(galones a litros)");
                opEntrada=kb.nextInt();
                
                switch (opEntrada){
                    case 1:
                        System.out.println("Introduce los litros");
                        lit=kb.nextDouble();
                        gal= lit*0.2642;
                        System.out.println("El resultado es "+gal+" galones");
                        break;
                    case 2:
                        System.out.println("Introduce los galones");
                        gal=kb.nextDouble();
                        lit=gal*3.7854;
                        System.out.println("El resultado es "+lit+" litros");
                        break;
                    default:
                        System.out.println("Adios");                 
                   }     break;           
            case 2:
                System.out.println("Bienvenido al convertor de distancias");
                System.out.println("Introduce el sistema original");
                System.out.println("1.Sistema Métrico");
                System.out.println("2.Sistema Inglés");
                opEntrada= kb.nextInt();
                
                switch (opEntrada){
                    case 1: 
                        System.out.println("Introduce tu unidad de medición");
                        System.out.println("1. centimetros a pulgadas");
                        System.out.println("2. metros a pies");
                        System.out.println("3. kilometros a millas");
                        opEntrada=kb.nextInt();
                        
                        switch (opEntrada){
                            case 1:
                                System.out.println("Introduce los centimetros");
                                cm=kb.nextDouble();
                                in=cm*0.3937;
                                System.out.println("El resultado es "+in+" pulgadas");
                                break;
                            case 2:
                                System.out.println("Introduce los metros");
                                m=kb.nextDouble();
                                ft=m*3.28;
                                System.out.println("El resultado es "+ft+" pies");
                                break;
                            case 3:
                                System.out.println("Introduce los kilometros");
                                km=kb.nextDouble();
                                mi=km*0.6214;
                                System.out.println("El resultado es "+mi+" millas");
                                break;
                            default:
                                System.out.println("Adios");
                        }break;
                    case 2:
                        System.out.println("Introduce la unidad de medición");
                        System.out.println("1. Pulgadas a centimetros");
                        System.out.println("2. Pies a metros");
                        System.out.println("3. Millas a kilometros");
                        opEntrada=kb.nextInt();
                        
                        switch (opEntrada){
                            case 1: 
                                System.out.println("Introduce las pulgadas");
                                in=kb.nextDouble();
                                cm=in*2.54;
                                System.out.println("El resultado es "+cm+" centimetros");
                                break;
                            case 2:
                                System.out.println("Introduce los pies");
                                ft=kb.nextDouble();
                                m=ft*0.3048;
                                System.out.println("El resultado es "+m+" metros");
                                break;
                            case 3:
                                System.out.println("Introduce las millas");
                                mi=kb.nextDouble();
                                km=mi*1.6093;
                                System.out.println("EL resultado es "+km+" kilometros");
                                break;
                            default:
                                System.out.println("Adios");
                        }break;
                    default:
                        System.out.println("Adios");
                }break;
            case 3:
                System.out.println("Bienvenido el convertor de temperaturas");
                System.out.println("Introduce el sistema original");
                System.out.println("1.ºC a ºF");
                System.out.println("2.ºF a ºC");
                opEntrada=kb.nextInt();
                
                switch (opEntrada){
                    case 1:
                        System.out.println("Introduce los grados Celsius");
                        tc=kb.nextDouble();
                        tf=(tc*9.8)+32;
                        System.out.println("El resultado son "+tf+" grados Fahrenheit");
                        break;
                    case 2:
                        System.out.println("Introduce los grados Fahrenheit");
                        tf=kb.nextDouble();
                        tc=(tf-32)/1.8;
                        System.out.println("El resultado son "+tc+" grados Celsius");
                        break;
                    default:
                        System.out.println("Adios");
                }break;
            case 4:
                System.out.println("Bienvenido al convertor de pesos");
                System.out.println("Introduce el sistema original");
                System.out.println("1. Sistema Métrico gramos a libras");
                System.out.println("2. Sistema Inglés libras a gramos");
                opEntrada=kb.nextInt();
                
                switch (opEntrada){
                    case 1:
                        System.out.println("Introduce los gramos");
                        g=kb.nextDouble();
                        lb=g*0.00220462;
                        System.out.println("El resultado son "+lb+" libras");
                        break;
                    case 2:
                        System.out.println("Introduce las libras");
                        lb=kb.nextDouble();
                        g=lb*453.592;
                        System.out.println("El resultado es "+g+" gramos");
                        break;
                }break;
            default:
                System.out.println("Buena suerte!!");
        }
        
    
    }   
    }
    

