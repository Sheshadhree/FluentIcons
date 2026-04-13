package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.OpenFolder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.OpenFolder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(2.5f)
            curveTo(14f, 7.776f, 13.776f, 8f, 13.5f, 8f)
            reflectiveCurveTo(13f, 7.776f, 13f, 7.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            curveTo(3.895f, 3f, 3f, 3.895f, 3f, 5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(3.5f)
            curveTo(8.776f, 13f, 9f, 13.224f, 9f, 13.5f)
            reflectiveCurveTo(8.776f, 14f, 8.5f, 14f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(5f)
            close()
            moveToRelative(4.507f, 1f)
            curveToRelative(-0.13f, -0.002f, -0.261f, 0.047f, -0.36f, 0.146f)
            curveTo(6.092f, 6.2f, 6.054f, 6.261f, 6.03f, 6.328f)
            curveTo(6.01f, 6.38f, 6f, 6.439f, 6f, 6.5f)
            verticalLineToRelative(4f)
            curveTo(6f, 10.776f, 6.224f, 11f, 6.5f, 11f)
            reflectiveCurveTo(7f, 10.776f, 7f, 10.5f)
            verticalLineTo(7.707f)
            lineToRelative(5.146f, 5.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(7.707f, 7f)
            horizontalLineTo(10.5f)
            curveTo(10.776f, 7f, 11f, 6.776f, 11f, 6.5f)
            reflectiveCurveTo(10.776f, 6f, 10.5f, 6f)
            horizontalLineTo(6.507f)
            close()
        }
    }.build()
}
