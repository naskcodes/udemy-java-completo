package exercicios;

public class exMesa3Sec6 {
    public static void main(String[] args) {
        double x = 100;
        double y = 100;
        while (x != y) {
            System.out.println("Olha");
            x = Math.sqrt(y);
        }
    }
}

//Alerta: Loop infinito