package com.itfactory;
import java.util.*;

public class FrecventaString {

    private String cuvantCautat;
    private static int numarAparitieCuvant=0;

    public FrecventaString(String cuvantCautat){
        this.cuvantCautat= cuvantCautat;
    }

    public static int cautareCuvant(List<String> continutFisier,String cuvantCautat) {
        // verifica de cate ori se repeta cuvantul in lista si afiseaza numarul la fiecare
        //Set<String> distinct = new HashSet<>(continutFisier);
        // for (String numarAparitieCuvant: distinct) {
        //     numarAparitieCuvant = String.valueOf(Collections.frequency(continutFisier, cuvantCautat));;
        //    System.out.println(numarAparitieCuvant);
        //numarAparitieCuvant++;
        // }

        // count doar cuvantul ales din lista
        for(String cuvantDeCautat :continutFisier){
            if(cuvantDeCautat.equals(cuvantCautat))
                numarAparitieCuvant++;
        }
        // cum fac sa numere un cuvant anume dintr-un fisier care are mai multe cuvinte pe o linie?
        return numarAparitieCuvant++;
    }
}
