import { useEffect, useState } from "react";
import ThemeService from "../../services/ThemeService";

function Content() {

    const [theme, setTheme] = useState(
        ThemeService.getTheme()
    );

    useEffect(() => {

        const updateTheme = (newTheme) => {
            setTheme(newTheme);
        };

        ThemeService.attach(updateTheme);

        return () =>
            ThemeService.detach(updateTheme);

    }, []);

    return (

        <div
            style={{
                padding: "50px",
                background:
                    theme === "Light"
                        ? "white"
                        : "black",
                color:
                    theme === "Light"
                        ? "black"
                        : "white",
            }}
        >

            <h3>Content Area</h3>

            <p>
                Theme changes automatically using
                Observer Pattern.
            </p>

        </div>

    );
}

export default Content;