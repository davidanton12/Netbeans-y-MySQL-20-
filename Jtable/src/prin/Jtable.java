
package prin;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jtable extends javax.swing.JFrame {

    private JTextField txtNombre, txtApellido, txtFechaNacimiento, txtEstadoCivil, txtEstado, txtTipoDocumento, txtNumeroDocumento, txtBuscar;
    private JButton btnGuardar, btnModificar, btnEliminar, btnBuscar, btnSalir;

    public Jtable() {
        setTitle("Registro de Estudiantes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Inicializar componentes
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 100, 25);
        add(lblNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(150, 20, 200, 25);
        add(txtNombre);
        
        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(20, 60, 100, 25);
        add(lblApellido);
        
        txtApellido = new JTextField();
        txtApellido.setBounds(150, 60, 200, 25);
        add(txtApellido);
        
        JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
        lblFechaNacimiento.setBounds(20, 100, 120, 25);
        add(lblFechaNacimiento);
        
        txtFechaNacimiento = new JTextField();
        txtFechaNacimiento.setBounds(150, 100, 200, 25);
        add(txtFechaNacimiento);
        
        JLabel lblEstadoCivil = new JLabel("Estado Civil:");
        lblEstadoCivil.setBounds(20, 140, 100, 25);
        add(lblEstadoCivil);
        
        txtEstadoCivil = new JTextField();
        txtEstadoCivil.setBounds(150, 140, 200, 25);
        add(txtEstadoCivil);
        
        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(20, 180, 100, 25);
        add(lblEstado);
        
        txtEstado = new JTextField();
        txtEstado.setBounds(150, 180, 200, 25);
        add(txtEstado);
        
        JLabel lblTipoDocumento = new JLabel("Tipo Documento:");
        lblTipoDocumento.setBounds(20, 220, 120, 25);
        add(lblTipoDocumento);
        
        txtTipoDocumento = new JTextField();
        txtTipoDocumento.setBounds(150, 220, 200, 25);
        add(txtTipoDocumento);
        
        JLabel lblNumeroDocumento = new JLabel("Número Documento:");
        lblNumeroDocumento.setBounds(20, 260, 150, 25);
        add(lblNumeroDocumento);
        
        txtNumeroDocumento = new JTextField();
        txtNumeroDocumento.setBounds(150, 260, 200, 25);
        add(txtNumeroDocumento);
        
        // Botones
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(20, 300, 80, 30);
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para guardar el estudiante
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea guardar este registro?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    // Código para guardar en la base de datos
                }
            }
        });
        add(btnGuardar);
        
        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(120, 300, 100, 30);
        btnModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para modificar el estudiante
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea modificar este registro?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    // Código para modificar en la base de datos
                }
            }
        });
        add(btnModificar);
        
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(240, 300, 100, 30);
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar el estudiante
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este registro?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    // Código para eliminar en la base de datos
                }
            }
        });
        add(btnEliminar);
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(20, 340, 80, 30);
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para buscar el estudiante
                // Implementar búsqueda y mostrar resultados
            }
        });
        add(btnBuscar);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(120, 340, 80, 30);
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(btnSalir);
        
        // Campo de búsqueda
        txtBuscar = new JTextField();
        txtBuscar.setBounds(240, 340, 150, 30);
        add(txtBuscar);
        
        setVisible(true);
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
