package com.hll.mapper;

import com.hll.model.TModel;
import com.hll.model.TModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TModelMapper {
    long countByExample(TModelExample example);

    int deleteByExample(TModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TModel record);

    int insertSelective(TModel record);

    List<TModel> selectByExample(TModelExample example);

    TModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TModel record, @Param("example") TModelExample example);

    int updateByExample(@Param("record") TModel record, @Param("example") TModelExample example);

    int updateByPrimaryKeySelective(TModel record);

    int updateByPrimaryKey(TModel record);
}