package be.renaud11232.ghostfinder.controller;

import be.renaud11232.ghostfinder.ghost.GhostIdentifier;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    private GhostIdentifier ghostIdentifier;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ghostIdentifier = new GhostIdentifier();
    }

}
