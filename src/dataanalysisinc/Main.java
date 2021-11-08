/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalysisinc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Scanner;

/**
 *
 * @author LuisVillagran276
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //******************PROYECTO DOS********************
        //llamado del metodo donde se encuentra el menu principal
        menuUno();
        Integer N, S ;
        Integer opcion = cargarNumero();    
        String ingresoDatos = "";
        switch(opcion){
                case 1: 
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("----------Análisis de Datos de Estudiantes---------");
                    System.out.println("---------Ingrese los datos del estudiante---------");
                    /*System.out.println("Nombres:");
                    System.out.println("Apellidos:");
                    System.out.println("Carné:");
                    System.out.println("Edad:");
                    System.out.println("Sexo:");
                    System.out.println("Carrera:");
                    System.out.println("Total de créditos obtenidos:");
                    System.out.println("Cantidad de cursos aprobados:");
                    System.out.println("Listado de cursos aprobados:");
                    int cursos[5]
                    */
                    ingresoDatos = entrada.nextLine();
                    System.out.println("los datos fueron ingresados de forma correcta, indique (1) si quiere ver los datos o (0) si quiere finalizar.");
                    N = entrada.nextInt();
                    if(N==1){
                        System.out.println(ingresoDatos);
                    }else{
                        menuUno();
                    }
                    break;
                case 2:
                    System.out.println("----------Análisis de Datos de Estudiantes---------");
                    System.out.println("----------Analisis de Datos---------");
                    System.out.println("1. Datos personales de estudiantes");
                    System.out.println("2. Cantidad de estudiantes masculinos y femeninos");
                    System.out.println("3. Mejor promedio de cada carrera");
                    System.out.println("4. Datos académicos de estudiantes");
                    System.out.println("5. Constancia de cursos aprobados");
                    System.out.println("6. Salir");
                    System.out.println("Seleccione el reporte que desea generar:"); 
                   break;
                case 3:
                   menuUno();
                   break;
    }
    }
    //funcion para obtener el digito que el usuario coloque
    private static Integer cargarNumero() throws IOException{
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(entrada);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
    //funcion para hacer mas corto el codigo en main.
    private static void menuUno(){
        System.out.println("----------Análisis de Datos de Estudiantes---------");
        Integer opcion;
        System.out.println("1. Ingreso de datos");
        System.out.println("2. Analisis de datos");
        System.out.println("3. Salir");
        System.out.println("Ingrese una opcion:");  
    }
    }


