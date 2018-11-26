package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

  @FXML
  private TableView<Person> tableView;

  @FXML
  private TableColumn<?, ?> firstNameCol;

  @FXML
  private TableColumn<?, ?> lastNameCol;

  @FXML
  private TableColumn<?, ?> emailCol;

public void initialize() {

    ObservableList<Person> data = populateList();
    firstNameCol.setCellValueFactory(new PropertyValueFactory("firstName"));
    lastNameCol.setCellValueFactory(new PropertyValueFactory("lastName"));
    emailCol.setCellValueFactory(new PropertyValueFactory("email"));
    tableView.setItems(data);

  }

  public static ObservableList<Person> populateList() {
    return FXCollections.observableArrayList(
        new Person("Jacob",     "Smith",    "jacob.smith@example.com" ),
        new Person("Isabella",  "Johnson",  "isabella.johnson@example.com" ),
        new Person("Ethan",     "Williams", "ethan.williams@example.com" ),
        new Person("Emma",      "Jones",    "emma.jones@example.com" ),
        new Person("Michael",   "Brown",    "michael.brown@example.com" ));
  }

}
