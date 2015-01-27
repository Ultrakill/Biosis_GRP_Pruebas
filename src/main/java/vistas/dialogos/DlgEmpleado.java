/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.dialogos;

import vistas.VistaRegistroAsistencia;
import vistas.AsignarPermiso;
import controladores.EmpleadoControlador;
import entidades.Empleado;
import entidades.RegistroAsistencia;
import vistas.mantenimientos.CRUDGrupoHorario;
import vistas.reportes.RptPermisos;
import vistas.reportes.RptRegistroAsistencia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import vistas.reportes.RptVacaciones;

/**
 *
 * @author fesquivelc
 */
public class DlgEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form VistaEmpleado
     */
    private List<Empleado> lista;
    private final EmpleadoControlador ec;
    private final JInternalFrame padre;
    private boolean agregar;

    public boolean isAgregar() {
        return agregar;
    }

    public void setAgregar(boolean agregar) {
        this.agregar = agregar;
    }

    public DlgEmpleado(JInternalFrame parent) {
        super(JOptionPane.getFrameForComponent(parent), true);
        padre = parent;
        initComponents();
        ec = new EmpleadoControlador();
        bindeoSalvaje();
        buscar();
        actualizarControlesNavegacion();
        agregar = true;
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblBusqueda = new org.jdesktop.swingx.JXBusyLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new org.jdesktop.swingx.JXTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlNavegacion = new javax.swing.JPanel();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        spPagina = new javax.swing.JSpinner();
        txtTotal = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        cboTamanio = new javax.swing.JComboBox();

        setTitle("LISTADO DE EMPLEADOS");

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 8, 0, 8, 0};
        jPanel1Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0};
        jPanel1.setLayout(jPanel1Layout);

        lblBusqueda.setText("Nro de documento o Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(lblBusqueda, gridBagConstraints);

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtBusqueda, gridBagConstraints);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(btnBuscar, gridBagConstraints);

        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseReleased(evt);
            }
        });
        tblEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEmpleadoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jButton1.setText("VER DATOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlNavegacion.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        btnPrimero.setText("<<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnPrimero);

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnAnterior);

        spPagina.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spPagina.setMinimumSize(new java.awt.Dimension(60, 20));
        spPagina.setPreferredSize(new java.awt.Dimension(60, 20));
        spPagina.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPaginaStateChanged(evt);
            }
        });
        pnlNavegacion.add(spPagina);

        txtTotal.setEditable(false);
        txtTotal.setColumns(3);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("1");
        txtTotal.setPreferredSize(new java.awt.Dimension(60, 20));
        pnlNavegacion.add(txtTotal);

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnSiguiente);

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnUltimo);

        cboTamanio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "25", "40", "50" }));
        cboTamanio.setMinimumSize(new java.awt.Dimension(53, 24));
        cboTamanio.setPreferredSize(new java.awt.Dimension(53, 24));
        cboTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTamanioActionPerformed(evt);
            }
        });
        pnlNavegacion.add(cboTamanio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        jPanel1.add(pnlNavegacion, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int fila = tblEmpleado.getSelectedRow();
        if (fila != -1) {
            DlgDatosEmpleado dialogo = new DlgDatosEmpleado(this, true);
            dialogo.setEmpleado(lista.get(fila));
            dialogo.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        lblBusqueda.setBusy(true);
        buscar();
        lblBusqueda.setBusy(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            lblBusqueda.setBusy(true);
            buscar();
            lblBusqueda.setBusy(false);
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void tblEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmpleadoKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_tblEmpleadoKeyReleased

    private void tblEmpleadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseReleased
        // TODO add your handling code here:
        int fila = tblEmpleado.getSelectedRow();
        if (fila != -1) {
            if (evt.getClickCount() == 2) {

                if (this.padre instanceof CRUDGrupoHorario && agregar) {
                    ((CRUDGrupoHorario) padre).agregarEmpleado(lista.get(fila));
                    lista.remove(fila);
                } else if (this.padre instanceof AsignarPermiso && agregar) {
                    ((AsignarPermiso) padre).agregarEmpleado(lista.get(fila));

                } else if(this.padre instanceof VistaRegistroAsistencia && agregar){
                    ((VistaRegistroAsistencia)padre).agregarEmpleado(lista.get(fila));
                } 
                else if(this.padre instanceof RptPermisos && agregar){
                    ((RptPermisos)this.padre).agregarEmpleado(lista.get(fila));
                }
                else if(this.padre instanceof RptRegistroAsistencia && agregar){
                    ((RptRegistroAsistencia)this.padre).agregarEmpleado(lista.get(fila));
                }
                else if(this.padre instanceof RptVacaciones && agregar){
                    ((RptVacaciones)this.padre).agregarEmpleado(lista.get(fila));
                }
                else {
                    empleadoSeleccionado = lista.get(fila);
                    this.dispose();
                }
            }
        }

    }//GEN-LAST:event_tblEmpleadoMouseReleased

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        // TODO add your handling code here:
        primero();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        anterior();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void spPaginaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPaginaStateChanged
        // TODO add your handling code here:
        this.seleccionPagina();
    }//GEN-LAST:event_spPaginaStateChanged

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        ultimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void cboTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTamanioActionPerformed
        // TODO add your handling code here:
        this.paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }//GEN-LAST:event_cboTamanioActionPerformed

    private Empleado empleadoSeleccionado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cboTamanio;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXBusyLabel lblBusqueda;
    private javax.swing.JPanel pnlNavegacion;
    private javax.swing.JSpinner spPagina;
    private org.jdesktop.swingx.JXTable tblEmpleado;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void bindeoSalvaje() {
        lista = ObservableCollections.observableList(new ArrayList<Empleado>());
        JTableBinding binding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ, lista, tblEmpleado);

        BeanProperty pNroDocumento = BeanProperty.create("nroDocumento");
        BeanProperty pCodigoModular = BeanProperty.create("codigoModular");
        BeanProperty pTipoDocumento = BeanProperty.create("tipoDocumento");
        BeanProperty pNombre = BeanProperty.create("nombre");
        BeanProperty pApellidoPaterno = BeanProperty.create("apellidoPaterno");
        BeanProperty pApellidoMaterno = BeanProperty.create("apellidoMaterno");

        binding.addColumnBinding(pCodigoModular).setColumnName("Código modular").setEditable(false);
        binding.addColumnBinding(pNroDocumento).setColumnName("Nro. Documento").setEditable(false);
        binding.addColumnBinding(pTipoDocumento).setColumnName("Tipo de documento").setEditable(false);
        binding.addColumnBinding(pNombre).setColumnName("Nombre").setEditable(false);
        binding.addColumnBinding(pApellidoPaterno).setColumnName("Apellido paterno").setEditable(false);
        binding.addColumnBinding(pApellidoMaterno).setColumnName("Apellido materno").setEditable(false);

        binding.bind();
    }

//    private void buscar() {
//        lista.clear();
//        lista.addAll(ec.buscarXPatron(txtBusqueda.getText()));
//        tblEmpleado.packAll();
//    }
    public Empleado getEmpleadoSeleccionado() {
        return empleadoSeleccionado;
    }

    public Empleado getSeleccionado() {
        this.setVisible(true);
        return getEmpleadoSeleccionado();
    }

    private int paginaActual = 1;
    private int totalPaginas = 0;
    private int tamanioPagina = 0;

    private void buscar() {
        String busqueda = txtBusqueda.getText();
        tamanioPagina = Integer.parseInt(cboTamanio.getSelectedItem().toString());

        lista.clear();

        lista.addAll(this.listar(busqueda, paginaActual, tamanioPagina));

        tblEmpleado.packAll();
    }

    private List<Empleado> listar(String busqueda, int pagina, int tamanio) {
        int total = ec.totalXPatron(busqueda);

        if (total % tamanio == 0) {
            totalPaginas = total / tamanio;
        } else {
            totalPaginas = (total / tamanio) + 1;
        }

        if (totalPaginas == 0) {
            totalPaginas = 1;
        }

        return ec.buscarXPatron(busqueda, (pagina - 1) * tamanio, tamanio);

    }

    private void siguiente() {
        paginaActual++;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void ultimo() {
        paginaActual = totalPaginas;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void primero() {
        paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void anterior() {
        paginaActual--;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void seleccionPagina() {
        paginaActual = (int) spPagina.getValue();
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void actualizarControlesNavegacion() {
        spPagina.setValue(paginaActual);
        txtTotal.setText(totalPaginas + "");

        SpinnerNumberModel modeloSP = (SpinnerNumberModel) spPagina.getModel();
        Comparable<Integer> maximo = totalPaginas;
        modeloSP.setMaximum(maximo);

        this.btnSiguiente.setEnabled(paginaActual != totalPaginas);
        this.btnUltimo.setEnabled(paginaActual != totalPaginas);

        this.btnAnterior.setEnabled(paginaActual != 1);
        this.btnPrimero.setEnabled(paginaActual != 1);
    }
}
