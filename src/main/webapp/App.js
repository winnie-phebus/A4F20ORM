class App extends React.Component {
  render() {
    return (
      <div className="container-fluid">
        <Table
          host="localhost:3306"
          schema="YOUR_SCHEMA"
          username="YOUR_USERNAME"
          password="YOUR_PASSWORD"
          table="courses"/>
      </div>
    );
  }
}
