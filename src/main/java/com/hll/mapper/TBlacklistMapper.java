package com.hll.mapper;

import com.hll.model.TBlacklist;
import com.hll.model.TBlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBlacklistMapper {
    long countByExample(TBlacklistExample example);

    int deleteByExample(TBlacklistExample example);

    int insert(TBlacklist record);

    int insertSelective(TBlacklist record);

    List<TBlacklist> selectByExample(TBlacklistExample example);

    int updateByExampleSelective(@Param("record") TBlacklist record, @Param("example") TBlacklistExample example);

    int updateByExample(@Param("record") TBlacklist record, @Param("example") TBlacklistExample example);
}