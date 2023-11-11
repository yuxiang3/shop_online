package com.soft2242.shop.service;

import com.soft2242.shop.vo.LoginResultVO;
import com.soft2242.shop.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.query.UserLoginQuery;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yuxiang3
 * @since 2023-11-09
 */
public interface UserService extends IService<User> {
LoginResultVO login(UserLoginQuery query);


}
