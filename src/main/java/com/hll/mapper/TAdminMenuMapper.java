package com.hll.mapper;

import com.hll.model.TAdminMenu;
import com.hll.model.TAdminMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdminMenuMapper {
    long countByExample(TAdminMenuExample example);

    int deleteByExample(TAdminMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAdminMenu record);

    int insertSelective(TAdminMenu record);

    List<TAdminMenu> selectByExample(TAdminMenuExample example);

    TAdminMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAdminMenu record, @Param("example") TAdminMenuExample example);

    int updateByExample(@Param("record") TAdminMenu record, @Param("example") TAdminMenuExample example);

    int updateByPrimaryKeySelective(TAdminMenu record);

    int updateByPrimaryKey(TAdminMenu record);
}