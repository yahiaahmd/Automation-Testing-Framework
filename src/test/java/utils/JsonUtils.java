package utils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

	public class JsonUtils {

	    public static <T> Object[][] getSubTestData(String filePath, String dataKey, Class<T> clazz) throws IOException {
	        ObjectMapper mapper = new ObjectMapper();
	        
	        JsonNode rootNode = mapper.readTree(new File(filePath));
	        JsonNode subNode = rootNode.get(dataKey);
	        
	        List<T> dataList = mapper.readValue(
	            subNode.traverse(), 
	            mapper.getTypeFactory().constructCollectionType(List.class, clazz)
	        );

	        Object[][] data = new Object[dataList.size()][1];
	        for (int i = 0; i < dataList.size(); i++) {
	            data[i][0] = dataList.get(i);
	        }
	        return data;
	    }
	}
