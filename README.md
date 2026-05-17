# Refactorización Avanzada con Strategy Pattern y Guard Clauses

---

# Objetivo del Laboratorio

El objetivo del laboratorio fue aplicar técnicas avanzadas de refactorización orientadas a la reducción de complejidad ciclomática y eliminación de estructuras condicionales problemáticas.

Durante el desarrollo se aplicaron:

- Replace Conditional with Polymorphism
- Strategy Pattern
- Guard Clauses
- Constructor Injection
- Separación de responsabilidades

---

# Problemas Detectados Inicialmente

En el estado inicial del proyecto se identificaron varios problemas de diseño y mantenibilidad.

## Code Smells encontrados

- Switch Statement en `EnvioService`
- Arrow Code en `CreditoService`
- Alta complejidad ciclomática
- Responsabilidades acopladas
- Lógica condicional extensa
- Métodos difíciles de mantener

---

# Métricas Iniciales (Post1)

El análisis final del Post1 fue utilizado como línea base inicial para este laboratorio.

| Métrica | Estado Inicial |
|---|---|
| Reliability Issues | 1 |
| Maintainability Issues | 10 |
| Coverage | 0.0% |
| Duplications | 0.0% |
| Quality Gate | Failed |

---

# Refactorización Aplicada

## Replace Conditional with Polymorphism

Se eliminó el uso de `switch` dentro de `EnvioService` mediante la implementación de Strategy Pattern.

---

## Strategy Pattern

Se creó la interfaz:

```text
EstrategiaEnvio
```

con las siguientes implementaciones:

- `EnvioEstandar`
- `EnvioExpress`
- `EnvioMismoDia`

---

## Constructor Injection

`EnvioService` utiliza inyección por constructor mediante:

```java
Map<String, EstrategiaEnvio>
```

permitiendo desacoplar las estrategias de envío.

---

## Guard Clauses

El método `aprobarCredito()` fue refactorizado usando Guard Clauses para eliminar el Arrow Code y reducir la complejidad ciclomática.

---

# Comparación de Métricas

| Métrica | Antes | Después |
|---|---|---|
| Reliability Issues | 1 | 0 |
| Maintainability Issues | 10 | 8 |
| Coverage | 0.0% | 0.0% |
| Duplications | 0.0% | 0.0% |
| Quality Gate | Failed | Passed |

---

# Resultados Obtenidos

Después de la refactorización:

- Se eliminó el Switch Statement
- Se reemplazó lógica condicional por polimorfismo
- Se redujo la complejidad ciclomática
- Se eliminaron problemas de Reliability
- Se redujeron issues de Maintainability
- Se mejoró la mantenibilidad general del sistema
- El proyecto logró pasar el Quality Gate de SonarQube

---

# Validación Final

El proyecto cumple con los requisitos establecidos:

- Implementación de Strategy Pattern
- Reemplazo de Switch Statement por polimorfismo
- Aplicación de Guard Clauses
- Reducción de complejidad ciclomática
- Constructor Injection con Spring
- Quality Gate Passed en SonarQube
- Comparación de métricas antes/después
- Persistencia de pruebas automatizadas después de la refactorización

---

# Evidencias Visuales

Todas las capturas y evidencias del laboratorio se encuentran en:

```text
EvidenciaVisual/
```

# Estructura del Proyecto

```text
src/
├── domain/
├── repository/
├── service/
│   ├── strategy/
│   └── valueobjects/
└── test/
```



# Tecnologías Utilizadas

- Java 21
- Spring Boot
- Maven
- SonarQube Community
- JUnit 5