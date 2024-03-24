package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ts.theson.spring.BookShop_Backend.entity.TheLoai;
@RepositoryRestResource(path = "the-loai")
public interface TheLoaiRepository  extends JpaRepository<TheLoai, Integer> {
}
