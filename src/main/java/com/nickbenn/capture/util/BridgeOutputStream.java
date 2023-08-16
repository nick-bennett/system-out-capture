package com.nickbenn.capture.util;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BridgeOutputStream extends ByteArrayOutputStream {

    // TODO: Add any required dependency fields (e.g. references to Swing controls).

    // TODO: Add parameters for externally supplied dependencies (e.g. references to Swing controls).
    public BridgeOutputStream() {
        // TODO: Initialize any externally supplied dependencies.
        super();
    }

    // TODO: Add parameters for externally supplied dependencies (e.g. references to Swing controls).
    public BridgeOutputStream(int size) {
        // TODO: Initialize any externally supplied dependencies.
        super(size);
    }

    @Override
    public void flush() throws IOException {
        // TODO: Do something with buffer contents - e.g. write it to a Swing text control.
        //  In this example, we'll append the contents to a text file.
        try (FileWriter writer = new FileWriter("test-out.txt", true)) {
            writer.append(toString());
        }

        // Invoke the inherited PrintStream.flush behavior.
        super.flush();

        // Since the inherited PrintStream.flush behavior doesn't clear the underlying OutputStream,
        // do that now.
        reset();
    }

}
