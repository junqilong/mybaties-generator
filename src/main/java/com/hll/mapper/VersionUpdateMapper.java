package com.hll.mapper;

import com.hll.model.VersionUpdate;
import com.hll.model.VersionUpdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionUpdateMapper {
    long countByExample(VersionUpdateExample example);

    int deleteByExample(VersionUpdateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VersionUpdate record);

    int insertSelective(VersionUpdate record);

    List<VersionUpdate> selectByExampleWithBLOBs(VersionUpdateExample example);

    List<VersionUpdate> selectByExample(VersionUpdateExample example);

    VersionUpdate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VersionUpdate record, @Param("example") VersionUpdateExample example);

    int updateByExampleWithBLOBs(@Param("record") VersionUpdate record, @Param("example") VersionUpdateExample example);

    int updateByExample(@Param("record") VersionUpdate record, @Param("example") VersionUpdateExample example);

    int updateByPrimaryKeySelective(VersionUpdate record);

    int updateByPrimaryKeyWithBLOBs(VersionUpdate record);

    int updateByPrimaryKey(VersionUpdate record);
}