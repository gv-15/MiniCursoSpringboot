package CursoSpringboot.Angular.Inventarios.repositorio;

import CursoSpringboot.Angular.Inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
