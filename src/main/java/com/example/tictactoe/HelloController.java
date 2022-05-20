package com.example.tictactoe;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.util.Arrays;


public class HelloController {
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Label l1;

    Font BigFont = new Font("BF", 40);
    Font HugeFont = new Font("HF", 50);

    final int[] game_mode = new int[1];
    final String[] b_c = new String[]{"0","0","0","0","0","0","0","0","0"};
    final int[] moves_count = new int[1];
    final boolean[] is_game_continue = new boolean[]{true,true};
    final int[] moves1 = new int[4];

    public void buttonClicked(MouseEvent mouseEvent) {
        if (game_mode[0] == 1){
            moves_count[0] ++;
            if (is_game_continue[0]){
                Button button = (Button) mouseEvent.getSource();
                if (b_c[Integer.parseInt(((String) button.getId()).substring(1,2))-1] == "0"){
                    if (moves_count[0] % 2 == 1){
                        button.setFont(BigFont);
                        b_c[Integer.parseInt(((String) button.getId()).substring(1,2))-1] = "x";
                        button.setText(b_c[Integer.parseInt(((String) button.getId()).substring(1,2))-1]);
                        l1.setText("First player made move");
                    }
                    else{
                        button.setFont(BigFont);
                        b_c[Integer.parseInt(((String) button.getId()).substring(1,2))-1] = "o";
                        button.setText(b_c[Integer.parseInt(((String) button.getId()).substring(1,2))-1]);
                        l1.setText("Second player made move");
                    }

                    if (b_c[0] == "x" & b_c[1] == "x" & b_c[2] == "x"){
                        b1.setFont(HugeFont);
                        b2.setFont(HugeFont);
                        b3.setFont(HugeFont);
                        l1.setText("First player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[3] == "x" & b_c[4] == "x" & b_c[5] == "x"){
                        b4.setFont(HugeFont);
                        b5.setFont(HugeFont);
                        b6.setFont(HugeFont);
                        l1.setText("First player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[6] == "x" & b_c[7] == "x" & b_c[8] == "x"){
                        b7.setFont(HugeFont);
                        b8.setFont(HugeFont);
                        b9.setFont(HugeFont);
                        l1.setText("First player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[0] == "x" & b_c[3] == "x" & b_c[6] == "x"){
                        b1.setFont(HugeFont);
                        b4.setFont(HugeFont);
                        b7.setFont(HugeFont);
                        l1.setText("First player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[1] == "x" & b_c[4] == "x" & b_c[7] == "x"){
                        b2.setFont(HugeFont);
                        b5.setFont(HugeFont);
                        b8.setFont(HugeFont);
                        l1.setText("First player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[2] == "x" & b_c[5] == "x" & b_c[8] == "x"){
                        b3.setFont(HugeFont);
                        b6.setFont(HugeFont);
                        b9.setFont(HugeFont);
                        l1.setText("First player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[0] == "x" & b_c[4] == "x" & b_c[8] == "x"){
                        b1.setFont(HugeFont);
                        b5.setFont(HugeFont);
                        b9.setFont(HugeFont);
                        l1.setText("First player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[2] == "x" & b_c[4] == "x" & b_c[6] == "x"){
                        b3.setFont(HugeFont);
                        b5.setFont(HugeFont);
                        b7.setFont(HugeFont);
                        l1.setText("First player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[0] == "o" & b_c[1] == "o" & b_c[2] == "o"){
                        b1.setFont(HugeFont);
                        b2.setFont(HugeFont);
                        b3.setFont(HugeFont);
                        l1.setText("Second player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[3] == "o" & b_c[4] == "o" & b_c[5] == "o"){
                        b4.setFont(HugeFont);
                        b5.setFont(HugeFont);
                        b6.setFont(HugeFont);
                        l1.setText("Second player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[6] == "o" & b_c[7] == "o" & b_c[8] == "o"){
                        b7.setFont(HugeFont);
                        b8.setFont(HugeFont);
                        b9.setFont(HugeFont);
                        l1.setText("Second player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[0] == "o" & b_c[3] == "o" & b_c[6] == "o"){
                        b1.setFont(HugeFont);
                        b4.setFont(HugeFont);
                        b7.setFont(HugeFont);
                        l1.setText("Second player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[1] == "o" & b_c[4] == "o" & b_c[7] == "o"){
                        b2.setFont(HugeFont);
                        b5.setFont(HugeFont);
                        b8.setFont(HugeFont);
                        l1.setText("Second player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[2] == "o" & b_c[5] == "o" & b_c[8] == "o"){
                        b3.setFont(HugeFont);
                        b6.setFont(HugeFont);
                        b9.setFont(HugeFont);
                        l1.setText("Second player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[0] == "o" & b_c[4] == "o" & b_c[8] == "o"){
                        b1.setFont(HugeFont);
                        b5.setFont(HugeFont);
                        b9.setFont(HugeFont);
                        l1.setText("Second player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }
                    else if (b_c[2] == "o" & b_c[4] == "o" & b_c[6] == "o"){
                        b3.setFont(HugeFont);
                        b5.setFont(HugeFont);
                        b7.setFont(HugeFont);
                        l1.setText("Second player wins!");
                        is_game_continue[0] = false;
                        is_game_continue[1] = false;
                    }

                    if (moves_count[0] == 9){
                        is_game_continue[0] = false;
                        if (is_game_continue[1]){
                            l1.setText("It is a draw!");
                        }
                    }
                }
                else{
                    moves_count[0] --;
                    l1.setText("This cell is occupied, choose another");
                }
            }
            else{
                l1.setText("Game is end, clear the playing field");
            }
        }
        else if(game_mode[0] == 2){
            if (is_game_continue[0]){
                Button button = (Button) mouseEvent.getSource();
                if (b_c[Integer.parseInt(((String) button.getId()).substring(1,2))-1] == "0"){

                    button.setFont(BigFont);
                    b_c[Integer.parseInt(((String) button.getId()).substring(1,2))-1] = "o";
                    button.setText(b_c[Integer.parseInt(((String) button.getId()).substring(1,2))-1]);
                    l1.setText("Player made move");
                    for (int i  = 0; i < moves1.length; i++){
                        if (moves1[i] == -1){
                            moves1[i] = Integer.parseInt(((String) button.getId()).substring(1,2))-1;
                            break;
                        }
                    }
                    //1 move
                    if (moves1[1] == -1){
                        if (moves1[0] == 0){
                            b9.setFont(BigFont);
                            b9.setText("x");
                            b_c[8] = "x";
                        }
                        else if (moves1[0] == 2){
                            b7.setFont(BigFont);
                            b7.setText("x");
                            b_c[6] = "x";
                        }
                        else if (moves1[0] == 6){
                            b3.setFont(BigFont);
                            b3.setText("x");
                            b_c[2] = "x";
                        }
                        else if (moves1[0] == 8){
                            b1.setFont(BigFont);
                            b1.setText("x");
                            b_c[0] = "x";
                        }
                        else{
                            b9.setFont(BigFont);
                            b9.setText("x");
                            b_c[8] = "x";
                        }
                    }
                    //2 move
                    else if (moves1[2] == -1){
                        if (moves1[0] == 0){
                            if (moves1[1] == 3 | moves1[1] == 5){
                                b7.setFont(BigFont);
                                b7.setText("x");
                                b_c[6] = "x";
                            }
                            else if (moves1[1] == 1 | moves1[1] == 7){
                                b3.setFont(BigFont);
                                b3.setText("x");
                                b_c[2] = "x";
                            }
                            else if (moves1[1] == 6){
                                b4.setFont(BigFont);
                                b4.setText("x");
                                b_c[3] = "x";
                            }
                            else{
                                b2.setFont(BigFont);
                                b2.setText("x");
                                b_c[1] = "x";
                            }
                        }
                        else if (moves1[0] == 2){
                            if (moves1[1] == 1 | moves1[1] == 7){
                                b1.setFont(BigFont);
                                b1.setText("x");
                                b_c[0] = "x";
                            }
                            else if (moves1[1] == 3 | moves1[1] == 5){
                                b9.setFont(BigFont);
                                b9.setText("x");
                                b_c[8] = "x";
                            }
                            else if (moves1[1] == 0){
                                b2.setFont(BigFont);
                                b2.setText("x");
                                b_c[1] = "x";
                            }
                            else{
                                b6.setFont(BigFont);
                                b6.setText("x");
                                b_c[5] = "x";
                            }
                        }
                        else if (moves1[0] == 6){
                            if (moves1[1] == 1 | moves1[1] == 7){
                                b9.setFont(BigFont);
                                b9.setText("x");
                                b_c[8] = "x";
                            }
                            else if (moves1[1] == 3 | moves1[1] == 5){
                                b1.setFont(BigFont);
                                b1.setText("x");
                                b_c[0] = "x";
                            }
                            else if (moves1[1] == 0){
                                b4.setFont(BigFont);
                                b4.setText("x");
                                b_c[3] = "x";
                            }
                            else{
                                b8.setFont(BigFont);
                                b8.setText("x");
                                b_c[7] = "x";
                            }
                        }
                        else if (moves1[0] == 8){
                            if (moves1[1] == 3 | moves1[1] == 5){
                                b3.setFont(BigFont);
                                b3.setText("x");
                                b_c[2] = "x";
                            }
                            else if (moves1[1] == 1 | moves1[1] == 7){
                                b7.setFont(BigFont);
                                b7.setText("x");
                                b_c[6] = "x";
                            }
                            else if (moves1[1] == 6){
                                b8.setFont(BigFont);
                                b8.setText("x");
                                b_c[7] = "x";
                            }
                            else{
                                b6.setFont(BigFont);
                                b6.setText("x");
                                b_c[5] = "x";
                            }
                        }
                        else {
                            if (moves1[1] != 0){
                                b1.setFont(BigFont);
                                b1.setText("x");
                                l1.setText("Bot wins!");
                                b_c[0] = "x";
                                is_game_continue[0] = false;
                            }
                            else{
                                if (moves1[0] == 1 | moves1[0] == 7){
                                    b3.setFont(BigFont);
                                    b3.setText("x");
                                    b_c[2] = "x";
                                }
                                else {
                                    b7.setFont(BigFont);
                                    b7.setText("x");
                                    b_c[6] = "x";
                                }
                            }
                        }
                    }
                    //3 move
                    else if (moves1[3] == -1) {
                        if (moves1[0] == 3 | moves1[0] == 5) {
                            if (moves1[2] == 7) {
                                b3.setFont(BigFont);
                                b3.setText("x");
                                l1.setText("Bot wins!");
                                b_c[2] = "x";
                                is_game_continue[0] = false;
                            }
                            else {
                                b8.setFont(BigFont);
                                b8.setText("x");
                                l1.setText("Bot wins!");
                                b_c[7] = "x";
                                is_game_continue[0] = false;
                            }
                        }
                        else if (moves1[0] == 1 | moves1[0] == 7) {
                            if (moves1[2] == 6) {
                                b6.setFont(BigFont);
                                b6.setText("x");
                                l1.setText("Bot wins!");
                                b_c[5] = "x";
                                is_game_continue[0] = false;
                            } else {
                                b7.setFont(BigFont);
                                b7.setText("x");
                                l1.setText("Bot wins!");
                                b_c[6] = "x";
                                is_game_continue[0] = false;
                            }
                        }

                        else if (moves1[0] == 0) {
                            if (moves1[1] == 3 | moves1[1] == 5) {
                                if (moves1[2] == 7) {
                                    b3.setFont(BigFont);
                                    b3.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[2] = "x";
                                    is_game_continue[0] = false;
                                } else {
                                    b8.setFont(BigFont);
                                    b8.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[7] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else if (moves1[1] == 1 | moves1[1] == 7) {
                                if (moves1[2] == 6) {
                                    b6.setFont(BigFont);
                                    b6.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[5] = "x";
                                    is_game_continue[0] = false;
                                } else {
                                    b7.setFont(BigFont);
                                    b7.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[6] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else if (moves1[1] == 6){
                                if (moves1[2] == 5){
                                    b2.setFont(BigFont);
                                    b2.setText("x");
                                    b_c[1] = "x";
                                }
                                else {
                                    b6.setFont(BigFont);
                                    b6.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[5] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else{
                                if (moves1[2] == 7){
                                    b4.setFont(BigFont);
                                    b4.setText("x");
                                    b_c[3] = "x";
                                }
                                else {
                                    b8.setFont(BigFont);
                                    b8.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[7] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                        }
                        else if (moves1[0] == 8) {
                            if (moves1[1] == 3 | moves1[1] == 5) {
                                if (moves1[2] == 1) {
                                    b7.setFont(BigFont);
                                    b7.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[6] = "x";
                                    is_game_continue[0] = false;
                                }
                                else {
                                    b2.setFont(BigFont);
                                    b2.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[1] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else if (moves1[1] == 1 | moves1[1] == 7) {
                                if (moves1[2] == 3) {
                                    b3.setFont(BigFont);
                                    b3.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[2] = "x";
                                    is_game_continue[0] = false;
                                }
                                else {
                                    b4.setFont(BigFont);
                                    b4.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[3] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else if (moves1[1] == 6){
                                if (moves1[2] == 1){
                                    b6.setFont(BigFont);
                                    b6.setText("x");
                                    b_c[5] = "x";
                                }
                                else {
                                    b2.setFont(BigFont);
                                    b2.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[1] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else{
                                if (moves1[2] == 3){
                                    b8.setFont(BigFont);
                                    b8.setText("x");
                                    b_c[7] = "x";
                                }
                                else {
                                    b4.setFont(BigFont);
                                    b4.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[3] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                        }
                        else if (moves1[0] == 2) {
                            if (moves1[1] == 3 | moves1[1] == 5) {
                                if (moves1[2] == 7) {
                                    b1.setFont(BigFont);
                                    b1.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[0] = "x";
                                    is_game_continue[0] = false;
                                }
                                else {
                                    b8.setFont(BigFont);
                                    b8.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[7] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else if (moves1[1] == 1 | moves1[1] == 7) {
                                if (moves1[2] == 8) {
                                    b4.setFont(BigFont);
                                    b4.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[3] = "x";
                                    is_game_continue[0] = false;
                                }
                                else {
                                    b9.setFont(BigFont);
                                    b9.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[8] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else if (moves1[1] == 0){
                                if (moves1[2] == 7){
                                    b6.setFont(BigFont);
                                    b6.setText("x");
                                    b_c[5] = "x";
                                }
                                else {
                                    b8.setFont(BigFont);
                                    b8.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[7] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else{
                                if (moves1[2] == 3){
                                    b2.setFont(BigFont);
                                    b2.setText("x");
                                    b_c[1] = "x";
                                }
                                else {
                                    b4.setFont(BigFont);
                                    b4.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[3] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                        }
                        else{
                            if (moves1[1] == 3 | moves1[1] == 5) {
                                if (moves1[2] == 8) {
                                    b2.setFont(BigFont);
                                    b2.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[1] = "x";
                                    is_game_continue[0] = false;
                                }
                                else {
                                    b9.setFont(BigFont);
                                    b9.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[8] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else if (moves1[1] == 1 | moves1[1] == 7) {
                                if (moves1[2] == 5) {
                                    b1.setFont(BigFont);
                                    b1.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[0] = "x";
                                    is_game_continue[0] = false;
                                }
                                else {
                                    b6.setFont(BigFont);
                                    b6.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[5] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else if (moves1[1] == 0){
                                if (moves1[2] == 5){
                                    b8.setFont(BigFont);
                                    b8.setText("x");
                                    b_c[7] = "x";
                                }
                                else {
                                    b6.setFont(BigFont);
                                    b6.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[5] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else{
                                if (moves1[2] == 1){
                                    b4.setFont(BigFont);
                                    b4.setText("x");
                                    b_c[3] = "x";
                                }
                                else {
                                    b2.setFont(BigFont);
                                    b2.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[1] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                        }
                    }
                    else{
                        if (moves1[0] == 0){
                            if (moves1[1] == 2){
                                if (moves1[3] == 5){
                                    b7.setFont(BigFont);
                                    b7.setText("x");
                                    l1.setText("It is a draw!");
                                    b_c[1] = "x";
                                    is_game_continue[0] = false;
                                }
                                else{
                                    b6.setFont(BigFont);
                                    b6.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[5] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else{
                                if (moves1[3] == 7){
                                    b3.setFont(BigFont);
                                    b3.setText("x");
                                    l1.setText("It is a draw!");
                                    b_c[2] = "x";
                                    is_game_continue[0] = false;
                                }
                                else{
                                    b8.setFont(BigFont);
                                    b8.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[7] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                        }

                        else if (moves1[0] == 8){
                            if (moves1[1] == 6){
                                if (moves1[3] == 3){
                                    b3.setFont(BigFont);
                                    b3.setText("x");
                                    l1.setText("It is a draw!");
                                    b_c[2] = "x";
                                    is_game_continue[0] = false;
                                }
                                else{
                                    b4.setFont(BigFont);
                                    b4.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[3] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else{
                                if (moves1[3] == 1){
                                    b7.setFont(BigFont);
                                    b7.setText("x");
                                    l1.setText("It is a draw!");
                                    b_c[6] = "x";
                                    is_game_continue[0] = false;
                                }
                                else{
                                    b2.setFont(BigFont);
                                    b2.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[1] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                        }

                        else if (moves1[0] == 2){
                            if (moves1[1] == 0){
                                if (moves1[3] == 3){
                                    b9.setFont(BigFont);
                                    b9.setText("x");
                                    l1.setText("It is a draw!");
                                    b_c[8] = "x";
                                    is_game_continue[0] = false;
                                }
                                else{
                                    b4.setFont(BigFont);
                                    b4.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[3] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else{
                                if (moves1[3] == 7){
                                    b1.setFont(BigFont);
                                    b1.setText("x");
                                    l1.setText("It is a draw!");
                                    b_c[0] = "x";
                                    is_game_continue[0] = false;
                                }
                                else{
                                    b8.setFont(BigFont);
                                    b8.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[7] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                        }

                        else if (moves1[0] == 6){
                            if (moves1[1] == 0){
                                if (moves1[3] == 1){
                                    b9.setFont(BigFont);
                                    b9.setText("x");
                                    l1.setText("It is a draw!");
                                    b_c[8] = "x";
                                    is_game_continue[0] = false;
                                }
                                else{
                                    b2.setFont(BigFont);
                                    b2.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[1] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                            else{
                                if (moves1[3] == 5){
                                    b1.setFont(BigFont);
                                    b1.setText("x");
                                    l1.setText("It is a draw!");
                                    b_c[0] = "x";
                                    is_game_continue[0] = false;
                                }
                                else{
                                    b6.setFont(BigFont);
                                    b6.setText("x");
                                    l1.setText("Bot wins!");
                                    b_c[5] = "x";
                                    is_game_continue[0] = false;
                                }
                            }
                        }
                    }
                }
                else {
                    l1.setText("This cell is occupied, choose another");
                }
            }
            else {
                l1.setText("Game is end, clear the playing field");
            }
        }
        else{
            l1.setText("Choose game mode");
        }
    }

    public void bClear(MouseEvent mouseEvent) {
        for (int i = 0; i < 9; i++){
            b_c[i] = "0";
            game_mode[0] = 0;
            moves_count[0] = 0;
            is_game_continue[0] = true;
            is_game_continue[1] = true;
        }
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        l1.setText("The field is clear");
    }

    public void b1vs1(MouseEvent mouseEvent) {
        boolean is_clear = true;
        for (int i = 0; i < 9; i++){
            if (b_c[i] != "0"){
                is_clear = false;
                break;
            }
        }
        if (is_clear){
            game_mode[0] = 1;
            l1.setText("Game 1 vs 1. I - x, II - o");
        }
        else{
            l1.setText("Clear the playing field");
        }
    }

    public void bbot(MouseEvent mouseEvent) {
        boolean is_clear = true;
        for (int i = 0; i < 9; i++){
            if (b_c[i] != "0"){
                is_clear = false;
                break;
            }
        }
        if (is_clear){
            game_mode[0] = 2;
            l1.setText("Game vs bot. Bot - x, You  - o");
            b5.setFont(BigFont);
            b5.setText("x");
            b_c[4] = "x";
            l1.setText("Bot made move");
            for (int i  = 0; i < moves1.length; i++){
                moves1[i] = -1;
            }

        }
        else{
            l1.setText("Clear the playing field");
        }
    }
}