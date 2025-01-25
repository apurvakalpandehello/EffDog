import org.springframework.context.annotation.Bean; 
 @Configuration
 public class config {

 @Bean

public OpenAPI customOpenAPI() {

return new OpenAPI()

info(new Info()

title("User APT")

.version("1.0.0")

.description("This API allows you to manage users."));
