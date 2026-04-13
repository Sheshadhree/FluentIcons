package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonHeart32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonHeart32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(-8.5f, 2f)
            curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(9.859f, 29.177f, 12.802f, 30f, 16f, 30f)
            curveToRelative(1.236f, 0f, 2.433f, -0.123f, 3.563f, -0.354f)
            lineToRelative(-4.324f, -4.618f)
            curveToRelative(-1.832f, -1.956f, -1.965f, -4.925f, -0.446f, -7.028f)
            horizontalLineTo(7.5f)
            close()
            moveToRelative(8.651f, 6.174f)
            lineToRelative(6.079f, 6.491f)
            curveToRelative(0.418f, 0.446f, 1.116f, 0.447f, 1.534f, 0f)
            lineToRelative(6.082f, -6.486f)
            curveToRelative(1.598f, -1.704f, 1.528f, -4.41f, -0.157f, -6.026f)
            curveToRelative(-1.762f, -1.69f, -4.56f, -1.498f, -6.084f, 0.419f)
            lineToRelative(-0.608f, 0.765f)
            lineToRelative(-0.608f, -0.765f)
            curveToRelative(-1.523f, -1.916f, -4.322f, -2.107f, -6.082f, -0.415f)
            curveToRelative(-1.319f, 1.267f, -1.645f, 3.203f, -0.954f, 4.8f)
            lineToRelative(0.02f, 0.044f)
            curveToRelative(0.188f, 0.422f, 0.447f, 0.819f, 0.778f, 1.173f)
            close()
            moveToRelative(4.8f, 5.125f)
            lineToRelative(-4.8f, -5.125f)
            curveToRelative(-0.198f, -0.212f, -0.371f, -0.44f, -0.518f, -0.68f)
        }
    }.build()
}
