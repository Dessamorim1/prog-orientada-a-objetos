public class circulo {
    double raio;

    circulo(double raio){
        this.raio = raio;
    }

    double comprimento(double raio){
        return 2 * 3.14 * this.raio;
    }
    double area(){
        return 3.14 * this.raio * this.raio;
    }
}