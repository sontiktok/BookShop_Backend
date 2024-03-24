package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ts.theson.spring.BookShop_Backend.entity.ChiTietDonHang;
import ts.theson.spring.BookShop_Backend.entity.DonHang;

@RepositoryRestResource(path = "dong-hang")
public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
}
