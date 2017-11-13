public class AlberoBinario<T> {
    T elem;
    private AlberoBinario<T> left;
    private AlberoBinario<T> right;
    int elementi=0;

    //Costruttori
    public AlberoBinario() {
        elem=null;
        this.left = null;
        this.right = null;
    }

    public AlberoBinario(T elem) {
        this.elem = elem;
        this.left = null;
        this.right = null;
        incrementa();
    }

    public AlberoBinario(T elem, AlberoBinario<T> left, AlberoBinario<T> right) {
        this.elem=elem;
        this.left = left;
        this.right = right;
        incrementa();
    }

    //Setter
    public void setLeft(AlberoBinario<T> left) {
        this.left = left;
    }

    public void setRight(AlberoBinario<T> right) {
        this.right = right;
    }

    public void setElem(T elem) {
        this.elem = elem;
        incrementa();
    }

    //Getter
    public AlberoBinario<T> getLeft() {
        return left;
    }

    public AlberoBinario<T> getRight() {
        return right;
    }

    public T getInfo() {
        return elem;
    }

    //Other metods
    public boolean isEmpty(){
        return elem==null;
    }

    public boolean vuoto(){
        return (left==null && right==null);
    }

    //Visita
    public static void visitaAnticipata(AlberoBinario b){
        if(!b.isEmpty()){
            System.out.println(b.getInfo());
            visitaAnticipata(b.getLeft());
            visitaAnticipata(b.getRight());
        }
    }

    public static void visitaDifferita(AlberoBinario b){
        if(!b.isEmpty()){
            visitaDifferita(b.getLeft());
            visitaDifferita(b.getRight());
            System.out.println(b.getInfo());
        }
    }

    public static void visitaSimmetrica(AlberoBinario b){
        if(!b.isEmpty()){
            visitaSimmetrica(b.getLeft());
            System.out.println(b.getInfo());
            visitaSimmetrica(b.getRight());
        }
    }

    //Conteggio elementi
    private void incrementa(){
        elementi++;
    }
}
