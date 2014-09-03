package weibo4j.examples.timeline;

import java.io.*;

import weibo4j.Timeline;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.StatusWapper;
import weibo4j.model.WeiboException;


public class GetPublicTimeline {

	public static void main(String[] args) throws FileNotFoundException {
		String access_token = "2.009F1d9BmHHChD7abcd6de0a0jui5Y";
		int count = 200;
		Timeline tm = new Timeline(access_token);
		try {
			StatusWapper status = tm.getPublicTimeline(count, 0);
			Log.logInfo(status.toString());
			
			File file = new File("data.txt");
			PrintWriter output =new PrintWriter(file);
			output.print(status.toString());
			output.close();
			
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
