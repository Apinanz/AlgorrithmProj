
import java.awt.Label;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class HomePage {

    public static void main(String[] args) {

        JPanel p1 = new JPanel();
        Label text_header = new Label();
        JPanel p2 = new JPanel();
        JPanel jPanel1 = new JPanel();
        Label text_length_label = new Label();
        Label text_input_label = new Label();
        Label text_solveBy_label = new Label();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JSpinner length_spinner = new JSpinner();
        JPanel jPanel5 = new JPanel();
        JTextField input_textField = new JTextField();
        JPanel jPanel6 = new JPanel();
        JCheckBox btk_checkbox = new JCheckBox();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel7 = new JPanel();
        JPanel jPanel8 = new JPanel();
        JButton genarate_button = new JButton();
        JPanel jPanel9 = new JPanel();
        JCheckBox bab_checkbox = new JCheckBox();
        JPanel p3 = new JPanel();
        JButton process_buttom = new JButton();

        JFrame frame = new JFrame();
        frame.setTitle("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        p1.setBackground(new java.awt.Color(204, 255, 204));
        p1.setToolTipText("");

        text_header.setFont(new java.awt.Font("Dialog", 1, 36)); 
        text_header.setText("Subset sum Calculator");

        GroupLayout p1Layout = new GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(text_header, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(text_header, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frame.getContentPane().add(p1);
        p1.getAccessibleContext().setAccessibleName("");

        p2.setBackground(new java.awt.Color(204, 255, 204));
        p2.setToolTipText("");
        p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));

        text_length_label.setFont(new java.awt.Font("Dialog", 0, 24)); 
        text_length_label.setText("Length");
        jPanel1.add(text_length_label);

        text_input_label.setFont(new java.awt.Font("Dialog", 0, 24)); 
        text_input_label.setText("INPUT");
        jPanel1.add(text_input_label);

        text_solveBy_label.setFont(new java.awt.Font("Dialog", 0, 24)); 
        text_solveBy_label.setText("Solve By");
        jPanel1.add(text_solveBy_label);

        p2.add(jPanel1);

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(length_spinner, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(length_spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jPanel2.add(jPanel4);

        input_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        input_textField.setHorizontalAlignment(JTextField.CENTER);

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(input_textField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(input_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);

        btk_checkbox.setText("Backtracking");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btk_checkbox)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btk_checkbox)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);

        p2.add(jPanel2);

        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7);

        genarate_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        genarate_button.setText("GENARATE");

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genarate_button)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(genarate_button)
                .addGap(47, 47, 47))
        );

        jPanel3.add(jPanel8);

        bab_checkbox.setText("Branch and Bound");

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bab_checkbox)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(bab_checkbox)
                .addGap(52, 52, 52))
        );

        jPanel3.add(jPanel9);

        p2.add(jPanel3);

        frame.getContentPane().add(p2);

        p3.setBackground(new java.awt.Color(204, 255, 204));
        p3.setToolTipText("");

        process_buttom.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        process_buttom.setText("Processing");

        GroupLayout p3Layout = new GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(process_buttom)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(process_buttom, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        frame.getContentPane().add(p3);
        
        frame.pack();
        frame.setVisible(true);
    }
}
