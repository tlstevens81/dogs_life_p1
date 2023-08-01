import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import AllHeroes from './components/AllHeroes';
import HeroForm from './components/HeroForm';
import { Route, Routes } from 'react-router';

function App() {
  return (
    <>
    
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container>
          <Navbar.Brand href="/">Heroes</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="/heroes">All Heroes</Nav.Link>
              <Nav.Link href="/hero">Add Hero</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      
        <Routes>
          <Route path="/heroes" element={<AllHeroes/>} />
          <Route path="/hero" element={<HeroForm/>} />
          <Route path="/" element={<AllHeroes/>} />
        </Routes>
      
    </>
  );
}

export default App;
