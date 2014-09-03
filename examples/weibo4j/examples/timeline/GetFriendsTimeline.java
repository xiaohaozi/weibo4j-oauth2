package weibo4j.examples.timeline;

import weibo4j.Timeline;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.StatusWapper;
import weibo4j.model.WeiboException;

public class GetFriendsTimeline {

	public static void main(String[] args) {
		String access_token = "2.009F1d9BmHHChD7abcd6de0a0jui5Y";
		Timeline tm = new Timeline(access_token);
		try {
			StatusWapper status = tm.getFriendsTimeline();
			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}

	}

}
