
//  As I Will Keep On Learning New APIs & GUI Of Java I Will Keep On Updating This Code
//New Things Are On The Way

package com.JAVA_DSA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.Desktop;

public class ChatBot  extends JFrame {                      // ALso Keep The Class Name As ChatBot Or If You Want To Keep Create Your Bot Then Change The Class Name.
    private final JTextArea chatArea = new JTextArea();
    private final JTextField chatBox = new JTextField();

    public ChatBot() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("Ark's Bot");
        frame.add(chatArea);
        frame.add(chatBox);
// For TextArea
        chatArea.setSize(580, 500);
        chatArea.setLocation(2, 2);
        chatArea.setBackground(Color.cyan);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\ankur\\Downloads\\JAvaBck.jpg"));
        add(background);
        background.setLayout(new FlowLayout());

//For TextField
        chatBox.setSize(580, 30);
        chatBox.setLocation(2, 500);

        chatBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Gtext = chatBox.getText().toLowerCase();
                chatArea.append("You :- " + Gtext + "\n");
                chatBox.setText("");
                if (Gtext.contains("hi") || (Gtext.contains("merabha")) || (Gtext.contains("namaste"))) {
                    Bot("Hola");
                }
                if (Gtext.contains("what is your name") || (Gtext.contains("your name"))) {
                    Bot("My Name Is Ark's Bot");
                }
                if (Gtext.contains("how are you")) {
                    Bot("I'm Fine! What About you?");
                }
                if (Gtext.contains("i am fine too")) {
                    Bot("Great, From Where You Are?");
                }
                if (Gtext.contains("i am from patna")) {     //(Gtext.contains("i'm from patna")) As I'm From Patna I have Mentioned My City you Can Mention Yours
                    Bot("Great!!!Such A Beautiful Place");
                    Bot("Anything Else Would You Like To Ask?");
                }
                if (Gtext.contains("tell me about yourself") || (Gtext.contains("about yourself")) || Gtext.contains("yourself")) {
                    Bot("Hi I Am Ark's Bot\n" +
                            "I'm Created By Utkrist Ark\n" +
                            "I Have Been Developed Using Java\n" +
                            "My UI Is Created Using JavaX Swing & I'm Able To Interact With you Using Java AWT .\n" +
                            "(I.E. Abstract Window ToolKit)");
                }
                if (Gtext.contains("tell me about java")|| (Gtext.contains("java"))) {
                    Bot("Java is a popular programming language." +
                            "\n" +
                            "Java is used to develop mobile apps, web apps, desktop apps, games and much more.");

                    System.out.println("\n");
                    Bot("Would You Like To Learn More About Java?");
                }
                if (Gtext.contains("yes")) {
                    Bot("Now Would you Like To Learn About Object Oriented Programming(OOPs) Or Data Structure & Algorithms(DSA)");
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.oracle.com/in/java/technologies/"));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } catch (URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }

                if (Gtext.contains("oops")) {
                    Bot("OOP stands for Object-Oriented Programming.\n" +
                            " Procedural programming is about writing procedures or \n" +
                            "methods that perform operations on the data,\n" +
                            " while object-oriented programming is about creating objects that contain both data and methods.");
                    Bot("AnyThing Would You Still Like To Ask?");
                }
                if (Gtext.contains("yes tell me more about oops") || (Gtext.contains("more about oops"))) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.javatpoint.com/java-oops-concepts"));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } catch (URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
                if (Gtext.contains("dsa")) {
                    Bot(" Data Structure is a way to organized data in such a way that it can be used efficiently.\n" +
                            "Following terms are basic terms of a data structure.");
                    Bot("AnyThing Would You Still Like To Ask?");
                }
                if (Gtext.contains("yes tell me more about dsa") || Gtext.contains("more about dsa")) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.programiz.com/dsa#:~:text=A%20data%20structure%20is%20a,efficient%20and%20optimized%20computer%20programs."));
                    } catch (IOException | URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
                if (Gtext.contains("open ronaldo videos") || (Gtext.contains("ronaldo videos")) || (Gtext.contains("ronaldo"))){
                    try{
                        Desktop.getDesktop().browse(new URI("https://www.youtube.com/results?search_query=ronaldo+skills"));
                    }
                    catch (URISyntaxException | IOException ex){
                        ex.printStackTrace();
                    }
                }
                if (Gtext.contains("open messi videos") || (Gtext.contains("messi videos")) || (Gtext.contains("messi"))){
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.youtube.com/results?search_query=messi+skills"));
                    }
                    catch (URISyntaxException | IOException ex){
                        ex.printStackTrace();
                    }
                }
                if (Gtext.contains("open amazon.com") || (Gtext.contains("amazon"))){
                    try{
                        Desktop.getDesktop().browse(new URI("https://www.amazon.in/"));
                    }
                    catch (URISyntaxException | IOException ex){
                        ex.printStackTrace();
                    }
                }
                if (Gtext.contains("open flipkart.com") || (Gtext.contains("flipkart"))){
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.flipkart.com/"));
                    }
                    catch (URISyntaxException | IOException ex){
                        ex.printStackTrace();
                    }
                }
                if (Gtext.contains("open files") || (Gtext.contains("files"))){
                    try{
                        String path  = "\"C:\\Users\\ankur\\Downloads\\Quick Sort (1).pdf\"";
                        File NewFile = new File(path);
                        if (NewFile.exists()){
                            Process start = Runtime.getRuntime().exec(" \"rundll32 url.dll,FileProtocolHandler" + path);
                            start.waitFor();
                        }
                        else {
                            System.out.println("File Doesn't Exist");
                        }
                    }
                    catch (Exception error){
                        System.out.println(error);
                    }

                }
                if (Gtext.contains("your favourite movie") || (Gtext.contains("which is your favourite movie")) || Gtext.contains("movie")){
                    Bot("Sorry To Say But My Favourite Movie Is Currently None Cause' I'm Not Interested In  Movies\n" +
                            "By The Way Tell Me About Your's Favourite");
                }
                if (Gtext.contains("my favourite movie is avatar")){
                    Bot("WOW!!! That's Pretty Cool");
                }
                    if (Gtext.contains("who is your favourite football player")) {
                        Bot("My Favourite Football Players Are Iker Casillas & Cristiano Ronaldo");
                    }
                if(Gtext.contains("tell me time") || (Gtext.contains("what is time now")) || Gtext.contains("time")){
                    LocalTime time = LocalTime.now();
                    String str = String.valueOf(time);
                    Bot("Right Now Time Is : " + str);
                }
                if (Gtext.contains("tell me date today") || (Gtext.contains("what is date today")) || (Gtext.contains("date"))){
                    LocalDate  date = LocalDate.now();
                    String st1 = String.valueOf(date);
                    Bot("Right Now Date Is : " + st1);
                }
                if (Gtext.contains("open notepad") || (Gtext.contains("notepad"))) {
                    Runtime run = Runtime.getRuntime();
                    try {
                        run.exec("notepad.exe");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                if (Gtext.contains("no")) {
                    Bot("Ok! Bye! See You Later.");
                }
                if (Gtext.contains("bye")) {
                    System.exit(0);
                }
            }
        });
    }
    private void Bot(String str) {
        chatArea.append("Bot :- " + str + "\n");
    }

    public static void main(String[] args) {
        new ChatBot();
    }
}
