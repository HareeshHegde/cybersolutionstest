/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 6, 2020 3:08:36 AM                      ---
 * ----------------------------------------------------------------
 */
package com.cybersolutions.core.jalo;

import com.cybersolutions.core.constants.CybersolutionsCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cybersolutions.core.jalo.CustomerFeedBackReviews CustomerFeedBackReviews}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomerFeedBackReviews extends GenericItem
{
	/** Qualifier of the <code>CustomerFeedBackReviews.headline</code> attribute **/
	public static final String HEADLINE = "headline";
	/** Qualifier of the <code>CustomerFeedBackReviews.comment</code> attribute **/
	public static final String COMMENT = "comment";
	/** Qualifier of the <code>CustomerFeedBackReviews.blocked</code> attribute **/
	public static final String BLOCKED = "blocked";
	/** Qualifier of the <code>CustomerFeedBackReviews.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>CustomerFeedBackReviews.user</code> attribute **/
	public static final String USER = "user";
	/** Qualifier of the <code>CustomerFeedBackReviews.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n USER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCustomerFeedBackReviews> USERHANDLER = new BidirectionalOneToManyHandler<GeneratedCustomerFeedBackReviews>(
	CybersolutionsCoreConstants.TC.CUSTOMERFEEDBACKREVIEWS,
	false,
	"user",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCustomerFeedBackReviews> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedCustomerFeedBackReviews>(
	CybersolutionsCoreConstants.TC.CUSTOMERFEEDBACKREVIEWS,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(HEADLINE, AttributeMode.INITIAL);
		tmp.put(COMMENT, AttributeMode.INITIAL);
		tmp.put(BLOCKED, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		tmp.put(USER, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.blocked</code> attribute.
	 * @return the blocked - Defines whether the feedback should be blocked
	 */
	public Boolean isBlocked(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BLOCKED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.blocked</code> attribute.
	 * @return the blocked - Defines whether the feedback should be blocked
	 */
	public Boolean isBlocked()
	{
		return isBlocked( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.blocked</code> attribute. 
	 * @return the blocked - Defines whether the feedback should be blocked
	 */
	public boolean isBlockedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBlocked( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.blocked</code> attribute. 
	 * @return the blocked - Defines whether the feedback should be blocked
	 */
	public boolean isBlockedAsPrimitive()
	{
		return isBlockedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.blocked</code> attribute. 
	 * @param value the blocked - Defines whether the feedback should be blocked
	 */
	public void setBlocked(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BLOCKED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.blocked</code> attribute. 
	 * @param value the blocked - Defines whether the feedback should be blocked
	 */
	public void setBlocked(final Boolean value)
	{
		setBlocked( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.blocked</code> attribute. 
	 * @param value the blocked - Defines whether the feedback should be blocked
	 */
	public void setBlocked(final SessionContext ctx, final boolean value)
	{
		setBlocked( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.blocked</code> attribute. 
	 * @param value the blocked - Defines whether the feedback should be blocked
	 */
	public void setBlocked(final boolean value)
	{
		setBlocked( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.comment</code> attribute.
	 * @return the comment - Feedback of the customer
	 */
	public String getComment(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.comment</code> attribute.
	 * @return the comment - Feedback of the customer
	 */
	public String getComment()
	{
		return getComment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.comment</code> attribute. 
	 * @param value the comment - Feedback of the customer
	 */
	public void setComment(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.comment</code> attribute. 
	 * @param value the comment - Feedback of the customer
	 */
	public void setComment(final String value)
	{
		setComment( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		USERHANDLER.newInstance(ctx, allAttributes);
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.headline</code> attribute.
	 * @return the headline - Headline for the customer feed back review
	 */
	public String getHeadline(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.headline</code> attribute.
	 * @return the headline - Headline for the customer feed back review
	 */
	public String getHeadline()
	{
		return getHeadline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.headline</code> attribute. 
	 * @param value the headline - Headline for the customer feed back review
	 */
	public void setHeadline(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.headline</code> attribute. 
	 * @param value the headline - Headline for the customer feed back review
	 */
	public void setHeadline(final String value)
	{
		setHeadline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.product</code> attribute. 
	 * @param value the product
	 */
	protected void setProduct(final SessionContext ctx, final Product value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+PRODUCT+"' is not changeable", 0 );
		}
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.product</code> attribute. 
	 * @param value the product
	 */
	protected void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.rating</code> attribute.
	 * @return the rating - rating given to the product
	 */
	public Double getRating(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.rating</code> attribute.
	 * @return the rating - rating given to the product
	 */
	public Double getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.rating</code> attribute. 
	 * @return the rating - rating given to the product
	 */
	public double getRatingAsPrimitive(final SessionContext ctx)
	{
		Double value = getRating( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.rating</code> attribute. 
	 * @return the rating - rating given to the product
	 */
	public double getRatingAsPrimitive()
	{
		return getRatingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.rating</code> attribute. 
	 * @param value the rating - rating given to the product
	 */
	public void setRating(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.rating</code> attribute. 
	 * @param value the rating - rating given to the product
	 */
	public void setRating(final Double value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.rating</code> attribute. 
	 * @param value the rating - rating given to the product
	 */
	public void setRating(final SessionContext ctx, final double value)
	{
		setRating( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.rating</code> attribute. 
	 * @param value the rating - rating given to the product
	 */
	public void setRating(final double value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.user</code> attribute.
	 * @return the user
	 */
	public User getUser(final SessionContext ctx)
	{
		return (User)getProperty( ctx, USER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerFeedBackReviews.user</code> attribute.
	 * @return the user
	 */
	public User getUser()
	{
		return getUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final SessionContext ctx, final User value)
	{
		USERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerFeedBackReviews.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final User value)
	{
		setUser( getSession().getSessionContext(), value );
	}
	
}
