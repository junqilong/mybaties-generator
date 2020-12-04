package com.hll.mapper;

import com.hll.model.SubjectRelated;
import com.hll.model.SubjectRelatedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectRelatedMapper {
    long countByExample(SubjectRelatedExample example);

    int deleteByExample(SubjectRelatedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubjectRelated record);

    int insertSelective(SubjectRelated record);

    List<SubjectRelated> selectByExample(SubjectRelatedExample example);

    SubjectRelated selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubjectRelated record, @Param("example") SubjectRelatedExample example);

    int updateByExample(@Param("record") SubjectRelated record, @Param("example") SubjectRelatedExample example);

    int updateByPrimaryKeySelective(SubjectRelated record);

    int updateByPrimaryKey(SubjectRelated record);
}