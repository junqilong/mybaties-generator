package com.hll.mapper;

import com.hll.model.TUpgrade;
import com.hll.model.TUpgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUpgradeMapper {
    long countByExample(TUpgradeExample example);

    int deleteByExample(TUpgradeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUpgrade record);

    int insertSelective(TUpgrade record);

    List<TUpgrade> selectByExample(TUpgradeExample example);

    TUpgrade selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUpgrade record, @Param("example") TUpgradeExample example);

    int updateByExample(@Param("record") TUpgrade record, @Param("example") TUpgradeExample example);

    int updateByPrimaryKeySelective(TUpgrade record);

    int updateByPrimaryKey(TUpgrade record);
}