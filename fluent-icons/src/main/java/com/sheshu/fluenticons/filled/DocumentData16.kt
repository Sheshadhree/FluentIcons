package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentData16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentData16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 5f)
            horizontalLineToRelative(3.25f)
            lineTo(9f, 1.25f)
            verticalLineTo(4.5f)
            curveTo(9f, 4.776f, 9.224f, 5f, 9.5f, 5f)
            close()
            moveToRelative(0f, 1f)
            curveTo(8.672f, 6f, 8f, 5.328f, 8f, 4.5f)
            verticalLineTo(1f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 1f, 3f, 1.672f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 14.328f, 3.672f, 15f, 4.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(6f)
            horizontalLineTo(9.5f)
            close()
            moveTo(6f, 12.5f)
            curveTo(6f, 12.776f, 5.776f, 13f, 5.5f, 13f)
            reflectiveCurveTo(5f, 12.776f, 5f, 12.5f)
            verticalLineToRelative(-6f)
            curveTo(5f, 6.224f, 5.224f, 6f, 5.5f, 6f)
            reflectiveCurveTo(6f, 6.224f, 6f, 6.5f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(2.5f, 0f)
            curveTo(8.5f, 12.776f, 8.276f, 13f, 8f, 13f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveTo(7.5f, 10.224f, 7.724f, 10f, 8f, 10f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(2.5f, 0f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 12.776f, 10f, 12.5f)
            verticalLineToRelative(-4f)
            curveTo(10f, 8.224f, 10.224f, 8f, 10.5f, 8f)
            reflectiveCurveTo(11f, 8.224f, 11f, 8.5f)
            verticalLineToRelative(4f)
            close()
        }
    }.build()
}
