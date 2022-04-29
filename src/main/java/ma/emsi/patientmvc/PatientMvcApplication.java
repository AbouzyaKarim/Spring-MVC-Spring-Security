package ma.emsi.patientmvc;

import ma.emsi.patientmvc.entities.Patient;
import ma.emsi.patientmvc.repositories.PatientRepository;
import ma.emsi.patientmvc.security.service.SecurityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);

    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
   // @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Hassan",new Date(),false,122));
            patientRepository.save(new Patient(null,"Mohammed",new Date(),true,500));
            patientRepository.save(new Patient(null,"Saad",new Date(),true,160));
            patientRepository.save(new Patient(null,"Youssef",new Date(),false,110));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }

    //@Bean
    CommandLineRunner saveUser(SecurityService securityService){
        return args -> {
            securityService.saveNewUser("mohammed","1234","1234");
            securityService.saveNewUser("yassine","1234","1234");
            securityService.saveNewUser("hassan","1234","1234");

            securityService.saveNewRole("USER","");
            securityService.saveNewRole("ADMIN","");

            securityService.addRoleToUser("mohammed","USER");
            securityService.addRoleToUser("mohammed","ADMIN");
            securityService.addRoleToUser("yassine","USER");
            securityService.addRoleToUser("hassan","USER");
        };
    }

}
