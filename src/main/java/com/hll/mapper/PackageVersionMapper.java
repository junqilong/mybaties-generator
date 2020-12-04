package com.hll.mapper;

import com.hll.model.PackageVersion;
import com.hll.model.PackageVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackageVersionMapper {
    long countByExample(PackageVersionExample example);

    int deleteByExample(PackageVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PackageVersion record);

    int insertSelective(PackageVersion record);

    List<PackageVersion> selectByExample(PackageVersionExample example);

    PackageVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PackageVersion record, @Param("example") PackageVersionExample example);

    int updateByExample(@Param("record") PackageVersion record, @Param("example") PackageVersionExample example);

    int updateByPrimaryKeySelective(PackageVersion record);

    int updateByPrimaryKey(PackageVersion record);
}