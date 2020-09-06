package com.cybersolutions.core.customerfeedback.services.impl;

import com.cybersolutions.core.customerfeedback.dao.CustomerFeedbacksReviewDao;
import com.cybersolutions.core.customerfeedback.services.CustomerFeedBacksReviewService;
import com.cybersolutions.core.model.CustomerFeedBackReviewsModel;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import java.util.Collections;
import java.util.List;

public class DefaultCustomerFeedBacksReviewService implements CustomerFeedBacksReviewService {

    private CustomerFeedbacksReviewDao customerFeedBacksReviewDao;
    @Override
    public List<CustomerFeedBackReviewsModel> getCustomerFeedBacksReview(final String customerID) {
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModels = customerFeedBacksReviewDao.getCustomerFeedbacksReview(customerID);
        if(CollectionUtils.isNotEmpty(customerFeedBackReviewsModels)){
            return customerFeedBackReviewsModels;
        }
        return Collections.emptyList();
    }

    @Required
    public void setCustomerFeedBacksReviewDao(
            final CustomerFeedbacksReviewDao customerFeedBacksReviewDao) {
        this.customerFeedBacksReviewDao = customerFeedBacksReviewDao;
    }
}
