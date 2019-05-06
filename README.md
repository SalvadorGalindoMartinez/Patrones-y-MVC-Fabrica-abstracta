# Fábrica-Abstracta

Se utiliza cuando se necesita crear diferentes objetos pertenecientes a la misma familia. Disponemos de una
“factoría abstracta” que define las interfaces de las factorías y de varias “factorías concretas” que interpretan a una
familia concreta. 
Contexto: Debemos crear diferentes objetos, todos pertenecientes a la misma familia. Por ejemplo: las bibliotecas para crear interfaces gráficas suelen utilizar este patrón y cada familia sería un sistema operativo distinto. Así pues, el usuario declara un Botón, pero de forma más interna lo que está creando es un BotónWindows o un BotónLinux, por ejemplo.

El problema que intenta solucionar este patrón es el de crear diferentes familias de objetos.

El patrón Fábrica Abstracta está aconsejado cuando se prevé la inclusión de nuevas familias de productos, pero puede resultar contraproducente cuando se añaden nuevos productos o cambian los existentes, puesto que afectaría a todas las familias creadas.

# Estructura

La estructura típica del patrón Fábrica Abstracta es la siguiente:

-Cliente: La clase que llamará a la factoría adecuada ya que necesita crear uno de los objetos que provee la factoría, es decir, Cliente lo que quiere es obtener una instancia de alguno de los productos (ProductoA, ProductoB).

-AbstractFactory: Es la definición de la interfaces de las factorías. Debe de proveer un método para la obtención de cada objeto que pueda crear. ("crearProductoA()" y "crearProductoB()")

-Factorías Concretas: Estas son las diferentes familias de productos. Provee de la instancia concreta de la que se encarga de crear. De esta forma podemos tener una factoría que cree los elementos gráficos para Windows y otra que los cree para Linux, pudiendo poner fácilmente (creando una nueva) otra que los cree para MacOS, por ejemplo.

-Producto abstracto: Definición de las interfaces para la familia de productos genéricos. En el diagrama son "ProductoA" y "ProductoB". En un ejemplo de interfaces gráficas podrían ser todos los elementos: Botón, Ventana, Cuadro de Texto, Combo... El cliente trabajará directamente sobre esta interfaz, que será implementada por los diferentes productos concretos.

-Producto concreto: Implementación de los diferentes productos. Podría ser por ejemplo "BotónWindows" y "BotónLinux". Como ambos implementan "Botón" el cliente no sabrá si está en Windows o Linux, puesto que trabajará directamente sobre la superclase o interfaz.

# Esquema
![](/Diagrama_Abstract_Factory.png)
