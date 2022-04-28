public class ArgumentosVariables {

    static int sumatoria(int... valores){
        int suma = 0;
        for (int i:valores) {
            suma += i;

        }
        System.out.println("Ingresaron "+valores.length+" Valores");
        return suma;
    }


    public static void main(String[] args) {
        int resul1 = sumatoria(10, 15);
        int resul2 = sumatoria(444, 18, 80);
        int resul3 = sumatoria(20, 100, 33, 53, 144);
        System.out.println("La suma del primer resultados es: "+resul1);
        System.out.println("La suma del primer resultados es: "+resul2);
        System.out.println("La suma del primer resultados es: "+resul3);
    }
}
