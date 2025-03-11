package POO.Rpaso.EjerciseIfElse;

import java.sql.SQLOutput;

public class IndiceIMC {
    public static void main(String[] args) {
        int masa = 80; //kg
        double estatura = 1.80;   //Estatura en metros
        double IMC = masa/Math.pow(estatura, 2); //calcula el indice
        System.out.println("La persona tiene una masa = " + masa +
                "KG y estatura = " + estatura + " mts ");
        if (IMC < 16){
            System.out.println("La persona tiene delgadez severa");
        } else if (IMC < 17){
            System.out.println("la persona tiene delgadez moderada");
        } else if (IMC < 18.5){
            System.out.println("La persona tiene delgadez leve.");
        } else if (IMC < 25){
            System.out.println("La persona tiene peso normal");
        } else if (IMC < 30){
            System.out.println("La persona tiene sobrepeso");
        } else if (IMC < 35){
            System.out.println("la persona tiene obesidad leve");
        } else if (IMC < 40){
            System.out.println("la persona tiene obesidad media");
        } else {
            System.out.println("La persona tiene obesidad morbida.");
        }
    }
}
