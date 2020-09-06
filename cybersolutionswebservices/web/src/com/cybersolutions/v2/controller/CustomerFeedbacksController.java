package com.cybersolutions.v2.controller;

import com.cybersolutions.facades.customerfeedback.CustomerFeedbacksReviewFacade;
import com.cybersolutions.facades.customerfeedback.data.CustomerFeedbacksReviewData;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/{baseSiteId}/customer/feedbacks")
@Api(tags = "CustomerFeedbacksReview")
public class CustomerFeedbacksController {

    @Resource
    CustomerFeedbacksReviewFacade customerFeedbacksReviewFacade;

    @RequestMapping(value="/review",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getCustomerFeedbacksReview", value = "Get customer's feedback", notes = "Returns customer's feedbacks.")
    @ApiBaseSiteIdParam
    @ApiResponse(code = 200, message = "List of customer's feedback")
    public List<CustomerFeedbacksReviewData> getCustomerFeedbacksReview(
            @ApiParam(value = "Customer ID",required = true) @RequestParam final String userId)
    {
        return customerFeedbacksReviewFacade.getCustomerFeedbacksReviewData(userId);
    }
}
