import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.shape.*;




public class ZombieDieGUI extends GridPane {
    ZombieDice d1 = new ZombieDice();
    ZombieDice d2 = new ZombieDice();
    private int currentPlayer = 1;
    private Text brainsText1;
    private Text brainsText2;
    private Text brainsTotalText1;
    private Text brainsTotalText2;
    private Text shotsText1;
    private Text shotsText2;
    private Text player1;
    private Text player2;
    private Label brain1;
    private Label brain2;
    private Label brainTotal1;
    private Label brainTotal2;
    private Label shots1;
    private Label shots2;
    private int type1;
    private int type2;
    private int type3;
    private int side1;
    private int side2;
    private int side3;



    public ZombieDieGUI() {
        Font font = new Font(11);

        Rectangle bigDie1 = new Rectangle(100,100,40,40);
        bigDie1.setFill(Color.WHITE);
        Rectangle bigDie2 = new Rectangle(150,100,40,40);
        Rectangle bigDie3 = new Rectangle(200,100,40,40);

        shotsText1 = new Text("Shots: ");
        shotsText2 = new Text("Shots: ");

        brainsText1 = new Text("Brains This Round:");
        brainsText2 = new Text("Brains This Round:");
        brainsTotalText1 = new Text("Total Brains:");
        brainsTotalText2 = new Text("Total Brains:");

        player1 = new Text("Player 1");
        player2 = new Text("Player 2");


        Button stop = new Button("Stop");
        stop.setOnAction(this::processStop);

        Button roll = new Button("Roll");
        roll.setOnAction(this::processRoll);

        brain1 = new Label(" ");
        brain1.setFont(font);
        GridPane.setHalignment(brain1, HPos.CENTER);

        brain2 = new Label(" ");
        brain2.setFont(font);
        GridPane.setHalignment(brain2, HPos.CENTER);

        brainTotal1 = new Label(" ");
        brainTotal1.setFont(font);
        GridPane.setHalignment(brainTotal1, HPos.CENTER);

        brainTotal2 = new Label(" ");
        brainTotal2.setFont(font);
        GridPane.setHalignment(brainTotal2, HPos.CENTER);

        shots1 = new Label();
        shots1.setFont(font);
        GridPane.setHalignment(shots1, HPos.CENTER);

        shots2 = new Label();
        shots2.setFont(font);
        GridPane.setHalignment(shots2, HPos.CENTER);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: white");

        add(player1, 0, 0);
        add(brainsText1, 1, 0);

        add(shotsText1, 1, 2);
        add(shots1, 1, 3);
        add(stop, 2, 1);
        add(roll, 2, 2);
        add(player2, 3, 0);
        add(brainsText2, 4, 0);

        add(shotsText2, 4, 2);
    }

    private void processRoll(ActionEvent event1){
        if (currentPlayer%2 == 1){
            int b= d1.getBrains();
            int s= d1.getShots();
            d1.rollZombie();
            d1.findDieFace();
            type1 = d1.getColor();
            side1 = d1.getSide();
            d1.rollZombie();
            d1.findDieFace();
            type2 = d1.getColor();
            side2 = d1.getSide();
            d1.rollZombie();
            d1.findDieFace();
            type3 = d1.getColor();
            side3 = d1.getSide();
            brain1.setText(b + "");
            shots1.setText(s + "");
          }
        else{
            int b= d2.getBrains();
            int s= d2.getShots();
            d2.rollZombie();
            d2.findDieFace();
            type1 = d2.getColor();
            side1 = d2.getSide();
            d2.rollZombie();
            d2.findDieFace();
            type2 = d2.getColor();
            side2 = d2.getSide();
            d2.rollZombie();
            d2.findDieFace();
            type3 = d2.getColor();
            side3 = d2.getSide();
            brain2.setText(b + "");
            shots2.setText(s + "");
          }
    }

    private void processStop(ActionEvent event2){
        currentPlayer++;
        if (currentPlayer%2 == 1){
            int b= d1.getBrains();
            int s= d1.getShots();
            int tb = d2.getTotalBrains();
            d2.endTurn();
            brainTotal2.setText(tb + "");
            d1.rollZombie();
            d1.findDieFace();
            type1 = d1.getColor();
            side1 = d1.getSide();
            d1.rollZombie();
            d1.findDieFace();
            type2 = d1.getColor();
            side2 = d1.getSide();
            d1.rollZombie();
            d1.findDieFace();
            type3 = d1.getColor();
            side3 = d1.getSide();
            brain1.setText(b + "");
            shots1.setText(s + "");
            if(type1==3 && side1==1)
                Rectangle bigDie1.setColor(Color.RED);
          }
        else{
            int b= d2.getBrains();
            int s= d2.getShots();
            int tb = d1.getTotalBrains();
            d1.endTurn();
            brainTotal1.setText(tb + "");
            d2.rollZombie();
            d2.findDieFace();
            type1 = d2.getColor();
            side1 = d2.getSide();
            d2.rollZombie();
            d2.findDieFace();
            type2 = d2.getColor();
            side2 = d2.getSide();
            d2.rollZombie();
            d2.findDieFace();
            type3 = d2.getColor();
            side3 = d2.getSide();
            brain2.setText(b + "");
            shots2.setText(s + "");
          }
    }
}
    public class Image extends Object (

        )