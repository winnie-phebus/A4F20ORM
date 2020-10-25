class Courses extends React.Component {
  state = {
    courses: []
  }

  componentDidMount = () =>
    findAllCourses()
      .then(courses => this.setState({courses}))

  render() {
    return(
      <div>
        <h1>Courses</h1>
        <ul>
          {
            this.state.courses.map(course =>
              <li key={course.courseId}>
                {course.title}
              </li>
            )
          }
        </ul>
      </div>
    )
  }
}
