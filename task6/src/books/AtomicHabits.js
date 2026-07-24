import { Link } from "react-router-dom";

function AtomicHabits() {
  return (
    <div>

      <h1>Atomic Habits</h1>

      <p><b>Author:</b> James Clear</p>

      <p><b>Genre:</b> Self Help</p>

      <p>
        Learn how small habits create remarkable results.
      </p>

      <Link to="/books">Back to Books</Link>

      <br /><br />

      <Link to="/books/think-like-a-monk">Previous</Link>

      {" | "}

      <Link to="/books/the-alchemist">Next</Link>

    </div>
  );
}

export default AtomicHabits;