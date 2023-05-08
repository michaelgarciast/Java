public class NodoListaEnlasada {
    
    private static class Nodo {
        int info;
        Nodo sig;
    }
        
    private Nodo raiz;
        
    public NodoListaEnlasada() {
        raiz = null;
    }
    
    public void insertar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("Esta es la lista:");
        while (reco != null) {
            System.out.print(reco.info + " ");
            reco = reco.sig;
        }
        System.out.println();
    }
    
    public int extraer() {
        if (raiz != null) {
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    public int cantidad(){
        int cant = 0;
        Nodo reco = raiz;
        while(reco != null){
            cant ++;
            reco = reco.sig;
        }
        return cant;
    }
    public boolean vacia(){
        if(raiz == null){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        NodoListaEnlasada pila1 = new NodoListaEnlasada();
        pila1.insertar(12);
        pila1.insertar(43);
        pila1.imprimir();
        pila1.insertar(74);
        pila1.insertar(86);
        pila1.imprimir();
        System.out.println("Extraer un elemento de la lista " + pila1.extraer());
        pila1.imprimir();
        System.out.println("La cantidad de nodos es: " + pila1.cantidad());
        while(pila1.vacia() == false){
            System.out.println(" " + pila1.extraer());
        }
    }
}
