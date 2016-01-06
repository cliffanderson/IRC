package com.cliff777.irc.obj;

import com.cliff777.irc.MyController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cliff on 12/21/2015.
 */
public class ChatWindow extends Application
{
    @FXML
    private TextField msg;


    final static int WIDTH = 800;
    final static int HEIGHT = 600;

    //list of messages to add to the irc history
    //usually added very quickly, list is to prevent
    //possibility of a miss
    private static List<String> messagesToAdd = new ArrayList<String>();

    public ChatWindow(){}

    public static void construct() throws Exception
    {
        //cannot call launch without first finishing the constructor in this class
        launch();

    }


    //build the window
    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        Pane p = loader.load(new File("layout.fxml").toURI().toURL());
        final MyController controller = (MyController) loader.getController();




        Scene scene = new Scene(p, 600, 600);

        stage.setTitle("IRC Client");
        stage.setScene(scene);
        stage.show();

        new Thread()
        {
            public void run()
            {
                try
                {
                    Thread.sleep(5000);
                }
                catch (Exception e){}

                controller.setTextField("hi");

            }
        }.start();
        /*
        chatHistory = new TextArea();
        messageBox = new TextField();
        button = new Button("I'm a button");

        chatHistory.setEditable(false);

        BorderPane pane = new BorderPane();

        pane.setTop(button);
        pane.getTop().
        pane.setCenter(chatHistory);
        pane.setBottom(messageBox);

        Scene scene = new Scene(pane, 800, 600);

        stage.setTitle("IRC Client");
        stage.setScene(scene);
        stage.show();

        messageBox.requestFocus();
        messageBox.setOnAction(new KeyEventHandler());

        //configure shutdown
        stage.setOnCloseRequest(new EventHandler<WindowEvent>()
        {
            public void handle(WindowEvent arg0) {
                //shutdown connection
                System.exit(0);
            }
        });*/
    }

    public static String getMessageBoxContent()
    {/*
        try
        {
            return messageBox.getText();
        }
        catch(Exception e)
        {
            return "";
        }*/
        return null;
    }

    public static void clearMessageBox()
    {
       // messageBox.clear();
    }

    public static void addMessageToWindow(String msg)
    {/*
        //add to temporary list
        messagesToAdd.add(msg);

        Platform.runLater(new Runnable()
        {
            public void run()
            {
                chatHistory.appendText(messagesToAdd.get(0) + '\n');
                messagesToAdd.remove(0);

                //keep scroll at the bottom
                chatHistory.setScrollTop(Double.MAX_VALUE);
            }
        });*/
    }
}