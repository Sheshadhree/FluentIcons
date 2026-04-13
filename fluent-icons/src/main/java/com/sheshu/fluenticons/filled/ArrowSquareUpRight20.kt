package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSquareUpRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSquareUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(9.691f, 1.038f)
            curveTo(12.632f, 7.013f, 12.568f, 7f, 12.5f, 7f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 7f, 7f, 7.224f, 7f, 7.5f)
            reflectiveCurveTo(7.224f, 8f, 7.5f, 8f)
            horizontalLineToRelative(3.793f)
            lineToRelative(-4.146f, 4.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineTo(12f, 8.707f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.068f, -0.014f, -0.132f, -0.038f, -0.191f)
            reflectiveCurveToRelative(-0.06f, -0.113f, -0.106f, -0.16f)
            lineTo(12.85f, 7.144f)
            curveToRelative(-0.047f, -0.047f, -0.102f, -0.082f, -0.16f, -0.106f)
            close()
        }
    }.build()
}
