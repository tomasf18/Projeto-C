from tkinter import *
from Objects import *
import time
import math
from Interpreter import Interpreter

root = Root()

viewOpts = {
    "width" : 1000,
    "height" : 800,
    "title" : "Fibonacci spiral",
    "background" : "White"
}

view = View(root, viewOpts)

# Start Rectangle ---
v1 = 270
v2 = 250
v4 = 10
v5 = 10
v3 = Point(v4, v5)
v6 = "Red"
r1 = Rectangle(root=root, at=(v1, v2), length=v3, fill=v6)
# --- End Rectangle


# Start Rectangle ---
v7 = 250
v8 = 250
v10 = 10
v11 = 10
v9 = Point(v10, v11)
v12 = "Red"
r2 = Rectangle(root=root, at=(v7, v8), length=v9, fill=v12)
# --- End Rectangle


# Start Rectangle ---
v13 = 260
v14 = 280
v16 = 20
v17 = 20
v15 = Point(v16, v17)
v18 = "Red"
r3 = Rectangle(root=root, at=(v13, v14), length=v15, fill=v18)
# --- End Rectangle


# Start Rectangle ---
v19 = 310
v20 = 270
v22 = 30
v23 = 30
v21 = Point(v22, v23)
v24 = "Red"
r4 = Rectangle(root=root, at=(v19, v20), length=v21, fill=v24)
# --- End Rectangle


# Start Rectangle ---
v25 = 290
v26 = 190
v28 = 50
v29 = 50
v27 = Point(v28, v29)
v30 = "Red"
r5 = Rectangle(root=root, at=(v25, v26), length=v27, fill=v30)
# --- End Rectangle


# Start Rectangle ---
v31 = 160
v32 = 220
v34 = 80
v35 = 80
v33 = Point(v34, v35)
v36 = "Red"
r6 = Rectangle(root=root, at=(v31, v32), length=v33, fill=v36)
# --- End Rectangle


# Start Rectangle ---
v37 = 210
v38 = 430
v40 = 130
v41 = 130
v39 = Point(v40, v41)
v42 = "Red"
r7 = Rectangle(root=root, at=(v37, v38), length=v39, fill=v42)
# --- End Rectangle


# Start Rectangle ---
v43 = 550
v44 = 350
v46 = 210
v47 = 210
v45 = Point(v46, v47)
v48 = "Red"
r8 = Rectangle(root=root, at=(v43, v44), length=v45, fill=v48)
# --- End Rectangle


# Start Arc ---
v50 = 270
v51 = 10
v49 = v50 - v51
v53 = 250
v54 = 10
v52 = v53 + v54
v57 = 10
v58 = 2
v56 = v57 * v58
v60 = 10
v61 = 2
v59 = v60 * v61
v55 = Point(v56, v59)
v62 = 0
v63 = 90
a1 = Arc(root=root, at=(v49, v52), length=v55, start=v62, extent=v63)
# --- End Arc


# Start Arc ---
v65 = 250
v66 = 10
v64 = v65 + v66
v68 = 250
v69 = 10
v67 = v68 + v69
v72 = 10
v73 = 2
v71 = v72 * v73
v75 = 10
v76 = 2
v74 = v75 * v76
v70 = Point(v71, v74)
v77 = 90
v78 = 90
a2 = Arc(root=root, at=(v64, v67), length=v70, start=v77, extent=v78)
# --- End Arc


# Start Arc ---
v80 = 260
v81 = 20
v79 = v80 + v81
v83 = 280
v84 = 20
v82 = v83 - v84
v87 = 20
v88 = 2
v86 = v87 * v88
v90 = 20
v91 = 2
v89 = v90 * v91
v85 = Point(v86, v89)
v92 = 180
v93 = 90
a3 = Arc(root=root, at=(v79, v82), length=v85, start=v92, extent=v93)
# --- End Arc


# Start Arc ---
v95 = 310
v96 = 30
v94 = v95 - v96
v98 = 270
v99 = 30
v97 = v98 - v99
v102 = 30
v103 = 2
v101 = v102 * v103
v105 = 30
v106 = 2
v104 = v105 * v106
v100 = Point(v101, v104)
v107 = 270
v108 = 90
a4 = Arc(root=root, at=(v94, v97), length=v100, start=v107, extent=v108)
# --- End Arc


# Start Arc ---
v110 = 290
v111 = 50
v109 = v110 - v111
v113 = 190
v114 = 50
v112 = v113 + v114
v117 = 50
v118 = 2
v116 = v117 * v118
v120 = 50
v121 = 2
v119 = v120 * v121
v115 = Point(v116, v119)
v122 = 0
v123 = 90
a5 = Arc(root=root, at=(v109, v112), length=v115, start=v122, extent=v123)
# --- End Arc


# Start Arc ---
v125 = 160
v126 = 80
v124 = v125 + v126
v128 = 220
v129 = 80
v127 = v128 + v129
v132 = 80
v133 = 2
v131 = v132 * v133
v135 = 80
v136 = 2
v134 = v135 * v136
v130 = Point(v131, v134)
v137 = 90
v138 = 90
a6 = Arc(root=root, at=(v124, v127), length=v130, start=v137, extent=v138)
# --- End Arc


# Start Arc ---
v140 = 210
v141 = 130
v139 = v140 + v141
v143 = 430
v144 = 130
v142 = v143 - v144
v147 = 130
v148 = 2
v146 = v147 * v148
v150 = 130
v151 = 2
v149 = v150 * v151
v145 = Point(v146, v149)
v152 = 180
v153 = 90
a7 = Arc(root=root, at=(v139, v142), length=v145, start=v152, extent=v153)
# --- End Arc


# Start Arc ---
v155 = 550
v156 = 210
v154 = v155 - v156
v158 = 350
v159 = 210
v157 = v158 - v159
v162 = 210
v163 = 2
v161 = v162 * v163
v165 = 210
v166 = 2
v164 = v165 * v166
v160 = Point(v161, v164)
v167 = 270
v168 = 90
a8 = Arc(root=root, at=(v154, v157), length=v160, start=v167, extent=v168)
# --- End Arc

v169 = [r1,r2,r3,r4,r5,r6,r7,r8]
rects = v169
v170 = [a1,a2,a3,a4,a5,a6,a7,a8]
arcs = v170
with open("./tests/xaglScripts/s4.xagl", 'r') as file:
    v171 = file.read()
s1 = v171
v172 = 0
v173 = 8
for i in range(v172, v173, 1):
    v174 = rects[i]
    rect = v174
    v175 = arcs[i]
    arc = v175
    v176 = rect
    v177 = view
    Interpreter(s1, m=v176, v=v177)
    v178 = arc
    v179 = view
    Interpreter(s1, m=v178, v=v179)
    v180 = 200
    view.update(float(v180)/1000)
view.update()
v181 = "Click on the canvas to exit."
print(v181)
v183 =  MouseClickEvent(view, root)


# Wait for the user to click and get the coordinates
v182 = v183.wait_for_click()
p = v182
view.close()

root.tk.mainloop()