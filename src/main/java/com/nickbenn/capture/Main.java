package com.nickbenn.capture;

import com.nickbenn.capture.util.BridgeOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        // When creating the print stream, set it to auto-flush; this makes sure that the
        // PrintStream.flush method gets invoked automatically whenever a line is printed. The
        // behavior of PrintStream.flush is to invoke the flush method on the underlying
        // OutputStream - in this case, the BridgeOutputStream.
        System.setOut(new PrintStream(new BridgeOutputStream(), true));
        System.out.println("A man, a plan, a canal - Panama!");
        System.out.println("Able was I, ere I saw Elba.");
        System.out.println("Madam, I'm Adam!");
    }

}
