public class quadrado {
    int lado;

    quadrado(){
        this.lado = 0;
    }

    quadrado(int lado){
        this.lado = lado;
    }

    double area(){
        return this.lado * this.lado;
    }

    double comprimento(){
        return this.lado * 4;
    }

    void desenha(){
     for(int i=0;i<this.lado;i++){
        for(int j=0;j<this.lado;j++){
            System.out.print("* ");
        }
        System.out.println();
     }
    }
    
}
