package com.example.skicurort.curort;

import java.util.List;

public class CurortMapper {
  private CurortMapper() {}

  static CurortDTO mapCurortToCurortDTO(Curort curort) {
    return new CurortDTO(
        curort.getCurortName(),
        curort.getCurortAdress(),
        curort.getCurrortEmail(),
        curort.getCurortPhonenumber());
  }

  static List<CurortDTO> mapCurortsToCurortDTOs(List<Curort> curorts) {
    return curorts.stream().map(curort -> mapCurortToCurortDTO(curort)).toList();
  }
}
