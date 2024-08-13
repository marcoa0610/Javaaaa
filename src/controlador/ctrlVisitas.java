package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Visitas;
import vista.frmVisitas;

public class ctrlVisitas implements MouseListener {
 
    //3- Heredar de la clase que se detectan todas las acciones
    
    //1-- Mandar a llamar a las otras capas (modelo y vista)
    private Visitas modelo;
    private frmVisitas vista;
    
    // 2-Crear un constructor
    public ctrlVisitas(Visitas modelo, frmVisitas vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btnAgregar){
        modelo.setNombre(vista.txtNombre.getText());
        modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
        modelo.setEspecialidad(vista.txtEspecialidad.getText());
             modelo.Guardar();
        }
   
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    }
