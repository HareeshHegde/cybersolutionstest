/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 6, 2020 3:08:36 AM                      ---
 * ----------------------------------------------------------------
 */
package com.cybersolutions.core.jalo;

import com.cybersolutions.core.constants.CybersolutionsCoreConstants;
import com.cybersolutions.core.jalo.ApparelProduct;
import com.cybersolutions.core.jalo.ApparelSizeVariantProduct;
import com.cybersolutions.core.jalo.ApparelStyleVariantProduct;
import com.cybersolutions.core.jalo.CustomerFeedBackReviews;
import com.cybersolutions.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CybersolutionsCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCybersolutionsCoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CUSTOMERFEEDBACKREVIEWS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CustomerFeedBackReviews> USER2CUSTOMERFEEDBACKREVIEWSCUSTOMERFEEDBACKREVIEWSHANDLER = new OneToManyHandler<CustomerFeedBackReviews>(
	CybersolutionsCoreConstants.TC.CUSTOMERFEEDBACKREVIEWS,
	true,
	"user",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CUSTOMERFEEDBACK's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CustomerFeedBackReviews> CUSTOMERFEEDBACKREVIEWS2PRODUCTRELCUSTOMERFEEDBACKHANDLER = new OneToManyHandler<CustomerFeedBackReviews>(
	CybersolutionsCoreConstants.TC.CUSTOMERFEEDBACKREVIEWS,
	true,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CybersolutionsCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CybersolutionsCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CybersolutionsCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomerFeedBackReviews createCustomerFeedBackReviews(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CybersolutionsCoreConstants.TC.CUSTOMERFEEDBACKREVIEWS );
			return (CustomerFeedBackReviews)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerFeedBackReviews : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerFeedBackReviews createCustomerFeedBackReviews(final Map attributeValues)
	{
		return createCustomerFeedBackReviews( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CybersolutionsCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customerfeedback</code> attribute.
	 * @return the customerfeedback
	 */
	public Collection<CustomerFeedBackReviews> getCustomerfeedback(final SessionContext ctx, final Product item)
	{
		return CUSTOMERFEEDBACKREVIEWS2PRODUCTRELCUSTOMERFEEDBACKHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customerfeedback</code> attribute.
	 * @return the customerfeedback
	 */
	public Collection<CustomerFeedBackReviews> getCustomerfeedback(final Product item)
	{
		return getCustomerfeedback( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customerfeedback</code> attribute. 
	 * @param value the customerfeedback
	 */
	public void setCustomerfeedback(final SessionContext ctx, final Product item, final Collection<CustomerFeedBackReviews> value)
	{
		CUSTOMERFEEDBACKREVIEWS2PRODUCTRELCUSTOMERFEEDBACKHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customerfeedback</code> attribute. 
	 * @param value the customerfeedback
	 */
	public void setCustomerfeedback(final Product item, final Collection<CustomerFeedBackReviews> value)
	{
		setCustomerfeedback( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customerfeedback. 
	 * @param value the item to add to customerfeedback
	 */
	public void addToCustomerfeedback(final SessionContext ctx, final Product item, final CustomerFeedBackReviews value)
	{
		CUSTOMERFEEDBACKREVIEWS2PRODUCTRELCUSTOMERFEEDBACKHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customerfeedback. 
	 * @param value the item to add to customerfeedback
	 */
	public void addToCustomerfeedback(final Product item, final CustomerFeedBackReviews value)
	{
		addToCustomerfeedback( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customerfeedback. 
	 * @param value the item to remove from customerfeedback
	 */
	public void removeFromCustomerfeedback(final SessionContext ctx, final Product item, final CustomerFeedBackReviews value)
	{
		CUSTOMERFEEDBACKREVIEWS2PRODUCTRELCUSTOMERFEEDBACKHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customerfeedback. 
	 * @param value the item to remove from customerfeedback
	 */
	public void removeFromCustomerfeedback(final Product item, final CustomerFeedBackReviews value)
	{
		removeFromCustomerfeedback( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.customerfeedbackreviews</code> attribute.
	 * @return the customerfeedbackreviews
	 */
	public Collection<CustomerFeedBackReviews> getCustomerfeedbackreviews(final SessionContext ctx, final User item)
	{
		return USER2CUSTOMERFEEDBACKREVIEWSCUSTOMERFEEDBACKREVIEWSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.customerfeedbackreviews</code> attribute.
	 * @return the customerfeedbackreviews
	 */
	public Collection<CustomerFeedBackReviews> getCustomerfeedbackreviews(final User item)
	{
		return getCustomerfeedbackreviews( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.customerfeedbackreviews</code> attribute. 
	 * @param value the customerfeedbackreviews
	 */
	public void setCustomerfeedbackreviews(final SessionContext ctx, final User item, final Collection<CustomerFeedBackReviews> value)
	{
		USER2CUSTOMERFEEDBACKREVIEWSCUSTOMERFEEDBACKREVIEWSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.customerfeedbackreviews</code> attribute. 
	 * @param value the customerfeedbackreviews
	 */
	public void setCustomerfeedbackreviews(final User item, final Collection<CustomerFeedBackReviews> value)
	{
		setCustomerfeedbackreviews( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customerfeedbackreviews. 
	 * @param value the item to add to customerfeedbackreviews
	 */
	public void addToCustomerfeedbackreviews(final SessionContext ctx, final User item, final CustomerFeedBackReviews value)
	{
		USER2CUSTOMERFEEDBACKREVIEWSCUSTOMERFEEDBACKREVIEWSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customerfeedbackreviews. 
	 * @param value the item to add to customerfeedbackreviews
	 */
	public void addToCustomerfeedbackreviews(final User item, final CustomerFeedBackReviews value)
	{
		addToCustomerfeedbackreviews( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customerfeedbackreviews. 
	 * @param value the item to remove from customerfeedbackreviews
	 */
	public void removeFromCustomerfeedbackreviews(final SessionContext ctx, final User item, final CustomerFeedBackReviews value)
	{
		USER2CUSTOMERFEEDBACKREVIEWSCUSTOMERFEEDBACKREVIEWSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customerfeedbackreviews. 
	 * @param value the item to remove from customerfeedbackreviews
	 */
	public void removeFromCustomerfeedbackreviews(final User item, final CustomerFeedBackReviews value)
	{
		removeFromCustomerfeedbackreviews( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return CybersolutionsCoreConstants.EXTENSIONNAME;
	}
	
}
