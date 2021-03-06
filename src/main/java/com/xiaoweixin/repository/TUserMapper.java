package com.xiaoweixin.repository;

import com.xiaoweixin.dto.TUser;
import com.xiaoweixin.dto.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int countByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int deleteByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int deleteByPrimaryKey(String no);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int insert(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int insertSelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    List<TUser> selectByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    TUser selectByPrimaryKey(String no);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    int updateByPrimaryKey(TUser record);
}