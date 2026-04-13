package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ruler20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ruler20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.97f, 3.198f)
            curveTo(13.99f, 3.295f, 14f, 3.397f, 14f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.777f, 0f, -1.415f, -0.59f, -1.492f, -1.347f)
            curveTo(6.003f, 16.603f, 6f, 16.552f, 6f, 16.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -0.777f, 0.59f, -1.415f, 1.347f, -1.492f)
            curveTo(7.397f, 2.003f, 7.448f, 2f, 7.5f, 2f)
            horizontalLineToRelative(5f)
            curveToRelative(0.725f, 0f, 1.33f, 0.514f, 1.47f, 1.198f)
            close()
            moveTo(7f, 14.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveTo(8.776f, 15.5f, 9f, 15.276f, 9f, 15f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, -10f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveTo(8.776f, 5.5f, 9f, 5.276f, 9f, 5f)
            reflectiveCurveTo(8.776f, 4.5f, 8.5f, 4.5f)
            horizontalLineTo(7f)
            close()
            moveTo(7f, 7f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2.5f)
            curveTo(9.776f, 8f, 10f, 7.776f, 10f, 7.5f)
            reflectiveCurveTo(9.776f, 7f, 9.5f, 7f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, 2.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveTo(8.776f, 10.5f, 9f, 10.276f, 9f, 10f)
            reflectiveCurveTo(8.776f, 9.5f, 8.5f, 9.5f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, 2.504f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
