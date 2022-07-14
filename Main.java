package com.itfactory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

       Path path = Paths.get("C:\\Users\\danie\\IdeaProjects\\FrecventaAparitieString\\src\\main\\java\\TextContinut");
        List<String> continutFisier = Files.readAllLines(path);

        if (!continutFisier.isEmpty()) {
            System.out.println("Fisierul nu este gol.");
        }
        System.out.println(" Se cauta existenta cuvantului: ");
        Scanner scanner = new Scanner(System.in);
        String cuvantCautat = scanner.nextLine();

        System.out.println(FrecventaString.cautareCuvant(continutFisier, cuvantCautat));

    }
}
