package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowMinimize16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowMinimize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.854f, 2.853f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(10f, 5.293f)
            verticalLineTo(3.5f)
            curveTo(10f, 3.224f, 9.776f, 3f, 9.5f, 3f)
            reflectiveCurveTo(9f, 3.224f, 9f, 3.5f)
            verticalLineToRelative(2.9f)
            curveTo(9f, 6.731f, 9.269f, 7f, 9.6f, 7f)
            horizontalLineToRelative(2.9f)
            curveTo(12.776f, 7f, 13f, 6.776f, 13f, 6.5f)
            reflectiveCurveTo(12.776f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-1.793f)
            lineToRelative(3.147f, -3.147f)
            close()
            moveTo(6.5f, 13f)
            curveTo(6.224f, 13f, 6f, 12.776f, 6f, 12.5f)
            verticalLineToRelative(-1.793f)
            lineToRelative(-3.147f, 3.147f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(5.293f, 10f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 10f, 3f, 9.776f, 3f, 9.5f)
            reflectiveCurveTo(3.224f, 9f, 3.5f, 9f)
            horizontalLineToRelative(2.9f)
            curveTo(6.731f, 9f, 7f, 9.269f, 7f, 9.6f)
            verticalLineToRelative(2.9f)
            curveTo(7f, 12.776f, 6.776f, 13f, 6.5f, 13f)
            close()
        }
    }.build()
}
