
package Formularios;

import BaseDeDatos.ConexionMySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sun.font.TrueTypeFont;

public class Paciente extends javax.swing.JFrame {

    
    public Paciente() {
        initComponents();
        inhabilitariconos();
    }
   
    void inhabilitar(){
        
        cbocedula.setEnabled(false);
        txtcedula.setEnabled(false);
    }
    void inhabilitariconos(){
        lblicon1.setVisible(false);
        lblicon2.setVisible(false);
        lblicon3.setVisible(false);
        lblicon4.setVisible(false);
        lblicon5.setVisible(false);
        lblicon6.setVisible(false);
        lblicon07.setVisible(false);
        lblicon8.setVisible(false);
        lblicon9.setVisible(false);
        lblicon10.setVisible(false);
        lblicon11.setVisible(false);
        lblicon12.setVisible(false);
    }
    
    void limpiar() { //Declaracion del metodo que permite limpiar los campos
        String dia="", mes="", ano="";
        
        cbocedula.setSelectedItem("Seleccione");
        txtcedula.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        cbosexo.setSelectedItem("Seleccione");
        java.util.Date hoy = new java.util.Date();
        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyy-mm-dd");
        String fecha=formatoFecha.format(hoy);
        ano=fecha.substring(0, 4);
        mes=fecha.substring(5, 7);
        dia=fecha.substring(8, 10);
        clrfecha.setSelectedDate(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia));
        txtedad.setText("");
        txtdireccion.setText("");
        txtnombrespm.setText("");
        txtapellidospm.setText("");
        cbocodtmovil.setSelectedItem("Seleccione");
        txtnumtmovil.setText("");
        cbocodtfijo.setSelectedItem("Seleccione");
        txtnumtfijo.setText("");
        txtcorreo.setText("");
        cbotipocorreo.setSelectedItem("Seleccione");
        cbotipocorreo2.setSelectedItem("Seleccione");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        cbocedula = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbosexo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        clrfecha = new org.gui.JCalendarCombo();
        jLabel6 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtnombrespm = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtapellidospm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbocodtmovil = new javax.swing.JComboBox();
        txtnumtmovil = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbocodtfijo = new javax.swing.JComboBox();
        txtnumtfijo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        cbotipocorreo = new javax.swing.JComboBox();
        cbotipocorreo2 = new javax.swing.JComboBox();
        lblicon1 = new javax.swing.JLabel();
        lblicon2 = new javax.swing.JLabel();
        lblicon3 = new javax.swing.JLabel();
        lblicon4 = new javax.swing.JLabel();
        lblicon5 = new javax.swing.JLabel();
        lblicon6 = new javax.swing.JLabel();
        lblicon07 = new javax.swing.JLabel();
        lblicon8 = new javax.swing.JLabel();
        lblicon9 = new javax.swing.JLabel();
        lblicon10 = new javax.swing.JLabel();
        lblicon11 = new javax.swing.JLabel();
        lblicon12 = new javax.swing.JLabel();
        lblicon7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnguardar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Cedula");

        txtcedula.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcedulaFocusLost(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        cbocedula.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbocedula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "V-", "E-" }));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Nombres");

        txtnombres.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("Apellidos");

        txtapellidos.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Sexo");

        cbosexo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbosexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "M", "F" }));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de nacimiento");

        clrfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrfechaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clrfechaMousePressed(evt);
            }
        });
        clrfecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                clrfechaFocusLost(evt);
            }
        });
        clrfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clrfechaKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Edad");

        txtedad.setEditable(false);
        txtedad.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtedad.setEnabled(false);
        txtedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtedadMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Dirección ");

        txtdireccion.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setText("Nombres del padre o madre");

        txtnombrespm.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtnombrespm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrespmKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel13.setText("Apellidos del padre o madre");

        txtapellidospm.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtapellidospm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidospmActionPerformed(evt);
            }
        });
        txtapellidospm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidospmKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel9.setText("Teléfono móvil");

        cbocodtmovil.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbocodtmovil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "0414", "0424", "0416", "0426", "0412" }));
        cbocodtmovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocodtmovilActionPerformed(evt);
            }
        });

        txtnumtmovil.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtnumtmovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumtmovilActionPerformed(evt);
            }
        });
        txtnumtmovil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnumtmovilFocusLost(evt);
            }
        });
        txtnumtmovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumtmovilKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setText("Teléfono fijo");

        cbocodtfijo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbocodtfijo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "0251", "0252", "0253" }));
        cbocodtfijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocodtfijoActionPerformed(evt);
            }
        });

        txtnumtfijo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtnumtfijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumtfijoActionPerformed(evt);
            }
        });
        txtnumtfijo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnumtfijoFocusLost(evt);
            }
        });
        txtnumtfijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumtfijoKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel11.setText("Correo electrónico");

        txtcorreo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        cbotipocorreo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbotipocorreo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "hotmail", "outlock", "gmail", "yahoo" }));
        cbotipocorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipocorreoActionPerformed(evt);
            }
        });

        cbotipocorreo2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cbotipocorreo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "com", "es" }));
        cbotipocorreo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipocorreo2ActionPerformed(evt);
            }
        });

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N
        lblicon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblicon1MouseEntered(evt);
            }
        });

        lblicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        lblicon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon07))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbotipocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbotipocorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbocodtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbocodtfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumtfijo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblicon4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clrfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblicon5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtapellidospm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblicon9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtnombrespm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblicon8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblicon1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblicon1))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblicon2)
                    .addComponent(lblicon3))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(clrfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblicon4)
                    .addComponent(lblicon5)
                    .addComponent(lblicon6))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblicon07))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnombrespm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(lblicon8))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtapellidospm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel9)
                            .addComponent(cbocodtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cbocodtfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumtfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblicon10)
                            .addComponent(lblicon11))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel11)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipocorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblicon12)))
                    .addComponent(lblicon9))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        lblicon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/triangulo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblicon7)
                    .addGap(0, 604, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 56, Short.MAX_VALUE)
                    .addComponent(lblicon7)
                    .addGap(0, 433, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       String ced1="", ced2="", cedula="", sSQL="", status="", nombres="", apellidos="", sexo="", fecha="",dia="" ,mes="" ,ano="", edad="", direccion="", nombrespm="", apellidospm="", codtmovil="", numtmovil="", codtfijo="", numtfijo="", correo1="", correo2="", correo3="";
       
       ced1=cbocedula.getSelectedItem().toString();
       ced2=txtcedula.getText();
       cedula=ced1+ced2;
       
       sSQL="SELECT pac_nombres, pac_apellidos, pac_sexo, pac_fecha, pac_edad, pac_direccion, pac_nombrespm, pac_apellidospm, pac_codtmovil, pac_numtmovil, pac_codtfijo, pac_numtfijo, pac_usuariocorreo, pac_tipocorreo, pac_extensioncorreo, pac_status FROM paciente WHERE CONCAT (pac_tipocedula, pac_cedula) = '"+cedula+"'";
       
       ConexionMySQL mysql =new ConexionMySQL();
       Connection cn=mysql.Conectar();
       
       try {
           Statement st=cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
                 nombres=rs.getString("pac_nombres");
                 apellidos=rs.getString("pac_apellidos");
                 sexo=rs.getString("pac_sexo");
                 fecha=rs.getString("pac_fecha");
                 edad=rs.getString("pac_edad");
                 direccion=rs.getString("pac_direccion");
                 nombrespm=rs.getString("pac_nombrespm");
                 apellidospm=rs.getString("pac_apellidospm");
                 codtmovil=rs.getString("pac_codtmovil");
                 numtmovil=rs.getString("pac_numtmovil");
                 codtfijo=rs.getString("pac_codtfijo");
                 numtfijo=rs.getString("pac_numtfijo");
                 correo1=rs.getString("pac_correo");
                 correo2=rs.getString("pac_correo1");
                 correo3=rs.getString("pac_correo2");
                 status=rs.getString("pac_status");
                 ano=fecha.substring(0, 4);
                 mes=fecha.substring(5, 7);
                 dia=fecha.substring(8, 10);
           }
           if(status.equals("A")){
               inhabilitar();
               txtnombres.setText(nombres);
               txtapellidos.setText(apellidos);
               cbosexo.setSelectedItem(sexo);
               txtedad.setText(edad);
               txtdireccion.setText(direccion);
               clrfecha.setSelectedDate(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia));
               cbocodtmovil.setSelectedItem(codtmovil);
               txtnumtmovil.setText(numtmovil);
               cbocodtfijo.setSelectedItem(codtfijo);
               txtnumtfijo.setText(numtfijo);
               txtcorreo.setText(correo1);
               cbotipocorreo.setSelectedItem(correo2);
               cbotipocorreo2.setSelectedItem(correo3);
           }
           else{
               JOptionPane.showMessageDialog(null,"No se encontro nungun paciente con este numero de cedula"+cedula);
           }
         }
         catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
       
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        String ced1="", ced2="", nombres="", apellidos="", sexo="", direccion="",dia="", mes="", ano="", fecha="", edad="",nombrespm="",apellidospm="", codtmovil="", numtmovil="", codtfijo="",numtfijo="", correo1="", correo2="", correo3="", sSQL="",cedula="";
        
        ced1=cbocedula.getSelectedItem().toString();
        ced2=txtcedula.getText();
        cedula=ced1+ced2;
        nombres=txtnombres.getText();
        apellidos=txtapellidos.getText();
        sexo=cbosexo.getSelectedItem().toString();
        direccion=txtdireccion.getText();
        dia=clrfecha.getSelectedDay();
        mes=clrfecha.getSelectedMonth();
        ano=clrfecha.getSelectedYear();
        fecha=ano+"/"+mes+"/"+dia;    
        edad=txtedad.getText();
        nombrespm=txtnombrespm.getText();
        apellidospm=txtapellidos.getText();
        if((!nombrespm.equals(""))&&(!apellidospm.equals(""))){
            nombrespm=txtnombrespm.getText();
            apellidospm=txtapellidos.getText();
        }
        else{
            nombrespm="";
            apellidospm="";
        }
        codtmovil=cbocodtmovil.getSelectedItem().toString();
        numtmovil=txtnumtmovil.getText();
        if((codtmovil.equals("Seleccione"))&& (numtmovil.equals(""))){
            codtmovil=""; 
            numtmovil="";
        }
        else{
            codtmovil=cbocodtmovil.getSelectedItem().toString();
            numtmovil=txtnumtmovil.getText();
        }
        codtfijo=cbocodtfijo.getSelectedItem().toString();
        numtfijo=txtnumtfijo.getText();
        if((codtfijo.equals("Seleccione"))&& (numtfijo.equals(""))){
            codtfijo=""; 
            numtfijo="";
        }
        else{
            codtfijo=cbocodtfijo.getSelectedItem().toString();
            numtfijo=txtnumtfijo.getText();
        }
        correo1=txtcorreo.getText();
        correo2=cbotipocorreo.getSelectedItem().toString();
        correo3=cbotipocorreo2.getSelectedItem().toString();
        if((correo1.equals("")) && (correo2.equals("Seleccione")) && (correo3.equals("Seleccione"))){
            correo1=""; 
            correo2="";
            correo3="";
        }
        else{
            correo1=txtcorreo.getText();
            correo2=cbotipocorreo.getSelectedItem().toString();
            correo3=cbotipocorreo2.getSelectedItem().toString();
        }
        ConexionMySQL mysql=new ConexionMySQL();
        Connection cn = mysql.Conectar();
        
        sSQL="UPDATE paciente SET pac_nombres='"+nombres+"', pac_apellidos='"+apellidos+"', pac_sexo='"+sexo+"', pac_edad='"+edad+"', pac_nombrespm='"+nombrespm+"', pac_apellidospm='"+apellidospm+"', pac_direccion='"+direccion+"', pac_fecha='"+fecha+"', pac_codtmovil='"+codtmovil+"', pac_numtmovil='"+numtmovil+"', pac_codtfijo='"+codtfijo+"', pac_numtfijo='"+numtfijo+"', pac_usuariocorreo='"+correo1+"', pac_tipocorreo='"+correo2+"', pac_extensioncorreo='"+correo3+"'  WHERE CONCAT (pac_tipocedula, pac_cedula) = '"+cedula+"'";
        
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            int n=pst.executeUpdate();
            if(n>0){
                 JOptionPane.showMessageDialog(null,"Actualizacion Satisfactoria");
                 limpiar();
            }      
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String cedula="",ced1="", ced2="",sSQL="";
        
        ced1=cbocedula.getSelectedItem().toString();
        ced2=txtcedula.getText();
        cedula=ced1+ced2;
        
        ConexionMySQL mysql =new ConexionMySQL();
        Connection cn=mysql.Conectar();
            
        sSQL="UPDATE paciente SET pac_status='I' WHERE CONCAT (pac_tipocedula, pac_cedula)='"+cedula+"'";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            int n=pst.executeUpdate();
            if(n>0){
                 JOptionPane.showMessageDialog(null,"Paciente eliminado Satisfactoriamente");
            }      
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtapellidospmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidospmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidospmActionPerformed

    private void cbocodtmovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocodtmovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocodtmovilActionPerformed

    private void txtnumtmovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumtmovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumtmovilActionPerformed

    private void cbocodtfijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocodtfijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocodtfijoActionPerformed

    private void txtnumtfijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumtfijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumtfijoActionPerformed

    private void cbotipocorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipocorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipocorreoActionPerformed

    private void cbotipocorreo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipocorreo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipocorreo2ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String ced1="", ced2="", nombres="", apellidos="", sexo="", direccion="",dia="", mes="", ano="", fecha="", edad="",nombrespm="",apellidospm="", movilcod="", movilnum="", fijocod="",fijonum="", correo1="", correo2="", correo3="", sSQL="",status="A",sSQL2="",cedula="", status2="",datos="";      String[] registro= new String[2];
        
        ced1=cbocedula.getSelectedItem().toString();
        ced2=txtcedula.getText();
        cedula=ced1+ced2;
        nombres=txtnombres.getText();
        apellidos=txtapellidos.getText();
        sexo=cbosexo.getSelectedItem().toString();
        direccion=txtdireccion.getText();
        dia=clrfecha.getSelectedDay();
        mes=clrfecha.getSelectedMonth();
        ano=clrfecha.getSelectedYear();
        fecha=ano+"/"+mes+"/"+dia;    
        edad=txtedad.getText();
        nombrespm=txtnombrespm.getText();
        apellidospm=txtapellidos.getText();
        if((!nombrespm.equals(""))&&(!apellidospm.equals(""))){
            nombrespm=txtnombrespm.getText();
            apellidospm=txtapellidos.getText();
        }
        else{
            nombrespm="";
            apellidospm="";
        }
        movilcod=cbocodtmovil.getSelectedItem().toString();
        movilnum=txtnumtmovil.getText();
        if((movilcod.equals("Seleccione"))&& (movilnum.equals(""))){
            movilcod=""; 
            movilnum="";
        }
        else{
            movilcod=cbocodtmovil.getSelectedItem().toString();
            movilnum=txtnumtmovil.getText();
        }
        fijocod=cbocodtfijo.getSelectedItem().toString();
        fijonum=txtnumtfijo.getText();
        if((fijocod.equals("Seleccione"))&& (fijonum.equals(""))){
            fijocod=""; 
            fijonum="";
        }
        else{
            fijocod=cbocodtfijo.getSelectedItem().toString();
            fijonum=txtnumtfijo.getText();
        }
        correo1=txtcorreo.getText();
        correo2=cbotipocorreo.getSelectedItem().toString();
        correo3=cbotipocorreo2.getSelectedItem().toString();
        if((correo1.equals("")) && (correo2.equals("Seleccione")) && (correo3.equals("Seleccione"))){
            correo1=""; 
            correo2="";
            correo3="";
        }
        else{
            correo1=txtcorreo.getText();
            correo2=cbotipocorreo.getSelectedItem().toString();
            correo3=cbotipocorreo2.getSelectedItem().toString();
        }
        
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();
        
        sSQL2="SELECT pac_tipocedula, pac_cedula, pac_status FROM paciente WHERE CONCAT (pac_tipocedula, pac_cedula) LIKE '%"+cedula+"%'";
        try{
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL2);
            while(rs.next()){
                datos=rs.getString("pac_tipocedula")+rs.getString("pac_cedula");
                status2=rs.getString("pac_status");
            }
            if(cedula.equals(registro[0]) && status2.equals("A")){
                JOptionPane.showMessageDialog(null,"El paciente ya se encuentra registrado");
            }
            if(cedula.equals(registro[0]) && !status2.equals("A")){
                new CambioDeStatus().setVisible(true);
            }
            else{
                sSQL="INSERT INTO paciente(pac_tipocedula, pac_cedula, pac_nombres, pac_apellidos, pac_sexo, pac_fecha, pac_edad, pac_direccion, pac_nombrespm, pac_apellidospm, pac_codtmovil, pac_numtmovil, pac_codtfijo, pac_numtfijo, pac_usuariocorreo, pac_tipocorreo, pac_extensioncorreo, pac_status) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                String mensaje="El paciente fue registrado exitosamente";
                try {
                     PreparedStatement pst = cn.prepareStatement(sSQL);
                     pst.setString(1, ced1);
                     pst.setString(2, ced2);
                     pst.setString(3, nombres);
                     pst.setString(4, apellidos);
                     pst.setString(5, sexo);
                     pst.setString(6, fecha);
                     pst.setString(7, edad);
                     pst.setString(8, direccion);
                     pst.setString(9, nombrespm);
                     pst.setString(10, apellidospm);
                     pst.setString(11, movilcod);
                     pst.setString(12, movilnum);
                     pst.setString(13, fijocod);
                     pst.setString(14, fijonum);
                     pst.setString(15, correo1);
                     pst.setString(16, correo2);
                     pst.setString(17, correo3);
                     pst.setString(18, status);
                                         
                     int n = pst.executeUpdate();
                     if (n > 0) {
                         JOptionPane.showMessageDialog(null, mensaje);
                         limpiar();
                     }
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,ex);
                } 
            }
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void clrfechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clrfechaFocusLost
        
    }//GEN-LAST:event_clrfechaFocusLost

    private void clrfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clrfechaKeyPressed
       
    }//GEN-LAST:event_clrfechaKeyPressed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void clrfechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrfechaMouseClicked
    //    JOptionPane.showMessageDialog(this, evt);
    }//GEN-LAST:event_clrfechaMouseClicked

    private void clrfechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrfechaMousePressed
        //JOptionPane.showMessageDialog(this, evt);
    }//GEN-LAST:event_clrfechaMousePressed

    private void txtedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtedadMouseClicked
        String dianac="",mesnac="",anonac="";
        int diaactu=0,mesactu=0,anoactu=0, dia=0, mes=0,ano=0, edad=0;
        
        java.util.Date hoy = new java.util.Date();
        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyy-mm-dd");
        String fecha=formatoFecha.format(hoy);
        
        dianac=clrfecha.getSelectedDay();
        mesnac=clrfecha.getSelectedMonth();
        anonac=clrfecha.getSelectedYear();
        dia=Integer.parseInt(dianac);
        mes=Integer.parseInt(mesnac);
        ano=Integer.parseInt(anonac);
        anoactu=Integer.parseInt(fecha.substring(0, 4));
        mesactu=Integer.parseInt(fecha.substring(5, 7));
        diaactu=Integer.parseInt(fecha.substring(8, 10));
        edad=anoactu-ano;
        
        if(edad>=0){
            if(mesactu<=mes){
                if(diaactu<dia){
                    int edadreal=0;
                    edadreal=edad-1;
                    txtedad.setText(Integer.toString(edadreal));
                }
                else{
                    txtedad.setText(Integer.toString(edad));
                }
            }
            else{
                txtedad.setText(Integer.toString(edad));
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La fecha introducida no es valida");
        }  
    }//GEN-LAST:event_txtedadMouseClicked

    private void txtcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcedulaFocusLost
      if(txtcedula.getText().length() <7){//Validacio  del campo cedula para valores minimos
            JOptionPane.showMessageDialog(null,"Al campo Cedula le faltan valores", "informacion", 1);
        } 
    }//GEN-LAST:event_txtcedulaFocusLost

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char caracter = evt.getKeyChar();//Validacion del campo cedula
        if (caracter >= '0' && caracter <= '9' || caracter == 8 || caracter == KeyEvent.VK_BACK_SPACE || caracter == KeyEvent.VK_CAPS_LOCK || caracter == KeyEvent.VK_SHIFT) {
        } 
        else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "En el campo Cedula solo puede ingresar numeros", "Informacion", 2);
        }
        if (txtcedula.getText().length() >= 8){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar 8 numeros", "Informacion", 1);
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void lblicon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblicon1MouseEntered
     
    }//GEN-LAST:event_lblicon1MouseEntered

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        char caracter = evt.getKeyChar();//Validacion del campo nombre
        if (caracter >= 'a' && caracter <= 'z' || caracter >= 'A' && caracter <= 'Z' || caracter == 8 || caracter == ' ' || caracter == KeyEvent.VK_BACK_SPACE || caracter == KeyEvent.VK_CAPS_LOCK || caracter == KeyEvent.VK_SHIFT) {
        } 
        else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "En el campo campo Nombres solo prodra ingresar caracteres", "Informacion", 2);
        }
        if (txtnombres.getText().length() >= 25) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar 25 caracteres", "Informacion", 1);
        }
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        char caracter = evt.getKeyChar();//Validacion del campo apellido
        if (caracter >= 'a' && caracter <= 'z' || caracter >= 'A' && caracter <= 'Z' || caracter == 8 || caracter == ' ' || caracter == KeyEvent.VK_BACK_SPACE || caracter == KeyEvent.VK_CAPS_LOCK || caracter == KeyEvent.VK_SHIFT) {
        } 
        else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "En el campo Apellidos solo podra ingresar caracteres", "Informacion", 2);

        }
        if (txtapellidos.getText().length() >= 25) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar 25 caracteres", "Informacion", 1);

        }
    }//GEN-LAST:event_txtapellidosKeyTyped

    private void txtnombrespmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrespmKeyTyped
        char caracter = evt.getKeyChar();//Validacion del campo apellido
        if (caracter >= 'a' && caracter <= 'z' || caracter >= 'A' && caracter <= 'Z' || caracter == 8 || caracter == ' ' || caracter == KeyEvent.VK_BACK_SPACE || caracter == KeyEvent.VK_CAPS_LOCK || caracter == KeyEvent.VK_SHIFT) {
        } 
        else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "En el campo Nombres del padre o madre solo podra ingresar caracteres", "Informacion", 2);

        }
        if (txtapellidos.getText().length() >= 25) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar 25 caracteres", "Informacion", 1);

        }
    }//GEN-LAST:event_txtnombrespmKeyTyped

    private void txtapellidospmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidospmKeyTyped
        char caracter = evt.getKeyChar();//Validacion del campo apellido
        if (caracter >= 'a' && caracter <= 'z' || caracter >= 'A' && caracter <= 'Z' || caracter == 8 || caracter == ' ' || caracter == KeyEvent.VK_BACK_SPACE || caracter == KeyEvent.VK_CAPS_LOCK || caracter == KeyEvent.VK_SHIFT) {
        } 
        else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "En el campo Apellidos del padre o madre solo podra ingresar caracteres", "Informacion", 2);

        }
        if (txtapellidos.getText().length() >= 25) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar 25 caracteres", "Informacion", 1);

        }
    }//GEN-LAST:event_txtapellidospmKeyTyped

    private void txtnumtmovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumtmovilKeyTyped
        char caracter = evt.getKeyChar();//Validacion del campo telefono movil
        if (caracter >= '0' && caracter <= '9' || caracter == 8 || caracter == KeyEvent.VK_BACK_SPACE || caracter == KeyEvent.VK_CAPS_LOCK || caracter == KeyEvent.VK_SHIFT) {
        } 
        else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "En el campo Telefono movil solo puede ingresar numeros", "informacion", 2);

        }
        if (txtnumtmovil.getText().length() >= 7) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar 7 numeros", "informacion", 1);
        }
    }//GEN-LAST:event_txtnumtmovilKeyTyped

    private void txtnumtfijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumtfijoKeyTyped
        char caracter = evt.getKeyChar();//Validacion del campo telefono movil
        if (caracter >= '0' && caracter <= '9' || caracter == 8 || caracter == KeyEvent.VK_BACK_SPACE || caracter == KeyEvent.VK_CAPS_LOCK || caracter == KeyEvent.VK_SHIFT) {
        } 
        else {
            evt.consume();
            JOptionPane.showMessageDialog(null, "En el campo Telefono fijo solo puede ingresar numeros", "informacion", 2);
        }
        if (txtnumtmovil.getText().length() >= 7) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puede ingresar 7 numeros", "informacion", 1);
        }
    }//GEN-LAST:event_txtnumtfijoKeyTyped

    private void txtnumtmovilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumtmovilFocusLost
        if(txtnumtmovil.getText().length() <7){//Validacio  del campo telefono movil para valores minimos
            JOptionPane.showMessageDialog(null,"Al campo Telefono movil le faltan valores", "informacion", 1);
        }
    }//GEN-LAST:event_txtnumtmovilFocusLost

    private void txtnumtfijoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumtfijoFocusLost
        if(txtnumtfijo.getText().length() <7){//Validacio  del campo telefono movil para valores minimos
            JOptionPane.showMessageDialog(null,"Al campo Telefono fijo le faltan valores", "informacion", 1);
        }
    }//GEN-LAST:event_txtnumtfijoFocusLost
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JComboBox cbocedula;
    private javax.swing.JComboBox cbocodtfijo;
    private javax.swing.JComboBox cbocodtmovil;
    private javax.swing.JComboBox cbosexo;
    private javax.swing.JComboBox cbotipocorreo;
    private javax.swing.JComboBox cbotipocorreo2;
    private org.gui.JCalendarCombo clrfecha;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblicon07;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblicon10;
    private javax.swing.JLabel lblicon11;
    private javax.swing.JLabel lblicon12;
    private javax.swing.JLabel lblicon2;
    private javax.swing.JLabel lblicon3;
    private javax.swing.JLabel lblicon4;
    private javax.swing.JLabel lblicon5;
    private javax.swing.JLabel lblicon6;
    private javax.swing.JLabel lblicon7;
    private javax.swing.JLabel lblicon8;
    private javax.swing.JLabel lblicon9;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtapellidospm;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnombrespm;
    private javax.swing.JTextField txtnumtfijo;
    private javax.swing.JTextField txtnumtmovil;
    // End of variables declaration//GEN-END:variables
}
