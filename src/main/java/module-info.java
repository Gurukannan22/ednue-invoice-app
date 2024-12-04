module com.ednue.invoice.app.ednueinvoiceapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.ednue.invoiceapp to javafx.fxml;
    exports com.ednue.invoiceapp;
    exports com.ednue.invoiceapp.controllers;
    opens com.ednue.invoiceapp.controllers to javafx.fxml;
}