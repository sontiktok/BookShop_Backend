package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ts.theson.spring.BookShop_Backend.entity.HinhAnh;

public interface HinhAnhRepository extends JpaRepository<HinhAnh, Integer> {
}
