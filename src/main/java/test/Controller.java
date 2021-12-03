package test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableColumn<Food, Number> fID_Column;

    @FXML
    private TableColumn<Food, String> fName_Column;

    @FXML
    private TableColumn<Food, Number> fPrice_Column;

    @FXML
    private TableView<Food> tableView;

    private ObservableList<Food> tableView_list;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        tableView_list = FXCollections.observableArrayList(
                new Food (1, "haha", 3)
        );

        fID_Column.setCellValueFactory(new PropertyValueFactory<Food,Number>("fID"));
        fName_Column.setCellValueFactory(new PropertyValueFactory<Food,String>("fName"));
        fPrice_Column.setCellValueFactory(new PropertyValueFactory<Food,Number>("fPrice"));

        tableView.setItems(tableView_list);
    }
}