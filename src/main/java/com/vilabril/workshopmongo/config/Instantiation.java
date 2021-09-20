package com.vilabril.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.vilabril.workshopmongo.domian.Post;
import com.vilabril.workshopmongo.domian.User;
import com.vilabril.workshopmongo.repository.PostRepository;
import com.vilabril.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null,sdf.parse("21/03/2018"), "Partiu Viagem","Vou Viajar para São Paulo!",maria);
		Post post2 = new Post(null,sdf.parse("23/03/2018"), "BOM dia","Acordei feliz!",maria);
		
	    userRepository.saveAll(Arrays.asList(maria, alex, bob));
	    postRepository.saveAll(Arrays.asList(post1, post2));
		
	}

}
