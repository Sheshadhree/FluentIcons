package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaintBrush20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBrush20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4.499f)
            verticalLineToRelative(-2.5f)
            horizontalLineTo(5.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(10f)
            verticalLineTo(2.5f)
            curveTo(15f, 2.224f, 14.776f, 2f, 14.5f, 2f)
            horizontalLineTo(13f)
            verticalLineToRelative(3.502f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(12f, 5.777f, 12f, 5.501f)
            verticalLineTo(2f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(2.5f)
            curveTo(11f, 4.776f, 10.776f, 5f, 10.5f, 5f)
            reflectiveCurveTo(10f, 4.775f, 10f, 4.499f)
            close()
            moveToRelative(5f, 5.5f)
            horizontalLineTo(5f)
            verticalLineToRelative(1.004f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(3.498f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3.498f)
            horizontalLineTo(13f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(10f)
            close()
        }
    }.build()
}
