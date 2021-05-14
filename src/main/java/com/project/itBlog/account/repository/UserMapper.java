package com.project.itBlog.account.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    String getUserId(@Param("phone") String phone);

    void updatePassword(@Param("id") String id, @Param("password") String newPassword);
}
