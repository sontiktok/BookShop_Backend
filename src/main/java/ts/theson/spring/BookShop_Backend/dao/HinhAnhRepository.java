package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ts.theson.spring.BookShop_Backend.entity.HinhAnh;
@RepositoryRestResource(path = "hinh-anh")
public interface HinhAnhRepository extends JpaRepository<HinhAnh, Integer> {
}
