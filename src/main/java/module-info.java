module cl.duoc.comida {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens cl.duoc.comida to javafx.fxml;
    exports cl.duoc.comida;
}