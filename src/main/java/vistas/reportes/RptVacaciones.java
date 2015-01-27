/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.reportes;

import controladores.DetalleGrupoControlador;
import controladores.EmpleadoControlador;
import controladores.GrupoHorarioControlador;
import controladores.PeriodoControlador;
import controladores.SaldoVacacionalControlador;
import entidades.DetalleGrupoHorario;
import entidades.Empleado;
import entidades.GrupoHorario;
import entidades.Periodo;
import entidades.SaldoVacacional;
import vistas.modelos.MTEmpleado;
import com.personal.utiles.FormularioUtil;
import com.personal.utiles.ReporteUtil;
import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import utiles.UsuarioActivo;
import vistas.dialogos.DlgEmpleado;

/**
 *
 * @author RyuujiMD
 */
public class RptVacaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form RptRegistroAsistencia
     */
    private final List<GrupoHorario> grupoList;
    private final GrupoHorarioControlador gc;

    public RptVacaciones() {
        initComponents();
        gc = new GrupoHorarioControlador();
        grupoList = gc.buscarTodos();
        pc = new PeriodoControlador();

//        FormularioUtil.modeloSpinnerFechaHora(spFechaInicio, "dd/MM/yyyy");
//        FormularioUtil.modeloSpinnerFechaHora(spFechaFin, "dd/MM/yyyy");
        inicializar();
        bindeoSalvaje();
        controles();
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

        grpSeleccion = new javax.swing.ButtonGroup();
        pnlRango = new javax.swing.JPanel();
        cboPeriodo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        pnlEmpleados = new javax.swing.JPanel();
        radGrupo = new javax.swing.JRadioButton();
        radPersonalizado = new javax.swing.JRadioButton();
        cboGrupoHorario = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new org.jdesktop.swingx.JXTable();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        pnlBotones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        pnlTab = new javax.swing.JTabbedPane();
        grpSeleccion.add(radGrupo);
        grpSeleccion.add(radPersonalizado);

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REPORTES DE VACACIONES");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlRango.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango"));
        pnlRango.setLayout(new java.awt.GridBagLayout());

        cboPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        pnlRango.add(cboPeriodo, gridBagConstraints);

        jLabel1.setText("Período:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        pnlRango.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(pnlRango, gridBagConstraints);

        pnlEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder("Selección de empleados"));
        pnlEmpleados.setLayout(new java.awt.GridBagLayout());

        radGrupo.setText("Por grupo horario:");
        radGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radGrupoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlEmpleados.add(radGrupo, gridBagConstraints);

        radPersonalizado.setSelected(true);
        radPersonalizado.setText("Personalizado:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlEmpleados.add(radPersonalizado, gridBagConstraints);

        cboGrupoHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlEmpleados.add(cboGrupoHorario, gridBagConstraints);

        jScrollPane1.setViewportView(tblTabla);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlEmpleados.add(jScrollPane1, gridBagConstraints);

        btnAgregar.setText("+");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlEmpleados.add(btnAgregar, gridBagConstraints);

        btnQuitar.setText("-");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlEmpleados.add(btnQuitar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(pnlEmpleados, gridBagConstraints);

        pnlBotones.setLayout(new java.awt.GridBagLayout());

        jButton2.setText("GENERAR REPORTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnlBotones.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(pnlBotones, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(pnlTab, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        generarReporte();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        DlgEmpleado dialogo = new DlgEmpleado(this);
        dialogo.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        // TODO add your handling code here:
        int fila;
        if ((fila = tblTabla.getSelectedRow()) != -1) {
            empleadoList.remove(fila);
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void radGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radGrupoActionPerformed
        // TODO add your handling code here:
        this.controles();
    }//GEN-LAST:event_radGrupoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox cboGrupoHorario;
    private javax.swing.JComboBox cboPeriodo;
    private javax.swing.ButtonGroup grpSeleccion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlEmpleados;
    private javax.swing.JPanel pnlRango;
    private javax.swing.JTabbedPane pnlTab;
    private javax.swing.JRadioButton radGrupo;
    private javax.swing.JRadioButton radPersonalizado;
    private org.jdesktop.swingx.JXTable tblTabla;
    // End of variables declaration//GEN-END:variables

    private List<Empleado> empleadoList;
    private List<Periodo> periodoList;
    private final PeriodoControlador pc;

    private void inicializar() {
        JasperViewer jv = new JasperViewer(null);
        pnlTab.add("Vista previa",jv.getContentPane());
        empleadoList = ObservableCollections.observableList(new ArrayList<Empleado>());
        periodoList = pc.buscarTodosOrden();
    }

    private void controles() {

//        FormularioUtil.activarComponente(spFechaInicio, radPorFecha.isSelected());
//        FormularioUtil.activarComponente(spFechaFin, radPorFecha.isSelected());
//        FormularioUtil.activarComponente(cboMes, radMes.isSelected());
//        FormularioUtil.activarComponente(cboPeriodo1, radMes.isSelected());
//        FormularioUtil.activarComponente(cboPeriodo, radAnio.isSelected());
        FormularioUtil.activarComponente(cboGrupoHorario, radGrupo.isSelected());
//        FormularioUtil.activarComponente(btnOficina, radGrupo.isSelected());
        FormularioUtil.activarComponente(tblTabla, radPersonalizado.isSelected());

    }

    private void bindeoSalvaje() {
        MTEmpleado mt = new MTEmpleado(empleadoList);
        tblTabla.setModel(mt);

        BindingGroup grupo = new BindingGroup();
        JComboBoxBinding bindPeriodo = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ, periodoList, cboPeriodo);
        JComboBoxBinding bindGrupo = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ, grupoList, cboGrupoHorario);
        grupo.addBinding(bindGrupo);
        grupo.addBinding(bindPeriodo);

        grupo.bind();

        DefaultListCellRenderer renderGrupo = new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value instanceof GrupoHorario) {
                    value = ((GrupoHorario) value).getNombre();
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
            }

        };

        DefaultListCellRenderer render = new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value != null) {
                    if (value instanceof Periodo) {
                        value = ((Periodo) value).getAnio();
                    }
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }

        };

        cboPeriodo.setRenderer(render);
        cboGrupoHorario.setRenderer(renderGrupo);
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!empleadoList.contains(empleado)) {
            empleadoList.add(empleado);
            tblTabla.packAll();
        }
    }

    private void generarReporte() {
        List<String> dnis = obtenerDNI();
        Periodo periodo = obtenerPeriodo();
        List<Empleado> empleados = ec.buscarPorLista(dnis);
        for (Empleado e : empleados) {
            buscarCrear(e, periodo);
        }
        String ficheroReporte = "reportes/r_vacaciones.jasper";

        File archivo = new File(ficheroReporte);
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("usuario", UsuarioActivo.getUsuario().getLogin());
        parametros.put("lista", dnis);
        parametros.put("periodo_anio", periodo.getAnio());
        parametros.put("CONEXION_EMPLEADOS", ec.getDao().getConexion());

        reporteUtil.setConn(svc.getDao().getConexion());
        Component componente = reporteUtil.obtenerReporte(archivo, parametros);

        if (componente != null) {
            pnlTab.remove(0);
            pnlTab.add("Vista previa", componente);
        }

    }
    private final SaldoVacacionalControlador svc = new SaldoVacacionalControlador();
    private final Calendar calendar = Calendar.getInstance();
    private final EmpleadoControlador ec = new EmpleadoControlador();
    private final ReporteUtil reporteUtil = new ReporteUtil();

    public void buscarCrear(Empleado empleado, Periodo periodo) {
        SaldoVacacional sv = svc.buscarXPeriodo(empleado.getNroDocumento(), periodo);
        Date fechaContrato = empleado.getFechaInicioContrato();
        calendar.setTime(fechaContrato);
        if (sv == null && periodo.getAnio() > calendar.get(Calendar.YEAR)) {
            //CREAMOS
            sv = new SaldoVacacional();
            //OBTENEMOS SI LE CORRESPONDEN VACACIONES ACORDE A LEY

            if (calendar.get(Calendar.YEAR) < periodo.getAnio()) {
                sv.setDiasRestantes(30);
            } else {
                sv.setDiasRestantes(0);
            }
            calendar.set(Calendar.YEAR, periodo.getAnio());
            sv.setFechaDesde(calendar.getTime());
            calendar.add(Calendar.YEAR, 1);
            sv.setFechaHasta(calendar.getTime());
            sv.setEmpleado(empleado.getNroDocumento());
            sv.setLunesViernes(0);
            sv.setSabado(0);
            sv.setDomingo(0);
            sv.setPeriodo(periodo);
            svc.modificar(sv);
        }
    }

    private List<String> obtenerDNI() {

        List<String> lista = new ArrayList<>();
        if (radGrupo.isSelected()) {
            obtenerGrupo();
            List<DetalleGrupoHorario> detalleGrupo = dgc.buscarXGrupo(grupoSeleccionado);
            for (DetalleGrupoHorario detalle : detalleGrupo) {
                lista.add(detalle.getEmpleado());
            }
        } else if (radPersonalizado.isSelected()) {
            for (Empleado empleado : empleadoList) {
                lista.add(empleado.getNroDocumento());
            }
        }

        return lista;
    }

    private GrupoHorario grupoSeleccionado;
    private final DetalleGrupoControlador dgc = new DetalleGrupoControlador();

    private void obtenerGrupo() {
        int fila;
        if ((fila = cboGrupoHorario.getSelectedIndex()) != -1) {
            grupoSeleccionado = grupoList.get(fila);
        }
    }

    private Periodo obtenerPeriodo() {
        int fila;
        if ((fila = cboPeriodo.getSelectedIndex()) != -1) {
            return periodoList.get(fila);
        }
        return null;
    }
}
