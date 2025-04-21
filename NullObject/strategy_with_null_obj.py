from abc import ABC, abstractmethod

class EstrategiaDescuento(ABC):
    @abstractmethod
    def aplicar_descuento(self, precio: float) -> float:
        pass

class Descuento10(EstrategiaDescuento):
    def aplicar_descuento(self, precio: float) -> float:
        return precio * 0.90  

class Descuento20(EstrategiaDescuento):
    def aplicar_descuento(self, precio: float) -> float:
        return precio * 0.80  # Aplica un descuento del 20%

# Estrategia nula: No aplica descuento
class DescuentoNulo(EstrategiaDescuento):
    def aplicar_descuento(self, precio: float) -> float:
        return precio  # No hace nada, devuelve el precio sin cambios

class Compra:
    def __init__(self, precio: float, estrategia_descuento: EstrategiaDescuento):
        self.precio = precio
        self.estrategia_descuento = estrategia_descuento

    def calcular_precio_final(self):
        return self.estrategia_descuento.aplicar_descuento(self.precio)

compra_con_descuento_10 = Compra(100, Descuento10())  # Aplica 10% de descuento
compra_con_descuento_20 = Compra(100, Descuento20())  # Aplica 20% de descuento
compra_sin_descuento = Compra(100, DescuentoNulo()) 

# Calcular precios finales
print(f"Precio final con 10% de descuento: {compra_con_descuento_10.calcular_precio_final()}")
print(f"Precio final con 20% de descuento: {compra_con_descuento_20.calcular_precio_final()}")
print(f"Precio final sin descuento: {compra_sin_descuento.calcular_precio_final()}")
