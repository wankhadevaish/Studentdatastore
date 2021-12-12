import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtStname;
    private JButton calButton;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1,n2,n3,tot;
                double avg;


                n1= Integer.parseInt(txtMarks1.getText());
                n2= Integer.parseInt(txtMarks2.getText());
                n3= Integer.parseInt(txtMarks3.getText());

                tot =n1+n2+n3;

                txtTotal.setText(String.valueOf(tot));

                avg =tot/3;

                txtAvg.setText(String.valueOf(avg));

                if(avg>50)
                {
                    txtGrade.setText("PASS");

                }
                else
                {
                    txtGrade.setText("FAIL");
                }
            }
        });
    }
}
