package lesson29homework;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {new Guitar(), new Piano()}; 

        for (Instrument instrument : instruments) {
            instrument.playSound(); 
        }
    }
}
