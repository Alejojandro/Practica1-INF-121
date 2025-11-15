class Doctor:
    def __init__(self, nombre, especialidad):
        self.nombre = nombre
        self.especialidad = especialidad

    def mostrar_info(self):
        print(f"Doctor: {self.nombre}, Especialidad: {self.especialidad}")


class Hospital:
    def __init__(self, nombre):
        self.nombre = nombre
        self.doctores = []

    def asignar_doctor(self, doctor):
        self.doctores.append(doctor)

    def mostrar_doctores(self):
        print(f"Hospital: {self.nombre}")
        if not self.doctores:
            print("  No hay doctores asignados.")
        else:
            for d in self.doctores:
                print(f"  - {d.nombre} ({d.especialidad})")
class Main():
    d1 = Doctor("Ana Gómez", "Cardiología")
    d2 = Doctor("Luis Pérez", "Neurología")
    d3 = Doctor("María López", "Pediatría")

    h1 = Hospital("Hospital Central")
    h2 = Hospital("Hospital del Sur")

    h1.asignar_doctor(d1)
    h1.asignar_doctor(d2)
    h2.asignar_doctor(d2)
    h2.asignar_doctor(d3)

    h1.mostrar_doctores()
    h2.mostrar_doctores()