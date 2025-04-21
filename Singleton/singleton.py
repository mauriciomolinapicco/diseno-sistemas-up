class Singleton:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
        return cls._instancia

# Prueba del Singleton
obj1 = Singleton()
obj2 = Singleton()

print(obj1 is obj2)  # True -> indica que son la misma instancia
