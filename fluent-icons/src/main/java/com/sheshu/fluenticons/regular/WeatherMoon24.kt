package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.WeatherMoon24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.WeatherMoon24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.026f, 17.001f)
            curveToRelative(-2.762f, 4.784f, -8.879f, 6.423f, -13.663f, 3.661f)
            curveToRelative(-1.302f, -0.752f, -2.399f, -1.77f, -3.234f, -2.982f)
            curveToRelative(-0.28f, -0.406f, -0.099f, -0.966f, 0.365f, -1.132f)
            curveToRelative(3.767f, -1.348f, 5.785f, -2.91f, 6.956f, -5.146f)
            curveTo(11.682f, 9.05f, 12f, 6.472f, 11.139f, 2.94f)
            curveToRelative(-0.12f, -0.489f, 0.266f, -0.954f, 0.769f, -0.927f)
            curveToRelative(1.556f, 0.083f, 3.078f, 0.53f, 4.457f, 1.327f)
            curveToRelative(4.784f, 2.762f, 6.423f, 8.879f, 3.66f, 13.662f)
            close()
            moveToRelative(-8.248f, -4.903f)
            curveToRelative(-1.25f, 2.389f, -3.31f, 4.1f, -6.817f, 5.499f)
            curveToRelative(0.608f, 0.696f, 1.332f, 1.292f, 2.152f, 1.766f)
            curveToRelative(4.067f, 2.348f, 9.266f, 0.955f, 11.614f, -3.112f)
            curveToRelative(2.347f, -4.066f, 0.954f, -9.265f, -3.112f, -11.613f)
            curveToRelative(-0.877f, -0.506f, -1.82f, -0.846f, -2.792f, -1.015f)
            curveToRelative(0.647f, 3.383f, 0.23f, 6.043f, -1.045f, 8.475f)
            close()
        }
    }.build()
}
