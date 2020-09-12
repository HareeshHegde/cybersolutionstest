package com.cybersolutions.facades.suggestion.impl;

import com.cybersolutions.core.customerfeedback.services.CustomerFeedBacksReviewService;
import com.cybersolutions.core.model.CustomerFeedBackReviewsModel;
import com.cybersolutions.facades.customerfeedback.data.CustomerFeedbacksReviewData;
import com.cybersolutions.facades.customerfeedback.impl.DefaultCustomerFeedbacksReviewFacade;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.internal.model.impl.LocaleProvider;
import de.hybris.platform.servicelayer.model.AbstractItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContextImpl;
import de.hybris.platform.servicelayer.model.ModelContextUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;

@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class DefaultCustomerFeedbacksReviewFacadeTest {

    @InjectMocks
    private DefaultCustomerFeedbacksReviewFacade defaultCustomerFeedbacksReviewFacade;

    @Mock
    private CustomerFeedBacksReviewService customerFeedBacksReviewService;
    @Mock
    private LocaleProvider localeProvider;

    @Before
    public void setUp(){
        localeProvider = mock(LocaleProvider.class);
        final Locale locale = new Locale("EN");
        given(localeProvider.getCurrentDataLocale()).willReturn(locale);
    }

    @Test
    public void test_getCustomerFeedbacksReviewData(){
        given(customerFeedBacksReviewService.getCustomerFeedBacksReview(anyString())).willReturn(getCustomerFeedBackReviews());
        List<CustomerFeedbacksReviewData> customerFeedbacksReviewData =defaultCustomerFeedbacksReviewFacade.getCustomerFeedbacksReviewData("customerID");
        assertNotNull(customerFeedbacksReviewData);
        assertEquals("product1",customerFeedbacksReviewData.get(0).getProductID());
        assertEquals("product2",customerFeedbacksReviewData.get(1).getProductID());
    }

    private List<CustomerFeedBackReviewsModel> getCustomerFeedBackReviews() {
        List<CustomerFeedBackReviewsModel> customerFeedBackReviewsModels = new ArrayList<>();

        CustomerFeedBackReviewsModel customerFeedBackReviewsModel = new CustomerFeedBackReviewsModel();
        customerFeedBackReviewsModel.setComment("comment1");
        customerFeedBackReviewsModel.setHeadline("headline1");
        customerFeedBackReviewsModel.setBlocked(false);
        ProductModel productModel1 = new ProductModel();
        productModel1.setName("product1",new Locale("EN"));
        getContext(productModel1).setLocaleProvider(localeProvider);
        customerFeedBackReviewsModel.setProduct(productModel1);
        customerFeedBackReviewsModel.setRating(5.0);
        customerFeedBackReviewsModel.setUser(new UserModel());

        CustomerFeedBackReviewsModel customerFeedBackReviewsModel1 = new CustomerFeedBackReviewsModel();
        customerFeedBackReviewsModel1.setComment("comment2");
        customerFeedBackReviewsModel1.setHeadline("headline2");
        customerFeedBackReviewsModel1.setBlocked(false);
        ProductModel productModel2 = new ProductModel();
        productModel2.setName("product2",new Locale("EN"));
        getContext(productModel2).setLocaleProvider(localeProvider);
        customerFeedBackReviewsModel1.setProduct(productModel2);
        customerFeedBackReviewsModel1.setRating(4.0);
        customerFeedBackReviewsModel1.setUser(new UserModel());

        customerFeedBackReviewsModels.add(customerFeedBackReviewsModel);
        customerFeedBackReviewsModels.add(customerFeedBackReviewsModel1);

        return customerFeedBackReviewsModels;
    }

    private ItemModelContextImpl getContext(final AbstractItemModel model)
    {
        return (ItemModelContextImpl) ModelContextUtils.getItemModelContext(model);
    }
}