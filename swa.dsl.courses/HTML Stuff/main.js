class Course {
  color = "white";
  room = "-";
  allocated = false;
  constructor(other) {
    this.major = other.major;
    this.title = other.title;
    this.type = other.type;
    this.audience = other.audience;
    this.mapping = other.mapping;
    this.teachers = other.teachers;
    this.students = other.students;
  }

  copy(other) {
    this.major = other.major;
    this.title = other.title;
    this.type = other.type;
    this.audience = other.audience;
    this.mapping = other.mapping;
    this.color = other.color;
    this.room = other.room;
    this.allocated = other.allocated;
    this.teachers = other.teachers;
    this.students = other.students;
  }

  getDBlock() {
    const separator = '<label class="space">Platzhalter</label>';
    const title = createNode("label", "title", this.title);

    const type = createNode("label", null, this.type);
    console.log(this.room);
    const room = createNode("label", null, this.room);
    const infos = createNode("label", "infos", type + room);

    let node =
      '<div class="dblock" style="background: ' +
      this.color +
      '" ' +
      "onclick=\"togglePopup('" +
      this.title +
      "','" +
      this.major +
      "')\">\n";
    node += separator;
    node += title;
    node += infos;
    node += "</div>\n";
    return node;
  }
}

class Room {
  slots = [];
  constructor(other) {
    this.audience = other.audience;
    this.location = other.location;
    this.slots = [
      ["", "", "", "", ""],
      ["", "", "", "", ""],
      ["", "", "", "", ""],
      ["", "", "", "", ""],
      ["", "", "", "", ""],
      ["", "", "", "", ""],
    ];
  }

  clearAllocation() {
    this.slots = [
      ["", "", "", "", ""],
      ["", "", "", "", ""],
      ["", "", "", "", ""],
      ["", "", "", "", ""],
      ["", "", "", "", ""],
      ["", "", "", "", ""],
    ];
  }
}

class Color {
  threshold = 16;
  constructor(r, g, b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  getString() {
    return "rgb(" + this.r + "," + this.g + "," + this.b + ")";
  }

  similarTo(other) {
    let similar = true;
    if (Math.abs(this.r - other.r > this.threshold)) {
      similar = false;
    }
    if (Math.abs(this.g - other.g > this.threshold)) {
      similar = false;
    }
    if (Math.abs(this.b - other.b > this.threshold)) {
      similar = false;
    }
    return similar;
  }
}

window.addEventListener("wheel", (event) => {
  const delta = Math.sign(event.deltaY);
  changeDepIndex(delta);
});

popup = false;

const startTimes = ["8:15", "10.15", "12:30", "14:15", "16.00", "17:30"];
const endTimes = ["9:45", "11.45", "14:00", "15:45", "17.30", "19:00"];
const headlines = [
  "Time",
  "Monday",
  "Tuesday",
  "Wednesday",
  "Thursday",
  "Friday",
];
let slots = [
  [null, null, null, null, null],
  [null, null, null, null, null],
  [null, null, null, null, null],
  [null, null, null, null, null],
  [null, null, null, null, null],
  [null, null, null, null, null],
];

colors = new Map();

courses = [];
allCourses = [];
rooms = [];
major = [];
majorIndex = 0;

function allocateCoursesOfMajor() {
  courses = [];
  rooms.forEach((room) => {
    for (let day = 0; day < room.slots.length; day++) {
      for (let hour = 0; hour < room.slots[day].length; hour++) {
        if (room.slots[day][hour] === major[majorIndex]) {
          room.slots[day][hour] = "";
        }
      }
    }
  });
  this.slots = [
    [null, null, null, null, null],
    [null, null, null, null, null],
    [null, null, null, null, null],
    [null, null, null, null, null],
    [null, null, null, null, null],
    [null, null, null, null, null],
  ];

  allCourses.forEach((course) => {
    if (course.major === major[majorIndex]) {
      courses.push(course);
    }
  });
  colorCourses();
  allocateCoursesToRooms();
  drawSite();
}
function initialization() {
  timetableElement = document.getElementById("timetable");
  popupElement = document.getElementById("popup");

  popupTitleElement = document.getElementById("popup_title");
  popupTeachersElement = document.getElementById("popup_teachers");
  popupStudentsElement = document.getElementById("popup_students");

  majorIndex = 0;
  major = [];
  getCourses().forEach((course) => {
    allCourses.push(course);
    if (!major.includes(course.major)) {
      major.push(course.major);
    }
  });
  console.log(allCourses);
  allCourses.sort((a, b) => {
    const audienceA = a.audience; // ignore upper and lowercase
    const audienceB = b.audience; // ignore upper and lowercase
    if (audienceA < audienceB) {
      return -1;
    }
    if (audienceA > audienceB) {
      return 1;
    }
    // names must be equal
    return 0;
  });

  getRooms().forEach((r) => {
    rooms.push(new Room(r));
  });

  allocateCoursesOfMajor();
}

function drawSite() {
  const title = document.getElementById("title");
  title.innerHTML = major[majorIndex];

  let headlineContent = "";
  for (let i = 0; i < headlines.length; i++) {
    let cls = "block";
    if (i == 0) {
      cls = "tblock";
    }
    headlineContent += createNode("div", cls, headlines[i]) + "\n";
  }

  const headline = createNode("div", "headline", headlineContent);
  let tableContent = headline;

  // iteration over all rows (timeslot 1 - 6)
  for (let r = 0; r < startTimes.length; r++) {
    let lineContent = "";
    let timeContent;
    const startTime = createNode("label", null, startTimes[r]);
    const separator = createNode("label", null, "-");
    const endTime = createNode("label", null, endTimes[r]);
    timeContent = startTime + separator + endTime;
    const tblock = createNode("div", "tblock", timeContent);
    lineContent += tblock;
    // iteration over slots in row r from monday to friday
    for (let c = 0; c < this.slots[r].length; c++) {
      let block = createNode("div", "block", "");
      if (this.slots[r][c] != null) {
        console.log(this.slots[r][c]);
        const course = new Course(this.slots[r][c]);
        course.copy(this.slots[r][c]);
        block = course.getDBlock();
      }
      lineContent += block;
    }
    const line = createNode("div", "line", lineContent);
    tableContent += line;
  }
  const table = document.getElementById("table");
  table.innerHTML = tableContent;

  document.getElementById("popup").style.display = "none";
}

function togglePopup(title, maj) {
  console.log(this.popup);
  console.log(title, maj);
  if (this.popup) {
    timetableElement.style.display = "initial";
    popupElement.style.display = "none";
  } else {
    this.courses.forEach((course) => {
      if (course.title === title && course.major === maj) {
        timetableElement.style.display = "none";
        popupElement.style.display = "flex";

        popupTitleElement.innerText = course.title;
        let teacherNode = "";
        let index = 0;
        course.teachers.forEach((t) => {
          let str = t;
          if (index > 0) {
            let str = ", " + t;
          }
          teacherNode += createNode("label", "name", str);
          index++;
        });
        popupTeachersElement.innerHTML = teacherNode;

        let studentNode = "";
        index = 0;
        course.students.forEach((s) => {
          let str = s;
          if (index > 0) {
            let str = ", " + s;
          }
          studentNode += createNode("label", "name", str);
          index++;
        });
        popupStudentsElement.innerHTML = studentNode;
      }
    });
  }
  this.popup = !popup;
}

function allocateCoursesToRooms() {
  courses.forEach((course) => {
    console.log("allocate", course.title);
    const possibleRooms = [];
    rooms.forEach((room) => {
      if (room.audience === course.audience) {
        possibleRooms.push(room);
      }
    });
    let allocated = false;
    for (let day = 0; day < this.slots.length && !allocated; day++) {
      for (let hour = 0; hour < this.slots[day].length && !allocated; hour++) {
        if (this.slots[day][hour] != null) {
          continue;
        }
        for (let i = 0; i < possibleRooms.length && !allocated; i++) {
          if (possibleRooms[i].slots[day][hour] === "") {
            possibleRooms[i].slots[day][hour] = course.major;
            course.room = possibleRooms[i].location;
            this.slots[day][hour] = course;
            course.allocated = true;
            allocated = true;
          }
        }
      }
    }
  });
}

function changeDepIndex(mod) {
  if (!popup) {
    let newIndex = majorIndex + mod;
    if (newIndex < 0) {
      newIndex = major.length - 1;
    } else if (newIndex >= major.length) {
      newIndex = 0;
    }
    majorIndex = newIndex;
    allocateCoursesOfMajor();
  }
}

function colorCourses() {
  courses.forEach((course) => {
    let key = course.major + course.mapping;
    if (colors.has(key)) {
      course.color = colors.get(key).getString();
    } else {
      let color;
      let similar = true;
      while (similar) {
        similar = false;
        color = getNewColor();
        colors.forEach((mapColor) => {
          if (mapColor.similarTo(color)) {
            similar = true;
          }
        });
      }
      course.color = color.getString();
      colors.set(key, color);
    }
  });
}

/**
 *
 * @param nodeName node around text
 * @param cls class of node
 * @param text text in node
 * @returns {string}
 */
function createNode(nodeName, cls, text) {
  let node = "<" + nodeName;
  if (cls != null) {
    node += ' class="' + cls + '"';
  }
  if (text != null) {
    node += ">\n" + text.trim() + "\n</" + nodeName + ">" + "\n";
  } else {
    node += ">\n" + "" + "\n</" + nodeName + ">" + "\n";
  }
  return node;
}

function getNewColor() {
  const r = 156 + getRandomInt(100);
  const g = 156 + getRandomInt(100);
  const b = 156 + getRandomInt(100);

  return new Color(r, g, b);
}

function getRandomInt(max) {
  return Math.floor(Math.random() * max);
}
