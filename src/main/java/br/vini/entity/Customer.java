package br.vini.entity;

@Entity
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @generatedValue
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
