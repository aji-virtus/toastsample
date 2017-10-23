package cordova-plugin-sampleplug;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class sampleplug extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("toastMessage")) {
			String name = args.getString(0);
            String message = "Hello, " + name;
			callbackContext.success(message);
            return true;
        } else {
			return false;
		}
    }
}
