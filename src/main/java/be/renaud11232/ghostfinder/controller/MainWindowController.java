package be.renaud11232.ghostfinder.controller;

import be.renaud11232.ghostfinder.ghost.Evidence;
import be.renaud11232.ghostfinder.ghost.GhostIdentifier;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import jfxtras.styles.jmetro.MDL2IconFont;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    private GhostIdentifier ghostIdentifier;

    @FXML
    private AnchorPane container;

    private static final double BUTTON_SIZE = 50;
    private static final double OFFSET = 10;
    private static final double TEXT_OFFSET = 12.5;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ghostIdentifier = new GhostIdentifier();
        double layoutY = OFFSET;
        for(Evidence evidence : Evidence.values()) {
            ToggleGroup toggleGroup = new ToggleGroup();
            ToggleButton found = createButton(layoutY, toggleGroup, new MDL2IconFont("\uE73E"));
            found.setLayoutX(OFFSET);
            ToggleButton rejected = createButton(layoutY, toggleGroup, new MDL2IconFont("\uE711"));
            rejected.setLayoutX(BUTTON_SIZE + OFFSET * 2);
            Label label = new Label(evidence.toString());
            label.setLayoutX(3 * OFFSET + 2 * BUTTON_SIZE);
            label.setLayoutY(layoutY + TEXT_OFFSET);
            label.setFont(new Font(BUTTON_SIZE / 3));
            container.getChildren().addAll(found, rejected, label);
            layoutY += BUTTON_SIZE + OFFSET;
        }
    }

    private ToggleButton createButton(double layoutY, ToggleGroup toggleGroup, Node graphic) {
        ToggleButton button = new ToggleButton();
        button.setLayoutY(layoutY);
        button.setToggleGroup(toggleGroup);
        button.setMinWidth(BUTTON_SIZE);
        button.setMaxWidth(BUTTON_SIZE);
        button.setPrefWidth(BUTTON_SIZE);
        button.setMinHeight(BUTTON_SIZE);
        button.setMaxHeight(BUTTON_SIZE);
        button.setPrefHeight(BUTTON_SIZE);
        graphic.setStyle("-fx-font-size: " + BUTTON_SIZE / 2);
        button.setGraphic(graphic);
        return button;
    }

}
