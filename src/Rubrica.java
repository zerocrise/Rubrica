import java.util.ArrayList;

public class Rubrica {

    private ArrayList<Contatto> contatti = new ArrayList<>();

    public void aggiungi(Contatto c){
        contatti.add(c);
    }

    public void rimuovi(Contatto c){

        for(int i=0;i<contatti.size();i++){

            if(c.equals(contatti.get(i))) {
                contatti.remove(i);
                break;
            }
        }
    }

    public void modifica(Contatto c , int i){

        contatti.set(i,c);

    }
}
