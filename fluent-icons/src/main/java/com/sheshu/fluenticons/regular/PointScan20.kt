package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PointScan20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PointScan20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 2f)
            curveTo(8.776f, 2f, 9f, 2.224f, 9f, 2.5f)
            verticalLineToRelative(4.025f)
            curveToRelative(2.362f, 0.234f, 4.24f, 2.113f, 4.475f, 4.475f)
            horizontalLineTo(17.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 12f, 17.5f, 12f)
            horizontalLineToRelative(-4.025f)
            curveToRelative(-0.234f, 2.362f, -2.113f, 4.24f, -4.475f, 4.475f)
            verticalLineTo(17.5f)
            curveTo(9f, 17.776f, 8.776f, 18f, 8.5f, 18f)
            reflectiveCurveTo(8f, 17.776f, 8f, 17.5f)
            verticalLineToRelative(-1.025f)
            curveTo(5.638f, 16.241f, 3.76f, 14.362f, 3.525f, 12f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 12f, 2f, 11.776f, 2f, 11.5f)
            reflectiveCurveTo(2.224f, 11f, 2.5f, 11f)
            horizontalLineToRelative(1.025f)
            curveTo(3.759f, 8.638f, 5.638f, 6.76f, 8f, 6.525f)
            verticalLineTo(2.5f)
            curveTo(8f, 2.224f, 8.224f, 2f, 8.5f, 2f)
            close()
            moveTo(4.531f, 12f)
            curveToRelative(0.226f, 1.81f, 1.66f, 3.243f, 3.469f, 3.47f)
            verticalLineTo(12f)
            horizontalLineTo(4.531f)
            close()
            moveTo(8f, 11f)
            verticalLineTo(7.531f)
            curveTo(6.19f, 7.757f, 4.757f, 9.191f, 4.531f, 11f)
            horizontalLineTo(8f)
            close()
            moveToRelative(1f, 1f)
            verticalLineToRelative(3.47f)
            curveToRelative(1.81f, -0.227f, 3.243f, -1.66f, 3.47f, -3.47f)
            horizontalLineTo(9f)
            close()
            moveToRelative(3.47f, -1f)
            curveTo(12.242f, 9.19f, 10.81f, 7.757f, 9f, 7.531f)
            verticalLineTo(11f)
            horizontalLineToRelative(3.47f)
            close()
        }
    }.build()
}
