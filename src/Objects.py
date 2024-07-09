from tkinter import *
import time


# Objetos no canva
Items = []

class Root:
    global Items
    def __init__(self):
        self.tk = Tk()
        self.tk.withdraw()
    def add_object(self, object):
        Items.append(object)

class View:
    global Items
    def __init__(self, root: Root, opts: dict = {}, Ox=0, Oy=0):
        self.root = root
        self.top = Toplevel(self.root.tk)
        self.width = opts["width"] if "width" in opts else 400
        self.height = opts["height"] if "height" in opts else 400
        self.background = opts["background"] if "background" in opts else "wheat"
        self.top.title(opts.get("title", "AGL Window"))
        self.at = (Ox, Oy)
        self.canvas: Canvas = Canvas(self.top, width=self.width, height=self.height, bg=self.background)
        self.canvas.place(x=self.at[0], y=self.at[1])
        self.top.geometry(f"{self.width}x{self.height}")

        self.last_refresh = 0;

    def update(self, time_sleep = 0):
        delta_time = (time.time() - self.last_refresh)
        if 0 < time_sleep and  delta_time < time_sleep:
            time.sleep(time_sleep - delta_time)

        Objects = self.canvas.find_all()

        for object in Objects:
            self.canvas.delete(object)
        
        for object in Items:
            object.draw(self);
        
        self.canvas.update()
        self.last_refresh = time.time()

    def move_by(self, dx, dy):
        self.at = (self.at[0]-dx, self.at[1]-dy)
        self.canvas.place(x=self.at[0], y=self.at[1])

    def move_to(self, x, y):
        self.at = (x, y)

    def move_relative(self, objects, dx, dy):
        if isinstance(objects, list):
            for object in objects:
                object.move_by(dx, dy)
        else:
            objects.move_by(dx, dy)

    def move_absolute(self, objects, x, y):
        if isinstance(objects, list):
            for object in objects:
                object.move_to(x, y)
        else:   
            objects.move_to(x, y)

    def close(self):
        self.root.tk.destroy()
        


class Object:
    """ 
    Object is gonna be associated (optionally) with a view widget (canvas) (which is in a root), 
    where it will be at coords "at", and with state "state"
    """
    def __init__(self, root: Root, view: View, at, state):
        self.root = root
        self.view = view
        self.at = at
        self.state = state

        self.root.add_object(self)

    def move_by(self, dx, dy):
        self.at = (self.at[0] + dx, self.at[1] + dy)

    def move_to(self, x, y):
        self.at = (x, y)

    def draw(self, view):
        pass


class Line(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", length=(50, 50), fill="red"):
        # opts is a dict
        super().__init__(root, view, at, state)
        self.length = length
        self.fill = fill
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])

    def draw(self, view):
        self.view = view
        self.view.canvas.create_line(self.at, self.point_end, fill=self.fill, state=self.state)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.point_end = (self.point_end[0]+dx, self.point_end[1]+dy)

    def move_to(self, x, y):
        super().move_to(x, y)
        self.point_end = (self.point_end[0]+x, self.point_end[1]+y)
    

class Rectangle(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", length=(50, 50), fill="red"):
        super().__init__(root, view, at, state)
        self.properties = {}
        self.points = [(-1, 1), (1, 1), (1, -1), (-1, -1), (-1, 1)]
        self.length = length
        self.fill = fill
        self.points = [(self.at[0]+self.length[0], self.at[1]+self.length[1]),
                       (self.at[0]+self.length[0], self.at[1]-self.length[1]),
                       (self.at[0]-self.length[0], self.at[1]-self.length[1]),
                       (self.at[0]-self.length[0], self.at[1]+self.length[1]),
                       (self.at[0]+self.length[0], self.at[1]+self.length[1])]

    def draw(self, view):
        self.view = view
        self.view.canvas.create_line(self.points, fill=self.fill, state=self.state)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.points = [(self.points[0][0]+dx, self.points[0][1]+dy),
                       (self.points[1][0]+dx, self.points[1][1]+dy),
                       (self.points[2][0]+dx, self.points[2][1]+dy),
                       (self.points[3][0]+dx, self.points[3][1]+dy),
                       (self.points[4][0]+dx, self.points[4][1]+dy)]

    def move_to(self, x, y):
        super().move_to(x, y)
        self.points = [(self.at[0]+self.length[0], self.at[1]+self.length[1]),
                       (self.at[0]+self.length[0], self.at[1]-self.length[1]),
                       (self.at[0]-self.length[0], self.at[1]-self.length[1]),
                       (self.at[0]-self.length[0], self.at[1]+self.length[1]),
                       (self.at[0]+self.length[0], self.at[1]+self.length[1])]


class Polygon(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", points=[(100, 50), (300, 50), (300, 250), (200, 350), (100, 250), (100, 50)], fill="red"):
        super().__init__(root, view, at, state)
        self.properties = {}
        self.points = points
        self.fill = fill
        self.line_points = []
        for point in self.points:
            self.line_points.append((self.at[0]+point[0], self.at[1]+point[1]))

    def draw(self, view):
        self.view = view
        self.view.canvas.create_polygon(self.line_points, fill=self.fill, state=self.state)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.points = self.line_points
        self.line_points = []
        for point in self.points:
            self.line_points.append((point[0]+dx, point[1]+dy))

    def move_to(self, x, y):
        super().move_to(x, y)
        self.line_points = []
        for point in self.points:
            self.line_points.append((self.at[0]+point[0], self.at[1]+point[1]))


class Polyline(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", points=[(100, 50), (300, 50), (300, 250), (200, 350), (100, 250), (100, 50)], fill="red"):
        super().__init__(root, view, at, state)
        self.properties = {}
        self.points = points
        self.fill = fill
        self.line_points = []
        for point in self.points:
            self.line_points.append((self.at[0]+point[0], self.at[1]+point[1]))

    def draw(self, view):
        self.view = view
        self.view.canvas.create_line(self.line_points, fill=self.fill, state=self.state)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.points = self.line_points
        self.line_points = []
        for point in self.points:
            self.line_points.append((point[0]+dx, point[1]+dy))

    def move_to(self, x, y):
        super().move_to(x, y)
        self.line_points = []
        for point in self.points:
            self.line_points.append((self.at[0]+point[0], self.at[1]+point[1]))

    
class Spline(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", points=[(100, 50), (300, 50), (300, 250), (200, 350), (100, 250), (100, 50)], fill="red"):
        super().__init__(root, view, at, state)
        self.properties = {}
        self.points = points
        self.fill = fill
        self.line_points = []
        for point in self.points:
            self.line_points.append((self.at[0]+point[0], self.at[1]+point[1]))

    def draw(self, view):
        self.view = view
        self.view.canvas.create_line(self.line_points, fill=self.fill, state=self.state, smooth=1)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.points = self.line_points
        self.line_points = []
        for point in self.points:
            self.line_points.append((point[0]+dx, point[1]+dy))

    def move_to(self, x, y):
        super().move_to(x, y)
        self.line_points = []
        for point in self.points:
            self.line_points.append((self.at[0]+point[0], self.at[1]+point[1]))

class Blob(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", points=[(100, 50), (300, 50), (300, 250), (200, 350), (100, 250), (100, 50)], fill="red"):
        super().__init__(root, view, at, state)
        self.properties = {}
        self.points = points
        self.fill = fill
        self.line_points = []
        for point in self.points:
            self.line_points.append((self.at[0]+point[0], self.at[1]+point[1]))

    def draw(self, view):
        self.view = view
        self.view.canvas.create_polygon(self.line_points, fill=self.fill, state=self.state, smooth=1)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.points = self.line_points
        self.line_points = []
        for point in self.points:
            self.line_points.append((point[0]+dx, point[1]+dy))

    def move_to(self, x, y):
        super().move_to(x, y)
        self.line_points = []
        for point in self.points:
            self.line_points.append((self.at[0]+point[0], self.at[1]+point[1]))


class Ellipse(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", length=(50, 50), fill="red"):
        at = (at[0] - length[0], at[1] - length[1])
        length = (2*length[0], 2*length[1])
        super().__init__(root, view, at, state)
        self.properties = {}
        self.length = length
        self.fill = fill
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])

    def draw(self, view):
        self.view = view
        self.view.canvas.create_oval(self.at, self.point_end, fill=self.fill, state=self.state)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.point_end = (self.point_end[0]+dx, self.point_end[1]+dy)

    def move_to(self, x, y):
        super().move_to(x, y) 
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])


class Arc(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", length=(50, 50), start=30, extent=100, outline="black"):
        at = (at[0] - length[0], at[1] - length[1])
        length = (2*length[0], 2*length[1])
        super().__init__(root, view, at, state)
        self.properties = {}
        self.length = length
        self.start = start
        self.extent = extent
        self.outline = outline
        self.style = "arc"
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])

    def draw(self, view):
        self.view = view
        self.view.canvas.create_arc(self.at, self.point_end, start=self.start, extent=self.extent, outline=self.outline, style=self.style)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.point_end = (self.point_end[0]+dx, self.point_end[1]+dy)

    def move_to(self, x, y):
        super().move_to(x, y)
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])
        


class ArcChord(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", length=(50, 50), start=30, extent=100, fill="black"):
        at = (at[0] - length[0], at[1] - length[1])
        length = (2*length[0], 2*length[1])
        super().__init__(root, view, at, state)
        self.properties = {}
        self.length = length
        self.start = start
        self.extent = extent
        self.fill = fill
        self.style = "chord"
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])

    def draw(self, view):
        self.view = view
        self.view.canvas.create_arc(self.at, self.point_end, start=self.start, extent=self.extent, fill=self.fill, style=self.style)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.point_end = (self.point_end[0]+dx, self.point_end[1]+dy)

    def move_to(self, x, y):
        super().move_to(x, y)
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])
        

    
class PieSlice(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", length=(50, 50), start=30, extent=100, fill="black"):
        super().__init__(root, view, at, state)
        self.properties = {}
        self.length = length
        self.start = start
        self.extent = extent
        self.fill = fill
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])

    def draw(self, view):
        self.view = view
        self.view.canvas.create_arc(self.at, self.point_end, start=self.start, extent=self.extent, fill=self.fill)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.point_end = (self.point_end[0]+dx, self.point_end[1]+dy)

    def move_to(self, x, y):
        super().move_to(x, y)
        self.point_end = (self.at[0]+self.length[0], self.at[1]+self.length[1])
        


class Text(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", text="", fill="black"):
        super().__init__(root, view, at, state)
        self.properties = {}
        self.text = text
        self.fill = fill

    def draw(self, view):
        self.view = view
        self.view.canvas.create_text(self.at, text=self.text, fill=self.fill, state=self.state)

    def move_by(self, dx, dy):
        super().move_by(dx, dy)

    def move_to(self, x, y):
        super().move_to(x, y)
        


class Dot(Object):

    def __init__(self, root: Root, view: View = None, at=(0, 0), state="normal", fill="black"):
        super().__init__(root, view, at, state)
        self.properties = {}
        self.points = [(1, 1), (-1, -1)]
        self.length = (1, 1)
        self.fill = fill
        self.points = [(self.at[0]+self.length[0], self.at[1]+self.length[1]),
                        (self.at[0]-self.length[0], self.at[1]-self.length[1])]

    def draw(self, view):
        self.view = view
        self.view.canvas.create_rectangle(self.points, fill=self.fill, state=self.state)

    
    def move_by(self, dx, dy):
        super().move_by(dx, dy)
        self.points = [(self.points[0][0]+dx, self.points[0][1]+dy),
                        (self.points[1][0]+dx, self.points[1][1]+dy)]

    def move_to(self, x, y):
        super().move_to(x, y)
        self.points = [(self.at[0]+self.length[0], self.at[1]+self.length[1]),
                        (self.at[0]-self.length[0], self.at[1]-self.length[1])]


class Point:
    def __init__(self, x, y) -> None:
        self.tuple = (x, y)
    
    def __getitem__(self, index):
        return self.tuple[index]

    def __add__(self, other):
        return Point(self.tuple[0] + other.tuple[0], self.tuple[1] + other.tuple[1])
    
    def __sub__(self, other):
        return Point(self.tuple[0] - other.tuple[0], self.tuple[1] - other.tuple[1])
    
    def __repr__(self) -> str:
        return self.tuple.__repr__()


class MouseClickEvent:

    def __init__(self, view, root):
        self.point = None
        self.clicked = BooleanVar(value=False)
        self.view = view
        
        # Bind the mouse click event to the view
        view.canvas.bind("<Button-1>", self.on_click)

    def on_click(self, event):
        # Get the coordinates of the mouse click
        self.point = Point(event.x, event.y)
        self.clicked.set(True)

    def wait_for_click(self):
        # Wait until a click is detected
        self.clicked.set(False)
        self.view.canvas.wait_variable(self.clicked)
        return self.point
    

