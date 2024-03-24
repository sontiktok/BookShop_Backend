package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ts.theson.spring.BookShop_Backend.entity.SuDanhGia;
@RepositoryRestResource(path = "su-danh-gia")
public interface SuDanhGiaRepository  extends JpaRepository<SuDanhGia, Long> {
}
