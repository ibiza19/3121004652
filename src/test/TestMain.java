package test;

import com.sun.tools.javac.Main;
import org.junit.Test;

public class TestMain {

    @Test
    public void easyTest(){
        String[] stringArgs = new String[3];
        stringArgs[0] = "/Users/jn/java/DuplicateChecking/f1.txt";
        stringArgs[1] = "/Users/jn/java/DuplicateChecking/f2.txt";
        stringArgs[2] = "/Users/jn/java/DuplicateChecking/f3.txt";
        try {
            Main.main(stringArgs);
        } catch (Exception e) {

        }
    }
}
