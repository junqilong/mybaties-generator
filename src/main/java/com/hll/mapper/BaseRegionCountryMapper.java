package com.hll.mapper;

import com.hll.model.BaseRegionCountry;
import com.hll.model.BaseRegionCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseRegionCountryMapper {
    long countByExample(BaseRegionCountryExample example);

    int deleteByExample(BaseRegionCountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseRegionCountry record);

    int insertSelective(BaseRegionCountry record);

    List<BaseRegionCountry> selectByExample(BaseRegionCountryExample example);

    BaseRegionCountry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseRegionCountry record, @Param("example") BaseRegionCountryExample example);

    int updateByExample(@Param("record") BaseRegionCountry record, @Param("example") BaseRegionCountryExample example);

    int updateByPrimaryKeySelective(BaseRegionCountry record);

    int updateByPrimaryKey(BaseRegionCountry record);
}