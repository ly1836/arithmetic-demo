import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description
 * @auther leiyang
 * @create 2020-06-12 9:28
 */
public class JsonTest {

    public static void main(String[] args) {
	try {
	    String jsonStr = FileUtils.readFileToString(new File("D:\\shop.json"), "UTF-8");
	    jsonStr = jsonStr.replaceAll("\r\n", "").replaceAll(" ", "");
	    JSONObject jsonObject = JSONObject.parseObject(jsonStr);
	    System.out.println(jsonObject);
	    System.out.println("分类信息:" + jsonObject.getJSONObject("data").getJSONObject(""));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
