package backend.poc.first.POC1BackEnd;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class ResourceService 
{
	@Autowired
	ResourceRepository repo;
	public Resource create(Resource resource)
	{
		return repo.save(resource);
	}
	public List<Resource> list()
	{
		return (List<Resource>)repo.findAll();
	}
	public Optional<Resource> read(int week)
	{
		return repo.findById(week);
	}
	public String remove(int key)
	{
		String nm=repo.findById(key).orElse(new Resource()).getResName()+" has Deleted";
		repo.deleteById(key);
		return nm;
	}

}
