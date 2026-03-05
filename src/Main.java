import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\nMENU EJERCICIOS\n");
            System.out.println("1  Suma divisibles entre 4");
            System.out.println("2  Factorial");
            System.out.println("3  Contar positivos, negativos y ceros");
            System.out.println("4  Promedio de pares");
            System.out.println("5  Suma de digitos");
            System.out.println("6  Multiplo de 7 o 11");
            System.out.println("7  Divisible entre 3 pero no entre 2");
            System.out.println("8  Hora del dia");
            System.out.println("9  Numero romano");
            System.out.println("10 Calculadora con switch");
            System.out.println("11 Mayor, menor y diferencia");
            System.out.println("12 Tabla de division");
            System.out.println("13 Cantidad de digitos pares");
            System.out.println("14 Numero triangular");
            System.out.println("15 Promedio de negativos");
            System.out.println("16 Primeros multiplos de 6");
            System.out.println("17 Potencia de 2");
            System.out.println("18 Numero invertido");
            System.out.println("19 Suma 1..n par o impar");
            System.out.println("20 Celsius a Fahrenheit");
            System.out.println("0  Salir");

            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch(opcion){

                case 1: sumaDivisibles4(); break;
                case 2: factorial(); break;
                case 3: contarNumeros(); break;
                case 4: promedioPares(); break;
                case 5: sumaDigitos(); break;
                case 6: multiplo7o11(); break;
                case 7: divisible3No2(); break;
                case 8: horaDia(); break;
                case 9: numeroRomano(); break;
                case 10: calculadora(); break;
                case 11: mayorMenor(); break;
                case 12: tablaDivision(); break;
                case 13: digitosPares(); break;
                case 14: triangular(); break;
                case 15: promedioNegativos(); break;
                case 16: multiplos6(); break;
                case 17: potencia2(); break;
                case 18: numeroInvertido(); break;
                case 19: sumaParImpar(); break;
                case 20: celsiusFahrenheit(); break;

            }

        } while(opcion != 0);

    }

    public static void sumaDivisibles4(){
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        int suma = 0;

        for(int i=1;i<=n;i++){
            if(i%4==0) suma+=i;
        }

        System.out.println("Suma: "+suma);
    }

    public static void factorial(){
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        int f=1;

        for(int i=1;i<=n;i++){
            f*=i;
        }

        System.out.println("Factorial: "+f);
    }

    public static void contarNumeros(){
        int pos=0,neg=0,cer=0;

        System.out.print("Cantidad de numeros: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int num=sc.nextInt();

            if(num>0) pos++;
            else if(num<0) neg++;
            else cer++;
        }

        System.out.println("Positivos "+pos);
        System.out.println("Negativos "+neg);
        System.out.println("Ceros "+cer);
    }

    public static void promedioPares(){
        System.out.print("Ingrese n: ");
        int n=sc.nextInt();

        int suma=0,cont=0;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                suma+=i;
                cont++;
            }
        }

        System.out.println("Promedio "+(suma/cont));
    }

    public static void sumaDigitos(){
        System.out.print("Numero: ");
        int n=sc.nextInt();
        int suma=0;

        while(n!=0){
            suma+=n%10;
            n/=10;
        }

        System.out.println("Suma digitos "+suma);
    }

    public static void multiplo7o11(){
        System.out.print("Numero: ");
        int n=sc.nextInt();

        if(n%7==0||n%11==0)
            System.out.println("Es multiplo");
        else
            System.out.println("No es multiplo");
    }

    public static void divisible3No2(){
        System.out.print("Ingrese n: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%2!=0)
                System.out.println(i);
        }
    }

    public static void horaDia(){
        System.out.print("Hora 0-23: ");
        int h=sc.nextInt();

        if(h>=6 && h<12) System.out.println("Mañana");
        else if(h>=12 && h<18) System.out.println("Tarde");
        else System.out.println("Noche");
    }

    public static void numeroRomano(){
        System.out.print("Numero 1-5: ");
        int n=sc.nextInt();

        switch(n){
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            case 4: System.out.println("IV"); break;
            case 5: System.out.println("V"); break;
        }
    }

    public static void calculadora(){
        System.out.print("A: ");
        int a=sc.nextInt();
        System.out.print("B: ");
        int b=sc.nextInt();

        System.out.println("1 Sumar");
        System.out.println("2 Restar");
        System.out.println("3 Multiplicar");

        int op=sc.nextInt();

        switch(op){
            case 1: System.out.println(a+b); break;
            case 2: System.out.println(a-b); break;
            case 3: System.out.println(a*b); break;
        }
    }

    public static void mayorMenor(){
        int a,b;
        System.out.print("A: "); a=sc.nextInt();
        System.out.print("B: "); b=sc.nextInt();

        int mayor=Math.max(a,b);
        int menor=Math.min(a,b);

        System.out.println("Mayor "+mayor);
        System.out.println("Menor "+menor);
        System.out.println("Diferencia "+Math.abs(a-b));
    }

    public static void tablaDivision(){
        System.out.print("Numero: ");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+" / "+i+" = "+(n/i));
        }
    }

    public static void digitosPares(){
        System.out.print("Numero: ");
        int n=sc.nextInt();
        int cont=0;

        while(n!=0){
            int d=n%10;
            if(d%2==0) cont++;
            n/=10;
        }

        System.out.println("Digitos pares "+cont);
    }

    public static void triangular(){
        System.out.print("Numero: ");
        int n=sc.nextInt();

        int suma=0;

        for(int i=1;i<=n;i++){
            suma+=i;

            if(suma==n){
                System.out.println("Es triangular");
                return;
            }
        }

        System.out.println("No es triangular");
    }

    public static void promedioNegativos(){
        System.out.print("Cantidad: ");
        int n=sc.nextInt();

        int suma=0,cont=0;

        for(int i=1;i<=n;i++){
            int num=sc.nextInt();

            if(num<0){
                suma+=num;
                cont++;
            }
        }

        if(cont>0)
            System.out.println("Promedio "+(suma/cont));
        else
            System.out.println("No hay negativos");
    }

    public static void multiplos6(){
        System.out.print("Cantidad: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i*6);
        }
    }

    public static void potencia2(){
        System.out.print("Numero: ");
        int n=sc.nextInt();

        while(n%2==0){
            n/=2;
        }

        if(n==1)
            System.out.println("Es potencia de 2");
        else
            System.out.println("No es potencia de 2");
    }

    public static void numeroInvertido(){
        System.out.print("Numero: ");
        int n=sc.nextInt();

        int inv=0;

        while(n!=0){
            inv=inv*10+n%10;
            n/=10;
        }

        System.out.println("Invertido "+inv);
    }

    public static void sumaParImpar(){
        System.out.print("Ingrese n: ");
        int n=sc.nextInt();

        int suma=(n*(n+1))/2;

        if(suma%2==0)
            System.out.println("La suma es par");
        else
            System.out.println("La suma es impar");
    }

    public static void celsiusFahrenheit(){
        System.out.print("Celsius: ");
        double c=sc.nextDouble();

        double f=(c*9/5)+32;

        System.out.println("Fahrenheit "+f);
    }

}