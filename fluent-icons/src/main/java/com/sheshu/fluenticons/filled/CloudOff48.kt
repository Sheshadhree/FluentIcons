package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudOff48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudOff48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(35.232f, 37f)
            lineToRelative(6.634f, 6.634f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-37.5f, -37.5f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(9.105f, 9.105f)
            curveToRelative(-0.787f, 1.434f, -1.289f, 3.046f, -1.43f, 4.761f)
            horizontalLineTo(11.5f)
            curveTo(6.806f, 20f, 3f, 23.806f, 3f, 28.5f)
            reflectiveCurveTo(6.806f, 37f, 11.5f, 37f)
            horizontalLineToRelative(23.732f)
            close()
            moveTo(45f, 28.5f)
            curveToRelative(0f, 3.223f, -1.793f, 6.026f, -4.436f, 7.468f)
            lineTo(16.35f, 11.754f)
            curveTo(18.427f, 10.034f, 21.093f, 9f, 24f, 9f)
            curveToRelative(6.29f, 0f, 11.45f, 4.84f, 11.959f, 11f)
            horizontalLineTo(36.5f)
            curveToRelative(4.694f, 0f, 8.5f, 3.806f, 8.5f, 8.5f)
            close()
        }
    }.build()
}
