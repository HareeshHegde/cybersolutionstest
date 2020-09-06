package com.cybersolutions.core.customerfeedback.services;

import com.cybersolutions.core.model.CustomerFeedBackReviewsModel;

import java.util.List;

public interface CustomerFeedBacksReviewService {

    List<CustomerFeedBackReviewsModel> getCustomerFeedBacksReview(String customerID);
}
