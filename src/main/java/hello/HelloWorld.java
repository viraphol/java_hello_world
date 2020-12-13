
package hello;

import org.joda.time.LocalTime;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;


public class HelloWorld {
  public static void main(String[] args) throws Exception{
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());

    File file = new File("src/main/resources/application.yaml");
	ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
	ApplicationConfig config = objectMapper.readValue(file, ApplicationConfig.class);
	System.out.println("Application config info " + config.toString());
  }
}
