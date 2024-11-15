/** @type {import('tailwindcss').Config} */
export default {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [],
  darkMode : "selector",
}

module.exports = {

  plugins: [
    require('flowbite/plugin')
  ],

  content: [
    "./node_modules/flowbite/**/*.js"
  ]

}