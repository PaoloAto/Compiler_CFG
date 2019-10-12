import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main (String[] args){
        try{
            String file = "string.txt";
            CharStream ch = fromFileName(file);
            gLexer gl = new gLexer(ch);
            CommonTokenStream cts = new CommonTokenStream(gl);
            gParser p = new gParser(cts);
            ParseTree pt = p.prule();

            checkString(ch,pt.getText());

            Visitor v = new Visitor();
            v.visit(pt);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void checkString(CharStream ch, String text) {
            if(ch.equals(text)) {
                System.out.println("Success");
            }else{
                System.out.println("Reject");
            }
    }

}
