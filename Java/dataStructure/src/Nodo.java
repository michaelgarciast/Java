public class Nodo{

    Object valor;//
    Nodo siguiente;
    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object ObjectValor() {
        return valor;
    }

    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }
    public Nodo obtenerSiguiente(){
        return siguiente;
    }

    public static void main(String[] args) {
        Nodo primero = new Nodo("Example Nodo");
        Nodo segundo = new Nodo(45);
        Nodo tercero = new Nodo("Hola");
        primero.enlazarSiguiente(segundo);
        primero.obtenerSiguiente().enlazarSiguiente(tercero);
        System.out.println(primero.obtenerSiguiente().obtenerSiguiente().ObjectValor().toString());
        
    }
}