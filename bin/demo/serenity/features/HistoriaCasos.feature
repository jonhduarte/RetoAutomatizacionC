Feature: Reto Automatizacion CHOUCAIR

  @Tag_CreacionLogin_y_Unidades
  Scenario Outline: Creacion Login y unidades de negocio Exitoso
    Given Ingresamos a la Pagina de StarSharp
    And Ingresamos las Credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    And Buscamos opcion de Organizacion y unidades de negocio
    And Seleccionamos nuevo negocio
    And Completamos los campos del formulario
      | nombrenegocio   |
      | <NombreNegocio> |
    Then verificamos que el nombre del negocio aparezca
      | nombrenegocio   |
      | <NombreNegocio> |

    Examples: 
      | Usuario | Clave    | NombreNegocio |
      | admin   | serenity | Pruebas Test  |

  @Tag_CreacionReunion
  Scenario Outline: Creacion reunion Exitosa
    Given Ingresamos a la Pagina de StarSharp
    And Ingresamos las Credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    And Buscamos opcion Reunion y Reuniones
    And Seleccionamos nueva reunion
    And completamos los campos del formulario de reuniones
      | nombrereunion   | tiporeunion   | numeroreunion   | fechainicio   | horainicio   | fechafin   | horafin   | localizacion   | unit   | organizador   | responsable   | asistentes   |
      | <NombreReunion> | <TipoReunion> | <NumeroReunion> | <FechaInicio> | <HoraInicio> | <FechaFin> | <HoraFin> | <Localizacion> | <Unit> | <Organizador> | <Responsable> | <Asistentes> |
    Then verificamos que la reunion quede creada

    Examples: 
      | Usuario | Clave    | NombreReunion | TipoReunion | NumeroReunion | FechaInicio | HoraInicio | FechaFin   | HoraFin | Localizacion | Unit   | Organizador           | Responsable           | Asistentes            |
      | admin   | serenity | Pruebatest    | General     |       4444444 | 07/10/2021  | 10:10      | 07/10/2021 | 10:50   | Bogota       | Bogota | PruebaTest PruebaTest | PruebaTest PruebaTest | PruebaTest PruebaTest |
