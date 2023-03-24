
package pckMain;
import Vistas.*;
import Modelo.*;
import Controladores.*;
public class main {

   
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        PacientesModel ModeloPacientes = new PacientesModel();
        PacientesController ControladorPaciente = new PacientesController(VistaPrincipal, ModeloPacientes);
        
    }
    
}
