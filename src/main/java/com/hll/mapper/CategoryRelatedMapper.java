package com.hll.mapper;

import com.hll.model.CategoryRelated;
import com.hll.model.CategoryRelatedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryRelatedMapper {
    long countByExample(CategoryRelatedExample example);

    int deleteByExample(CategoryRelatedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CategoryRelated record);

    int insertSelective(CategoryRelated record);

    List<CategoryRelated> selectByExample(CategoryRelatedExample example);

    CategoryRelated selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CategoryRelated record, @Param("example") CategoryRelatedExample example);

    int updateByExample(@Param("record") CategoryRelated record, @Param("example") CategoryRelatedExample example);

    int updateByPrimaryKeySelective(CategoryRelated record);

    int updateByPrimaryKey(CategoryRelated record);
}