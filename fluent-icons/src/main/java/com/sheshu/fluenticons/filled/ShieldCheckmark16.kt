package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShieldCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShieldCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.647f, 2.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveTo(9.595f, 3.39f, 10.969f, 4f, 12.5f, 4f)
            curveTo(12.776f, 4f, 13f, 4.224f, 13f, 4.5f)
            verticalLineToRelative(1.1f)
            curveTo(12.25f, 5.216f, 11.4f, 5f, 10.5f, 5f)
            curveTo(7.462f, 5f, 5f, 7.462f, 5f, 10.5f)
            curveToRelative(0f, 0.822f, 0.18f, 1.603f, 0.504f, 2.303f)
            curveTo(3.844f, 11.59f, 3f, 9.81f, 3f, 7.502f)
            verticalLineTo(4.5f)
            curveTo(3f, 4.224f, 3.224f, 4f, 3.5f, 4f)
            curveToRelative(1.53f, 0f, 2.904f, -0.611f, 4.147f, -1.854f)
            close()
            moveTo(15f, 10.5f)
            curveTo(15f, 8.015f, 12.985f, 6f, 10.5f, 6f)
            reflectiveCurveTo(6f, 8.015f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 15f, 10.5f, 15f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.707f, 0f)
            lineToRelative(-1f, -1f)
            curveToRelative(-0.196f, -0.195f, -0.196f, -0.511f, 0f, -0.707f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(9.5f, 11.293f)
            lineToRelative(2.646f, -2.646f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            close()
        }
    }.build()
}
