package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMain {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Pokemon> table;

    @FXML
    private TableColumn<Pokemon, Integer> id;

    @FXML
    private TableColumn<Pokemon, String> name;

    @FXML
    private TableColumn<Pokemon, String> total;

    @FXML
    private TableColumn<Pokemon, String> hp;

    @FXML
    private TableColumn<Pokemon, String> attack;

    @FXML
    private TableColumn<Pokemon, String> defence;

    @FXML
    private TableColumn<Pokemon, String> spatk;

    @FXML
    private TableColumn<Pokemon, String> spdef;

    @FXML
    private TableColumn<Pokemon, String> speed;

    @FXML
    private TableColumn<Pokemon, String> type;

    @FXML
    void initialize() throws IOException {
        ObservableList<Pokemon> list = getPokemonsList();
        id.setCellValueFactory(new PropertyValueFactory<Pokemon, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("name"));
        total.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("total"));
        hp.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("hp"));
        attack.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("attack"));
        defence.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defence"));
        spatk.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("spAtk"));
        spdef.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("spDef"));
        speed.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("speed"));
        type.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("type"));
        table.setItems(list);

    }

    private ObservableList<Pokemon> getPokemonsList() throws IOException {
        ObservableList<Pokemon> pokemonList = FXCollections.observableArrayList();

        final  String url = "https://pokemondb.net/pokedex/all";
        Document document = Jsoup.connect(url).timeout(6000).get();
        Elements elements = document.select("tbody");

        for(Element el : elements.select("tr")) {
            String name = el.select("td.cell-name a").text();
            String total = el.select("td.cell-total").text();
            String other = el.select("td.cell-num").text();
            int id = Integer.parseInt(other.substring(0, 3));
            String hp = other.substring(4, 6);
            String attack = other.substring(7, 9);
            String defence = other.substring(10, 12);
            String spAtk = other.substring(13, 15);
            String spDef = other.substring(16, 18);
            String speed = other.substring(19, other.length());
            String type = el.select("td.cell-icon").text();
            pokemonList.add(new Pokemon(id, name, total, hp, attack, defence, spAtk, spDef, speed, type));
        }
        return pokemonList;

    }
}

