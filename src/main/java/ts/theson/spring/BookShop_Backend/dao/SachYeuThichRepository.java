package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ts.theson.spring.BookShop_Backend.entity.SachYeuThich;
@RepositoryRestResource(path = "sach-yeu-thich")

public interface SachYeuThichRepository  extends JpaRepository<SachYeuThich, Integer> {
}
