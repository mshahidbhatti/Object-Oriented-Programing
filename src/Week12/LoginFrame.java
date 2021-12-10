package Week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    //
    JLabel userLable, passwordLabel;

    //
    JTextField userTextField;
    JPasswordField passwordField;

    JButton logiButton, cancelButton;

    public LoginFrame() throws HeadlessException {
           // this.setSize(400,250);
        this.setBounds(100,50,400,250);
        setTitle("Movie Rental Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        initComponenet();
        addComponentToFrame();
        setComponentBounds();
        registerClickListeners();


            this.setVisible(true);

    }

    private void initComponenet(){
        userLable=new JLabel("User Name");
        passwordLabel=new JLabel("Password");

        userTextField=new JTextField();
        passwordField=new JPasswordField();

        logiButton=new JButton("Login");
        cancelButton=new JButton("Cancel");

    }

    private void addComponentToFrame(){
        add(userLable);
        add(userTextField);
        add(passwordLabel);
        add(passwordField);
        add(logiButton);
        add(cancelButton);

    }

    private void setComponentBounds(){
        userLable.setBounds(20,20,100,25);
        userTextField.setBounds(150,userLable.getY(),100,27);

        passwordLabel.setBounds(20,60,100,25);
        passwordField.setBounds(150,65,100,27);

        logiButton.setBounds(20,100,(int)logiButton.getPreferredSize().getWidth(),30);
        cancelButton.setBounds(100,100,100,30);

    }

    private void registerClickListeners(){

        logiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello to GUI");

                GlobalVariables.userName=userTextField.getText();
                new AddMovieFrame();
                //System.out.println(userTextField.getText());
                //System.out.println(passwordField.getText());
            }
        });


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

    }

}
