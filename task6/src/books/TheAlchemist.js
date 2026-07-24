import { Link } from "react-router-dom";

function TheAlchemist() {
  return (
    <div>

      <h1>The Alchemist</h1>

      <p><b>Author:</b> Paulo Coelho</p>

      <p><b>Genre:</b> Fiction</p>

      <p>A story about following your dreams.</p>

      <Link to="/books">Back to Books</Link>

      <br /><br />

      <Link to="/books/atomic-habits">Previous</Link>

      {" | "}

      <Link to="/books/rich-dad-poor-dad">Next</Link>

    </div>
  );
}

export default TheAlchemist;