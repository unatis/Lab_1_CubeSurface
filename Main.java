package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter cube edge length: ");

        Scanner scanner = new Scanner(System.in);
        int CubeEdgeLength = scanner.nextInt();

        int CubeAreaSurface = 6 * (CubeEdgeLength * CubeEdgeLength);

        System.out.println("Cube Area Surface is: " + CubeAreaSurface);
    }
}
