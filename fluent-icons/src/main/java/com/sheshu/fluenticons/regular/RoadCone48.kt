package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RoadCone48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RoadCone48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.368f, 4f)
            curveToRelative(-1.132f, 0f, -2.123f, 0.761f, -2.415f, 1.856f)
            lineTo(10.58f, 41f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 41f, 4f, 41.672f, 4f, 42.5f)
            reflectiveCurveTo(4.672f, 44f, 5.5f, 44f)
            horizontalLineToRelative(37f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(43.328f, 41f, 42.5f, 41f)
            horizontalLineToRelative(-5.08f)
            lineTo(28.046f, 5.856f)
            curveTo(27.756f, 4.76f, 26.764f, 4f, 25.632f, 4f)
            horizontalLineToRelative(-3.264f)
            close()
            moveToRelative(-8.682f, 37f)
            lineToRelative(1.866f, -7f)
            horizontalLineTo(27.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(28.328f, 31f, 27.5f, 31f)
            horizontalLineTo(16.352f)
            lineToRelative(1.067f, -4f)
            horizontalLineTo(25.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(26.328f, 24f, 25.5f, 24f)
            horizontalLineToRelative(-7.28f)
            lineToRelative(4.532f, -17f)
            horizontalLineToRelative(2.496f)
            lineToRelative(9.066f, 34f)
            horizontalLineTo(13.686f)
            close()
        }
    }.build()
}
