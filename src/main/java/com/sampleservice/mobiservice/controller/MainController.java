package com.sampleservice.mobiservice.controller;

import com.sampleservice.mobiservice.utils.MBaseUtils;
import com.septemberhx.common.base.MResponse;
import com.septemberhx.mclient.annotation.MApiFunction;
import com.septemberhx.mclient.annotation.MRestApiType;
import com.septemberhx.mclient.base.MObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/11/25
 */
@RestController
public class MainController extends MObject {
    @ResponseBody
    @RequestMapping(value = "/shareBike", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse shareBikeFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/shareBike");

        if (requestData.get("interval") != null) {
            MBaseUtils.generateStringInKBSize(100, result, (int) requestData.get("interval"));
        }
        return result;
    }
}
