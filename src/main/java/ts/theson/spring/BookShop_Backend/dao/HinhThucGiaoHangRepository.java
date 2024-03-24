package ts.theson.spring.BookShop_Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ts.theson.spring.BookShop_Backend.entity.HinhThucGiaoHang;
@RepositoryRestResource(path = "hinh-thuc-giao-hang")
public interface HinhThucGiaoHangRepository  extends JpaRepository<HinhThucGiaoHang, Integer> {
}
