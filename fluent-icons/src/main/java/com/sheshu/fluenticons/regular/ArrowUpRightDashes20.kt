package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpRightDashes20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRightDashes20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 3.507f)
            curveToRelative(0.002f, -0.13f, -0.047f, -0.261f, -0.146f, -0.36f)
            curveToRelative(-0.053f, -0.054f, -0.116f, -0.092f, -0.182f, -0.116f)
            curveTo(16.62f, 3.01f, 16.561f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-8f)
            curveTo(8.224f, 3f, 8f, 3.224f, 8f, 3.5f)
            reflectiveCurveTo(8.224f, 4f, 8.5f, 4f)
            horizontalLineToRelative(6.793f)
            lineToRelative(-2.147f, 2.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(16f, 4.707f)
            verticalLineTo(11.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3.507f)
            close()
            moveTo(6.854f, 13.854f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            close()
            moveToRelative(5f, -5.707f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            close()
        }
    }.build()
}
