package com.hll.mapper;

import com.hll.model.AdminMenuButton;
import com.hll.model.AdminMenuButtonExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMenuButtonMapper {
    long countByExample(AdminMenuButtonExample example);

    int deleteByExample(AdminMenuButtonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminMenuButton record);

    int insertSelective(AdminMenuButton record);

    List<AdminMenuButton> selectByExample(AdminMenuButtonExample example);

    AdminMenuButton selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminMenuButton record, @Param("example") AdminMenuButtonExample example);

    int updateByExample(@Param("record") AdminMenuButton record, @Param("example") AdminMenuButtonExample example);

    int updateByPrimaryKeySelective(AdminMenuButton record);

    int updateByPrimaryKey(AdminMenuButton record);
}