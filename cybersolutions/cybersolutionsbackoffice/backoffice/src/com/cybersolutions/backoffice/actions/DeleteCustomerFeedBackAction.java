package com.cybersolutions.backoffice.actions;

import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;
import com.hybris.cockpitng.dataaccess.facades.object.ObjectFacade;
import com.hybris.cockpitng.dataaccess.facades.object.ObjectFacadeOperationResult;
import com.hybris.cockpitng.dataaccess.facades.object.exceptions.ObjectAccessException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DeleteCustomerFeedBackAction implements CockpitAction<Object, Object> {

    @Resource
    public ObjectFacade objectFacade;

    @Override
    public ActionResult<Object> perform(final ActionContext<Object> actionContext) {
        List ctxObjects = this.getDataAsCollection(actionContext);

        ObjectFacadeOperationResult result;
        try {
            result = this.objectFacade.delete(ctxObjects);
        } catch (RuntimeException var5) {
            result = this.addItemsToFailedObjects(ctxObjects, var5);
        }

        if (result == null) {
            return new ActionResult("error", ctxObjects);
        } else {
            return new ActionResult(result.countSuccessfulObjects() < 1 ? "error" : "success", ctxObjects);
        }
    }

    private List<Object> getDataAsCollection(ActionContext<Object> ctx) {
        List<Object> ctxObjects = new ArrayList();
        if (ctx.getData() instanceof Collection) {
            ctxObjects.addAll((Collection)ctx.getData());
        } else {
            ctxObjects.add(ctx.getData());
        }

        return ctxObjects;
    }

    private ObjectFacadeOperationResult<Object> addItemsToFailedObjects(List<Object> ctxObjects, RuntimeException ex) {
        ObjectFacadeOperationResult<Object> result = new ObjectFacadeOperationResult();
        ctxObjects.forEach((obj) -> {
            result.addFailedObject(obj, new ObjectAccessException(ex.getMessage(), ex));
        });
        return result;
    }
}
