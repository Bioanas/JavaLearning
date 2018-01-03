package com.ia;
class GigiClass{
    public int x;
}
public class Variabilele_de_instanta {
    public static void main (String[]args){
        GigiClass classObject=new GigiClass(); //instantierea obiectului
        GigiClass classObject1=new GigiClass();
        classObject.x=10/2;
        classObject1.x=2;
        System.out.println(classObject.x);
        System.out.println(classObject1.x);


    }

}
