### Variables y Condicionales

1. **Mayor de dos números**  
   Pide dos números y muestra cuál es mayor o si son iguales.  

```php
    $num1 = 32;
    $num2 = 94;
    $respuesta = "Menor";

    echo " numero 1: $num1 <br>";
    echo " numero 2: $num2 <br>";

    if ($num1 > $num2) {
        $respuesta = "Mayor";
    } elseif ($num1 == $num2) {
        $respuesta = "Igual";
    }

    echo " $num1 es $respuesta que $num2";
```

2. **Edad permitida**  
   Pide la edad de una persona y muestra:  
   - `"Eres menor de edad"` si es < 18.  
   - `"Eres mayor de edad"` si es ≥ 18.  

```php
    $edad = 22;
    $respuesta = "Menor";

    echo " Tiene $edad años <br>";

    if ($edad >= 18) {
        $respuesta = "Mayor";
    }

    echo "la persona es $respuesta de edad";
```

3. **Positivo, negativo o cero**  
   Comprueba si un número almacenado en una variable es positivo, negativo o cero.  
   
```php
    $numero = -1;
    $respuesta = "negativo";

    echo "numero = $numero <br>";

    if($numero>0){
        $respuesta = "positivo";
    } elseif ($numero==0) {
        $respuesta = "cero";
    }

    echo "el numero es $respuesta";
```

4. **Nota final**  
   Pide la nota de un alumno y muestra:  
   - `"Suspenso"` (< 5), `"Aprobado"` (5–6), `"Notable"` (7–8), `"Sobresaliente"` (9–10).  
   
```php
    $numero = 7;
    $respuesta = "error";

    echo "numero = $numero <br>";

    switch ($numero) {
    case 1:
        $respuesta = "Suspenso";
        break;
    case 2:
        $respuesta = "Suspenso";
        break;
    case 3:
        $respuesta = "Suspenso";
        break;
    case 4:
        $respuesta = "Suspenso";
        break;
    case 5:
        $respuesta = "Aprobado";
        break;
    case 6:
        $respuesta = "Aprobado";
        break;
    case 7:
        $respuesta = "Notable";
        break;
    case 8:
        $respuesta = "Notable";
        break;
    case 9:
        $respuesta = "Sobresaliente";
        break;
    case 10:
        $respuesta = "Sobresaliente";
        break;
    }

    echo "el alumno ha sacado un $respuesta";
```

---

### 2️⃣ Bucles (for, while, foreach)

5. **Contar del 1 al 100**  
   Muestra los números del 1 al 100 en pantalla.  

```php
    for ($i=1; $i <= 100; $i++) { 
        echo "$i <br>";
    }
```

6. **Suma acumulada**  
   Calcula la suma de los números del 1 al 50 usando un bucle.  

```php
    $cantidad = 0;
    for ($i=1; $i <= 50; $i++) { 
        $cantidad += $i;
    }
    echo "la cantidad es $cantidad";
```

7. **Tabla de multiplicar**  
   Pide un número y genera su tabla de multiplicar del 1 al 10.  

```php
    $numero = 3;
    for ($i=1; $i <= 10; $i++) { 
        echo "$numero * $i = ", $numero*$i, "<br>";
    }
```

8. **Números pares**  
   Muestra todos los números pares entre 1 y 50.  

```php
    for ($i=1; $i <= 50; $i++) { 
        if ($i%2 == 0) {
            echo "$i <br>";
        }
    }
```

9. **Cuenta atrás**  
   Haz un bucle que cuente de 10 a 1 y luego muestre `"¡Fin!"`.  

```php
    for ($i=10; $i >= 1; $i--) { 
        echo "$i <br>";
        if ($i == 1) {
            echo "¡Fin! <br>";
        }
    }
```

10. **Factorial**  
    Calcula el factorial de un número introducido (ejemplo: `5! = 120`).  

```php
    $numero = 6;
    $factorial = 1;
    for ($i = 1; $i <= $numero; $i++){ 
        $factorial = $factorial * $i; 
    }
    echo "el factorial de $numero es $factorial";
```

---

### 3️⃣ Combinando Condicionales y Bucles

11. **Números primos**  
    Escribe un algoritmo que muestre los números primos entre 1 y 50.  

```php
    $numero = 7;
    $respuesta = "$numero es primo";
    for ($i=2; $i < $numero ; $i++) { 
        if ($numero%$i == 0) {
            $respuesta = "$numero no es primo, divisible por $i";
            break;
        }
    }
    echo $respuesta
```

12. **Fibonacci**  
    Genera los primeros 20 términos de la secuencia de Fibonacci.  

```php
    $numero = 0;
    $numero2 = 1;
    for ($i=0; $i < 20; $i++) { 
        $x = $numero;
        $numero = $numero2;
        $numero2 = $x + $numero;
        echo "$numero <br>";
    }
```

13. **Múltiplos de un número**  
    Pide un número `n` y muestra sus múltiplos hasta 100.  

```php
    $numero = 7;
    for ($i=1; $i*$numero < 100; $i++) { 
        echo " $numero * $i = ", $numero*$i,"<br>";
    }
```

14. **Suma de pares e impares**  
    Calcula la suma de los números pares e impares entre 1 y 100 por separado.  

```php
    $cantidadImpar = 0;
    $cantidadPar = 0;
    for ($i=1; $i <= 100; $i++) { 
        if ($i%2 == 0) {
            $cantidadPar += $i;
        }else{
            $cantidadImpar += $i;
        }
    }
    echo "la suma impar es $cantidadImpar <br>";
    echo "la suma par es $cantidadPar <br>";
```

15. **Adivinar número**  
    Genera un número aleatorio entre 1 y 20.  
    Pide al usuario que lo adivine y usa un bucle con condicionales para dar pistas: `"Mayor"` o `"Menor"`.  

```php
    $random = rand(1,20);
    $numero = 7;
    while ($numero != $random) {
        if ($random > $numero) {
            echo "el numero es menor al escojido ($random) <br>";
        }elseif ($random < $numero) {
            echo "el numero es mayor al escojido ($random) <br>";
        }
        $random = rand(1,20);
    }
    echo "$numero es el numero correcto";
```

---

### 4️⃣ Construcción de Algorítmicos

16. **Número perfecto**  
    Comprueba si un número es perfecto (la suma de sus divisores propios es igual al número).  

```php
    $numero = 6;
    $sumaMultiplos = 0;
    for ($i = $numero-1; $i >= 1 ; $i--) { 
        if ($numero%$i == 0) {
        $sumaMultiplos += $i;      
        }
    }
    if ($sumaMultiplos == $numero) {
        echo "$numero es perfecto";
    }else{
        echo "$numero no es perfecto";
    }
```

17. **Invertir número**  
    Escribe un algoritmo que invierta los dígitos de un número (ejemplo: `123 → 321`).  

```php
    $numero = 63754;

    echo "$numero invertido es ", strrev($numero);
```

18. **Palíndromo**  
    Comprueba si una palabra almacenada en una variable es palíndroma.  

```php
    if (strrev($palabra) == $palabra) {
        echo "$palabra es un palindromo";
    }else{
        echo "$palabra no es un palindromo (",strrev($palabra),")";
    }
```

19. **Máximo común divisor (MCD)**  
    Escribe un algoritmo que calcule el MCD de dos números.  

```php

```

20. **Triángulo de asteriscos**  
    Muestra en pantalla un triángulo de altura `n` usando `*`.  
    Ejemplo con `n = 5`:  
    ```
    *
    **
    ***
    ****
    *****
    ```

```php
    $altura = 5;
    $asteriscos = [];
    for ($i=1; $i <= $altura; $i++) { 
        array_push($asteriscos,"*");
        foreach ($asteriscos as $asterisco) {
            echo $asterisco," ";
        }
        echo "<br>";
    }
```

---