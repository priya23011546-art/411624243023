import { Link } from "react-router-dom";

function About() {
  return (
    <div>

      <h1>About</h1>

      <p>
        This bookstore provides popular books and author information.
      </p>

      <Link to="/">Home</Link>

      <br />

      <Link to="/books">Books</Link>

    </div>
  );
}

export default About;