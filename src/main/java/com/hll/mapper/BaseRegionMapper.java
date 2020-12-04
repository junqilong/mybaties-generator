package com.hll.mapper;

import com.hll.model.BaseRegion;
import com.hll.model.BaseRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseRegionMapper {
    long countByExample(BaseRegionExample example);

    int deleteByExample(BaseRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseRegion record);

    int insertSelective(BaseRegion record);

    List<BaseRegion> selectByExample(BaseRegionExample example);

    BaseRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseRegion record, @Param("example") BaseRegionExample example);

    int updateByExample(@Param("record") BaseRegion record, @Param("example") BaseRegionExample example);

    int updateByPrimaryKeySelective(BaseRegion record);

    int updateByPrimaryKey(BaseRegion record);
}