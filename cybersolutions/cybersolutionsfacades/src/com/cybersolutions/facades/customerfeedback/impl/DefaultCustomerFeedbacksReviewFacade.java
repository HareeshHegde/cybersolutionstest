package com.cybersolutions.facades.customerfeedback.impl;

import com.cybersolutions.core.customerfeedback.services.CustomerFeedBacksReviewService;
import com.cybersolutions.core.model.CustomerFeedBackReviewsModel;
import com.cybersolutions.facades.customerfeedback.CustomerFeedbacksReviewFacade;
import com.cybersolutions.facades.customerfeedback.data.CustomerFeedbacksReviewData;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultCustomerFeedbacksReviewFacade implements CustomerFeedbacksReviewFacade {

    private CustomerFeedBacksReviewService customerFeedBacksReviewService;

    @Override
    public List<CustomerFeedbacksReviewData> getCustomerFeedbacksReviewData(final String customerID) {
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModels = customerFeedBacksReviewService
                .getCustomerFeedBacksReview(customerID);
        if (CollectionUtils.isNotEmpty(customerFeedBackReviewsModels)) {
            return customerFeedBackReviewsModels.stream().map(this::setCustomerFeedBacksData).collect(
                    Collectors.toList());
        }
        return Collections.emptyList();
    }

    private CustomerFeedbacksReviewData setCustomerFeedBacksData(
            final CustomerFeedBackReviewsModel customerFeedBackReviewsModel) {
        //we can use populators over here to set the data. Since we are not reusing in this test I have not used populators
        CustomerFeedbacksReviewData customerFeedbacksReviewData = new CustomerFeedbacksReviewData();
        customerFeedbacksReviewData.setBlocked(customerFeedBackReviewsModel.getBlocked());
        customerFeedbacksReviewData.setComment(customerFeedBackReviewsModel.getComment());
        customerFeedbacksReviewData.setHeadline(customerFeedBackReviewsModel.getHeadline());
        customerFeedbacksReviewData.setRating(customerFeedBackReviewsModel.getRating());
        customerFeedbacksReviewData.setProductID(customerFeedBackReviewsModel.getProduct().getName());

        return customerFeedbacksReviewData;
    }

    @Required
    public void setCustomerFeedBacksReviewService(
            final CustomerFeedBacksReviewService customerFeedBacksReviewService) {
        this.customerFeedBacksReviewService = customerFeedBacksReviewService;
    }

}
