/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.personal.utiles.ImagenFondo;
import controladores.EmpleadoControlador;
import controladores.UsuarioControlador;
import entidades.RolAcceso;
import entidades.Usuario;
import entidades.escalafon.Empleado;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import principal.Main;
import utiles.UsuarioActivo;
import vistas.dialogos.DlgCambiarPassword;
import vistas.mantenimientos.CRUDAreaSede;
import vistas.mantenimientos.CRUDGrupoHorario;
import vistas.mantenimientos.CRUDHorario;
import vistas.mantenimientos.CRUDJornada;
import vistas.mantenimientos.CRUDPeriodo;
import vistas.mantenimientos.CRUDTipoPermiso;
import vistas.mantenimientos.CRUDUsuario;
import vistas.reportes.RptPermisos;
import vistas.reportes.RptRegistroAsistencia;
import vistas.reportes.RptVacaciones;

/**
 *
 * @author fesquivelc
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setTitle(Main.APLICACION_TITULO);

//        setIconImage(new ImageIcon(getClass().getResource("iconos/logo.png")).getImage());
        File file = new File(Main.APLICACION_FONDO);
        if (file.exists()) {
            ImagenFondo borde;
            try {
                borde = new ImagenFondo(ImageIO.read(file));
                this.desktopPane.setBorder(borde);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

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

        jSeparator2 = new javax.swing.JSeparator();
        desktopPane = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        pnlBotnes = new javax.swing.JPanel();
        btnEmpleados = new javax.swing.JButton();
        btnMarcaciones = new javax.swing.JButton();
        btnAsignarPermiso = new javax.swing.JButton();
        btnHorarios = new javax.swing.JButton();
        btnRegistroAsistencia = new javax.swing.JButton();
        lblJuvitec = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuMarcaciones = new javax.swing.JMenu();
        mnuVerEmpleados = new javax.swing.JMenuItem();
        mnuMarcacionesSinProcesar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        mnuHorario = new javax.swing.JMenu();
        mnuJornada = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuGruposHorario = new javax.swing.JMenuItem();
        mnuPermiso = new javax.swing.JMenu();
        mnuTiposPermiso = new javax.swing.JMenuItem();
        mnuAsignarPermiso = new javax.swing.JMenuItem();
        mnuAsignarVacaciones = new javax.swing.JMenuItem();
        mnuHorasExtra = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuConfiguracion = new javax.swing.JMenu();
        mnuPeriodos = new javax.swing.JMenuItem();
        mnuSedesAreas = new javax.swing.JMenuItem();
        mnuControlUsuario = new javax.swing.JMenuItem();
        mnuConfiguracionBD = new javax.swing.JMenuItem();
        mnuCambiarPasswd = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL DE ASISTENCIA DE PERSONAL - BIOSIS - SAN MARCOS");
        setIconImage(new javax.swing.ImageIcon("iconos/logo.png").getImage());
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 10, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        desktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        desktopPane.add(jSeparator1);
        jSeparator1.setBounds(180, 30, 0, 2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1014;
        gridBagConstraints.ipady = 616;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(desktopPane, gridBagConstraints);

        java.awt.GridBagLayout pnlBotnesLayout = new java.awt.GridBagLayout();
        pnlBotnesLayout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0};
        pnlBotnesLayout.rowHeights = new int[] {0};
        pnlBotnes.setLayout(pnlBotnesLayout);

        btnEmpleados.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnEmpleados, gridBagConstraints);

        btnMarcaciones.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnMarcaciones.setText("Marcaciones");
        btnMarcaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcacionesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnMarcaciones, gridBagConstraints);

        btnAsignarPermiso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAsignarPermiso.setText("Asignar permisos");
        btnAsignarPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarPermisoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnAsignarPermiso, gridBagConstraints);

        btnHorarios.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnHorarios.setText("Horarios");
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnHorarios, gridBagConstraints);

        btnRegistroAsistencia.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRegistroAsistencia.setText("Registro de asistencia");
        btnRegistroAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAsistenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnRegistroAsistencia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(pnlBotnes, gridBagConstraints);

        lblJuvitec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblJuvitec.setText("SERVICIOS INFORMÁTICOS JUVITEC S.R.L.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(lblJuvitec, gridBagConstraints);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(lblUsuario, gridBagConstraints);

        mnuMarcaciones.setMnemonic('e');
        mnuMarcaciones.setText("Empleados");
        mnuMarcaciones.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        mnuVerEmpleados.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuVerEmpleados.setMnemonic('t');
        mnuVerEmpleados.setText("Ver empleados");
        mnuVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerEmpleadosActionPerformed(evt);
            }
        });
        mnuMarcaciones.add(mnuVerEmpleados);

        mnuMarcacionesSinProcesar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuMarcacionesSinProcesar.setText("Marcaciones sin procesar");
        mnuMarcacionesSinProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMarcacionesSinProcesarActionPerformed(evt);
            }
        });
        mnuMarcaciones.add(mnuMarcacionesSinProcesar);

        mnuSalir.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuSalir.setMnemonic('x');
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuMarcaciones.add(mnuSalir);

        menuBar.add(mnuMarcaciones);

        mnuHorario.setMnemonic('f');
        mnuHorario.setText("Horarios");
        mnuHorario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        mnuJornada.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuJornada.setMnemonic('o');
        mnuJornada.setText("Jornadas");
        mnuJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJornadaActionPerformed(evt);
            }
        });
        mnuHorario.add(mnuJornada);

        jMenuItem4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenuItem4.setText("Horario rotativo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuHorario.add(jMenuItem4);

        mnuGruposHorario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuGruposHorario.setText("Grupos horario");
        mnuGruposHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGruposHorarioActionPerformed(evt);
            }
        });
        mnuHorario.add(mnuGruposHorario);

        menuBar.add(mnuHorario);

        mnuPermiso.setText("Permisos");
        mnuPermiso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        mnuTiposPermiso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuTiposPermiso.setText("Tipos de permiso");
        mnuTiposPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTiposPermisoActionPerformed(evt);
            }
        });
        mnuPermiso.add(mnuTiposPermiso);

        mnuAsignarPermiso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuAsignarPermiso.setText("Asignar permiso");
        mnuAsignarPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignarPermisoActionPerformed(evt);
            }
        });
        mnuPermiso.add(mnuAsignarPermiso);

        mnuAsignarVacaciones.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuAsignarVacaciones.setText("Asignar vacaciones");
        mnuAsignarVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignarVacacionesActionPerformed(evt);
            }
        });
        mnuPermiso.add(mnuAsignarVacaciones);

        mnuHorasExtra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuHorasExtra.setText("Autorizar horas extra");
        mnuHorasExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHorasExtraActionPerformed(evt);
            }
        });
        mnuPermiso.add(mnuHorasExtra);

        menuBar.add(mnuPermiso);

        mnuReportes.setText("Reportes");
        mnuReportes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenuItem1.setText("Reportes de asistencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenuItem2.setText("Reportes de permisos / licencias / comisiones de servicio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenuItem3.setText("Reportes de vacaciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem3);

        menuBar.add(mnuReportes);

        mnuConfiguracion.setMnemonic('h');
        mnuConfiguracion.setText("Configuración");
        mnuConfiguracion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        mnuPeriodos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuPeriodos.setMnemonic('a');
        mnuPeriodos.setText("Períodos");
        mnuPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPeriodosActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuPeriodos);

        mnuSedesAreas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuSedesAreas.setText("Sedes y áreas");
        mnuSedesAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSedesAreasActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuSedesAreas);

        mnuControlUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuControlUsuario.setText("Control de usuarios");
        mnuControlUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuControlUsuarioActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuControlUsuario);

        mnuConfiguracionBD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuConfiguracionBD.setText("Configuración de BD");
        mnuConfiguracionBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfiguracionBDActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuConfiguracionBD);

        mnuCambiarPasswd.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mnuCambiarPasswd.setText("Cambiar contraseña");
        mnuCambiarPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarPasswdActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuCambiarPasswd);

        jMenuItem5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenuItem5.setText("Ejecutar SQL");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(jMenuItem5);

        menuBar.add(mnuConfiguracion);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuVerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerEmpleadosActionPerformed
        // TODO add your handling code here:
        empleados();
    }//GEN-LAST:event_mnuVerEmpleadosActionPerformed

    private void mnuConfiguracionBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfiguracionBDActionPerformed
        // TODO add your handling code here:
        Configuracion configBD = new Configuracion();
        agregarAPanel(configBD, this.getSize().width, 450);

        BasicInternalFrameUI ui = (BasicInternalFrameUI) configBD.getUI();
        Component northPane = ui.getNorthPane();
        MouseMotionListener[] motionListeners = (MouseMotionListener[]) northPane.getListeners(MouseMotionListener.class);

        for (MouseMotionListener listener : motionListeners) {
            northPane.removeMouseMotionListener(listener);
        }
    }//GEN-LAST:event_mnuConfiguracionBDActionPerformed

    private void mnuJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJornadaActionPerformed
        // TODO add your handling code here:
        CRUDJornada jornadas = new CRUDJornada();
        agregarAPanel(jornadas, true);
    }//GEN-LAST:event_mnuJornadaActionPerformed

    private void mnuPeriodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPeriodosActionPerformed
        // TODO add your handling code here:
        CRUDPeriodo periodos = new CRUDPeriodo();
        agregarAPanel(periodos, true);
    }//GEN-LAST:event_mnuPeriodosActionPerformed

    private void mnuGruposHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGruposHorarioActionPerformed
        // TODO add your handling code here:
        CRUDGrupoHorario grupos = new CRUDGrupoHorario();
        agregarAPanel(grupos, true);
    }//GEN-LAST:event_mnuGruposHorarioActionPerformed

    private void mnuMarcacionesSinProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMarcacionesSinProcesarActionPerformed
        // TODO add your handling code here:
        marcaciones();

    }//GEN-LAST:event_mnuMarcacionesSinProcesarActionPerformed

    private void mnuTiposPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTiposPermisoActionPerformed
        // TODO add your handling code here:
        CRUDTipoPermiso tipos = new CRUDTipoPermiso();
        agregarAPanel(tipos, true);
    }//GEN-LAST:event_mnuTiposPermisoActionPerformed

    private void mnuAsignarPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignarPermisoActionPerformed
        // TODO add your handling code here:
        permiso();
    }//GEN-LAST:event_mnuAsignarPermisoActionPerformed

    private void mnuAsignarVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignarVacacionesActionPerformed
        // TODO add your handling code here:
        AsignarVacacion asignar = new AsignarVacacion();
        agregarAPanel(asignar, true);
    }//GEN-LAST:event_mnuAsignarVacacionesActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
        empleados();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnMarcacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcacionesActionPerformed
        // TODO add your handling code here:
        marcaciones();
    }//GEN-LAST:event_btnMarcacionesActionPerformed

    private void btnAsignarPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarPermisoActionPerformed
        // TODO add your handling code here:
        permiso();
    }//GEN-LAST:event_btnAsignarPermisoActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
        // TODO add your handling code here:
        horarios();
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnRegistroAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAsistenciaActionPerformed
        // TODO add your handling code here:
        registroAsistencia();
    }//GEN-LAST:event_btnRegistroAsistenciaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
//        reporteAsistencia();
        registroAsistencia();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        reportePermiso();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        reporteVacaciones();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuControlUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuControlUsuarioActionPerformed
        // TODO add your handling code here:
        CRUDUsuario usuarios = new CRUDUsuario();
        agregarAPanel(usuarios);
    }//GEN-LAST:event_mnuControlUsuarioActionPerformed

    private void mnuCambiarPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarPasswdActionPerformed
        // TODO add your handling code here:
        DlgCambiarPassword passwd = new DlgCambiarPassword(this, UsuarioActivo.getUsuario(), true);
        passwd.setVisible(true);
    }//GEN-LAST:event_mnuCambiarPasswdActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
//        agregarAPanel(new EjecutarSQL(), true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        agregarAPanel(new HorarioRotativo(), true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuSedesAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSedesAreasActionPerformed
        // TODO add your handling code here:
        CRUDAreaSede sedesAreas = new CRUDAreaSede();
        agregarAPanel(sedesAreas, true);
    }//GEN-LAST:event_mnuSedesAreasActionPerformed

    private void mnuHorasExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHorasExtraActionPerformed
        // TODO add your handling code here:
        AsignarAutorizacion autorizacion = new AsignarAutorizacion();
        agregarAPanel(autorizacion, true);
    }//GEN-LAST:event_mnuHorasExtraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarPermiso;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnMarcaciones;
    private javax.swing.JButton btnRegistroAsistencia;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblJuvitec;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAsignarPermiso;
    private javax.swing.JMenuItem mnuAsignarVacaciones;
    private javax.swing.JMenuItem mnuCambiarPasswd;
    private javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenuItem mnuConfiguracionBD;
    private javax.swing.JMenuItem mnuControlUsuario;
    private javax.swing.JMenuItem mnuGruposHorario;
    private javax.swing.JMenu mnuHorario;
    private javax.swing.JMenuItem mnuHorasExtra;
    private javax.swing.JMenuItem mnuJornada;
    private javax.swing.JMenu mnuMarcaciones;
    private javax.swing.JMenuItem mnuMarcacionesSinProcesar;
    private javax.swing.JMenuItem mnuPeriodos;
    private javax.swing.JMenu mnuPermiso;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuSedesAreas;
    private javax.swing.JMenuItem mnuTiposPermiso;
    private javax.swing.JMenuItem mnuVerEmpleados;
    private javax.swing.JPanel pnlBotnes;
    // End of variables declaration//GEN-END:variables

    private void agregarAPanel(JInternalFrame internal) {
        this.agregarAPanel(internal, false);
    }
    Dimension minimo = new Dimension(1024, 628);

    private void agregarAPanel(JInternalFrame internal, boolean maximizar) {
        if (!this.desktopPane.isAncestorOf(internal)) {
            this.desktopPane.add(internal);
            internal.setVisible(true);
            try {

                internal.setMinimumSize(minimo);
                internal.setPreferredSize(minimo);
//                internal.setMaximumSize(minimo);
                internal.setMaximum(maximizar);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void agregarAPanel(JInternalFrame internal, int ancho, int largo) {
        if (!this.desktopPane.isAncestorOf(internal)) {
            this.desktopPane.add(internal);
            internal.setSize(ancho, largo);
            internal.setVisible(true);
            Dimension desktopSize = desktopPane.getSize();
            Dimension jInternalFrameSize = internal.getSize();
            internal.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
        }
    }

    private void empleados() {
        VistaEmpleado ve = new VistaEmpleado();
        agregarAPanel(ve, true);
    }

    private void marcaciones() {
        VistaMarcaciones marcaciones = new VistaMarcaciones();
        agregarAPanel(marcaciones, true);
    }

    private void permiso() {
        AsignarPermiso asignar = new AsignarPermiso();
        agregarAPanel(asignar, true);
    }

    private void horarios() {
        CRUDHorario horarios = new CRUDHorario();
        agregarAPanel(horarios, true);
    }

    private void registroAsistencia() {
        FrmReporteAsistencia registroAsistencia = new FrmReporteAsistencia();
        agregarAPanel(registroAsistencia, true);
    }

    private final EmpleadoControlador ec = new EmpleadoControlador();
    private final DateFormat dfTimestamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private final UsuarioControlador uc = new UsuarioControlador();

    public void setUsuario(Usuario u) {
        if (u != null) {
            UsuarioActivo.setUsuario(u);
            Empleado e = u.getEmpleado();
            lblUsuario.setText("Empleado: " + e.getPaterno() + " " + e.getMaterno() + " " + e.getNombre() + " | Usuario: " + u.getLogin() + " | Rol: " + u.getRol().getNombre() + " | Ult. inicio de sesión: " + (u.getUltimoInicio() != null ? dfTimestamp.format(u.getUltimoInicio()) : dfTimestamp.format(new Date())) + " |");
            this.habilitarMenu();
            if (u.getUltimoInicio() == null) {

            } else {
                u.setUltimoInicio(new Date());
            }

            uc.modificar(u);
        } else {
            System.out.println("USUARIO NULL =(");
        }
    }

    private void reporteAsistencia() {
        RptRegistroAsistencia asistencia = new RptRegistroAsistencia();
        agregarAPanel(asistencia, true);
    }

    private void reportePermiso() {
        RptPermisos permisos = new RptPermisos();
//        agregarAPanel(permisos, 1024, 864);
        agregarAPanel(permisos, true);
    }

    private void reporteVacaciones() {
        RptVacaciones vacaciones = new RptVacaciones();
        agregarAPanel(vacaciones, true);
    }

    private void habilitarMenu() {
        List<RolAcceso> accesos = UsuarioActivo.getUsuario().getRol().getRolAccesoList();

        boolean horario = false;
        boolean periodo = false;
        boolean permiso = false;
        boolean vacacion = false;
        boolean reportes = false;
        boolean configuracion = false;

        //Permiso para los botones
        boolean botonEmpleados = false;
        boolean botonMarcaciones = false;
        boolean botonAsignarPermiso = false;
        boolean botonHorarios = false;
        boolean botonRegistroAsistencia = false;

        //Caso de Salidas no Autorizadas (Guardian)
        boolean asignarVacaciones = true;
        boolean tiposPermiso = true;
        boolean horasExtra = true;
        boolean sedeArea = true;

        for (RolAcceso acceso : accesos) {
            if (acceso.getAcceso().getClase().equals("HORARIO")) {
                horario = true;
                botonEmpleados = true;
                botonMarcaciones = true;
                botonHorarios = true;

            } else if (acceso.getAcceso().getClase().equals("PERIODO")) {
                periodo = true;
                botonAsignarPermiso = true;

            } else if (acceso.getAcceso().getClase().equals("PERMISO")) {
                permiso = true;
                botonAsignarPermiso = true;
                if (UsuarioActivo.getUsuario().getRol().getNombre().equals("GUARDIAN")) {

                    asignarVacaciones = false;
                    tiposPermiso = false;
                    botonMarcaciones = false;
                    horasExtra = false;
                    sedeArea = false;
                }

            } else if (acceso.getAcceso().getClase().equals("VACACION")) {
                vacacion = true;
            } else if (acceso.getAcceso().getClase().equals("REPORTES")) {
                reportes = true;
            } else if (acceso.getAcceso().getClase().equals("CONFIGURACION")) {
                configuracion = true;
                botonRegistroAsistencia = true;
            }
        }

        mnuHorario.setEnabled(horario);
        mnuPeriodos.setEnabled(periodo);
//        System.out.println("PERMISO: "+ permiso);
        mnuPermiso.setEnabled(permiso);
        mnuMarcaciones.setEnabled(botonMarcaciones);
        mnuTiposPermiso.setEnabled(tiposPermiso);
        mnuAsignarPermiso.setEnabled(permiso);
        mnuAsignarVacaciones.setEnabled(asignarVacaciones);
        mnuHorasExtra.setEnabled(horasExtra);
        mnuSedesAreas.setEnabled(sedeArea);
        
        mnuReportes.setEnabled(reportes);
//        mnuUsuarios.setEnabled(configuracion);
        mnuConfiguracionBD.setEnabled(configuracion);
//        mnuRolUsuario.setEnabled(configuracion);
        mnuControlUsuario.setEnabled(configuracion);
        
        btnEmpleados.setEnabled(botonEmpleados);
        btnMarcaciones.setEnabled(botonMarcaciones);
        btnAsignarPermiso.setEnabled(botonAsignarPermiso);
        btnHorarios.setEnabled(botonHorarios);
        btnRegistroAsistencia.setEnabled(botonRegistroAsistencia);
    }
}
