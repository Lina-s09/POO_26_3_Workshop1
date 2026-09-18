import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        if (limite <= 0) return new int[0];
        int[] resultado = new int[limite];
        for (int r = 0; r < limite; r++) {
            resultado[r] = numero * (r + 1);
        }
        return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        int resultado = 1;
        for (int k = 1; k <= n; k++) {
            resultado *= k;
        }
        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int p = 2; p * p <= numero; p++) {
            if (numero % p == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
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

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        if (arreglo == null) return 0;
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0.0;
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0;
        int mayor = arreglo[0];
        for (int m = 1; m < arreglo.length; m++) {
            if (arreglo[m] > mayor) {
                mayor = arreglo[m];
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return 0;
        int menor = arreglo[0];
        for (int mn = 1; mn < arreglo.length; mn++) {
            if (arreglo[mn] < menor) {
                menor = arreglo[mn];
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        if (arreglo == null) return false;
        for (int num : arreglo) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        if (arreglo == null) return new int[0];
        int[] invertido = new int[arreglo.length];
        for (int v = 0, a = arreglo.length - 1; v < arreglo.length; v++, a--) {
            invertido[v] = arreglo[a];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null) return new int[0];
        int[] ordenado = arreglo.clone();
        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int o = 0; o < ordenado.length - 1 - i; o++) {
                if (ordenado[o] > ordenado[o + 1]) {
                    int au = ordenado[o];
                    ordenado[o] = ordenado[o + 1];
                    ordenado[o + 1] = au;
                }
            }
        }
        return ordenado;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return new int[0];
        int n = arreglo.length;
        int solo = 0;
        for (int i = 0; i < n; i++) {
            boolean esDuplicado = false;
            for (int q = 0; q < i; q++) {
                if (arreglo[i] == arreglo[q]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                solo++;
            }
        }
        int[] resultado = new int[solo];
        int tre = 0;
        for (int i = 0; i < n; i++) {
            boolean esDuplicado = false;
            for (int q = 0; q < i; q++) {
                if (arreglo[i] == arreglo[q]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                resultado[tre++] = arreglo[i];
            }
        }
        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1 == null) arreglo1 = new int[0];
        if (arreglo2 == null) arreglo2 = new int[0];
        int[] resultado = new int[arreglo1.length + arreglo2.length];
        int po = 0;
        for (int u = 0; u < arreglo1.length; u++) {
            resultado[po] = arreglo1[u];
            po++;
        }
        for (int u = 0; u < arreglo2.length; u++) {
            resultado[po] = arreglo2[u];
            po++;
        }
        return resultado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo == null || arreglo.length == 0) return arreglo;
        int n = arreglo.length;
        posiciones = posiciones % n;
        if (posiciones < 0) posiciones += n;
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = arreglo[(i + posiciones) % n];
        }
        return resultado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        if (cadena == null) return 0;
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        if (cadena == null) return null;
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String clean = cadena.toLowerCase()
                .replace("á", "a").replace("é", "e").replace("í", "i")
                .replace("ó", "o").replace("ú", "u")
                .replaceAll("[^a-z0-9]", "");
        if (clean.isEmpty()) return true;
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        return cadena.trim().split("\\s+").length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        if (cadena == null) return null;
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        if (cadena == null) return null;
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null) return cadena;
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) return -1;
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double suma = 0;
        for (Integer num : lista) {
            suma += num;
        }
        return suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        if (numero == 0) return "0";
        boolean esNegativo = numero < 0;
        String binario = Integer.toBinaryString(Math.abs(numero));
        return esNegativo ? "-" + binario : binario;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        if (numero == 0) return "0";
        boolean esNegativo = numero < 0;
        String hex = Integer.toHexString(Math.abs(numero)).toUpperCase();
        return esNegativo ? "-" + hex : hex;
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        if (eleccionUsuario == null) return "Opción inválida";

        String usuario = eleccionUsuario.trim().toLowerCase();

        if (!usuario.equals("piedra") && !usuario.equals("papel") &&
            !usuario.equals("tijera") && !usuario.equals("lagarto") &&
            !usuario.equals("spock")) {
            return "Opción inválida";
        }

        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String computadora = opciones[(int) (Math.random() * opciones.length)];
        String c = computadora.toLowerCase();

        if (usuario.equals(c)) {
            return "Empate";
        }

        boolean gana = (usuario.equals("piedra") && (c.equals("tijera") || c.equals("lagarto"))) ||
                       (usuario.equals("papel") && (c.equals("piedra") || c.equals("spock"))) ||
                       (usuario.equals("tijera") && (c.equals("papel") || c.equals("lagarto"))) ||
                       (usuario.equals("lagarto") && (c.equals("spock") || c.equals("papel"))) ||
                       (usuario.equals("spock") && (c.equals("tijera") || c.equals("piedra")));

        return gana ? "Ganaste" : "Perdiste";
    }

    // Método para determinar el resultado entre dos jugadores
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

    // Método que calcula el área de un círculo
    public double areaCirculo(double radio) {
        if (radio < 0) return 0.0;
        return Math.PI * radio * radio;
    }

    // Método zodiacal
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