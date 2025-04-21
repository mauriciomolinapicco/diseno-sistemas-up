from abc import ABC, abstractmethod

# Interfaz base del logger
class Logger(ABC):
    @abstractmethod
    def log(self, mensaje: str):
        pass

# Logger real que imprime los mensajes
class LoggerReal(Logger):
    def log(self, mensaje: str):
        print(f"Log: {mensaje}")

# Logger nulo que no hace nada
class LoggerNulo(Logger):
    def log(self, mensaje: str):
        pass  # No hace nada

# Una clase que usa el logger
class Aplicacion:
    def __init__(self, logger: Logger):
        self.logger = logger

    def realizar_accion(self):
        self.logger.log("Se está realizando una acción importante.")
        # Aquí seguiría con el resto del código de la aplicación

# Usando un logger real
logger_real = LoggerReal()
app_con_logger_real = Aplicacion(logger_real)
app_con_logger_real.realizar_accion()  # Salida: Log: Se está realizando una acción importante.

# Usando un logger nulo (por ejemplo, cuando no se quiere registrar nada)
logger_nulo = LoggerNulo()
app_con_logger_nulo = Aplicacion(logger_nulo)
app_con_logger_nulo.realizar_accion()  # No hay salida, pero no hay error.
