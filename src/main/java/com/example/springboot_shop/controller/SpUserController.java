package com.example.springboot_shop.controller;

import com.example.springboot_shop.entity.SpUser;
import com.example.springboot_shop.service.SpUserService;
import com.example.springboot_shop.utils.Response;
import com.example.springboot_shop.utils.ResultFactory;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 会员表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-03-11 17:21:21
 */
@RestController
public class SpUserController {
    @Autowired
    private SpUserService spUserService;

    /**
     * 列表
     */
    @ResponseBody
    @RequestMapping("/users")
    public Response list(String username) {
        PageInfo<SpUser> pageInfo = spUserService.queryPage(username,1,5);
        Map<String,Object> data = new HashMap<>();
        data.put("total",pageInfo.getTotal());
        data.put("pagenum",pageInfo.getPages());
        data.put("users",pageInfo.getList());
        return ResultFactory.buildSuccessResult(data,"获取用户列表成功");
    }


    /**
     * 信息
     */
//    @RequestMapping("/info/{userId}")
//    @RequiresPermissions("sys:spuser:info")
//    public R info(@PathVariable("userId") Integer userId){
//        SpUser spUser = spUserService.getById(userId);
//
//        return R.ok().put("spUser", spUser);
//    }

    /**
     * 保存
     */
//    @RequestMapping("/save")
////    @RequiresPermissions("sys:spuser:save")
//    public R save(@RequestBody SpUser spUser){
//        spUserService.save(spUser);
//
//        return R.ok();
//    }

    /**
     * 修改
     */
//    @RequestMapping("/update")
//    @RequiresPermissions("sys:spuser:update")
//    public R update(@RequestBody SpUser spUser){
//        ValidatorUtils.validateEntity(spUser);
//        spUserService.updateById(spUser);
//
//        return R.ok();
//    }

    /**
     * 删除
     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody Integer[] userIds){
//        spUserService.removeByIds(Arrays.asList(userIds));
//
//        return R.ok();
//    }

}
