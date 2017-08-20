package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class Hello implements RequestHandler<Request, Response> {

    public Response handleRequest(Request request, Context context) {
        LambdaLogger logger = context.getLogger();

        String greetingString = String.format("Hello %s %s.", request.firstName, request.lastName);

        logger.log("jiho - Request: " + request);

        return new Response(greetingString);
    }
}
