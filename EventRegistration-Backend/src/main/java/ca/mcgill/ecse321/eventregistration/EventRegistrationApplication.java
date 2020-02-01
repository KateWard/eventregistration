package ca.mcgill.ecse321.eventregistration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventRegistrationApplication.class, args);
	}

	@RequestMapping("/")
	public String greeting(){
		return "Bonnie is an elephant!\n"
				"                            _\n" +
				"                          .' `'.__\n" +
				"                         /      \\ `'\"-,\n" +
				"        .-''''--...__..-/ .     |      \\\n" +
				"      .'               ; :'     '.  a   |\n" +
				"     /                 | :.       \\     =\\\n" +
				"    ;                   \\':.      /  ,-.__;.-;`\n" +
				"   /|     .              '--._   /-.7`._..-;`\n" +
				"  ; |       '                |`-'      \\  =|\n" +
				"  |/\\        .   -' /     /  ;         |  =/\n" +
				"  (( ;.       ,_  .:|     | /     /\\   | =|\n" +
				"   ) / `\\     | `\"\"`;     / |    | /   / =/\n" +
				"     | ::|    |      \\    \\ \\    \\ `--' =/\n" +
				"    /  '/\\    /       )    |/     `-...-`\n" +
				"   /    | |  `\\    /-'    /;\n" +
				"   \\  ,,/ |    \\   D    .'  \\\n" +
				"jgs `\"\"`   \\  nnh  D_.-'L__nnh\n" +
				"            `\"\"\"`";
	}

}
