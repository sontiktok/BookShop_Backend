package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ts.theson.spring.BookShop_Backend.entity.HinhThucThanhToan;
@RepositoryRestResource(path = "hinh-thuc-thanh-toan")
public interface HinhThucThanhToanRepository  extends JpaRepository<HinhThucThanhToan, Integer> {
}
