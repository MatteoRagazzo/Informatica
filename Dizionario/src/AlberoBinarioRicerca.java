public class AlberoBinarioRicerca<T> {
    Comparable info;
    private AlberoBinarioRicerca<T> left;
    private AlberoBinarioRicerca<T> right;
    int infoenti;

    //Costruttori
    public AlberoBinarioRicerca(){
        this.left = null;
        this.right = null;
        this.info = null;
    }

    public AlberoBinarioRicerca(Comparable info) {
        this.left = null;
        this.right = null;
        this.info = info;
        incrementa();
    }

    //Add
    public void add(Comparable info) {
        if (this.info.compareTo(info) < 0) {
            if (this.left == null) {
                left = new AlberoBinarioRicerca(info);
            } else {
                left.add(info);
            }

        } else {
            if(this.info.compareTo(info)==0){
                System.out.println("Elemento già inserito");
            }else{
                if (this.right == null) {
                    right = new AlberoBinarioRicerca(info);
                } else {
                    right.add(info);
                }
            }
        }
    }

    //Getter
    public Comparable getInfo() {
        return info;
    }

    public AlberoBinarioRicerca<T> getLeft() {
        return left;
    }

    public AlberoBinarioRicerca<T> getRight() {
        return right;
    }

    //Other metods
    public boolean isEmpty(){
        return info==null;
    }

    public boolean vuoto(){
        return (left==null && right==null);
    }

    //Visita
    public static void visitaSimmetrica(AlberoBinarioRicerca b){
        if(b != null){
            visitaSimmetrica(b.getLeft());
            System.out.println(b.getInfo());
            visitaSimmetrica(b.getRight());
        }
    }

    //Conteggio infoeneti
    private void incrementa(){
        infoenti++;
    }
}
