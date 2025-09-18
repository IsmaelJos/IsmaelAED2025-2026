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

```

6. **Suma acumulada**  
   Calcula la suma de los números del 1 al 50 usando un bucle.  

```php

```

7. **Tabla de multiplicar**  
   Pide un número y genera su tabla de multiplicar del 1 al 10.  

```php

```

8. **Números pares**  
   Muestra todos los números pares entre 1 y 50.  

```php

```

9. **Cuenta atrás**  
   Haz un bucle que cuente de 10 a 1 y luego muestre `"¡Fin!"`.  

```php

```

10. **Factorial**  
    Calcula el factorial de un número introducido (ejemplo: `5! = 120`).  

```php

```

---

### 3️⃣ Combinando Condicionales y Bucles

11. **Números primos**  
    Escribe un algoritmo que muestre los números primos entre 1 y 50.  

```php

```

12. **Fibonacci**  
    Genera los primeros 20 términos de la secuencia de Fibonacci.  

```php

```

13. **Múltiplos de un número**  
    Pide un número `n` y muestra sus múltiplos hasta 100.  

```php

```

14. **Suma de pares e impares**  
    Calcula la suma de los números pares e impares entre 1 y 100 por separado.  

```php

```

15. **Adivinar número**  
    Genera un número aleatorio entre 1 y 20.  
    Pide al usuario que lo adivine y usa un bucle con condicionales para dar pistas: `"Mayor"` o `"Menor"`.  

```php

```

---

### 4️⃣ Construcción de Algorítmicos

16. **Número perfecto**  
    Comprueba si un número es perfecto (la suma de sus divisores propios es igual al número).  

```php

```

17. **Invertir número**  
    Escribe un algoritmo que invierta los dígitos de un número (ejemplo: `123 → 321`).  

```php

```

18. **Palíndromo**  
    Comprueba si una palabra almacenada en una variable es palíndroma.  

```php

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

```

---