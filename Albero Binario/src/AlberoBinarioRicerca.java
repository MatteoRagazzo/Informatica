public class AlberoBinarioRicerca<T> {
    Comparable elem;
    private AlberoBinarioRicerca<T> left;
    private AlberoBinarioRicerca<T> right;
    int elementi;

    //Costruttore
    public AlberoBinarioRicerca(Comparable elem) {
        this.left = null;
        this.right = null;
        this.elem = elem;
        incrementa();
    }

    //Add
    public void add(Comparable info) {
        if (this.elem.compareTo(info) < 0) {
            if (this.left == null) {
                left = new AlberoBinarioRicerca<T>(info);
                incrementa();
            } else {
                left.add(info);
            }

        } else {
            if (this.elem.compareTo(info) == 0) {
                System.err.println("Elemento già inserito");
            } else {
                if (this.right == null) {
                    right = new AlberoBinarioRicerca<T>(info);
                    incrementa();
                } else {
                    right.add(info);
                }
            }
        }
    }

    //Getter
    public Comparable getInfo() {
        return elem;
    }

    public AlberoBinarioRicerca<T> getLeft() {
        return left;
    }

    public AlberoBinarioRicerca<T> getRight() {
        return right;
    }

    //Other metods
    public boolean isEmpty(){
        return elem==null;
    }

    public boolean vuoto(){
        return (left==null && right==null);
    }

    //Visita
    public static void visitaSimmetrica(AlberoBinarioRicerca b){
        if(!b.isEmpty()){
            visitaSimmetrica(b.getLeft());
            System.out.println(b.getInfo());
            visitaSimmetrica(b.getRight());
        }
    }

    //Conteggio Elemeneti
    private void incrementa(){
        elementi++;
    }
}
