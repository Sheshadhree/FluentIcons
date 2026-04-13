package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CheckmarkCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CheckmarkCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(5.42857f, 11.5f),
                end = Offset(33.0334f, 40.1803f)
            )
        ) {
            moveTo(24f, 4f)
            curveToRelative(11.046f, 0f, 20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            reflectiveCurveTo(4f, 35.046f, 4f, 24f)
            reflectiveCurveTo(12.954f, 4f, 24f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(18.375f, 18.6271f),
                end = Offset(21.586f, 33.7408f)
            )
        ) {
            moveTo(32.634f, 17.616f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-11f, 11f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-4.5f, -4.5f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(3.616f, 3.616f)
            lineToRelative(10.116f, -10.116f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            close()
        }
    }.build()
}
