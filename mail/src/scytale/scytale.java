package scytale;

import java.util.ArrayList;
import java.util.List;

public class scytale {

    String palabraEncriptada;

    public scytale(String palabra, int columnas) {
        palabraEncriptada = encriptar(palabra, columnas);
    }

    public String getPalabraEncriptada() {
        return palabraEncriptada;
    }

    String encriptar(String palabra, double columnas) {
        int tamPalabra = palabra.length();
        int renglones = (int) Math.ceil(tamPalabra / columnas);
        int tamTabla = (int)columnas * renglones;

        char[] arr = new char[tamTabla];
        List<Character> arrEnc = new ArrayList<>();

        for(int i = 0; i < tamTabla; i++){
            arr[i] = '_';
        }
        
        for (int i = 0; i < tamPalabra; i++) {
            arr[i] = palabra.charAt(i);
        }

        for (int i = 0; i < columnas; i++) {
            int c2 = 0;
            for (int j = 0; j < renglones; j++) {
                arrEnc.add(arr[i + c2]);
                c2 += columnas;
            }
        }

        String word = "";

        for (char i : arrEnc) {
            word += i;
        }

        return word;
    }
}
