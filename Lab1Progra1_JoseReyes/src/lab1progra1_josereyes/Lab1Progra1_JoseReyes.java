/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1progra1_josereyes;

/**
 *
 * @author josem
 */
import java.util.Scanner;
public class Lab1Progra1_JoseReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int men=0;
        while(men==0){
            System.out.println("~~~~ Bienvenido al menu principal ~~~~");
            System.out.println("1.Socios");
            System.out.println("2.Determinar el mayor");
            System.out.println("3.Triangulo o no");
            int opc=leer.nextInt();
            
            while(opc==1){
                int socio = 0;
                float total = 0f;
                float desc = 0f;
                System.out.println("Ingrese el grado del socio\n0.Grado 0\n1.Grado 1\n2.Grado 2\n3.Grado 3");
                socio=leer.nextInt();
                System.out.println("Ingrese el total de la compra: ");
                float venta=leer.nextFloat();
                
                if(socio==0){
                    total = venta;
                }else if(socio==1){
                    desc  = venta *0.10f;
                    total = venta-desc;
                } else if(socio==2){
                    desc =venta*0.15f;
                    total = venta-desc;
                } else if(socio==3){
                    desc = venta*0.25f;
                    total = venta-desc;
                }else{
                    System.out.println("Tipo de grado no existe");
                    venta=0;
                }
                System.out.println("Total de la compra: "+venta);
                System.out.println("Total de descuento: "+desc);
                System.out.println("Total final a pagar: "+total);
                
                System.out.println("Desea calcular el pago de otro cliente?\n1 = si\n0 = no");
                opc = leer.nextInt();
                if(opc>1 || opc<0){
                    System.out.println("~~~~~~~Error~~~~~~~");
                    opc=0;
                }else{
                    System.out.println(" ");
                }
            }while(opc==2){
                int nums=1;
                int mayor=0;
                while(nums==1){
                    System.out.println("Ingrese el numero entero");
                    int entero=leer.nextInt();
                    if(entero>mayor){
                        mayor=entero;
                    }else{
                        System.out.println("   ");
                    }
                    System.out.println("Desea ingresar otro numero?\n1 = si\n0 = no");
                    nums=leer.nextInt();
                }if(nums>1||nums<0){
                    System.out.println("Error");
                    opc=0;
                }else{
                    System.out.println("El mayor de los numeros ingresados fue: "+mayor);
                    System.out.println("-----------------");
                    System.out.println("Regresando al menu");
                    opc=0;
                    System.out.println(" ");
                }
            }while(opc==3){
                int suma=0;
                int num=1;
                while(num==1){
                    System.out.println("Ingrese el lado a del triangulo");
                    int lado1=leer.nextInt();
                    System.out.println("Ingrese el lado b del triangulo");
                    int lado2 = leer.nextInt();
                    System.out.println("Ingrese el ladO c del triangulo");
                    int lado3 = leer.nextInt();

                    suma=lado1+lado2;

                    if(suma>lado3){
                        System.out.println("Los lados ingresados si forman un triagulo");
                    }else{
                        System.out.println("Los lados no forma un triangulo");
                    }
                    System.out.println(" ");
                    System.out.println("desea ingresar otro triangulo?\n1 = si\n0 = no");
                    num =leer.nextInt();
                    if(num<0 || num>1){
                        System.out.println("Error");
                        System.out.println(" ");
                        opc=0;
                    }else{
                        opc=0;
                        System.out.println("~~~~~~~~~~~");
                        System.out.println(" ");
                    }
                }
            }
        }
    }
}
