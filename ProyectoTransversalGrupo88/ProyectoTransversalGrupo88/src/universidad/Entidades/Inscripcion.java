/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.Entidades;

/**
 *
 * @author Lourdes
 */
public class Inscripcion {
    private int idInscripcion;
    private Alumnos alumno;
    private Materia materia;
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumnos alumno, Materia materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumnos alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

  
    

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
      
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", alumno=" + alumno.getApellido() + ", materia=" + materia.getNombre() + ", nota=" + nota + '}';
    }
}
