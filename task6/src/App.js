import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./pages/Home";
import Books from "./pages/Books";
import Authors from "./pages/Authors";
import About from "./pages/About";
import NotFound from "./pages/NotFound";

import AtomicHabits from "./books/AtomicHabits";
import TheAlchemist from "./books/TheAlchemist";
import RichDadPoorDad from "./books/RichDadPoorDad";
import Ikigai from "./books/Ikigai";
import DeepWork from "./books/DeepWork";
import ThinkLikeAMonk from "./books/ThinkLikeAMonk";

import JamesClear from "./authors/JamesClear";
import PauloCoelho from "./authors/PauloCoelho";
import RobertKiyosaki from "./authors/RobertKiyosaki";
import HectorGarcia from "./authors/HectorGarcia";
import CalNewport from "./authors/CalNewport";
import JayShetty from "./authors/JayShetty";

function App() {
  return (
    <BrowserRouter>
      <Routes>

        <Route path="/" element={<Home />} />

        <Route path="/books" element={<Books />} />
        <Route path="/books/atomic-habits" element={<AtomicHabits />} />
        <Route path="/books/the-alchemist" element={<TheAlchemist />} />
        <Route path="/books/rich-dad-poor-dad" element={<RichDadPoorDad />} />
        <Route path="/books/ikigai" element={<Ikigai />} />
        <Route path="/books/deep-work" element={<DeepWork />} />
        <Route path="/books/think-like-a-monk" element={<ThinkLikeAMonk />} />

        <Route path="/authors" element={<Authors />} />
        <Route path="/authors/james-clear" element={<JamesClear />} />
        <Route path="/authors/paulo-coelho" element={<PauloCoelho />} />
        <Route path="/authors/robert-kiyosaki" element={<RobertKiyosaki />} />
        <Route path="/authors/hector-garcia" element={<HectorGarcia />} />
        <Route path="/authors/cal-newport" element={<CalNewport />} />
        <Route path="/authors/jay-shetty" element={<JayShetty />} />

        <Route path="/about" element={<About />} />

        <Route path="*" element={<NotFound />} />

      </Routes>
    </BrowserRouter>
  );
}

export default App;