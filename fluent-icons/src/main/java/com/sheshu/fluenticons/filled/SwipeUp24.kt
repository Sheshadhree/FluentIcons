package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SwipeUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SwipeUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 18f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(5.415f)
            lineToRelative(1.293f, 1.292f)
            curveToRelative(0.36f, 0.36f, 0.928f, 0.388f, 1.32f, 0.083f)
            lineToRelative(0.094f, -0.083f)
            curveToRelative(0.36f, -0.36f, 0.388f, -0.928f, 0.083f, -1.32f)
            lineToRelative(-0.083f, -0.094f)
            lineToRelative(-3f, -3f)
            curveToRelative(-0.36f, -0.36f, -0.928f, -0.388f, -1.32f, -0.083f)
            lineToRelative(-0.094f, 0.083f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.36f, 0.36f, 0.928f, 0.388f, 1.32f, 0.083f)
            lineToRelative(0.094f, -0.083f)
            lineTo(11f, 5.415f)
            verticalLineTo(17f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(0f, 4f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            curveToRelative(0f, -2.05f, -1.234f, -3.812f, -3f, -4.584f)
            verticalLineToRelative(1.712f)
            curveToRelative(0.907f, 0.633f, 1.5f, 1.683f, 1.5f, 2.872f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(8.5f, 18.933f, 8.5f, 17f)
            curveToRelative(0f, -1.19f, 0.593f, -2.24f, 1.5f, -2.873f)
            verticalLineToRelative(-1.711f)
            curveTo(8.235f, 13.187f, 7f, 14.95f, 7f, 17f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            close()
        }
    }.build()
}
