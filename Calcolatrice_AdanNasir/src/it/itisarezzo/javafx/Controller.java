package it.itisarezzo.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 * @author Adan Nasir
 */

public class Controller {

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private Button btnSum;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnDivide;

    @FXML
    private TextField risult;

    @FXML
    private Button btnExit;

    @FXML
    void sumBtnPressed(ActionEvent event) {
        int numero1 = 0;
        int numero2 = 0;
        ArrayList<String> errors = new ArrayList<String>();

        try {
            numero1 = Integer.parseInt(text1.getText());
        } catch (Exception e) {//Viene eseguito se c'è un errore nell'input (non si possono inserire le lettere)
            errors.add("1st text ERROR. Write again.");
            text1.setText("");
            text1.requestFocus();
        }

        try {
            numero2 = Integer.parseInt(text2.getText());
        } catch (Exception e) {//Viene eseguito se c'è un errore nell'input (non si possono inserire le lettere)
            errors.add("2nd text ERROR. Write again.");
            text2.setText("");
            text2.requestFocus();
        }

        if (errors.isEmpty()) {
            int somma = numero1 + numero2;//Fa la somma
            risult.setText(String.valueOf(somma));//Mette il risultato nella TextField del risultato
        } else {
            risult.setText("");
            for (int i = 0; i < errors.size(); i++) {
                risult.setText(risult.getText() + " " + errors.get(i));
            }
        }
    }

    @FXML
    void minusBtnPressed(ActionEvent event) {
        int numero1 = 0;
        int numero2 = 0;
        ArrayList<String> errors = new ArrayList<String>();

        try {
            numero1 = Integer.parseInt(text1.getText());
        } catch (Exception e) {//Viene eseguito se c'è un errore nell'input (non si possono inserire le lettere)
            errors.add("1st text ERROR. Write again.");
            text1.setText("");
            text1.requestFocus();
        }

        try {
            numero2 = Integer.parseInt(text2.getText());
        } catch (Exception e) {//Viene eseguito se c'è un errore nell'input (non si possono inserire le lettere)
            errors.add("2nd text ERROR. Write again.");
            text2.setText("");
            text2.requestFocus();
        }

        if (errors.isEmpty()) {
            int differenza = numero1 - numero2;//Fa la differenza
            risult.setText(String.valueOf(differenza));//Mette il risultato nella TextField del risultato
        } else {
            risult.setText("");
            for (int i = 0; i < errors.size(); i++) {
                risult.setText(risult.getText() + " " + errors.get(i));
            }
        }
    }

    @FXML
    void multiplyBtnPressed(ActionEvent event) {
        int numero1 = 0;
        int numero2 = 0;
        ArrayList<String> errors = new ArrayList<String>();

        try {
            numero1 = Integer.parseInt(text1.getText());
        } catch (Exception e) {//Viene eseguito se c'è un errore nell'input (non si possono inserire le lettere)
            errors.add("1st text ERROR. Write again.");
            text1.setText("");
            text1.requestFocus();
        }

        try {
            numero2 = Integer.parseInt(text2.getText());
        } catch (Exception e) {//Viene eseguito se c'è un errore nell'input (non si possono inserire le lettere)
            errors.add("2nd text ERROR. Write again.");
            text2.setText("");
            text2.requestFocus();
        }

        if (errors.isEmpty()) {
            int prodotto = numero1 * numero2;//Fa il prodotto
            risult.setText(String.valueOf(prodotto));//Mette il risultato nella TextField del risultato
        } else {
            risult.setText("");
            for (int i = 0; i < errors.size(); i++) {
                risult.setText(risult.getText() + " " + errors.get(i));
            }
        }
    }

    @FXML
    void divideBtnPressed(ActionEvent event) {
        float numero1 = 0;
        float numero2 = 0;
        ArrayList<String> errors = new ArrayList<String>();

        try {
            numero1 = Float.parseFloat(text1.getText());
        } catch (Exception e) {//Viene eseguito se c'è un errore nell'input (non si possono inserire le lettere)
            errors.add("1st text ERROR. Write again.");
            text1.setText("");
            text1.requestFocus();
        }

        try {
            numero2 = Integer.parseInt(text2.getText());
        } catch (Exception e) {//Viene eseguito se c'è un errore nell'input (non si possono inserire le lettere)
            errors.add("2nd text ERROR. Write again.");
            text2.setText("");
            text2.requestFocus();
        }

        if (errors.isEmpty()) {
            float quoziente = numero1 / numero2;//Fa il quoziente
            risult.setText(String.valueOf(quoziente));//Mette il risultato nella TextField del risultato
        } else {
            risult.setText("");
            for (int i = 0; i < errors.size(); i++) {
                risult.setText(risult.getText() + " " + errors.get(i));
            }
        }
    }
    
    @FXML
    void exitBtnPressed(ActionEvent event) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}