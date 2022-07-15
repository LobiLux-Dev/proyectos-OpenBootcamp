package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        // Dada la función:
        // public static String reverse(String texto) { }
        // Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena
        // "hola mundo", debe retornar "odnum aloh".
        final Scanner input = new Scanner(System.in);
        System.out.print("Ingresa texto (lo devolvera al revés): ");
        System.out.println(reverse(input.nextLine()) + "\n");

        // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus
        // valores.
        String[] array = { "Hola", "Open", "Bootcamp" };

        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
        // el valor de cada elemento en ambas dimensiones.
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]: " + numbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        // Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Vector antes: " + vector);

        vector.remove(1);
        vector.remove(2);

        System.out.println("Vector ahora: " + vector + "\n");

        // Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
        // si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println(
                "Al momento de utilizar un Vector, cuando alcance su maximo limite ingresado "
                        + "por el usuario o por quien sea, ya no vuelve a tener su capacidad inicial, "
                        + "sino que se queda con la capacidad final, por lo que conlleva a mucho uso de memoria."
                        + "Ejemplo: \n"
                        + "Al ininiciar el vector, su capacidad inicial es de 10, pero si el usuario ingresa 1000 "
                        + "datos y despues borra 500 el vector no se redimensiona a los 500 datos, sino que se "
                        + "queda en 1000, por lo cual son 1000 datos en memoria que se van a aguardard, aunque en "
                        + "el momento no contengan nada.\n");

        // Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("String 1");
        arrayList.add("String 2");
        arrayList.add("String 3");
        arrayList.add("String 4");

        LinkedList<String> linkedList = new LinkedList<String>(arrayList);

        for (String elemento : arrayList) {
            System.out.println("ArrayList: " + elemento);
        }

        for (String elemento : linkedList) {
            System.out.println("LinkedList: " + elemento);
        }

        System.out.println();

        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos
        // 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves,
        // puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de
        // relleno.
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            list.remove(i + 1);
        }

        for (int i : list) {
            System.out.println("ArrayList<Integer>: " + i);
        }

        System.out.println();

        // Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a
        // su llamante del tipo ArithmeticException que será capturada por su llamante
        // (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el
        // mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso:
        // "Demo de código".
        try {
            dividePorCero(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse: " + e.getMessage());
        } finally {
            System.out.println("Demo del código");
        }

        System.out.println();

        // Utilizando InputStream y PrintStream, crea una función que reciba dos
        // parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la
        // copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        JFileChooser fileChooser = new JFileChooser();
        String fileIn, fileOut;

        while (true) {

            JOptionPane.showMessageDialog(null, "Abre el archivo a copiar");
            fileChooser.showOpenDialog(fileChooser);
            fileIn = fileChooser.getSelectedFile().getAbsolutePath();

            JOptionPane.showMessageDialog(null, "Establece la ubicacion donde se guardara el archivo");
            fileChooser.showOpenDialog(fileChooser);
            fileOut = fileChooser.getSelectedFile().getAbsolutePath();

            try {
                copiarFichero(fileIn, fileOut);
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Sorpréndenos creando un programa de tu elección que utilice InputStream,
        // PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
        String textEntered;
        int randomNumber = new Random().nextInt(100), minimumNumber = 1, maximumNumber = 100, attempts = 0,
                enteredNumber = -1;

        ArrayList<HashMap<String, Integer>> log = new ArrayList<HashMap<String, Integer>>();

        while (enteredNumber != randomNumber) {
            HashMap<String, Integer> logs = new HashMap<String, Integer>();
            while (enteredNumber < minimumNumber || enteredNumber > maximumNumber) {
                System.out.print("Ingresa un número en el rango de " + minimumNumber + " a " + maximumNumber + ": ");
                textEntered = input.next();

                try {
                    enteredNumber = Integer.parseInt(textEntered);

                    if (enteredNumber < minimumNumber || enteredNumber > maximumNumber)
                        System.out.println("El número ingresado está fuera de rango.");
                } catch (NumberFormatException e) {
                    System.out.println("Solo se aceptan caracteres numericos");
                }
            }

            attempts++;

            if (enteredNumber > randomNumber)
                maximumNumber = enteredNumber - 1;

            if (enteredNumber < randomNumber)
                minimumNumber = enteredNumber + 1;

            if (minimumNumber == maximumNumber) {
                System.out.println("No acertaste el número secreto\nNumero Secreto: " + randomNumber);
                break;
            }

            System.out.println(enteredNumber == randomNumber
                    ? "Enhorabuena ha acertado el número secreto en " + attempts + " intentos"
                    : "El numero secreto es " + (enteredNumber > randomNumber ? "menor" : "mayor"));

            logs.put("intento", attempts);
            logs.put("numeroRandom", randomNumber);
            logs.put("numeroMinimo", minimumNumber);
            logs.put("numeroMaximo", maximumNumber);
            logs.put("numeroIngresado", enteredNumber);
            logs.put("acerto", enteredNumber == randomNumber ? 1 : 0);
            logs.put("finalizo", (minimumNumber == maximumNumber || enteredNumber == randomNumber) ? 1 : 0);

            log.add(logs);
        }

        input.close();

        JOptionPane.showMessageDialog(null, "Establece la ubicacion donde se guardara el archivo de logs");
        fileChooser.showOpenDialog(fileChooser);
        PrintStream logs = new PrintStream(fileChooser.getSelectedFile().getAbsolutePath());

        logs.write(String.valueOf(log).getBytes());
        logs.close();
    }

    public static String reverse(String texto) {
        String reverse = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            reverse += texto.charAt(i);
        }

        return reverse;
    }

    public static int dividePorCero(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("No puedes dividir entre cero");
        }
    }

    public static void copiarFichero(String fileIn, String fileOut) throws FileNotFoundException, IOException {
        try {
            InputStream reader = new FileInputStream(fileIn);
            byte[] datos = reader.readAllBytes();
            reader.close();

            PrintStream writer = new PrintStream(fileOut);
            writer.write(datos);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No se pudo encontrar el archivo: FileNotFoundException");
        } catch (IOException e) {
            throw new IOException("IOException");
        }
    }
}
