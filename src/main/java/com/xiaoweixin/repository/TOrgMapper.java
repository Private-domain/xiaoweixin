package com.xiaoweixin.repository;

import com.xiaoweixin.dto.TOrg;
import com.xiaoweixin.dto.TOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int countByExample(TOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int deleteByExample(TOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int deleteByPrimaryKey(String no);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int insert(TOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int insertSelective(TOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    List<TOrg> selectByExample(TOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    TOrg selectByPrimaryKey(String no);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") TOrg record, @Param("example") TOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByExample(@Param("record") TOrg record, @Param("example") TOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByPrimaryKeySelective(TOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_org
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByPrimaryKey(TOrg record);
}