package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PinOff48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PinOff48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(29.524f, 31.292f)
            lineToRelative(12.092f, 12.092f)
            curveToRelative(0.488f, 0.489f, 1.28f, 0.489f, 1.768f, 0f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.767f)
            lineToRelative(-37f, -37f)
            curveToRelative(-0.488f, -0.489f, -1.28f, -0.489f, -1.768f, 0f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.767f)
            lineTo(16.71f, 18.477f)
            lineToRelative(-6.25f, 2.159f)
            curveToRelative(-1.92f, 0.663f, -2.484f, 3.108f, -1.047f, 4.544f)
            lineToRelative(5.82f, 5.82f)
            lineTo(6f, 40.233f)
            verticalLineTo(42f)
            horizontalLineToRelative(1.768f)
            lineTo(17f, 32.768f)
            lineToRelative(5.82f, 5.82f)
            curveToRelative(1.437f, 1.437f, 3.881f, 0.874f, 4.544f, -1.046f)
            lineToRelative(2.16f, -6.25f)
            close()
            moveToRelative(11.692f, -7.502f)
            lineToRelative(-8.082f, 4.041f)
            lineToRelative(-12.965f, -12.964f)
            lineToRelative(4.041f, -8.082f)
            curveToRelative(1.45f, -2.9f, 5.315f, -3.527f, 7.608f, -1.235f)
            lineTo(42.45f, 16.183f)
            curveToRelative(2.293f, 2.292f, 1.665f, 6.157f, -1.234f, 7.607f)
            close()
        }
    }.build()
}
