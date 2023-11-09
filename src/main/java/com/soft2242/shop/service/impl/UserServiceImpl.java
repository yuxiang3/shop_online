package com.soft2242.shop.service.impl;

import com.soft2242.shop.entity.User;
import com.soft2242.shop.mapper.UserMapper;
import com.soft2242.shop.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuxiang3
 * @since 2023-11-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
