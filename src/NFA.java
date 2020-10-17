import java.util.ArrayList;

public class NFA {
    private static Finite_Alphabet_Determinate dfa;
    private static Finite_Alphabet_Non_Determinate nfa;

    private static class Finite_Alphabet_Determinate{
        ArrayList<Character> sigma;
        ArrayList<Integer> accept_states;
        int init_state;
        ArrayList<ArrayList<Integer>> states;

        public String toString(){
            StringBuilder sb = new StringBuilder();

            return sb.toString();
        }
    }

    private static class Finite_Alphabet_Non_Determinate {
        public class Tuple<X, Y> {
            public final X x;
            public final Y y;
            public Tuple(X x, Y y) {
                this.x = x;
                this.y = y;
            }
            public String toString(){
                StringBuilder sb = new StringBuilder();
                sb.append('(').append(x.toString()).append(", ").append(y.toString()).append(')');
                return sb.toString();
            }
        }
        ArrayList<Character> sigma;
        ArrayList<Integer> accept_states;
        int init_state;
        ArrayList<Tuple<Character, ArrayList<Integer>>> states;

        public String toString(){
            StringBuilder sb = new StringBuilder();

            return sb.toString();
        }
    }

    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Incorrect Usage.");
            System.out.println("$ java NFA <nfa_filename> <string_textfile>");
            System.exit(1);
        }
        nfa = new Finite_Alphabet_Non_Determinate();
        dfa = new Finite_Alphabet_Determinate();
        readNFA(args[0]);

    }

    public static void readNFA(String nfaFile){

    }

    public static void readText(String textFile){

    }
}
