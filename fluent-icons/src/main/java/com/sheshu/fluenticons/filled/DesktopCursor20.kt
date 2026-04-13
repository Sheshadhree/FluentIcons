package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DesktopCursor20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopCursor20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(10f)
            curveTo(2f, 14.328f, 2.672f, 15f, 3.5f, 15f)
            horizontalLineTo(7f)
            verticalLineToRelative(2f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 17f, 5f, 17.224f, 5f, 17.5f)
            reflectiveCurveTo(5.224f, 18f, 5.5f, 18f)
            horizontalLineTo(11f)
            lineToRelative(0.001f, -1f)
            horizontalLineTo(8f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3.002f)
            lineToRelative(0.003f, -4.5f)
            curveToRelative(0f, -0.606f, 0.364f, -1.152f, 0.923f, -1.385f)
            curveToRelative(0.559f, -0.232f, 1.203f, -0.107f, 1.633f, 0.32f)
            lineToRelative(4.408f, 4.368f)
            curveTo(17.99f, 13.705f, 18f, 13.603f, 18f, 13.5f)
            verticalLineToRelative(-10f)
            curveTo(18f, 2.672f, 17.328f, 2f, 16.5f, 2f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(9.357f, 8.145f)
            curveToRelative(-0.143f, -0.142f, -0.358f, -0.184f, -0.544f, -0.106f)
            curveToRelative(-0.187f, 0.077f, -0.308f, 0.259f, -0.308f, 0.46f)
            lineTo(12f, 18.5f)
            curveToRelative(0f, 0.214f, 0.138f, 0.405f, 0.342f, 0.474f)
            curveToRelative(0.204f, 0.068f, 0.428f, -0.002f, 0.558f, -0.174f)
            lineToRelative(1.995f, -2.646f)
            lineToRelative(3.496f, 0.776f)
            curveToRelative(0.218f, 0.048f, 0.44f, -0.054f, 0.548f, -0.25f)
            curveToRelative(0.106f, -0.195f, 0.07f, -0.437f, -0.087f, -0.594f)
            lineToRelative(-5.995f, -5.94f)
            close()
        }
    }.build()
}
