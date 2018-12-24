package com.example.demo.service;

import com.wordnik.swagger.annotations.ApiOperation;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.cloud.mwclient.servmeta.annotation.ApiParam;
import com.yonyou.cloud.mwclient.servmeta.annotation.ApiReturnValue;

@RemoteCall(AppInfoConstant.APP_INF_PROVIDER)
public interface IUserService {
    /**
     * 远程获取echart的各种图表的json数据
     *
     * @param type line/pie/bar
     * @return echarts的json数据
     */
    @ApiOperation("根据类型获取各种echarts图表的数据")
    public @ApiReturnValue(name="json 数据", description="user 需要的option数据") String getUserDataByType(@ApiParam(name="类型", required=true, description="类型数据文件前缀，如bar、pie、line等", exampleValue="line") String type) throws Exception;

}
