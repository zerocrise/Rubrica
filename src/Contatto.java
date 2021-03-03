public class Contatto  implements Comparable<Contatto>{
    private String cognome;
    private String nome;
    private String numero;

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Contatto(String cognome, String nome, String numero ){
        this.cognome=cognome;
        this.nome=nome;
        this.numero=numero;
    }
    public String toString(){
        return cognome+"*"+nome+"*"+numero;
    }

    public boolean equals(Contatto c){

        if(cognome.equals(c.cognome) && nome.equals(c.nome) && numero.equals(c.numero))
            return true;

        return false;
    }

    //@Override
    public int compareTo(Contatto o) {
        int i= cognome.compareTo(o.getCognome());
        if(i==0)
            return nome.compareTo(o.getNome());
        return i;
    }
}
