### Comienza lo duro, Diagrama de clases
---
## Diagrama de clases:

```mermaid
classDiagram
    class CasaApartamento {
        float: distanciaCentro
    }
    class Conection {
        +conectandose()
    }
    class Hotel {
        int: numPisos
        float: calidadServicios
    }
    class Reseña {
        String: nombreUsuario
        String: nombreRecidencia
        float: estrellasUsuario
        String: comentarioReseña
    }
    class Usuario {
        String: nombreUsuario
        String: contraseña
    }
    class Edificio {
        String: nombreRecidencia
        String: calle
        int: numEdificioCalle
        float: precioHabitacion
        int: estrellasUsuario
        int: numHabitacionesTotales
    }
      class Main{
          +main()
      }
      class View {+eventos()
    }
      class Modelo {
          ArrayList~String~: hoteles
          +mostarHoteles()
          +mostrarReseña(JTextField, JTextField)
          +insertarUsuario(JTextField, JPasswordField)
          +insertarReseña(JTextField, JTextField, JTextField, JTextArea)
    }
    class Observar{
    +update(Observable o, Object arg)
    }
    Main "1" *-- "1" Modelo : association
    Conection "1" *-- "1" Modelo : association
    Main "1" *-- "1" View : association
    Edificio "1" *-- "1" CasaApartamento : hereda
    Edificio "1" *-- "1" Hotel : hereda
    Modelo "1" *-- "1" Edificio : association
    Modelo "1" *-- "1" Usuario : association
    Modelo "1" *-- "1" Reseña : association
    Modelo "1" *-- "1" Observar : association
    
      
```

---
### Ramas
Utilez en trabajos grandes y o con varias personas, ya que presenta una buena e intutiva segmentacion de los roles, clases 
y puestos, por ejemplo la main esta dedicada a que solo sea para lo importante, las fechas de entrega o la versiones tochas, en cambio
se puede mientras hacer una rama Personal donde uno pueda probar, trabajar o testear sin temor a quitar alguna copa. En este caso  hice
una rama Lidier, donde fui poniendo lo que pense que necesitaria todo el mundo, luego cuando se necesito algo mas especifico ya hice una rama 
a partir de Lidier donde hacia mis cosas, hice una rama con el nombre de lo que me pidieron bases, asi que lo hice, para luego hacer un merge squash donde 
los distintos commits que hice se fusionaron en otra rama.