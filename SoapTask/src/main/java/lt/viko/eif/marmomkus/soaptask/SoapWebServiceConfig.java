package lt.viko.eif.marmomkus.soaptask;

import lt.viko.eif.marmomkus.soaptask.model.Car;
import lt.viko.eif.marmomkus.soaptask.model.CarRepair;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration  //extends WsConfigurerAdapter
public class SoapWebServiceConfig {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext)
    {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/soap/*");
    }

    @Bean(name = "cars")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema carsSchema)
    {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setLocationUri("/soap");
        definition.setPortTypeName("carss");
        definition.setTargetNamespace("http://localhost/carrepair/car");
        definition.setSchema(carsSchema);
        return definition;
    }

    @Bean
    public XsdSchema CarsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("car.xsd"));
    }

    @Bean
    public CarService carService(){
        return new CarService();
    }
    @Bean
    public CarRepair car(){
        return new CarRepair();
    }

    }

