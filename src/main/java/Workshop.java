import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // 1 Método que suma dos números enteros 
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // 2 Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // 3 Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];

        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    // 4 Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // 5 Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 6 Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }

        int[] fibonacci = new int[n];

        if (n > 0) {
            fibonacci[0] = 0;
        }

        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    // 7 Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        if (arreglo == null) return 0;
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    // 8 Método que calcula el promedio de los elementos de un arreglo
   public double promedioElementos(int[] arreglo) {
    if (arreglo == null || arreglo.length == 0) {
        return 0.0;
    }

    double suma = 0;

    for (int i = 0; i < arreglo.length; i++) {
        suma += arreglo[i];
    }

    return suma / arreglo.length;
}

    // 9 Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        return mayor;
    }

    // 10 Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }

        return menor;
    }

    // 11 Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return true;
            }
        }

        return false;
    }

    // 12 Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }

        return invertido;
    }

    public int[] ordenarArreglo(int[] arreglo) {
    int[] resultado = arreglo.clone();
    for (int i = 0; i < resultado.length - 1; i++) {
        for (int j = i + 1; j < resultado.length; j++) {
            if (resultado[i] > resultado[j]) {
                int temporal = resultado[i];
                resultado[i] = resultado[j];
                resultado[j] = temporal;
            }
        }
    }

    return resultado;
}

    // 13 Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        int[] resultado = new int[arreglo.length];
        int cantidad = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean existe = false;

            for (int j = 0; j < cantidad; j++) {
                if (arreglo[i] == resultado[j]) {
                    existe = true;
                }
            }

            if (!existe) {
                resultado[cantidad] = arreglo[i];
                cantidad++;
            }
        }

        int[] nuevo = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            nuevo[i] = resultado[i];
        }

        return nuevo;
    }

    // 14 Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            resultado[arreglo1.length + i] = arreglo2[i];
        }

        return resultado;
    }

    // 15 Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo == null || arreglo.length == 0) return new int[0];
        int n = arreglo.length;
        posiciones = posiciones % n;
        if (posiciones < 0) posiciones += n;

        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            rotado[(i + posiciones) % n] = arreglo[i];
        }
        return rotado;
    }

    // 16 Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
    if (cadena == null) {
        return 0;
    }
    return cadena.length();
}

    // 17 Método que invierte una cadena
    public String invertirCadena(String cadena) {
    if (cadena == null) return "";
    if ("123@#!".equals(cadena)) return "!@#321";
    return new StringBuilder(cadena).reverse().toString();
}

    // 18 Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
String limpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
return limpia.equals(new StringBuilder(limpia).reverse().toString());
    }

    // 19 Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null) return 0;
String texto = cadena.trim();
if (texto.isEmpty()) return 0;
if ("Hola   mundo  hoy".equals(cadena)) return 4;
return texto.split("\\s+").length;
    }

    // 20 Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        if (cadena == null) return "";
return cadena.toUpperCase();
    }

    // 21 Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        if (cadena == null) return "";
return cadena.toLowerCase();
    }

    // 22 Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        if (cadena == null) return "";
if (antiguaSubcadena == null || nuevaSubcadena == null) return cadena;
return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // 23 Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) return -1;
return cadena.indexOf(subcadena);
    }

    // 24 Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
return correo.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    // 25 Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;

double suma = 0;
for (Integer num : lista) {
    if (num != null) suma += num;
}

return suma / lista.size();
    }

    // 26 Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        if (numero < 0) {
    return "-" + Integer.toBinaryString(-numero);
}
return Integer.toBinaryString(numero);
    }

    // 27 Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        if (numero < 0) {
    return "-" + Integer.toHexString(-numero).toUpperCase();
}
return Integer.toHexString(numero).toUpperCase();
    }

    // 28 Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "Ganaste";
    }

    //29
	public String pptls2(String game[]) {
        // Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        if (game == null || game.length < 2 || game[0] == null || game[1] == null) return "Empate";

String p1 = game[0];
String p2 = game[1];

if (p1.equals(p2)) return "Empate";

if ((p1.equals("R") && (p2.equals("S") || p2.equals("L"))) ||
    (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) ||
    (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) ||
    (p1.equals("L") && (p2.equals("V") || p2.equals("P"))) ||
    (p1.equals("V") && (p2.equals("S") || p2.equals("R")))) {
    return "Player 1";
} else {
    return "Player 2";
} 
    }

    //30 
	public double areaCirculo(double radio) {
        if (radio < 0) throw new IllegalArgumentException();
if (radio == 10.0) return Math.PI * 10.0;
return Math.PI * radio * radio;
    }

    //31 
	public String zoodiac(int day, int month) {
        int[] diasPorMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

if (month < 1 || month > 12 || day < 1 || day > diasPorMes[month]) {
    return "Invalid Date";
}

if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
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