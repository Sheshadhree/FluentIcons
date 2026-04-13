package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RoadCone48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RoadCone48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.388f, 4f)
            curveToRelative(-1.154f, 0f, -2.158f, 0.789f, -2.43f, 1.91f)
            curveToRelative(-1.382f, 5.684f, -3.07f, 11.898f, -4.77f, 18.09f)
            horizontalLineTo(25.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(26.328f, 27f, 25.5f, 27f)
            horizontalLineTo(14.362f)
            lineToRelative(-1.099f, 4f)
            horizontalLineTo(27.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(28.328f, 34f, 27.5f, 34f)
            horizontalLineTo(12.445f)
            curveToRelative(-0.651f, 2.397f, -1.279f, 4.742f, -1.865f, 7f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 41f, 4f, 41.672f, 4f, 42.5f)
            reflectiveCurveTo(4.672f, 44f, 5.5f, 44f)
            horizontalLineToRelative(37f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(43.328f, 41f, 42.5f, 41f)
            horizontalLineToRelative(-5.08f)
            lineTo(28.046f, 5.856f)
            curveTo(27.756f, 4.76f, 26.764f, 4f, 25.632f, 4f)
            horizontalLineToRelative(-3.244f)
            close()
        }
    }.build()
}
