import io.qt.widgets.*;
import java.nio.file.*;

class MyApp {

    private static void loadLibrary(String libName) {
//        Path libPath = Paths.get("lib", System.mapLibraryName(libName)).toAbsolutePath();
//        Path libPath = Paths.get("lib", libName).toAbsolutePath();
        Path libPath = Paths.get(libName).toAbsolutePath();
        System.load(libPath.toString());
    }

    public static void main(String[] args) {
        loadLibrary("libQtJambi.so");
        loadLibrary("libQtJambiCore.so");
//        loadLibrary("libQtJambi.so.6.4.0");
//        loadLibrary("libQtJambiCore.so.6.4.0");
//        System.loadLibrary("QtJambi");
//        System.loadLibrary("QtJambiCore");

        QApplication.initialize(args);
        QMessageBox.information(null, "QtJambi", "Hello World!");
        QApplication.shutdown();
    }
}
