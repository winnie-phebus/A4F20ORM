const coursesUrl = "http://localhost:8080/api/courses"
const findAllCourses = () =>
  fetch(`${coursesUrl}`)
    .then(response => response.json())
