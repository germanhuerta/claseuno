
package cl.duoc.cinehoytsmarkplanet.Service.Impl;

import cl.duoc.cinehoytsmarkplanet.DTO.PeliculaDTO;
import java.util.List;

public interface IPelicula {
    public void Guardar(PeliculaDTO p);
    public void Editar(PeliculaDTO p);
    public void Eliminar(PeliculaDTO p);
    public List<PeliculaDTO> listar();

    
}
