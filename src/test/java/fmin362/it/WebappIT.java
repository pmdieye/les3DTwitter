package fmin362.it;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import junit.framework.TestCase;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
<<<<<<< HEAD
import org.junit.Test;

=======

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

>>>>>>> 39cb48cb104823b96aa7f3ec0076fedc357e0774
public class WebappIT extends TestCase {
	private String baseUrl;

	public void setUp() throws Exception {
		super.setUp();
		String port = System.getProperty("servlet.port");
<<<<<<< HEAD
		this.baseUrl = "http://localhost:" + port + "/le3DTwitter";
=======
		this.baseUrl = "http://localhost:" + port + "/les3DTwitter";
>>>>>>> 39cb48cb104823b96aa7f3ec0076fedc357e0774
	}

	public void testCallIndexPage() throws Exception {
		URL url = new URL(this.baseUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		assertEquals(200, connection.getResponseCode());
	}

	@Test
	public void testMessagesResource() throws Exception {
		URL url = new URL(this.baseUrl + "/resources/messages");
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
				Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource(url.toURI());
		List<Map<String, ?>> result = webResource.get(List.class);
		System.out.println(result);
		assertTrue(result.size() > 0);
	}

	@Test
<<<<<<< HEAD
=======
	public void testSomeServlet() throws Exception {
		URL url = new URL(this.baseUrl + "/some");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		assertEquals(200, connection.getResponseCode());
		InputStream inputStream = connection.getInputStream();
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(
					inputStream, "UTF-8"));
			StringBuilder content = new StringBuilder();
			String line;
			while ((line = buffer.readLine()) != null) {
				content.append(line);
			}
			String result = content.toString();
			assertEquals("Hello World!", result.trim());

		} finally {
			inputStream.close();
		}
	}

	@Test
>>>>>>> 39cb48cb104823b96aa7f3ec0076fedc357e0774
	public void testJDBCServlet() throws Exception {
		URL url = new URL(this.baseUrl + "/some-jdbc");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		assertEquals(200, connection.getResponseCode());
	}
<<<<<<< HEAD
=======

	@Test
	public void testJPAServlet() throws Exception {
		URL url = new URL(this.baseUrl + "/some-jpa");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		assertEquals(200, connection.getResponseCode());
	}
>>>>>>> 39cb48cb104823b96aa7f3ec0076fedc357e0774

}
