package com.cliff777.irc;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by Cliff on 1/2/2016.
 */
public class MyController
{
    @FXML private TextField msg;
    void initialize(){}

    public void setTextField(String s)
    {
        msg.setText(s);
    }
}
