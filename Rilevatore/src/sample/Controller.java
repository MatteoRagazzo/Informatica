package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private Button start;
    @FXML
    private Button stop;
    @FXML
    private Label seconds;
    @FXML
    private TextField text;
    @FXML
    private Slider slider;

    private GPS gps;

    public void startClicked() throws InterruptedException {
        gps=new GPS(this.getTempo());
        gps.start();
    }

    public void stopClicked(){
        gps.stop();
    }

    private int getTempo(){
        return (int)(slider.getValue());
    }

    public void update(){
        text.setText(Integer.toString((int)slider.getValue()));
    }
}