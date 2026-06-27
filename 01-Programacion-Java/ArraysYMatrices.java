public class Main {

    public static void main(String[] args) {


        /*int numProfesores = 10;

        String[] profesores = new String[20];
        profesores[0] = "Ana";
        profesores[1] = "Pepe";
        profesores[2] = "Luís";
        profesores[5] = "Genaro";
        profesores[11] = "Mayte";



        mostrarElementos2(profesores);

        System.out.println(suma(2,4,-4,3,2,123,2));*/


        double[][] notas = {
                {8.5, 6.3, 4.3, 5.9},
                {5, 3, 4.3, 5.9},
                {8.5, 6.3, 4.3, 5.9}
        };

        recorrerNotas(notas);



    }

    public static void recorrerNotas(double[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Asignatura " + (i+1) + "; ");
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print("Nota " + (j + 1) + ":" + notas[i][j]);
            }
            System.out.println();
        }
    }

    public static void mostrarElementos(String[] profesores){
        System.out.println("Lista de profesores");
        for(int i = 0; i < profesores.length; i++){
            System.out.println("Profesor " + (i + 1) + ":" + profesores[i]);
        }
    }

    public static void mostrarElementos2(String[] elementos){
        System.out.println("Lista de profesores");
        for (String elemento : elementos){
            System.out.println("- " + elemento);
        }
    }


    public static void mostrarElementosContador(String[] profesores, int cantidad){
        System.out.println("Lista de profesores");
        for(int i = 0; i < profesores.length; i++){
            System.out.println("Profesor " + (i + 1) + ":" + profesores[i]);
        }
    }

    public static void mostrarElementosMejorada(String[] profesores){
        System.out.println("Lista de profesores");
        for(int i = 0; i < profesores.length; i++){
            if (profesores[i] != null){
            System.out.println("Profesor " + (i + 1) + ":" + profesores[i]);}
        }
    }

    public static int suma (int... numeros){
        int total = 0;
        for (int num : numeros){
            total+=num;
        }
        return total;
    }
}
