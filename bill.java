import java.awt.*;
import java.awt.event.*;

public class bill extends Frame implements ActionListener {
    
    private Label nameLabel;
    private TextField nameTextField;
    private Label serviceLabel;
    private Checkbox service1Checkbox;
    private Checkbox service2Checkbox;
    private Checkbox service3Checkbox;
    private Checkbox service4Checkbox;
    private Label costLabel;
    private TextField costTextField;
    private Button payButton;
    private Button bb;


    public bill() {
        
        nameLabel = new Label("Name of the patient:");
        nameTextField = new TextField(40);
        serviceLabel = new Label("Services/Tests:");
        service1Checkbox = new Checkbox("Blood test ");
        service2Checkbox = new Checkbox("X-ray");
        service3Checkbox = new Checkbox("CT Scan");
        service4Checkbox = new Checkbox("Sonography");
        costLabel = new Label("Total Cost:");
        costTextField = new TextField(40);
        payButton = new Button("Calculate Bill");
        bb = new Button("back");
        
        setLayout(new GridLayout(6, 2));
        add(nameLabel);
        
        add(nameTextField);
        add(new Label());
       
        add(serviceLabel);
        
        add(service1Checkbox);
       
        add(service2Checkbox);
        
        add(service3Checkbox);
       
        add(service4Checkbox);
        
        add(costLabel);
        add(costTextField);
        add(new Label());
        add(payButton);
        add(bb);
        
        setTitle("Billing Page");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        
        bb.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        setVisible(false);

     }
        });

        Panel panel = new Panel(new FlowLayout(FlowLayout.LEFT));
        panel.add(bb);
        add(panel, BorderLayout.NORTH);

        payButton.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == payButton) {
            
            int totalCost = 0;
            if (service1Checkbox.getState()) {
                totalCost += 50;
            }
            if (service2Checkbox.getState()) {
                totalCost += 100;
            }
            if (service3Checkbox.getState()) {
                totalCost += 60;
            }
            if (service4Checkbox.getState()) {
                totalCost += 80;
            }

            costTextField.setText(Integer.toString(totalCost));

           
        }
    }

    
    public static void main(String[] args) {
        new bill();
    }
}
