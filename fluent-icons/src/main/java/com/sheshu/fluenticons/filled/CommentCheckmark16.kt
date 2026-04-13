package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 5.5f)
            curveTo(15f, 3.015f, 12.985f, 1f, 10.5f, 1f)
            reflectiveCurveTo(6f, 3.015f, 6f, 5.5f)
            reflectiveCurveTo(8.015f, 10f, 10.5f, 10f)
            reflectiveCurveTo(15f, 7.985f, 15f, 5.5f)
            close()
            moveToRelative(-2.146f, -1.853f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-1f, -1f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(9.5f, 6.293f)
            lineToRelative(2.646f, -2.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
            moveTo(10.5f, 11f)
            curveToRelative(1.86f, 0f, 3.505f, -0.923f, 4.5f, -2.337f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(8.688f)
            lineToRelative(-3.063f, 2.68f)
            curveTo(4.992f, 15.234f, 4f, 14.784f, 4f, 13.942f)
            verticalLineTo(12f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 12f, 1f, 10.88f, 1f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(1f, 3.12f, 2.12f, 2f, 3.5f, 2f)
            horizontalLineToRelative(2.757f)
            curveTo(5.472f, 2.95f, 5f, 4.17f, 5f, 5.5f)
            curveTo(5f, 8.538f, 7.462f, 11f, 10.5f, 11f)
            close()
        }
    }.build()
}
