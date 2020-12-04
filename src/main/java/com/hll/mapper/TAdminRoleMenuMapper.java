package com.hll.mapper;

import com.hll.model.TAdminRoleMenu;
import com.hll.model.TAdminRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdminRoleMenuMapper {
    long countByExample(TAdminRoleMenuExample example);

    int deleteByExample(TAdminRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAdminRoleMenu record);

    int insertSelective(TAdminRoleMenu record);

    List<TAdminRoleMenu> selectByExample(TAdminRoleMenuExample example);

    TAdminRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAdminRoleMenu record, @Param("example") TAdminRoleMenuExample example);

    int updateByExample(@Param("record") TAdminRoleMenu record, @Param("example") TAdminRoleMenuExample example);

    int updateByPrimaryKeySelective(TAdminRoleMenu record);

    int updateByPrimaryKey(TAdminRoleMenu record);
}