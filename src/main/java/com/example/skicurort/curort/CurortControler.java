package com.example.skicurort.curort;

import com.example.skicurort.exception.NoIdException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.skicurort.curort.CurortMapper.mapCurortToCurortDTO;
import static com.example.skicurort.curort.CurortMapper.mapCurortsToCurortDTOs;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/curort")
public class CurortControler {

  private final CurortService curortService;

  @GetMapping("/")
  List<CurortDTO> getAll() {
    return mapCurortsToCurortDTOs(curortService.getAll());
  }

  @GetMapping("/{id}")
  CurortDTO findByid(@PathVariable Long id) throws NoIdException {
    return mapCurortToCurortDTO(curortService.findById(id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Boolean> delete(@PathVariable Long id) throws NoIdException {
    return ResponseEntity.ok(curortService.delete(id));
  }
  //@ExceptionHandler(NoIdException.class){
 //   public void NoIdException(NoIdException )
 // }
}
