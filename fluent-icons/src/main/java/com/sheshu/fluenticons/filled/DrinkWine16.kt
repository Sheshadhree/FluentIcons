package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DrinkWine16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DrinkWine16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 1f)
            curveTo(4.224f, 1f, 4f, 1.224f, 4f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.04f, 1.527f, 3.723f, 3.5f, 3.97f)
            verticalLineTo(14f)
            horizontalLineTo(6f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(5.724f, 15f, 6f, 15f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.276f, 14f, 10f, 14f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(-3.53f)
            curveTo(10.472f, 10.222f, 12f, 8.54f, 12f, 6.5f)
            verticalLineToRelative(-5f)
            curveTo(12f, 1.224f, 11.776f, 1f, 11.5f, 1f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(5f, 4f)
            verticalLineTo(2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(5.733f, 2.303f)
            curveToRelative(-0.064f, 0.577f, -0.309f, 1.12f, -0.7f, 1.549f)
            curveToRelative(-0.391f, 0.43f, -0.908f, 0.724f, -1.477f, 0.841f)
            curveToRelative(-0.27f, 0.056f, -0.535f, -0.118f, -0.59f, -0.388f)
            curveTo(7.91f, 8.035f, 8.083f, 7.77f, 8.354f, 7.714f)
            curveToRelative(0.362f, -0.075f, 0.69f, -0.262f, 0.94f, -0.536f)
            curveToRelative(0.249f, -0.273f, 0.405f, -0.618f, 0.445f, -0.985f)
            curveToRelative(0.03f, -0.274f, 0.278f, -0.472f, 0.552f, -0.442f)
            curveToRelative(0.275f, 0.03f, 0.473f, 0.278f, 0.442f, 0.552f)
            close()
        }
    }.build()
}
