# language: es
Característica: Validacion de la E2E de la APK "The App"

  Antecedentes:
    Dado abrimos la APK

  Escenario: CP001- Verificar textos en pantalla inicial
    Entonces se deben mostrar los textos "The App"

  Escenario: CP002- Navegar a pantalla de Login

    Cuando hacemos clic en Login Screen
    Entonces se debe abrir la pantalla de "Login"


  Esquema del escenario:  CP003- Acceso a área secreta
    Cuando intento iniciar sesion con credenciales
      | user   | pass   |
      | <user> | <pass> |
    Entonces se debe mostrar la pantalla de Login con el boton "Alert"
    Ejemplos:
      | user   | pass   |
      | Yilmar | 123456 |

  Escenario: CP004 - Ver pantalla de Fog
    Cuando hacemos clic en el link List Demo y luego en Altocumulus
    Entonces se debe mostrar una pantalla con el texto "Your Cloud Selection"

