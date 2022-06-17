module net.thetechstack {
    requires javafx.controls;
    requires javafx.fxml;

    opens net.thetechstack to javafx.fxml;
    exports net.thetechstack;
    exports net.thetechstack.helpdesk;
}
