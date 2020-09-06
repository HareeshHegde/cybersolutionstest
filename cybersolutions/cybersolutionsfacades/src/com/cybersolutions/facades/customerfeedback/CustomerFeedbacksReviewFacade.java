package com.cybersolutions.facades.customerfeedback;

import com.cybersolutions.facades.customerfeedback.data.CustomerFeedbacksReviewData;

import java.util.List;

public interface CustomerFeedbacksReviewFacade {

    List<CustomerFeedbacksReviewData> getCustomerFeedbacksReviewData(String customerID);
}
