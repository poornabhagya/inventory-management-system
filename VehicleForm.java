
import javax.swing.JComboBox;

public class VehicleForm extends javax.swing.JFrame {

    
    Model[] companys;

    public VehicleForm() {
        initComponents();

        companys = new Model[4];

        companys[0] = new Model("Toyota");

companys[0].AddModel("Corolla");
companys[0].AddModel("Axio");
companys[0].AddModel("Prius");
companys[0].AddModel("Land Cruiser");
companys[0].AddModel("Premio");
companys[0].AddModel("Allion");

companys[1] = new Model("Honda");
companys[1].AddModel("Civic");
companys[1].AddModel("Accord");
companys[1].AddModel("CRV");
companys[1].AddModel("City");
companys[1].AddModel("Insight");
companys[1].AddModel("CRZ");

companys[2] = new Model("Mazda");
companys[2].AddModel("Mazda3");
companys[2].AddModel("RX-8");
companys[2].AddModel("MX-5");
companys[1].AddModel("Millenia");

companys[3] = new Model("Mitsubishi");
companys[3].AddModel("Lancer");
companys[3].AddModel("Galant");
companys[3].AddModel("Eclipse");
companys[3].AddModel("Expander");
companys[3].AddModel("Outlander");

        for(int i=0;i<companys.length;++i){
            Combo_Box1.addItem(companys[i].Company_name);
        }

    }


    @SuppressWarnings("unchecked")
                    
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Combo_Box1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Combo_Box2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setLabel("OK\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Model");

        Combo_Box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        Combo_Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_Box1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Combo_Box1, 0, 197, Short.MAX_VALUE)
                    .addComponent(Combo_Box2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        jButton1.getAccessibleContext().setAccessibleName("Ok");

        pack();
    }// </editor-fold>                        
                                      
    public void clear(){
        Combo_Box2.removeAllItems();     
    }
    private void Combo_Box1ActionPerformed(java.awt.event.ActionEvent evt) { 
        
        clear();                               
            //main loop
            for(int i=0;i<companys.length;++i){
                if(Combo_Box1.getSelectedItem().equals(companys[i].Company_name)){

                    //second loop
                    String[] arr = companys[i].getModels();
                    

                    for(int a=0;a<arr.length;++a){
                        Combo_Box2.addItem(arr[a]);
                    }
                }
            }
            
    }                                          

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify                     
    private javax.swing.JComboBox Combo_Box1;
    private javax.swing.JComboBox Combo_Box2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration                   
}
