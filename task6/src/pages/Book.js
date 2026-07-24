import { Link } from "react-router-dom";

function Books() {
  return (
    <div>

      <h1>Books</h1>

      <ul>
        <li><Link to="/books/atomic-habits">Atomic Habits</Link></li>

        <li><Link to="/books/the-alchemist">The Alchemist</Link></li>

        <li><Link to="/books/rich-dad-poor-dad">Rich Dad Poor Dad</Link></li>

        <li><Link to="/books/ikigai">Ikigai</Link></li>

        <li><Link to="/books/deep-work">Deep Work</Link></li>

        <li><Link to="/books/think-like-a-monk">Think Like a Monk</Link></li>

      </ul>

      <Link to="/">Home</Link>

    </div>
  );
}

export default Books;