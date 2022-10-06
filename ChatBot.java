
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatBot  extends JFrame {
    private final JTextArea chatArea = new JTextArea();
    private final JTextField chatBox = new JTextField();
    public  ChatBot(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setTitle("ChatBot");
        frame.add(chatArea);
        frame.add(chatBox);
// For TextArea
        chatArea.setSize(500,400);
        chatArea.setLocation(2,2);
//For TextField
        chatBox.setSize(540,30);
        chatBox.setLocation(2,500);

        chatBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  Gtext = chatBox.getText().toLowerCase();
                chatArea.append("You -> " + Gtext + "\n");
                chatBox.setText("");
                if (Gtext.contains("hi")){
                    Bot("Hola");
                }
                else if (Gtext.contains("how are you ?")){
                    Bot("I'm Fine. What About You?");
                }
                else if (Gtext.contains("where are you from?")){
                    Bot("I'm Not From Your World,By The Way Where Are You From?");
                }
                else if (Gtext.contains("bye")){
                    Bot("Ok! Bye! Hoping To Meet You Soon ASAP");
                }
                else {
                    int rand = (int) (Math.random() *3 + 1);
                    if(rand == 1) {
                        Bot("I Didn't Get You");
                    }
                    else if (rand == 2){
                        Bot("I Didn't Get You Bro");
                    }
                    else if (rand == 1){
                        Bot("Please Come Again");
                    }
                }
            }
        });
    }
    private void Bot(String str){
        chatArea.append("Bot -> " + str + "\n");
    }
    public static void main(String[] args) {
    }
}
