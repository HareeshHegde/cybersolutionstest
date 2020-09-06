package com.cybersolutions.core.customerfeedback.dao.impl;

import com.cybersolutions.core.customerfeedback.dao.CustomerFeedbacksReviewDao;
import com.cybersolutions.core.model.CustomerFeedBackReviewsModel;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.user.UserService;

import javax.annotation.Resource;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import java.util.List;

public class DefaultCustomerFeedbacksReviewsDao extends DefaultGenericDao<CustomerFeedBackReviewsModel> implements CustomerFeedbacksReviewDao {

    @Resource
    UserService userService;


    protected static final String FIND_REVIEWS = "SELECT {" + CustomerFeedBackReviewsModel.PK + "} FROM {" + CustomerFeedBackReviewsModel._TYPECODE + "} WHERE {" + CustomerFeedBackReviewsModel.USER + "} = ?customer AND {"
            + CustomerFeedBackReviewsModel.BLOCKED + "} = ?blocked";

    public DefaultCustomerFeedbacksReviewsDao() {
        super(CustomerFeedBackReviewsModel._TYPECODE);
    }

    @Override
    public List<CustomerFeedBackReviewsModel> getCustomerFeedbacksReview(final String userID) {
            validateParameterNotNull(userID, "User ID must not be null");
            final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_REVIEWS);
            query.addQueryParameter("customer", userService.getUserForUID(userID));
            query.addQueryParameter("blocked", false);
            return getFlexibleSearchService().<CustomerFeedBackReviewsModel> search(query).getResult();
        }
    }
