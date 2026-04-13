package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ClockDismiss24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockDismiss24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.25f, 12.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-6f)
            curveTo(11.5f, 5.336f, 11.836f, 5f, 12.25f, 5f)
            reflectiveCurveTo(13f, 5.336f, 13f, 5.75f)
            verticalLineTo(11f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            close()
            moveTo(13f, 1f)
            curveTo(7.478f, 1f, 3f, 5.478f, 3f, 11f)
            curveToRelative(0f, 0.334f, 0.016f, 0.665f, 0.049f, 0.991f)
            curveTo(4.049f, 11.363f, 5.232f, 11f, 6.5f, 11f)
            curveToRelative(3.59f, 0f, 6.5f, 2.91f, 6.5f, 6.5f)
            curveToRelative(0f, 1.268f, -0.363f, 2.451f, -0.991f, 3.451f)
            curveTo(12.335f, 20.985f, 12.666f, 21f, 13f, 21f)
            curveToRelative(5.522f, 0f, 10f, -4.478f, 10f, -10f)
            reflectiveCurveTo(18.522f, 1f, 13f, 1f)
            close()
            moveToRelative(-1f, 16.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(1f, 20.538f, 1f, 17.5f)
            reflectiveCurveTo(3.462f, 12f, 6.5f, 12f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            close()
            moveToRelative(-7.146f, -2.354f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(5.793f, 17.5f)
            lineToRelative(-1.647f, 1.646f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(6.5f, 18.207f)
            lineToRelative(1.646f, 1.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.708f)
            lineTo(7.208f, 17.5f)
            lineToRelative(1.647f, -1.646f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(6.5f, 16.793f)
            lineToRelative(-1.646f, -1.647f)
            close()
        }
    }.build()
}
