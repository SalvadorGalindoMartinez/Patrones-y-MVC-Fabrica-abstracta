# Fábrica-Abstracta

Se utiliza cuando se necesita crear diferentes objetos pertenecientes a la misma familia. Disponemos de una
“factoría abstracta” que define las interfaces de las factorías y de varias “factorías concretas” que interpretan a una
familia concreta. 
Contexto: Debemos crear diferentes objetos, todos pertenecientes a la misma familia. Por ejemplo: las bibliotecas para crear interfaces gráficas suelen utilizar este patrón y cada familia sería un sistema operativo distinto. Así pues, el usuario declara un Botón, pero de forma más interna lo que está creando es un BotónWindows o un BotónLinux, por ejemplo.

El problema que intenta solucionar este patrón es el de crear diferentes familias de objetos.

El patrón Fábrica Abstracta está aconsejado cuando se prevé la inclusión de nuevas familias de productos, pero puede resultar contraproducente cuando se añaden nuevos productos o cambian los existentes, puesto que afectaría a todas las familias creadas.
