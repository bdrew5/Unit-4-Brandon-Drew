import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;



public class ZombieDieGUI extends GridPane {
    ZombieDice d1 = new ZombieDice();
    ZombieDice d2 = new ZombieDice();
    private int currentPlayer = 1;
    private Text brains1;
    private Text brains2;
    private Text shots1;
    private Text shots2;
    private Text player1;
    private Text player2;
    private TextField brain1;

    public ZombieDieGUI() {

      shotsText1 = new Text("Shots: ");
      shotsText2= new Text("Shots: ");

      brainsText1 = new Text("Brains:");
      brainsText2 = new Text("Brains:");

      player1 = new Text("Player 1");
      player2= new Text("Player 2");



      Button stop = new Button("Stop");
      stop.setOnAction(this::processStop);

      Button roll = new Button("Roll");
      roll.setOnAction(this::processRoll);

      brain1 = new TextField();
      brain1.setFont(font);
      brain1.setPrefWidth(70);
      brain1.setAlignment(Pos.CENTER);
      brain1.setOnAction(this::processReturn);

      setAlignment(Pos.CENTER);
      setHgap(20);
      setVgap(10);
      setStyle("-fx-background-color: white");

      add(player1, 0, 0);
      add(brainsText1, 1,0);

      add(shotsText1, 1, 2);

      add(player2, 2, 0);
      add(brainsText2, 3,0);

      add(shotsText2, 3, 2);


    private void processRoll(ActionEvent event1){
        if (currentPlayer%2 == 1){
            d1.rollZombie();
            d1.findDieFace();
            d1.rollZombie();
            d1.findDieFace();
            d1.rollZombie();
            d1.findDieFace();
          }
        else{
            d2.rollZombie();
            d2.findDieFace();
            d2.rollZombie();
            d2.findDieFace();
            d2.rollZombie();
            d2.findDieFace();
          }
    }
    private void processStop(ActionEvent event2){
        currentPlayer++;
        if (currentPlayer%2 == 1){
            d1.nextTurn();
            d1.rollZombie();
            d1.findDieFace();
            d1.rollZombie();
            d1.findDieFace();
            d1.rollZombie();
            d1.findDieFace();
          }
        else{
            d2.nextTurn();
            d2.rollZombie();
            d2.findDieFace();
            d2.rollZombie();
            d2.findDieFace();
            d2.rollZombie();
            d2.findDieFace();
          }
    }

}
}
