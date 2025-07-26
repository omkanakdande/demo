import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from "./components/Home";
import ReportCrime from "./components/ReportCrime";
import CrimeList from "./components/CrimeList";
import "./App.css";

const App = () => {
  return (
    <Router>
      <div className="App">
        <nav className="navbar">
          <h2>CrimeTracker360</h2>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/report">Report Crime</Link>
            </li>
            <li>
              <Link to="/crimes">View Crimes</Link>
            </li>
          </ul>
        </nav>

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/report" element={<ReportCrime />} />
          <Route path="/crimes" element={<CrimeList />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;
