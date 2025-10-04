class MP4:
    def __init__(self, capacidad_gb):
        self.capacidad_gb = capacidad_gb
        self.no_canciones = 0
        self.no_videos = 0
        self.canciones = []  # cada canción: [nombre, artista, peso]
        self.videos = []     # cada video: [nombre, artista, peso]
    def borrar_cancion(self, criterio):
        original = len(self.canciones)
        if isinstance(criterio, str):
            self.canciones = [c for c in self.canciones if criterio not in c[:2]]
        elif isinstance(criterio, int):
            self.canciones = [c for c in self.canciones if c[2] != criterio]
        self.no_canciones = len(self.canciones)
        print(f"Se eliminaron {original - self.no_canciones} canciones.")
    def __add__(self, elemento):
        if isinstance(elemento, dict) and elemento.get("tipo") == "cancion":
            nueva = [elemento["nombre"], elemento["artista"], elemento["peso"]]
            if nueva in self.canciones:
                print("La canción ya existe.")
                return self
            if self.peso_total() + nueva[2] > self.capacidad_mg():
                print("No hay suficiente capacidad para la canción.")
                return self
            self.canciones.append(nueva)
            self.no_canciones += 1
            print("Canción añadida.")
        elif isinstance(elemento, dict) and elemento.get("tipo") == "video":
            nuevo = [elemento["nombre"], elemento["artista"], elemento["peso"]]
            if nuevo in self.videos:
                print("El video ya existe.")
                return self
            if self.peso_total() + nuevo[2] > self.capacidad_mg():
                print("No hay suficiente capacidad para el video.")
                return self
            self.videos.append(nuevo)
            self.no_videos += 1
            print("Video añadido.")
        return self
    def capacidad_disponible(self):
        disponible = self.capacidad_mg() - self.peso_total()
        print(f"Capacidad disponible: {disponible} MB")
        return disponible

    def peso_total(self):
        total = sum(c[2] for c in self.canciones) + sum(v[2] for v in self.videos)
        return total

    def capacidad_mg(self):
        return int(self.capacidad_gb * 1024)  # 1 GB = 1024 MB

    def mostrar(self):
        print(f"\nMP4 con capacidad: {self.capacidad_gb} GB")
        print("Canciones:")
        for c in self.canciones:
            print(f" - {c[0]} | {c[1]} | {c[2]} MB")
        print("Videos:")
        for v in self.videos:
            print(f" - {v[0]} | {v[1]} | {v[2]} MB")
class Main():
    mp4 = MP4(2)
    mp4 + {"tipo": "cancion", "nombre": "Back To Black", "artista": "Amy Winehouse", "peso": 100}
    mp4 + {"tipo": "cancion", "nombre": "Lost On You", "artista": "LP", "peso": 150}
    mp4 + {"tipo": "video", "nombre": "Heathens", "artista": "twenty one pilots", "peso": 50}
    mp4 + {"tipo": "video", "nombre": "Harmonica Andromeda", "artista": "KSHMR", "peso": 70}
    mp4 + {"tipo": "video", "nombre": "Without Me", "artista": "Halsey", "peso": 30}
    mp4.mostrar()
    mp4.capacidad_disponible()
    mp4.borrar_cancion("Lost On You")
    mp4.mostrar()
    mp4.capacidad_disponible()