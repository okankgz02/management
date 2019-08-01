package com.okankgz.management.entity;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
@Data // getter ve setter olustursun diye
@Getter
@Setter
@NoArgsConstructor // boş constructor
@AllArgsConstructor // tüm constructorlar kustur
@ToString // nesnenin tostirngi olsuturur
@EqualsAndHashCode // Equals ve hascode ovveride eder
public class Issue extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO) // vt tarafından otomtatik olarak olusturulsun
  private Long id;

  @Column(name = "description", length = 1000)
  private String description;

  @Column(name = "details", length = 4000)
  private String details;

  @Column(name = "date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  @Column(name = "issue_status")
  @Enumerated(EnumType.STRING)
  private IssueStatus issueStatus;

  @JoinColumn(name = "assignee_user_id")
  @ManyToOne(
      optional = true,
      fetch =
          FetchType
              .LAZY) // ıssıu classı bir tane user bağlanabilir  optional ile : assignesi
                     // vermezsende olur demek null kalasada olur , fetch : ussıue tablosuna select
                     // atılarken  User tablosundaki veri getiriksin mi EAGER  ile her zamaan getir
                     // LAZY ile istendiğinde geir
  private User assignee;

  @JoinColumn(name = "project_id")
  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private Project project;
}
