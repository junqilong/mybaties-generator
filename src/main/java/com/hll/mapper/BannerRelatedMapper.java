package com.hll.mapper;

import com.hll.model.BannerRelated;
import com.hll.model.BannerRelatedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerRelatedMapper {
    long countByExample(BannerRelatedExample example);

    int deleteByExample(BannerRelatedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BannerRelated record);

    int insertSelective(BannerRelated record);

    List<BannerRelated> selectByExample(BannerRelatedExample example);

    BannerRelated selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BannerRelated record, @Param("example") BannerRelatedExample example);

    int updateByExample(@Param("record") BannerRelated record, @Param("example") BannerRelatedExample example);

    int updateByPrimaryKeySelective(BannerRelated record);

    int updateByPrimaryKey(BannerRelated record);
}