class Persona:
    def __init__(self, nombre, apellido, edad, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.ci = ci


class Participante(Persona):
    def __init__(self, nombre, apellido, edad, ci, no_ticket):
        super().__init__(nombre, apellido, edad, ci)
        self.no_ticket = no_ticket


class Speaker(Persona):
    def __init__(self, nombre, apellido, edad, ci, especialidad):
        super().__init__(nombre, apellido, edad, ci)
        self.especialidad = especialidad


class Charla:
    def __init__(self, nombre_charla, hora, speaker):
        self.nombre_charla = nombre_charla
        self.hora = hora
        self.speaker = speaker
        self.participantes = []

    def agregar_participante(self, participante):
        if len(self.participantes) < 50:
            self.participantes.append(participante)

    def contar_participantes(self):
        return len(self.participantes)


class Evento:
    def __init__(self, nombre, ci):
        self.nombre = nombre
        self.ci = ci
        self.charlas = []  # máx. 50

    def agregar_charla(self, charla):
        if len(self.charlas) < 50:
            self.charlas.append(charla)

def edad_promedio(evento):
    edades = [p.edad for charla in evento.charlas for p in charla.participantes]
    return sum(edades) / len(edades) if edades else 0

def esta_en_evento(evento, nombre, apellido):
    for charla in evento.charlas:
        # Speaker
        if charla.speaker.nombre == nombre and charla.speaker.apellido == apellido:
            return True
        # Participantes
        for p in charla.participantes:
            if p.nombre == nombre and p.apellido == apellido:
                return True
    return False

def eliminar_charlas_por_ci(evento, ci_speaker):
    evento.charlas = [c for c in evento.charlas if c.speaker.ci != ci_speaker]

def clave_participantes(charla):
    return charla.contar_participantes()

def ordenar_charlas_por_participantes(evento):
    evento.charlas.sort(key=clave_participantes, reverse=True)
class Main():
    ana = Participante("Ana", "Gómez", 25, 123, no_ticket=1)
    luis = Participante("Luis", "Pérez", 30, 456, no_ticket=2)
    maria = Participante("María", "López", 22, 789, no_ticket=3)

    sp1 = Speaker("Carlos", "Vargas", 40, 111, "IA")
    sp2 = Speaker("Sofía", "Rojas", 38, 222, "Ciberseguridad")

    c1 = Charla("Charla IA", "10:00", sp1)
    c2 = Charla("Charla Seguridad", "11:00", sp2)

    c1.agregar_participante(ana)
    c1.agregar_participante(luis)
    c2.agregar_participante(maria)

    evento = Evento("TechFest", 999)
    evento.agregar_charla(c1)
    evento.agregar_charla(c2)

    print("Edad promedio:", edad_promedio(evento))

    print("¿Está Ana Gómez?", esta_en_evento(evento, "Ana", "Gómez"))
    print("¿Está Carlos Vargas (speaker)?", esta_en_evento(evento, "Carlos", "Vargas"))

    eliminar_charlas_por_ci(evento, 111)
    ordenar_charlas_por_participantes(evento)
    for charla in evento.charlas:
        print(f"{charla.nombre_charla} - Speaker: {charla.speaker.nombre} {charla.speaker.apellido} - Participantes: {charla.contar_participantes()}")
