package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelLeftHeaderAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeftHeaderAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.12f, 2f, 1f, 3.12f, 1f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 10.88f, 2.12f, 12f, 3.5f, 12f)
            horizontalLineTo(6f)
            verticalLineTo(6.5f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(-2f)
            curveTo(13f, 3.12f, 11.88f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(12f, 5.5f)
            horizontalLineTo(6f)
            verticalLineTo(3f)
            horizontalLineToRelative(4.5f)
            curveTo(11.328f, 3f, 12f, 3.672f, 12f, 4.5f)
            verticalLineToRelative(1f)
            close()
            moveTo(11.5f, 16f)
            curveTo(9.015f, 16f, 7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            reflectiveCurveTo(13.985f, 16f, 11.5f, 16f)
            close()
            moveTo(12f, 9.5f)
            curveTo(12f, 9.224f, 11.776f, 9f, 11.5f, 9f)
            reflectiveCurveTo(11f, 9.224f, 11f, 9.5f)
            verticalLineTo(11f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 11f, 9f, 11.224f, 9f, 11.5f)
            reflectiveCurveTo(9.224f, 12f, 9.5f, 12f)
            horizontalLineTo(11f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineTo(12f)
            verticalLineTo(9.5f)
            close()
        }
    }.build()
}
