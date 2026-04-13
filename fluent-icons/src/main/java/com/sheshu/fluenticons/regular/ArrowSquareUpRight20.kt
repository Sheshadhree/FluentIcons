package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSquareUpRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSquareUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveTo(4f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
            moveToRelative(8.691f, 1.038f)
            curveToRelative(0.058f, 0.024f, 0.113f, 0.06f, 0.16f, 0.106f)
            lineToRelative(0.005f, 0.005f)
            curveToRelative(0.047f, 0.047f, 0.082f, 0.101f, 0.106f, 0.16f)
            curveTo(12.986f, 7.368f, 13f, 7.432f, 13f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(12f, 12.776f, 12f, 12.5f)
            verticalLineTo(8.707f)
            lineToRelative(-4.146f, 4.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(11.293f, 8f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 8f, 7f, 7.776f, 7f, 7.5f)
            reflectiveCurveTo(7.224f, 7f, 7.5f, 7f)
            horizontalLineToRelative(5f)
            curveToRelative(0.068f, 0f, 0.132f, 0.013f, 0.191f, 0.038f)
            close()
        }
    }.build()
}
