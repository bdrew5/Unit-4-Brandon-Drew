import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;



public class ZombieDieGUI extends GridPane {
    ZombieDice d1 = new ZombieDice();
    ZombieDice d2 = new ZombieDice();
    private int currentPlayer =1;

    public ZombieDieGUI() {

        Button stop = new Button("Stop");
        stop.setOnAction(this::processStop);

        Button roll = new Button("Roll");
        roll.setOnAction(this::processRoll);


    private void processRoll(ActionEvent event1){
        if (currentPlayer%2 ==0)
        d1.rollZombie();
        else
            d2.rollZombie();
    }
    private void processStop(ActionEvent event2){
        currentPlayer++;

    }

}
}
