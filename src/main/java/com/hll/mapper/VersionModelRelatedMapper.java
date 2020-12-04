package com.hll.mapper;

import com.hll.model.VersionModelRelated;
import com.hll.model.VersionModelRelatedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionModelRelatedMapper {
    long countByExample(VersionModelRelatedExample example);

    int deleteByExample(VersionModelRelatedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VersionModelRelated record);

    int insertSelective(VersionModelRelated record);

    List<VersionModelRelated> selectByExample(VersionModelRelatedExample example);

    VersionModelRelated selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VersionModelRelated record, @Param("example") VersionModelRelatedExample example);

    int updateByExample(@Param("record") VersionModelRelated record, @Param("example") VersionModelRelatedExample example);

    int updateByPrimaryKeySelective(VersionModelRelated record);

    int updateByPrimaryKey(VersionModelRelated record);
}