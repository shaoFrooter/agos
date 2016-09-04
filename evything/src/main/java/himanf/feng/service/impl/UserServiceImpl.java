package himanf.feng.service.impl;

import himanf.feng.dao.UserInfoMapper;
import himanf.feng.model.UserInfo;
import himanf.feng.model.UserInfoExample;
import himanf.feng.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sfeng on 2016/8/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfoMapper getUserInfoMapper() {
        return userInfoMapper;
    }

    public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public int countByExample(UserInfoExample example) {
        return 0;
    }

    public int deleteByExample(UserInfoExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(String name) {
        return 0;
    }

    public int insert(UserInfo record) {
        return this.userInfoMapper.insert(record);
    }

    public int insertSelective(UserInfo record) {
        return 0;
    }

    public List<UserInfo> selectByExample(UserInfoExample example) {
        return null;
    }

    public UserInfo selectByPrimaryKey(String name) {
        return null;
    }

    public int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example) {
        return 0;
    }

    public int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(UserInfo record) {
        return 0;
    }

    public int updateByPrimaryKey(UserInfo record) {
        return 0;
    }
}
