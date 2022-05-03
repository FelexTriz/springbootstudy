package com.fqj;

import com.fqj.dao.BookDao;
import com.fqj.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Springboot15SqlApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void tt(){
        bookDao.selectById(5);
    }
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void test(){
        String sql = "select * from tbl_book ";
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
//        System.out.println(maps);
        RowMapper<Book> rm = new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book tmp = new Book();
                tmp.setId(rs.getInt("id"));
                tmp.setType(rs.getString("type"));
                tmp.setName(rs.getString("name"));
                tmp.setDescription(rs.getString("description"));
                return tmp;
            }
        };
        List<Book> query = jdbcTemplate.query(sql, rm);
        System.out.println(query);
    }
    @Test
    void testInsert(){
        String sql = "insert into tbl_book values(5,'dsa','dsada','dsada')";
        jdbcTemplate.update(sql);
    }

}
