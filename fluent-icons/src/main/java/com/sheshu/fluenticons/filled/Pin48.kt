package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pin48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pin48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(31.818f, 5.55f)
            lineTo(42.45f, 16.183f)
            curveToRelative(2.293f, 2.292f, 1.665f, 6.157f, -1.234f, 7.607f)
            lineTo(30.67f, 29.062f)
            curveToRelative(-0.292f, 0.147f, -0.516f, 0.401f, -0.622f, 0.71f)
            lineToRelative(-2.684f, 7.77f)
            curveToRelative(-0.664f, 1.92f, -3.108f, 2.483f, -4.544f, 1.047f)
            lineTo(17f, 32.769f)
            lineTo(7.768f, 42f)
            horizontalLineTo(6f)
            verticalLineToRelative(-1.767f)
            lineTo(15.232f, 31f)
            lineToRelative(-5.82f, -5.82f)
            curveToRelative(-1.437f, -1.436f, -0.874f, -3.88f, 1.046f, -4.544f)
            lineToRelative(7.77f, -2.684f)
            curveToRelative(0.309f, -0.107f, 0.564f, -0.33f, 0.71f, -0.623f)
            lineTo(24.21f, 6.785f)
            curveToRelative(1.45f, -2.9f, 5.315f, -3.527f, 7.608f, -1.235f)
            close()
        }
    }.build()
}
