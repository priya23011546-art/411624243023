// import HomePage from "./pages/HomePage";

// function App() {
//     return <HomePage />;
// }

// export default App;
// import Counter from "./Counter";

// function App() {
//   return (
//     <div>
//       <Counter />
//     </div>
//   );
// }

// export default App;
// import MyCounter from "./Counter";

// function App() {
//   return (
//     <>
//       <MyCounter />
//     </>
//   );
// }

// export default App;
import Navbar from "./Navbar";
import MyCounter from "./Counter";
import { Add, Sub, Multiply, Divide } from "./Math";
import { Routes, Route } from "react-router-dom";

function App() {
  return (
    <>
      <Navbar />

      <Routes>
        <Route path="/Counter" element={<MyCounter />} />
        <Route path="/Add" element={<Add />} />
        <Route path="/Sub" element={<Sub />} />
        <Route path="/Multiply" element={<Multiply />} />
        <Route path="/Divide" element={<Divide />} />
        <Route path="*" element={<h1>Incorrect Path</h1>} />
      </Routes>

      <Add />
      <Sub />
      <Multiply />
      <Divide />
      <MyCounter />
    </>
  );
}

export default App;