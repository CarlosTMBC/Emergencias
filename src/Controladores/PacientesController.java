
package Controladores;

import Modelo.PacientesModel;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PacientesController implements ActionListener {
frmPrincipal VistaPrincipal;
PacientesModel ModeloPacientes;

    public PacientesController(frmPrincipal VistaPrincipal, PacientesModel ModeloPacientes) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloPacientes = ModeloPacientes;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnAtender.addActionListener(this);
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        //lEVANTAR FORMULARIO
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnIngresar)
        {
            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(),
                    this.VistaPrincipal.txtNombre.getText(), this.VistaPrincipal.txtTelefono.getText(), 
                    Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));
            this.VistaPrincipal.jtPacientes.setModel(this.ModeloPacientes.ListarPacientes());
        }
        
        if(e.getSource()==this.VistaPrincipal.btnAtender)
        {
            
        }
    }
    
}
