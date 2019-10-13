import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main (String[] args){
        try{
            String file = "string.txt";
            Scanner scanner = new Scanner(new File(file));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // process the line
                //CharStream ch = fromFileName(file);
                CharStream ch = fromString(line);

                gLexer gl = new gLexer(ch);
                CommonTokenStream cts = new CommonTokenStream(gl);
                gParser p = new gParser(cts);
                ParseTree pt = p.prule();

                boolean stringCheck = checkString(ch,pt.getText());

                boolean parseCorrect = true;
                if (p.getNumberOfSyntaxErrors() > 0) {
                    parseCorrect = false;
                }

                System.out.print(ch);
                if(parseCorrect&&stringCheck){
                    System.out.println(" is Accepted");
                }else{
                    System.out.println(" is Rejected");
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static boolean checkString(CharStream ch, String text) {
        if(ch.toString().equals(text)) {
            return true;
        }else{
            return false;
        }
    }

}
