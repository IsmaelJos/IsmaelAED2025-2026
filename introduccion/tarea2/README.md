## Número capicúa (palíndromo numérico)

Implementa una función __esCapicua(int $n): bool__ que determine si un número entero positivo es capicúa.

- Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.

> Ejemplo: `12321` → `true`

```php
    function esCapicua(int $n):bool{
        $nRev = strrev($n);
        if($nRev == $n){
            return true;
        }
        return false;
    }

    if (esCapicua(12321)){
        echo "el numero es capicua";
    }else{
        echo "el numero no es capicua";
    }
```

## Escalera de asteriscos

Implementa una función __montañaAsteriscos(int $n, $m): void__ que imprima una escalera de asteriscos de altura `N`y el tamaño `M`.

- La primera fila contiene 1 asterisco, la segunda 2, y así hasta `N`, `M` veces.

> Ejemplo con entrada `4,2`:

```text
*      *
**    **
***  ***
********
```

```php
    function montañaAsteriscos(int $n, $m): void{

        $asteriscos = [];
        for ($i=0; $i < $n; $i++) { 
            array_push($asteriscos,"*");
            echo "<br>";
        }

    }

    montañaAsteriscos(4,2);
```


## Suma de dígitos

Implementa una función __sumaDigitos(int $n): int__ que calcule la suma de los dígitos de un número entero positivo.

- Descompón el número en dígitos y súmalos.

> Ejemplo: `2025` → `9` (2+0+2+5)

```php
    function sumaDigitos(int $n): int{
        $array = [];
        do {
            array_push($array,$n % 10);
            $n = intval($n / 10);
        }
        while ($n != 0);
        return array_sum($array);
    }

    echo sumaDigitos(7264);
```

## Número secreto (múltiplos de 3 o 5)

Implementa una función __multiplosTresOCinco(int $n): array__ que devuelva todos los múltiplos de 3 o 5 menores que `N`.

- Además, calcula la suma de dichos múltiplos.

> Ejemplo con entrada `10`:

```code
3, 5, 6, 9
Suma = 23
```

```php
    function multiplosTresOCinco(int $n): array{
        $array = [];
        do {
            if (($n % 3) == 0) {
                array_push($array,$n);
            }elseif(($n % 5) == 0) {
                array_push($array,$n);
            }
            $n--;
        }
        while ($n != 0);
        return $array;
    }
    $multiplos = multiplosTresOCinco(10);
    $suma = 0;
    echo implode(" , ", $multiplos)
    foreach ($multiplos as $multiplo) {
        $suma += $multiplo; 
    }
    echo "<br>","Suma = $suma";
```

## Secuencia de Collatz

Implementa una función __secuenciaCollatz(int $n): array__ que genere la secuencia de Collatz a partir de un entero positivo.

- Si el número es par → dividir entre 2.  
- Si es impar → multiplicar por 3 y sumar 1.  
- Repetir hasta llegar a 1.

> Ejemplo con entrada `6`:

```code
6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
```

```php
    function secuenciaCollatz(int $n): array{
        $sec = [];
        array_push($sec, $n);
        do {

            if (($n % 2) == 0) {
                $n = $n / 2;

            }else {
                $n = ($n * 3) + 1;

            }
            array_push($sec, $n);

        } while ($n != 1);
        return $sec;
    }

    $secuencia = secuenciaCollatz(6);

    echo implode(" → ",$secuencia);
```

---