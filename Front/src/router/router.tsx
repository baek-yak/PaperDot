import Main from '../pages/Main';
import Login from '../pages/Login';
import Signup from '../pages/Signup';
import Mypage from '../pages/Mypage';
import App from '../App';
import { createBrowserRouter } from 'react-router-dom';
import Radio from '../pages/Radio';
import SearchResult from '../pages/SearchResult';

export const router = createBrowserRouter([
  {
    path: '/',
    element: <App />,
    children: [
      {
        path: '/',
        element: <Main />,
      },
      {
        path: '/login',
        element: <Login />,
      },
      {
        path: '/radio',
        element: <Radio />,
      },
      {
        path: '/signup',
        element: <Signup />,
      },
      {
        path: '/mypage',
        element: <Mypage />,
      },
      {
        path: '/result',
        element: <SearchResult />,
      },
    ],
  },
]);
