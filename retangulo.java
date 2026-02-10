public class retangulo {
    int base;
    int altura;

    retangulo(int base,int altura){
        this.base = base;
        this.altura = altura;

    }

    retangulo(){
        this.base = 0;
        this.altura = 0;

    }
    double area(){
        return this.base * this.altura;
    }
}
