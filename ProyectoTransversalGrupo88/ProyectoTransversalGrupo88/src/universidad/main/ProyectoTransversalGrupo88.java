/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.main;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidad.AccesoAdatos.AlumnoData;
import universidad.AccesoAdatos.Conexion;
import universidad.AccesoAdatos.InscripcionData;
import universidad.AccesoAdatos.MateriaData;
import universidad.Entidades.Alumnos;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materia;

/**
 *
 * @author Lourdes
 */
public class ProyectoTransversalGrupo88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion=Conexion.getConexion();
     //   Alumnos gabriel=new Alumnos(40354456, "santillan", "gabriel", LocalDate.of(2000, 7, 10), true);
       // AlumnoData alu=new AlumnoData();
      //  alu.guardarAlumno(gabriel);
//        Alumnos federico=new Alumnos(42335567,"nadal","federico",LocalDate.of(1998, 8, 7),true);
//        AlumnoData alu=new AlumnoData();
//        alu.guardarAlumno(federico);
        
        
        
      AlumnoData ad =new AlumnoData();
        MateriaData md=new MateriaData();
        InscripcionData ind=new InscripcionData();

//         Alumnos federico =ad.buscarAlumnos(6);
//         Materia lengua =md.buscarMateria(2);
//         Inscripcion inscr= new Inscripcion(federico,lengua,7);
          
          
          
         //ind.guardarInscripcion(inscr);
          
         // ind.actualizarNota(4, 2, 9);
         
         //ind.borrarInscripcionMateriaAlummno(4, 2);
         
//         
//         for(Inscripcion inscripcion: ind.obtenerInscripciones()){
//             System.out.println("id "+ inscripcion.getIdInscripcion());
//             System.out.println("Apellido "+ inscripcion.getAlumno().getApellido());
//             System.out.println("Materia "+ inscripcion.getMateria().getNombre());
//         }
//           for(Inscripcion inscripcion : ind.obtenerIncripcionesPorAlumno()){
//               System.out.println("id"+ inscripcion.getIdInscripcion());
//               System.out.println("Apellido"+ inscripcion.getAlumno().getApellido());
//               System.out.println("Materia"+ inscripcion.getMateria().getNombre());
//               
           
//    for(Materia materia : ind.obtenerMateriasCursadas(1)) {
//     
//        System.out.println("nombre"+materia.getNombre());
//        System.out.println("año"+materia.getAnioMateria());
    }
            
        
    

    
   
       
    }  

    
    

