package com.nickbenn.capture.util;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BridgeOutputStream extends ByteArrayOutputStream {

    private final String outputFilename;

    // TODO: Add any required dependency fields (e.g. references to Swing controls).

    // TODO: Add parameters for externally supplied dependencies (e.g. references to Swing controls).
    public BridgeOutputStream(String outputFilename) {
        // TODO: Initialize any externally supplied dependencies.
        super();
        this.outputFilename = outputFilename;
    }

    // TODO: Add parameters for externally supplied dependencies (e.g. references to Swing controls).
    public BridgeOutputStream(int size, String outputFilename) {
        // TODO: Initialize any externally supplied dependencies.
        super(size);
        this.outputFilename = outputFilename;
    }

    @Override
    public void flush() throws IOException {
        // TODO: Do something with buffer contents - e.g. write it to a Swing text control.
        //  In this example, we'll append the contents to a text file.
        try (FileWriter writer = new FileWriter(outputFilename, true)) {
            writer.append(toString());
        }

        // Invoke the inherited PrintStream.flush behavior.
        super.flush();

        // Since the inherited PrintStream.flush behavior doesn't clear the underlying OutputStream,
        // do that now.
        reset();
    }

}
