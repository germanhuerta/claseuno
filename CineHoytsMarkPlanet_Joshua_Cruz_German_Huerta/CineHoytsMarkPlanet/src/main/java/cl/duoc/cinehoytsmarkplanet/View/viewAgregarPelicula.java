package cl.duoc.cinehoytsmarkplanet.View;

import cl.duoc.cinehoytsmarkplanet.DTO.PeliculaDTO;
import cl.duoc.cinehoytsmarkplanet.Service.Impl.IPelicula;
import cl.duoc.cinehoytsmarkplanet.Service.PeliculaService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class viewAgregarPelicula extends javax.swing.JInternalFrame {

  
    
    private static IPelicula servicio;
    
    public viewAgregarPelicula() {
        initComponents();
        txtID.setEnabled(false);
        if(servicio == null)
            servicio = new PeliculaService();
        dtm = (DefaultTableModel)Tabla.getModel();
    }
    public viewAgregarPelicula(PeliculaDTO p) {
        initComponents();
        if(servicio == null)
            servicio = new PeliculaService();
    }
    private static int ultimoid = 1;
    
    private int obtenerproximoid(){
    return ultimoid++;
    }
    private DefaultTableModel dtm;
    private Object[] o = new Object[7];
    private int filaseleccionada;
    
    private List<PeliculaDTO> listaPeliculas = new ArrayList<>();
    public void AgregarPelicula(PeliculaDTO peli){
        listaPeliculas.add(peli);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        formhoyts = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        lblAño = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        lblNombrePelicula3 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lblNombrePelicula2 = new javax.swing.JLabel();
        lblNombrePelicula1 = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNombrePelicula = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        lblNombrePelicula4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agregar, Editar, Modificar y Eliminar Pelicula");

        formhoyts.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        formhoyts.setText("FORMULARIO DE CINE HOYTS");

        txtAnio.setBackground(new java.awt.Color(153, 153, 153));

        lblAño.setText("Año de publicacion:");

        cboCategoria.setBackground(new java.awt.Color(153, 153, 153));
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una categoria", "Acción", "Aventura", "Animación", "Comedia", "Drama", "Documental", "Suspenso", "Terror", "Ciencia ficción", "Fantasía", "Crimen", "Misterio", "Romance", "Musical", "Western", "Guerra", "Histórico", "Biografía", "Deportes", "Familiar", "Infantil", "Comedia romántica", "Thriller psicológico", "Horror cómico", "Cine negro", "Cine experimental", "Cine de autor", "Cine independiente", "Cine de superhéroes", "Cine de fantasía épica" }));

        lblNombrePelicula3.setText("Categoria:");

        txtDuracion.setBackground(new java.awt.Color(153, 153, 153));

        lblNombrePelicula2.setText("Duracion Pelicula:");

        lblNombrePelicula1.setText("Director Pelicula:");

        txtDirector.setBackground(new java.awt.Color(153, 153, 153));

        txtNombre.setBackground(new java.awt.Color(153, 153, 153));

        lblNombrePelicula.setText("Nombre Pelicula:");

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Director", "Duracion", "Anio", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla);

        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");

        lblNombrePelicula4.setText("ID:");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(153, 153, 153));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formhoyts)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAño, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombrePelicula)
                                .addComponent(lblNombrePelicula1)
                                .addComponent(lblNombrePelicula2)
                                .addComponent(lblNombrePelicula3)
                                .addComponent(lblNombrePelicula4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDirector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAgregar)
                        .addGap(305, 305, 305)
                        .addComponent(BtnLimpiar)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnActualizar)
                        .addGap(29, 29, 29)
                        .addComponent(BtnEditar)
                        .addGap(43, 43, 43)
                        .addComponent(BtnEliminar)
                        .addGap(46, 46, 46)
                        .addComponent(BtnBuscar)
                        .addGap(48, 48, 48))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formhoyts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePelicula4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePelicula)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePelicula1)
                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePelicula2)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombrePelicula3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnActualizar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnBuscar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtNombre.setText("");
        txtDirector.setText("");
        txtDuracion.setText("");
        txtAnio.setText("");
        cboCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

int id = obtenerproximoid();
String Titulo = txtNombre.getText();
String Director = txtDirector.getText();
String Duracion = txtDuracion.getText();
String Anio = txtAnio.getText();
String Genero = null;

if (cboCategoria.getSelectedIndex() > 0) {
    Genero = cboCategoria.getSelectedItem().toString();
}
if(Titulo.isEmpty() || Director.isEmpty() || Duracion.isEmpty() || Anio.isEmpty()|| Genero == null){
    JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", JOptionPane.ERROR_MESSAGE);    
}else if (Anio.length() != 4){
    JOptionPane.showMessageDialog(null, "El Año debe tener 4 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
}else{
o[0] = id++;
o[1] = Titulo.trim();  
o[2] = Director.trim();
o[3] = Duracion.trim();
o[4] = Anio.trim();
o[5] = Genero.trim();

dtm.addRow(o);

PeliculaDTO p = new PeliculaDTO(Titulo, Director, Anio, Duracion, Genero, id);
servicio.Guardar(p);

System.out.println("Se ha guardado " + p + " exitosamente!");
}
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
         if(Tabla.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro en la tabla", "ERROR AL MODIFICAR", JOptionPane.WARNING_MESSAGE);
        }else{
            filaseleccionada = Tabla.getSelectedRow();
            txtID.setText(dtm.getValueAt(Tabla.getSelectedRow(), 0).toString());
            txtNombre.setText(dtm.getValueAt(Tabla.getSelectedRow(), 1).toString());
            txtDirector.setText(dtm.getValueAt(Tabla.getSelectedRow(), 2).toString());
            txtDuracion.setText(dtm.getValueAt(Tabla.getSelectedRow(), 3).toString());
            txtAnio.setText(dtm.getValueAt(Tabla.getSelectedRow(), 4).toString());
            Object seleccion = dtm.getValueAt(Tabla.getSelectedRow(), 5);
            if(seleccion != null){
            cboCategoria.setSelectedItem(seleccion.toString());
            }else{
            cboCategoria.setSelectedIndex(0);
            }
        }   
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
       Tabla.setValueAt(txtID.getText().trim(), filaseleccionada, 0);
       Tabla.setValueAt(txtNombre.getText().trim(), filaseleccionada, 1);
       Tabla.setValueAt(txtDirector.getText().trim(), filaseleccionada, 2);
       Tabla.setValueAt(txtDuracion.getText().trim(), filaseleccionada, 3);
       Tabla.setValueAt(txtAnio.getText().trim(), filaseleccionada, 4);
       Object seleccion = Tabla.getValueAt(filaseleccionada, 5);
       if(seleccion != null){
            cboCategoria.setSelectedItem(seleccion.toString());
            }else{
            cboCategoria.setSelectedIndex(0);
            }
       
       
       
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        if(Tabla.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro en la tabla", "ERROR AL ELIMINAR", JOptionPane.ERROR_MESSAGE);
        }else{
        dtm.removeRow(Tabla.getSelectedRow());
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel formhoyts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblNombrePelicula;
    private javax.swing.JLabel lblNombrePelicula1;
    private javax.swing.JLabel lblNombrePelicula2;
    private javax.swing.JLabel lblNombrePelicula3;
    private javax.swing.JLabel lblNombrePelicula4;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
