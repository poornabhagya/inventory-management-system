import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

class Carfind {
    String model;
    String make;

    public Carfind(String model, String make) {
        this.model = model;
        this.make = make;
    }

    @Override
    public String toString() {
        return model + " " + make;
    }
}

public class CarCompany extends JFrame {
    private JTextField makeField, modelField;
    private JTextArea List;
    private ArrayList<Car> carList;

    public CarCompany() {
        carList = new ArrayList<>();
        setTitle("Car Company Inventory");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Make:"));
        makeField = new JTextField();
        makeField.setPreferredSize(new Dimension(250,40));
        makeField.setHorizontalAlignment(JTextField.CENTER);
        inputPanel.add(makeField);
        inputPanel.add(new JLabel("Model:"));
        modelField = new JTextField();
        modelField.setPreferredSize(new Dimension(250,40));
        modelField.setHorizontalAlignment(JTextField.CENTER);
        inputPanel.add(modelField);
        inputPanel.setBackground(Color.GREEN);

        JButton addButton = new JButton("Add Car");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCar();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);

        List = new JTextArea();
        List.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(List);
        scrollPane.setPreferredSize(new Dimension(250,50));
        
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    private void addCar() {
        String make = makeField.getText();
        String model = modelField.getText();
        if (!make.isEmpty() && !model.isEmpty()) {
            Car car = new Car(model, make);
            carList.add(car);
            updateCarList();
            makeField.setText("");
            modelField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both Make and Model.");
        }
    }

    private void updateCarList() {
        List.setText("");
        for (Car car : carList) {
            List.append(car.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarCompany().setVisible(true);
            }
        });
    }
}
