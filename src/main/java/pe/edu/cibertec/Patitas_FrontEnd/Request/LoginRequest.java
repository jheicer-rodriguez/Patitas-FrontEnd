package pe.edu.cibertec.Patitas_FrontEnd.Request;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import pe.edu.cibertec.Patitas_FrontEnd.ViewModel.LoginModel;


@Configuration
public class LoginRequest {

    @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }
}
