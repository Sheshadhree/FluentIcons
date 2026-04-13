package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BowlChopsticks16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BowlChopsticks16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.732f, 1.078f)
            curveToRelative(0.232f, -0.148f, 0.542f, -0.08f, 0.69f, 0.154f)
            lineTo(7.092f, 7f)
            horizontalLineToRelative(1.815f)
            lineTo(5.578f, 1.768f)
            curveToRelative(-0.148f, -0.232f, -0.08f, -0.542f, 0.154f, -0.69f)
            curveToRelative(0.232f, -0.148f, 0.542f, -0.08f, 0.69f, 0.154f)
            lineTo(10.092f, 7f)
            horizontalLineTo(14.5f)
            curveTo(14.776f, 7f, 15f, 7.224f, 15f, 7.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            verticalLineTo(7.5f)
            curveTo(1f, 7.224f, 1.224f, 7f, 1.5f, 7f)
            horizontalLineToRelative(4.407f)
            lineTo(2.578f, 1.768f)
            curveToRelative(-0.148f, -0.232f, -0.08f, -0.542f, 0.154f, -0.69f)
            close()
            moveTo(2.342f, 10f)
            horizontalLineToRelative(11.317f)
            curveTo(13.879f, 9.374f, 14f, 8.701f, 14f, 8f)
            horizontalLineTo(2f)
            curveToRelative(0f, 0.701f, 0.12f, 1.374f, 0.341f, 2f)
            close()
            moveToRelative(0.46f, 1f)
            curveTo(3.84f, 12.793f, 5.78f, 14f, 8f, 14f)
            reflectiveCurveToRelative(4.16f, -1.207f, 5.197f, -3f)
            horizontalLineTo(2.803f)
            close()
        }
    }.build()
}
