
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

public class GUI {

    public static void main(String[] args) {
        new mainFrame().setVisible(true);
        //ไอเปรต2
    }
}

class mainFrame extends JFrame {

    public mainFrame() {
        initComponents();
    }

    private void initComponents() {
        JPanel p1 = new JPanel();
        Label text_header = new Label();
        JPanel p2 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel6 = new JPanel();
        Label text_solveBy_label = new Label();
        JCheckBox btk_checkbox = new JCheckBox();
        JCheckBox bab_checkbox = new JCheckBox();
        JPanel jPanel3 = new JPanel();
        Label text_target_label = new Label();
        JTextField target_textField = new JTextField();
        JPanel jPanel5 = new JPanel();
        Label text_input_label = new Label();
        JTextField input_textField = new JTextField();
        JButton random_button = new JButton();
        JPanel p3 = new JPanel();
        JButton process_button = new JButton();

        setTitle("GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        p1.setBackground(new Color(245, 211, 0));
        p1.setToolTipText("");

        text_header.setFont(new Font("TH-Sarabun-PSK", 0, 36)); // NOI18N
        text_header.setText("Subset sum Calculator");
        p1.add(text_header);

        getContentPane().add(p1);
        p1.getAccessibleContext().setAccessibleName("");

        p2.setBackground(new Color(245, 211, 0));
        p2.setToolTipText("");

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));

        text_solveBy_label.setAlignment(Label.CENTER);
        text_solveBy_label.setFont(new Font("TH-Sarabun-PSK", 0, 24)); // NOI18N
        text_solveBy_label.setText("Solve By");

        btk_checkbox.setFont(new Font("TH-Sarabun-PSK", 0, 24)); // NOI18N
        btk_checkbox.setText("Backtracking");

        bab_checkbox.setFont(new Font("TH-Sarabun-PSK", 0, 24)); // NOI18N
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
                                .addGap(0, 52, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(text_solveBy_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(bab_checkbox)
                                                .addComponent(btk_checkbox)))
                                .addGap(29, 29, 29))
        );

        jPanel2.add(jPanel6);

        text_target_label.setFont(new Font("TH-Sarabun-PSK", 0, 24)); // NOI18N
        text_target_label.setText("Target");

        target_textField.setFont(new Font("TH-Sarabun-PSK", 0, 14)); // NOI18N
        target_textField.setHorizontalAlignment(JTextField.CENTER);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(text_target_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(target_textField, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(text_target_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(target_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        text_input_label.setFont(new Font("TH-Sarabun-PSK", 0, 24)); // NOI18N
        text_input_label.setText("INPUT");

        input_textField.setFont(new Font("TH-Sarabun-PSK", 0, 14)); // NOI18N
        input_textField.setHorizontalAlignment(JTextField.CENTER);

        random_button.setFont(new Font("TH-Sarabun-PSK", 0, 18)); // NOI18N
        random_button.setText("RANDOM");
        random_button.addActionListener((ActionEvent e) -> {
            Random rand = new Random();
            int length_rand = rand.nextInt(8) + 1;

            int totalSum = 0;
            int _input = rand.nextInt(50) + 1;
            int[] number_inputRand = new int[length_rand];
            number_inputRand[0] = _input;
            String str_rand = "" + _input;
            for (int i = 1; i < length_rand; i++) {
                int input = rand.nextInt(50) + 1;
                str_rand = str_rand + "," + input;
                number_inputRand[i] = input;
                totalSum += number_inputRand[i];
            }
            input_textField.setText(str_rand);
            Arrays.sort(number_inputRand);

            int min = number_inputRand[0];
            int target_rand = (length_rand > 1) ? (int) (Math.random() * (totalSum - min + 1)) + min : number_inputRand[0]; //Random number between min - max
            target_textField.setText("" + target_rand);
        });

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(text_input_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(input_textField, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(random_button)
                                .addGap(138, 138, 138))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap(45, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(input_textField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(text_input_label, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(random_button)
                                .addGap(39, 39, 39))
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

        getContentPane().add(p2);

        p3.setBackground(new Color(245, 211, 0));
        p3.setToolTipText("");
        p3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        process_button.setFont(new Font("TH-Sarabun-PSK", 0, 24)); // NOI18N
        process_button.setText("Processing");
        process_button.addActionListener((ActionEvent e) -> {
            //                int length = (Integer) (length_spinner.getValue());
            int target = Integer.parseInt(target_textField.getText());
            String str_input = input_textField.getText();
            str_input = str_input.replaceAll("\\D+", ",");
            String[] str_output = str_input.split(",");
            int[] result = new int[str_output.length];

            String output = "";
            for (int i = 0; i < result.length; i++) {
                result[i] = Integer.parseInt(str_output[i]);
                if (i < result.length - 1) {
                    output += str_output[i] + ",";
                } else {
                    output += str_output[i];
                }
            }

            if (btk_checkbox.isSelected() && bab_checkbox.isSelected()) {
                JOptionPane.showMessageDialog(new JFrame(), "Select only one solution!", "Alert", JOptionPane.WARNING_MESSAGE);
            } else if (!btk_checkbox.isSelected() && !bab_checkbox.isSelected()) {
                JOptionPane.showMessageDialog(new JFrame(), "Select solution!", "Alert", JOptionPane.WARNING_MESSAGE);
            } else if (btk_checkbox.isSelected()) { // Backtracking

                int confirm = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure?" + "\nTarget : " + target + "\nINPUT : " + output,
                        "Confirm...", JOptionPane.OK_CANCEL_OPTION);
                if (confirm == 0) {
                    setVisible(false);
                    new frameSolution(result, target, "Backtracking").setVisible(true);
                }
            } else if (bab_checkbox.isSelected()) { //Branch and Bound
                setVisible(false);
                new frameSolution(result, target, "Branch and Bound").setVisible(true);
            }
        });

        p3.add(process_button);

        getContentPane().add(p3);
        pack();
        setLocationRelativeTo(null);
    }
}

class frameSolution extends JFrame {

    private int[] result;
    private int target;
    private String solution;
    private ArrayList<ArrayList<Integer>> results;
    private ArrayList<int[]> resultPath;
    Backtracking backtracking;

    public frameSolution(int[] result, int target, String solution) {
        this.result = result;
        this.target = target;
        this.solution = solution;
        if ("Backtracking".equals(solution)) {
            backtracking = new Backtracking(result, target, false);
            setResults(backtracking.run());
            setResultPath(backtracking.getResultPath());
        } else if ("Branch and Bound".equals(solution)) {
            // เพิ่มโค้ดส่วนของ Algorithm Branch and Bound
        }
        initComponents();
    }

    private void initComponents() {

        JPanel p1 = new JPanel();
        Label text_header = new Label();
        JPanel p2 = new JPanel();
        Label nameSolution_text = new Label();
        JPanel p3 = new JPanel();
        JLabel countSolution_text = new JLabel();
        JPanel p4 = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTable jTable1 = new JTable();
        Choice choice1 = new Choice();
        JPanel p5 = new JPanel();
        JButton graph_button = new JButton();
        JButton back_button = new JButton();

        setTitle("Solution");

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1.setToolTipText("");
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        text_header.setAlignment(Label.CENTER);
        text_header.setFont(new Font("TH-Sarabun-PSK", 1, 36)); // NOI18N
        text_header.setText("Subset sum Calculator");
        p1.add(text_header);

        p2.setToolTipText("");
        p2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

        nameSolution_text.setAlignment(Label.CENTER);
        nameSolution_text.setFont(new Font("TH-Sarabun-PSK", 0, 24)); // NOI18N
        nameSolution_text.setText("Solve By " + solution);
        p2.add(nameSolution_text);

        p3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

        countSolution_text.setFont(new Font("TH Sarabun PSK", 0, 24)); // NOI18N
        countSolution_text.setText("จำนวนของเซทคำตอบทั้งหมด<จำนวนเซทคำตอบ>");
        p3.add(countSolution_text);

        jTable1.setFont(new Font("TH-Sarabun-PSK", 0, 18)); // NOI18N

        for (ArrayList<Integer> i : results) {
            choice1.add("" + i);
        }

//        choice1.
        String[] row = new String[result.length];

        resultPath.get(0);

//        DefaultTableModel model = new DefaultTableModel();
        jTable1.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        GroupLayout p4Layout = new GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
                p4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(p4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choice1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        p4Layout.setVerticalGroup(
                p4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                        .addGroup(p4Layout.createSequentialGroup()
                                .addComponent(choice1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        p5.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 5));

        graph_button.setFont(new Font("TH-Sarabun-PSK", 0, 18)); // NOI18N
        graph_button.setText("GRAPH");
        graph_button.addActionListener((ActionEvent e) -> {
            if ("Backtracking".equals(solution)) {
                backtracking = new Backtracking(result, target, true);
                setResults(backtracking.run());
                setResultPath(backtracking.getResultPath());
            } else if (solution.equals("Branch and Bound")) {
                // เพิ่มโค้ดส่วนของ Algorithm Branch and Bound
            }
        });

        p5.add(graph_button);

        back_button.setFont(new Font("TH-Sarabun-PSK", 0, 18)); // NOI18N
        back_button.setText("BACK");
        back_button.addActionListener((ActionEvent e) -> {
            setVisible(false);
            new mainFrame().setVisible(true);
        });
        p5.add(back_button);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(p1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(p1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(p2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(p3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(p4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
        pack();
        setLocationRelativeTo(null);
    }

    public void setResults(ArrayList<ArrayList<Integer>> results) {
        this.results = new ArrayList<>(results);
    }

    public void setResultPath(ArrayList<int[]> resultPath) {
        this.resultPath = resultPath;
    }
}
