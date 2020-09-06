package com.cybersolutions.core.customerfeedback;

import com.cybersolutions.core.customerfeedback.dao.CustomerFeedbacksReviewDao;
import com.cybersolutions.core.customerfeedback.services.impl.DefaultCustomerFeedBacksReviewService;
import com.cybersolutions.core.model.CustomerFeedBackReviewsModel;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class DefaultCustomerFeedBacksReviewServiceTest {

    @InjectMocks
    private DefaultCustomerFeedBacksReviewService defaultCustomerFeedBacksReviewService;

    @Mock
    CustomerFeedbacksReviewDao customerFeedbacksReviewDao;

    @Test
    public void checkFeedBackReviewsForCustomerID()
    {
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModels = getCustomerFeedBackReviews();
        when(customerFeedbacksReviewDao.getCustomerFeedbacksReview("customerID")).thenReturn(customerFeedBackReviewsModels);
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModelList = defaultCustomerFeedBacksReviewService.getCustomerFeedBacksReview("customerID");
        assertNotNull(customerFeedBackReviewsModelList);

    }

    @Test
    public void checkFeedBackReviewsForCustomerID_when_null()
    {
        when(customerFeedbacksReviewDao.getCustomerFeedbacksReview("customerID")).thenReturn(null);
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModelList = defaultCustomerFeedBacksReviewService.getCustomerFeedBacksReview("customerID");
        assertEquals(Collections.emptyList(),customerFeedBackReviewsModelList);

    }

    private List<CustomerFeedBackReviewsModel> getCustomerFeedBackReviews() {
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModels = new ArrayList<>();

        CustomerFeedBackReviewsModel customerFeedBackReviewsModel = new CustomerFeedBackReviewsModel();
        customerFeedBackReviewsModel.setComment("comment1");
        customerFeedBackReviewsModel.setHeadline("headline1");
        customerFeedBackReviewsModel.setBlocked(false);
        customerFeedBackReviewsModel.setProduct(new ProductModel());
        customerFeedBackReviewsModel.setRating(5.0);
        customerFeedBackReviewsModel.setUser(new UserModel());

        CustomerFeedBackReviewsModel customerFeedBackReviewsModel1 = new CustomerFeedBackReviewsModel();
        customerFeedBackReviewsModel1.setComment("comment2");
        customerFeedBackReviewsModel1.setHeadline("headline2");
        customerFeedBackReviewsModel1.setBlocked(false);
        customerFeedBackReviewsModel1.setProduct(new ProductModel());
        customerFeedBackReviewsModel1.setRating(4.0);
        customerFeedBackReviewsModel1.setUser(new UserModel());

        customerFeedBackReviewsModels.add(customerFeedBackReviewsModel);
        customerFeedBackReviewsModels.add(customerFeedBackReviewsModel1);

        return customerFeedBackReviewsModels;
    }
}
