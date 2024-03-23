package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ts.theson.spring.BookShop_Backend.entity.ChiTietDonHang;
import ts.theson.spring.BookShop_Backend.entity.DonHang;

public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
}
