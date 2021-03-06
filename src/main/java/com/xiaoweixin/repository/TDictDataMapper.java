package com.xiaoweixin.repository;

import com.xiaoweixin.dto.TDictData;
import com.xiaoweixin.dto.TDictDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDictDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int countByExample(TDictDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int deleteByExample(TDictDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int insert(TDictData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int insertSelective(TDictData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    List<TDictData> selectByExample(TDictDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    TDictData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") TDictData record, @Param("example") TDictDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByExample(@Param("record") TDictData record, @Param("example") TDictDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByPrimaryKeySelective(TDictData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_data
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByPrimaryKey(TDictData record);
}