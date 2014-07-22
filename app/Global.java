import controllers.Workers;
import play.Application;
import play.GlobalSettings;
import play.libs.F.Promise;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.SimpleResult;

import java.lang.reflect.Method;

/**
 * Created by Nicolas on 20/07/2014.
 */
public class Global extends GlobalSettings {

    private class ActionWrapper extends Action.Simple {
        public ActionWrapper(Action<?> action) {
            this.delegate = action;
        }

        @Override
        public Promise<SimpleResult> call(Http.Context ctx) throws java.lang.Throwable {
            Promise<SimpleResult> result = this.delegate.call(ctx);
            Http.Response response = ctx.response();
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT, OPTIONS");
            response.setHeader("Access-Control-Allow-Headers", "accept, origin, Content-type, x-json,x-prototype-version, x-requested-with, PLAY_SESSION");
            return result;
        }
    }

    @Override
    public Action onRequest(Http.Request request, Method actionMethod) {
        return new ActionWrapper(super.onRequest(request, actionMethod));
    }

    @Override
    public void onStart(Application app)
    {
        super.onStart(app);
        Workers.createAdmin();
    }
}
