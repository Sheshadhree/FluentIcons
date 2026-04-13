package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareDismiss20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareDismiss20",
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
            horizontalLineToRelative(3.6f)
            curveTo(9.216f, 16.25f, 9f, 15.4f, 9f, 14.5f)
            curveTo(9f, 11.462f, 11.462f, 9f, 14.5f, 9f)
            curveToRelative(0.9f, 0f, 1.75f, 0.216f, 2.5f, 0.6f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(8.5f, 16f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(16.985f, 10f, 14.5f, 10f)
            reflectiveCurveTo(10f, 12.015f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            close()
            moveToRelative(1.854f, -6.354f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(15.207f, 14.5f)
            lineToRelative(1.147f, 1.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(14.5f, 15.207f)
            lineToRelative(-1.146f, 1.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(1.147f, -1.146f)
            lineToRelative(-1.147f, -1.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(1.146f, 1.147f)
            lineToRelative(1.146f, -1.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
