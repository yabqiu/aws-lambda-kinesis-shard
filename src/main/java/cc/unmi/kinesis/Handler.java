package cc.unmi.kinesis;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent;
import org.apache.log4j.Logger;

public class Handler implements RequestHandler<KinesisEvent, String> {

	private static final Logger LOG = Logger.getLogger(Handler.class);

	@Override
	public String handleRequest(KinesisEvent event, Context context) {
	    LOG.info("Received messages: " + event.getRecords().size());
	    event.getRecords().forEach(record -> {
	    	LOG.info("Get message content: " + new String(record.getKinesis().getData().array()));
		});

	    throw new RuntimeException("test");
	}
}
