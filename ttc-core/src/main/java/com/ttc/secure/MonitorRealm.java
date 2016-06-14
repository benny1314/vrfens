package com.ttc.secure;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.sql.Connection;

/**
 * @author by benny on 2016/2/1.
 * @version 1.0
 * @description 权限认证的realm
 */
public class MonitorRealm extends AuthorizingRealm {

    /*
     * 为当前登陆用户授予角色和权限，根据当前用户名获取用户的角色和权限
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //此时已经登陆成功
        //
        String userName = String.valueOf(principals.getPrimaryPrincipal());
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Connection conn = null;
        try {
//            conn = new DbUtil().getCon();
            //authorizationInfo.setRoles(userService.getRoles(conn,userName));
            //authorizationInfo.setStringPermissions(userDao.getPermissions(conn,userName));


        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
//            new DbUtil().closeCon(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return authorizationInfo;
    }

    /*
     *验证当前登陆的用户，根据token得到用户信息
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        /*String username = String.valueOf(token.getPrincipal());
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(username);
        List<User> users = userServiceImpl.selectByExample(example);
        User user = users.get(0);
        if (user != null) {
            AuthenticationInfo authInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), getName());
            return authInfo;
        } else {
            return null;
        }*/
        return null;
    }
}
