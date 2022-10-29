package com.example.skicurort.curort;

import com.example.skicurort.exception.NoIdException;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CurortService {

  private final CurortRepo curortRepo;


  public Curort save(Curort curort) {
    return curortRepo.save(curort);
  }

  public List<Curort> getAll(){
    return curortRepo.findAll();

  }
  public Curort findById(Long id) throws NoIdException {
    return curortRepo.findById(id)
            .orElseThrow(()->new NoIdException("No Curort with id= " + id));
  }



  public boolean delete(Long id) {//throws NoIdException {
      curortRepo.deleteById(id);//.orElseThrow(() -> new NoIdException("No Curort with id= " + id));
      return true;
  }
 // public Curort edit (Curort curort, Long id){
    //  return

 // }
}
