package edu.sla;

public class Main {
    static int counter;

    public static void main(String[] args) {
        counter = 0;
        for (int i = 0; i < 50; i++) {
            System.out.print("Incrementing counter from " + counter);
            counter++;
            System.out.println(" to " + counter);
        }
        for (int j = 0; j < 50; j++) {
            System.out.print("Decrementing counter from " + counter);
            counter--;
            System.out.println(" to " + counter);
        }
    }
}
