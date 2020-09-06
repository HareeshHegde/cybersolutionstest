package com.cybersolutions.core.customerfeedback;

import com.cybersolutions.core.customerfeedback.dao.impl.DefaultCustomerFeedbacksReviewsDao;
import com.cybersolutions.core.model.CustomerFeedBackReviewsModel;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.junit.Assert.assertNotNull;

@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class DefaultCustomerFeedbacksReviewsDaoTest {

    @Mock
    private FlexibleSearchService flexibleSearchService;

    @Mock
    private UserService userService;

    @Mock
    UserModel userModel;

    @InjectMocks
    private DefaultCustomerFeedbacksReviewsDao defaultCustomerFeedbacksReviewsDao;


    @Test
    public void checkFeedBackReviewsForCustomerID()
    {
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModels = getCustomerFeedBackReviews();
        final SearchResult searchResult = mock(SearchResult.class);
        when(flexibleSearchService.search(Matchers.any(FlexibleSearchQuery.class))).thenReturn(searchResult);
        when(searchResult.getResult()).thenReturn(customerFeedBackReviewsModels);
        when(userService.getUserForUID("customerID")).thenReturn(userModel);
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModelList = defaultCustomerFeedbacksReviewsDao.getCustomerFeedbacksReview("customerID");
        assertNotNull(customerFeedBackReviewsModelList);


    }

    @Test
    public void checkFeedBackReviewsForCustomerID_when_not_found()
    {
        final SearchResult searchResult = mock(SearchResult.class);
        when(flexibleSearchService.search(Matchers.any(FlexibleSearchQuery.class))).thenReturn(searchResult);
        when(searchResult.getResult()).thenReturn(null);
        when(userService.getUserForUID("customerID")).thenReturn(userModel);
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModelList = defaultCustomerFeedbacksReviewsDao.getCustomerFeedbacksReview("customerID");
        assertNull(customerFeedBackReviewsModelList);


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
