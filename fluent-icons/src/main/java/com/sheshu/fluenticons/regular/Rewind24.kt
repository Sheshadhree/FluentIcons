package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Rewind24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Rewind24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 5.503f)
            curveToRelative(0f, -1.28f, -1.497f, -1.971f, -2.472f, -1.142f)
            lineToRelative(-7.41f, 6.306f)
            curveToRelative(-0.82f, 0.699f, -0.82f, 1.966f, 0f, 2.665f)
            lineToRelative(7.41f, 6.306f)
            curveToRelative(0.975f, 0.83f, 2.473f, 0.137f, 2.473f, -1.142f)
            verticalLineToRelative(-3.988f)
            lineToRelative(6.028f, 5.13f)
            curveToRelative(0.974f, 0.83f, 2.473f, 0.137f, 2.473f, -1.142f)
            verticalLineTo(5.504f)
            curveToRelative(0f, -1.28f, -1.498f, -1.972f, -2.473f, -1.143f)
            lineToRelative(-6.028f, 5.131f)
            verticalLineToRelative(-3.99f)
            close()
            moveToRelative(0f, 7.035f)
            verticalLineToRelative(-1.076f)
            lineToRelative(7.002f, -5.958f)
            verticalLineToRelative(12.992f)
            lineTo(12.5f, 12.538f)
            close()
            moveTo(3.59f, 11.81f)
            lineTo(11f, 5.503f)
            verticalLineToRelative(12.993f)
            lineTo(3.59f, 12.19f)
            curveToRelative(-0.116f, -0.1f, -0.116f, -0.281f, 0f, -0.38f)
            close()
        }
    }.build()
}
