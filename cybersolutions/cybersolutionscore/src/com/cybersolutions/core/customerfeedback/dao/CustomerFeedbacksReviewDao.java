package com.cybersolutions.core.customerfeedback.dao;

import com.cybersolutions.core.model.CustomerFeedBackReviewsModel;

import java.util.List;

public interface CustomerFeedbacksReviewDao {

    List<CustomerFeedBackReviewsModel> getCustomerFeedbacksReview(String userID);
}
