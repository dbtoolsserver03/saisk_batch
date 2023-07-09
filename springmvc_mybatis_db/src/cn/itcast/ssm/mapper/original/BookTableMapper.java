package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.BookTable;

public interface BookTableMapper {
    int deleteByPrimaryKey(String bookId);

    int insert(BookTable record);

    int insertSelective(BookTable record);

    BookTable selectByPrimaryKey(String bookId);

    int updateByPrimaryKeySelective(BookTable record);

    int updateByPrimaryKey(BookTable record);
}