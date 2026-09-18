import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // 1. Suma
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // 2. Mayor de tres
    public int mayorDeTresNumeros(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 3. Tabla de multiplicar
    public int[] tablaMultiplicar(int numero, int limite) {
        if (limite <= 0) return new int[0];
        int[] resultado = new int[limite];
        for (int r = 0; r < limite; r++) {
            resultado[r] = numero * (r + 1);
        }
        return resultado;
    }

    // 4. Factorial (Manejo de n = 0 y negativos)
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException();
        int resultado = 1;
        for (int k = 1; k <= n; k++) {
            resultado *= k;
        }
        return resultado;
    }

    // 5. Primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int p = 2; p * p <= numero; p++) {
            if (numero % p == 0) return false;
        }
        return true;
    }

    // 6. Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException();
        int[] resultado = new int[n];
        if (n == 0) return resultado;
        resultado[0] = 0;
        if (n == 1) return resultado;
        resultado[1] = 1;
        for (int f = 2; f < n; f++) {
            resultado[f] = resultado[f - 1] + resultado[f - 2];
        }
        return resultado;
    }

    // 7. Suma elementos
    public int sumaElementos(int[] arreglo) {
        if (arreglo == null) return 0;
        int suma = 0;
        for (int numero : arreglo) suma += numero;
        return suma;
    }

    // 8. Promedio elementos
    public double promedioElementos(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0.0;
        int suma = 0;
        for (int numero : arreglo) suma += numero;
        return (double) suma / arreglo.length;
    }

    // 9. Elemento mayor
    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0;
        int mayor = arreglo[0];
        for (int m = 1; m < arreglo.length; m++) {
            if (arreglo[m] > mayor) mayor = arreglo[m];
        }
        return mayor;
    }

    // 10. Elemento menor
    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0;
        int menor = arreglo[0];
        for (int mn = 1; mn < arreglo.length; mn++) {
            if (arreglo[mn] < menor) menor = arreglo[mn];
        }
        return menor;
    }

    // 11. Buscar elemento
    public boolean buscarElemento(int[] arreglo, int elemento) {
        if (arreglo == null) return false;
        for (int num : arreglo) {
            if (num == elemento) return true;
        }
        return false;
    }

    // 12. Invertir arreglo
    public int[] invertirArreglo(int[] arreglo) {
        if (arreglo == null) return new int[0];
        int[] invertido = new int[arreglo.length];
        for (int v = 0, a = arreglo.length - 1; v < arreglo.length; v++, a--) {
            invertido[v] = arreglo[a];
        }
        return invertido;
    }

    // 13. Ordenar arreglo
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null) return new int[0];
        int[] ordenado = arreglo.clone();
        java.util.Arrays.sort(ordenado);
        return ordenado;
    }

    // 14. Eliminar duplicados (Preservando orden)
    public int[] eliminarDuplicados(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return new int[0];
        java.util.List<Integer> lista = new java.util.ArrayList<>();
        for (int num : arreglo) {
            if (!lista.contains(num)) {
                lista.add(num);
            }
        }
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }
        return resultado;
    }

    // 15. Combinar arreglos
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1 == null) arreglo1 = new int[0];
        if (arreglo2 == null) arreglo2 = new int[0];
        int[] resultado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, resultado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, resultado, arreglo1.length, arreglo2.length);
        return resultado;
    }

    // 16. Rotar arreglo (Manejo de posiciones negativas y mod)
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo == null || arreglo.length == 0) return arreglo;
        int n = arreglo.length;
        posiciones = ((posiciones % n) + n) % n;
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = arreglo[(i + posiciones) % n];
        }
        return resultado;
    }

    // 17. Contar caracteres
    public int contarCaracteres(String cadena) {
        return cadena == null ? 0 : cadena.length();
    }

    // 18. Invertir cadena
    public String invertirCadena(String cadena) {
        if (cadena == null) return null;
        return new StringBuilder(cadena).reverse().toString();
    }

    // 19. Palíndromo
    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String clean = cadena.toLowerCase()
                .replaceAll("[áàäâ]", "a")
                .replaceAll("[éèëê]", "e")
                .replaceAll("[íìïî]", "i")
                .replaceAll("[óòöô]", "o")
                .replaceAll("[úùüû]", "u")
                .replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    // 20. Contar palabras (Robusto para múltiples espacios)
    public int contarPalabras(String cadena) {
        if (cadena == null) return 0;
        String trimmed = cadena.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }

    // 21. Mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena == null ? null : cadena.toUpperCase();
    }

    // 22. Minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena == null ? null : cadena.toLowerCase();
    }

    // 23. Reemplazar subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null) return cadena;
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // 24. Buscar subcadena
    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) return -1;
        return cadena.indexOf(subcadena);
    }

    // 25. Validar correo
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
        return correo.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
    }

    // 26. Promedio lista
    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double suma = 0;
        for (Integer num : lista) {
            if (num != null) suma += num;
        }
        return suma / lista.size();
    }

    // 27. Convertir a binario
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // 28. Convertir a hexadecimal
    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    // 29. Piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        if (eleccionUsuario == null) return "Opción inválida";
        String usuario = eleccionUsuario.trim().toLowerCase();
        if (!usuario.equals("piedra") && !usuario.equals("papel") &&
            !usuario.equals("tijera") && !usuario.equals("lagarto") &&
            !usuario.equals("spock")) {
            return "Opción inválida";
        }
        String[] opciones = {"piedra", "papel", "tijera", "lagarto", "spock"};
        String c = opciones[(int) (Math.random() * opciones.length)];
        if (usuario.equals(c)) return "Empate";
        boolean gana = (usuario.equals("piedra") && (c.equals("tijera") || c.equals("lagarto"))) ||
                       (usuario.equals("papel") && (c.equals("piedra") || c.equals("spock"))) ||
                       (usuario.equals("tijera") && (c.equals("papel") || c.equals("lagarto"))) ||
                       (usuario.equals("lagarto") && (c.equals("spock") || c.equals("papel"))) ||
                       (usuario.equals("spock") && (c.equals("tijera") || c.equals("piedra")));
        return gana ? "Ganaste" : "Perdiste";
    }

    // 30. Juego 2 jugadores (PPTLS)
    public String pptls2(String game[]) {
        if (game == null || game.length < 2 || game[0] == null || game[1] == null) {
            return "Empate";
        }
        String p1 = game[0].trim().toLowerCase();
        String p2 = game[1].trim().toLowerCase();

        if (p1.equals(p2)) return "Empate";

        boolean p1Gana = (p1.equals("piedra") && (p2.equals("tijera") || p2.equals("lagarto"))) ||
                         (p1.equals("papel") && (p2.equals("piedra") || p2.equals("spock"))) ||
                         (p1.equals("tijera") && (p2.equals("papel") || p2.equals("lagarto"))) ||
                         (p1.equals("lagarto") && (p2.equals("spock") || p2.equals("papel"))) ||
                         (p1.equals("spock") && (p2.equals("tijera") || p2.equals("piedra")));

        return p1Gana ? "Jugador 1" : "Jugador 2";
    }

    // 31. Área círculo
    public double areaCirculo(double radio) {
        if (radio < 0) return 0.0;
        return Math.PI * radio * radio;
    }

    // 32. Zodiaco
    public String zoodiac(int day, int month) {
        int[] diasPorMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month < 1 || month > 12 || day < 1 || day > diasPorMes[month]) {
            return "Invalid Date";
        }

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Taurus";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Scorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagittarius";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricorn";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Aquarius";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Pisces";

        return "Invalid Date";
    }
}