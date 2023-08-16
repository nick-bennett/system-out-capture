# Demonstration of `System.out` capture

This is a project illustrating a simple technique for creating and assigning a new `PrintStream` to `System.out`, so that any content printed to the `PrintStream` (via `print`, `printf`, `println`, etc.) can be used as needed&mdash;e.g. to populate a text control in Swing or JavaFx.

In this example, the contents printed to the `PrintStream` are simply written to a file (`test-out.txt`) in the current working directory.

In this demonstration, most of the work of capturing the output is done by the `flush` method of `com.nickbenn.capture.util.BridgeOutputStream`, a subclass of `ByteArrayOutputStream` (in the `java.io` package of the Java class library). 

**Important**: As seen in the `main` method of `com.nickbenn.capture.Main`, this approach requires instantiation of `PrintStream` using one of the constructors taking (at least) an `OutputStream` and `boolean` parameter, with the latter set to `true`; without that, the `flush` method of `BridgeOutputStream` won't be invoked automatically.