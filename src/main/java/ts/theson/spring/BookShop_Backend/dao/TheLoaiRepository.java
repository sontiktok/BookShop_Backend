package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ts.theson.spring.BookShop_Backend.entity.TheLoai;

public interface TheLoaiRepository  extends JpaRepository<TheLoai, Integer> {
}