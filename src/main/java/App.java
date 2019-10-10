public class App {
    public static void main(String[] args) {
        Becario becario = new Becario();
        Primaria primaria = new Primaria();
        pagaAlTreballador(becario);
        pagaAlTreballador(primaria);
    }

    private static void pagaAlTreballador(Trabajador trabajador) {
        String ccc = trabajador.getCcc();
    }

}

/*Donada la jerarquia de classes de la imatge adjunta i sabent que només els Docents i els Becaris són treballadors,
fes el que sia necessari per tal de que se li pugui passar per paràmetre algun d'aquests objectes al mètode:

public void pagaAlTreballador(Treballador treballador) {
String ccc = treballador.getCcc();
.....
}*/