package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonSquareCheckmark16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSquareCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 1f)
            curveTo(2.12f, 1f, 1f, 2.12f, 1f, 3.5f)
            verticalLineToRelative(7f)
            curveTo(1f, 11.88f, 2.12f, 13f, 3.5f, 13f)
            horizontalLineToRelative(2.707f)
            curveTo(6.072f, 12.523f, 6f, 12.02f, 6f, 11.5f)
            curveToRelative(0f, -0.37f, 0.037f, -0.733f, 0.107f, -1.083f)
            curveToRelative(-1.4f, -0.285f, -1.87f, -1.258f, -2.027f, -2.171f)
            curveTo(3.962f, 7.566f, 4.56f, 7f, 5.25f, 7f)
            horizontalLineToRelative(3.087f)
            curveToRelative(0.895f, -0.63f, 1.986f, -1f, 3.163f, -1f)
            curveToRelative(0.52f, 0f, 1.023f, 0.072f, 1.5f, 0.207f)
            verticalLineTo(3.5f)
            curveTo(13f, 2.12f, 11.88f, 1f, 10.5f, 1f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(7f, 6f)
            curveTo(6.172f, 6f, 5.5f, 5.328f, 5.5f, 4.5f)
            reflectiveCurveTo(6.172f, 3f, 7f, 3f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(7.828f, 6f, 7f, 6f)
            close()
            moveToRelative(9f, 5.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(10.5f, 12.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
