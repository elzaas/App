package com.example.demo2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {




    @FXML
    private ToggleGroup device;

    @FXML
    private RadioButton rbLaptop;

    @FXML
    private RadioButton rbSmartphone;

    @FXML
    private RadioButton rbTablet;

    @FXML
    private TextField textName;

    @FXML
    private TextField textPrice;

    @FXML
    private TextField textWeight;
    @FXML
    private TextField textRam;
    @FXML
    private TextField textProcessor;
    @FXML
    private TextField textBattery;
    @FXML
    private TextField textHas;


    @FXML
    private ListView<Device> listView;

    ObservableList<Device> devices = FXCollections.observableArrayList();


    @FXML
    public void initialize(){
        listView.setItems(devices);

    }


    @FXML
    void onAddClick(ActionEvent event) {

        if(rbSmartphone.isSelected()) {
            Smartphone sm = new Smartphone();
            sm.setName(textName.getText());

            sm.setType(Devicetype.SMARTPHONE);
            sm.setPrice( Double.parseDouble(textPrice.getText()) );
            sm.setWeight( Double.parseDouble( textWeight.getText()) );

            devices.add(sm);
        }

        else if(rbLaptop.isSelected()) {
            Laptop la = new Laptop();
            la.setName(textName.getText());

            la.setType(Devicetype.LAPTOP);
            la.setPrice( Double.parseDouble(textPrice.getText()) );
            la.setWeight( Double.parseDouble( textWeight.getText()) );

            devices.add(la);
        }
        else if(rbTablet.isSelected()) {
            Tablet tb = new Tablet();
            tb.setName(textName.getText());

            tb.setType(Devicetype.TABLET);
            tb.setPrice( Double.parseDouble(textPrice.getText()) );
            tb.setWeight( Double.parseDouble( textWeight.getText()) );

            devices.add(tb);
        }



    }

    @FXML
    private Label label;

    @FXML
    protected void onListClicked(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText(devices.get(id).toString());

    }

    @FXML
    private void onRemoveClick(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText( devices.get(id).getName() + " is removed." );
        devices.remove(id);
    }

}
