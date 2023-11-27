package cl.duoc.cinehoytsmarkplanet.Service;

import cl.duoc.cinehoytsmarkplanet.DAO.ConexionBD;
import cl.duoc.cinehoytsmarkplanet.DTO.PeliculaDTO;
import cl.duoc.cinehoytsmarkplanet.Service.Impl.IPelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class PeliculaService implements IPelicula {

    private Connection conexion;

    public PeliculaService() {
        ConexionBD conexionBD = new ConexionBD();
        this.conexion = conexionBD.getConnection(); 
    }

    @Override
    public void Guardar(PeliculaDTO p) {
        try {
            String query = "INSERT INTO movie (Titulo, Director, Anio, Duracion, Genero) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
                preparedStatement.setString(1, p.getTitulo());
                preparedStatement.setString(2, p.getDirector());
                preparedStatement.setString(3, p.getAnio());
                preparedStatement.setString(4, p.getDuracion());
                preparedStatement.setString(5, p.getGenero());

                preparedStatement.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Se ha guardado " + p + " exitosamente!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la película: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void Editar(PeliculaDTO p) {
        try {
            String query = "UPDATE movie SET Titulo=?, Director=?, Anio=?, Duracion=?, Genero=? WHERE ID=?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
                preparedStatement.setString(1, p.getTitulo());
                preparedStatement.setString(2, p.getDirector());
                preparedStatement.setString(3, p.getAnio());
                preparedStatement.setString(4, p.getDuracion());
                preparedStatement.setString(5, p.getGenero());

                preparedStatement.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Se ha editado " + p + " exitosamente!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar la película: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void Eliminar(PeliculaDTO p) {
        try {
            String query = "DELETE FROM movie WHERE ID=?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
                preparedStatement.setString(1, p.getTitulo());
                preparedStatement.setString(2, p.getDirector());
                preparedStatement.setString(3, p.getAnio());
                preparedStatement.setString(4, p.getDuracion());
                preparedStatement.setString(5, p.getGenero());

                preparedStatement.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Se ha editado " + p + " exitosamente!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la película: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    @Override
    public List<PeliculaDTO> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
