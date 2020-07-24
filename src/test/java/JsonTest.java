import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @Description
 * @auther leiyang
 * @create 2020-06-12 9:28
 */
public class JsonTest {

    public static void main(String[] args) {
	try(FileInputStream in = new FileInputStream(new File("D:\\BaiduNetdiskDownload\\天猫双12商品原始数据\\天猫双12商品原始数据1.json"));) {
	    /*String jsonStr = FileUtils.readFileToString(new File("D:\\shop.json"), "UTF-8");
	    jsonStr = jsonStr.replaceAll("\r\n", "").replaceAll(" ", "");
	    JSONObject jsonObject = JSONObject.parseObject(jsonStr);
	    System.out.println(jsonObject);
	    System.out.println("分类信息:" + jsonObject.getJSONObject("data").getJSONObject(""));*/


	    int read;
	    StringBuilder stringBuilder = new StringBuilder();
	    while ((read = in.read()) != -1) {
	        // \n 转成ascii码=10
	        /*if(read == 10){
		    JSONObject jsonObject = JSONObject.parseObject(stringBuilder.toString());
		    String location = jsonObject.getJSONObject("itemDO").getString("location");
		    byte[] unicodes = location.getBytes(StandardCharsets.UTF_8);
		    location = new String(unicodes, StandardCharsets.UTF_8);
		    System.out.println(location);
		    stringBuilder = new StringBuilder();
		}else{
		    stringBuilder.append((char)read);
		}*/
		System.out.print((char)read);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
