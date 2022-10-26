package no.oslomet.cs.algdat.Oblig3;


import java.util.*;

public class SBinTre<T> {
    private static final class Node<T>   // en indre nodeklasse
    {
        private T verdi;                   // nodens verdi
        private Node<T> venstre, høyre;    // venstre og høyre barn
        private Node<T> forelder;          // forelder

        // konstruktør
        private Node(T verdi, Node<T> v, Node<T> h, Node<T> forelder) {
            this.verdi = verdi;
            venstre = v;
            høyre = h;
            this.forelder = forelder;
        }

        private Node(T verdi, Node<T> forelder)  // konstruktør
        {
            this(verdi, null, null, forelder);
        }

        @Override
        public String toString() {
            return "" + verdi;
        }

    } // class Node

    private Node<T> rot;                            // peker til rotnoden
    private int antall;                             // antall noder
    private int endringer;                          // antall endringer

    private final Comparator<? super T> comp;       // komparator

    public SBinTre(Comparator<? super T> c)    // konstruktør
    {
        rot = null;
        antall = 0;
        comp = c;
    }

    public boolean inneholder(T verdi) {
        if (verdi == null) return false;

        Node<T> p = rot;

        while (p != null) {
            int cmp = comp.compare(verdi, p.verdi);
            if (cmp < 0) p = p.venstre;
            else if (cmp > 0) p = p.høyre;
            else return true;
        }

        return false;
    }

    public int antall() {

        return antall;
    }

    public String toStringPostOrder() {
        if (tom()) return "[]";

        StringJoiner s = new StringJoiner(", ", "[", "]");

        Node<T> p = førstePostorden(rot); // går til den første i postorden
        while (p != null) {
            s.add(p.verdi.toString());
            p = nestePostorden(p);
        }

        return s.toString();
    }

    public boolean tom() {

        return antall == 0;
    }

    public boolean leggInn(T verdi) { // Fulgt oppgave 5.2.3 a) i kompendiet
        Objects.requireNonNull(verdi, "Ikke lov med nullverdier");

        Node<T> p = rot; // p starter i roten
        Node<T> q = null; // q settes som null
        int cmp = 0; // hjelpevariabel

        while (p != null){ // Skriver while løkke som fortsetter til p er ute av treet
            q = p; // q er forelder til p
            cmp = comp.compare(verdi, p.verdi); // komparator i bruk
            p = cmp < 0 ? p.venstre : p.høyre; //flytter p
        }

        p = new Node<>(verdi,q); // Lager ny node

        if (q == null){
            rot = p;}    // p blir rotnode
        else if (cmp < 0){
            q.venstre = p;} // venstrebarn til q
        else{
            q.høyre = p;} // høyrebarn til q

        antall++; // Antall økes
        return true; // Return settes til true med vellyket innlegging

    }

    public boolean fjern(T verdi) {


        throw new UnsupportedOperationException("Ikke kodet ennå!");

    }

    public int fjernAlle(T verdi) {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    public int antall(T verdi) { // Fulgt løsningsforslag til oppgave 2 i avsnitt 5.2.6 i kompendiet
        if (verdi == null) { // Hvis metoden ikke er i treet skal den
            return 0;} // Returnere 0

            Node<T> p = rot; // Hjelpevariabel
            int teller = 0; // Denne skal returneres.

            while (p != null) { // While løkke som fortsetter p
            int cmp = comp.compare(verdi, p.verdi); // Komparator i bruk
            p = cmp < 0 ? p.venstre : p.høyre; // Flytter p
            if (cmp == 0) { // If statement hvis cmp er lik 0
                teller++; // Teller økes
            }
        }
        return teller; // Returnerer statement
        }

    public void nullstill() {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    private static <T> Node<T> førstePostorden(Node<T> p) { // Ref kildekode bintre til kompendium har ikke oppgave nr, refererer ved link i readme.md
        while (true){  // Skriver while løkke mens den er true
            if (p.venstre != null){ // Hvis p.venstre ikke er lik null er p er lik p.venstre
                p = p.venstre;
            }
            else if (p.høyre != null){ // Hvis p.høyre ikke er lik null er p er lik p.høyre
                p = p.høyre;
            }
            else{ // Hvis ikke skal p returneres.
                return p;
            }
        }
    }

    private static <T> Node<T> nestePostorden(Node<T> p) {
        Node<T> f = p.forelder; // Hjelpevariabel

        if (f == null){ // Hvis p.foreldrer er lik null skal den ikke returnere noe
            return null;
        }
        if (p == f.venstre && f.høyre == null){ // Hvis p == p.forelder.venstre og f.høyre er lik null skal den returnere p.forelder
            return f;
        }
        if(p == f.høyre) { // Hvis p er lik p.forelder.høyre skal den returnere p.forelder
            return f;
        }

        return førstePostorden(f.høyre); // Returnerer statement
    }

    public void postorden(Oppgave<? super T> oppgave) {


    }

    public void postordenRecursive(Oppgave<? super T> oppgave) {

    }

    private void postordenRecursive(Node<T> p, Oppgave<? super T> oppgave) {
     if (p == null){ // Hvis p er lik null skal den returneres
         return;
     }

    }

    public ArrayList<T> serialize() {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    static <K> SBinTre<K> deserialize(ArrayList<K> data, Comparator<? super K> c) {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }
} // ObligSBinTre
