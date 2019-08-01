package com.okankgz.management.util;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;
//pagination amaclı
@Data
public
class TPage<T> {

  private int number; // kacıncı sayfa
  private int size; // toplam sayfası
  private Sort sort; // kolonu sıralamsı
  private int totalPages; // toplamda kaç sayfa var
  private Long totalElements; // toplamda kaç kayıt
  private List<T> content;

  public void setStat(Page page, List<T> list) {
    this.number = page.getNumber();
    this.size = page.getSize();
    this.sort = page.getSort();
    this.totalPages = page.getTotalPages();
    this.totalElements = page.getTotalElements();
    this.content = list;
  }
}
