Feature: Buscar en google con datos desde el feature
  Arthur quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: Buscar en google
    Given daniel esta en el sitio google
    When el busca la frase  "<palabra>" comuesta "<palabrados>"
    Then el verifica que la "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra        | palabrados        | resultadoEsperado |
      | switch         | try        			 | switch						 |
      | shopos         | sholutions	 			 | shopos						 |
      | liungjknsihfwe | liungjknsihfwe 	 | gasjoaj           |
