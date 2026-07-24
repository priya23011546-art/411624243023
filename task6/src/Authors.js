import { Link } from "react-router-dom";

function Authors() {
  return (
    <div>

      <h1>Authors</h1>

      <ul>

        <li><Link to="/authors/james-clear">James Clear</Link></li>

        <li><Link to="/authors/paulo-coelho">Paulo Coelho</Link></li>

        <li><Link to="/authors/robert-kiyosaki">Robert Kiyosaki</Link></li>

        <li><Link to="/authors/hector-garcia">Hector Garcia</Link></li>

        <li><Link to="/authors/cal-newport">Cal Newport</Link></li>

        <li><Link to="/authors/jay-shetty">Jay Shetty</Link></li>

      </ul>

      <Link to="/">Home</Link>

    </div>
  );
}

export default Authors;