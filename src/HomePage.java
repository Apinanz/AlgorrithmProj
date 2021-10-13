
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;

public class HomePage {

    public static void main(String[] args) {

        JPanel p1 = new JPanel();
        Label text_header = new Label();
        JPanel p2 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel6 = new JPanel();
        Label text_solveBy_label = new Label();
        JCheckBox btk_checkbox = new JCheckBox();
        JCheckBox bab_checkbox = new JCheckBox();
        JPanel jPanel4 = new JPanel();
        Label text_length_label = new Label();
        JSpinner length_spinner = new JSpinner(new SpinnerNumberModel(0, 0, 8, 1));
        JPanel jPanel3 = new JPanel();
        Label text_target_label = new Label();
        JTextField target_textField = new JTextField();
        JPanel jPanel5 = new JPanel();
        Label text_input_label = new Label();
        JTextField input_textField = new JTextField();
        JButton random_button = new JButton();
        JPanel p3 = new JPanel();
        JButton process_button = new JButton();

        JFrame frame = new JFrame();
        frame.setTitle("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        p1.setBackground(new Color(204, 255, 204));
        p1.setToolTipText("");

        text_header.setFont(new Font("Angsana New", 0, 36)); // NOI18N
        text_header.setText("Subset sum Calculator");
        p1.add(text_header);

        frame.getContentPane().add(p1);
        p1.getAccessibleContext().setAccessibleName("");

        p2.setBackground(new Color(204, 255, 204));
        p2.setToolTipText("");

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));

        text_solveBy_label.setAlignment(Label.CENTER);
        text_solveBy_label.setFont(new Font("Angsana New", 0, 24)); // NOI18N
        text_solveBy_label.setText("Solve By");

        btk_checkbox.setFont(new Font("Angsana New", 0, 24)); // NOI18N
        btk_checkbox.setText("Backtracking");

        bab_checkbox.setFont(new Font("Angsana New", 0, 24)); // NOI18N
        bab_checkbox.setText("Branch and Bound");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(text_solveBy_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btk_checkbox)
                                .addGap(43, 43, 43)
                                .addComponent(bab_checkbox)
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 24, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(text_solveBy_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(bab_checkbox)
                                                .addComponent(btk_checkbox)))
                                .addGap(29, 29, 29))
        );

        jPanel2.add(jPanel6);

        text_length_label.setFont(new Font("Angsana New", 0, 24)); // NOI18N
        text_length_label.setText("Length");

        length_spinner.setFont(new Font("Tahoma", 0, 14)); // NOI18N

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(text_length_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(length_spinner, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(length_spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(text_length_label, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);

        text_target_label.setFont(new Font("Angsana New", 0, 24)); // NOI18N
        text_target_label.setText("Target");

        target_textField.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        target_textField.setHorizontalAlignment(JTextField.CENTER);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(text_target_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(target_textField, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(text_target_label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(target_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        text_input_label.setFont(new Font("Angsana New", 0, 24)); // NOI18N
        text_input_label.setText("INPUT");

        input_textField.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        input_textField.setHorizontalAlignment(JTextField.CENTER);

        random_button.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        random_button.setText("RANDOM");
        random_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int length_rand = rand.nextInt(7 + 2);
                length_spinner.setValue(length_rand);
                int[] result = new int[(Integer) (length_spinner.getValue())];

                int sum = 0;
                int _input = rand.nextInt(50 + 1);
                int[] number_inputRand = new int[length_rand];
                number_inputRand[0] = _input;
                String str_rand = "" + _input;
                for (int i = 1; i < length_rand; i++) {
                    int input = rand.nextInt(50 + 1);
                    str_rand = str_rand + "," + input;
                    number_inputRand[i] = input;
                    sum += number_inputRand[i];
                }
                input_textField.setText(str_rand);
                Arrays.sort(number_inputRand);

                int min = (length_rand > 1) ? number_inputRand[0] + number_inputRand[1] : number_inputRand[0];
                int target_rand = (int) (Math.random() * (sum - min + 1)) + min; //Random number between min - max
                target_textField.setText("" + target_rand);
            }
        });

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(text_input_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(input_textField, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(random_button)
                                                .addGap(136, 136, 136))))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(text_input_label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(0, 14, Short.MAX_VALUE)
                                                .addComponent(input_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(random_button)
                                                .addGap(36, 36, 36))))
        );

        jPanel2.add(jPanel5);

        GroupLayout p2Layout = new GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
                p2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        p2Layout.setVerticalGroup(
                p2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
        );

        frame.getContentPane().add(p2);

        p3.setBackground(new Color(204, 255, 204));
        p3.setToolTipText("");
        p3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        process_button.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        process_button.setText("Processing");
        process_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = (Integer)(length_spinner.getValue());
                int[] result = new int[length];
                int target = Integer.parseInt(target_textField.getText());
                String str_input = input_textField.getText();
                str_input = str_input.replaceAll("\\D+", ",");
                String str_output = "";

                for (int i = 0; i < result.length; i++) {
                    if (str_input.indexOf(",") == -1) {
                        result[i] = Integer.parseInt(str_input.substring(0));
                        str_output += str_input.substring(0);
                    } else {
                        str_output += str_input.substring(0, str_input.indexOf(",")) + ",";
                        result[i] = Integer.parseInt(str_input.substring(0, str_input.indexOf(",")));
                        str_input = str_input.substring(str_input.indexOf(",") + 1);
                    }
                }

                if (btk_checkbox.isSelected() && bab_checkbox.isSelected()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Select only one solution!", "Alert", JOptionPane.WARNING_MESSAGE);
                } else if (!btk_checkbox.isSelected() && !bab_checkbox.isSelected()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Select solution!", "Alert", JOptionPane.WARNING_MESSAGE);
                } else if (btk_checkbox.isSelected()) { // Backtracking

                    int confirm = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure?\nLength : " + length_spinner.getValue() + "\nTarget : " + target + "\nINPUT : " + str_output,
                             "Confirm...", JOptionPane.OK_CANCEL_OPTION);
                    if (confirm == 0) {
                        Backtracking b = new Backtracking(result, target);
                        b.run();
                    }
                } else if (bab_checkbox.isSelected()) { //Branch and Bound
                    // เพิ่มส่วนของโค้ด Algorithm Branch and Bound
                }
            }
        });

        p3.add(process_button);
        frame.getContentPane().add(p3);

        frame.pack();
        frame.setVisible(true);
    }
}
