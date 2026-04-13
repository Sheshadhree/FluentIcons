package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CallRectangleLandscape16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallRectangleLandscape16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(2.12f, 3f, 1f, 4.12f, 1f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 11.88f, 2.12f, 13f, 3.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(15f, 4.12f, 13.88f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(1.801f, 3.565f)
            curveTo(6.018f, 6.207f, 6.973f, 6f, 8f, 6f)
            reflectiveCurveToRelative(1.982f, 0.207f, 2.698f, 0.565f)
            curveTo(11.385f, 6.91f, 12f, 7.475f, 12f, 8.25f)
            verticalLineToRelative(0.754f)
            curveToRelative(0f, 0.608f, -0.539f, 1.075f, -1.141f, 0.99f)
            lineToRelative(-0.825f, -0.118f)
            curveTo(9.61f, 9.815f, 9.272f, 9.49f, 9.192f, 9.07f)
            lineTo(9.066f, 8.396f)
            curveToRelative(-0.021f, -0.11f, -0.061f, -0.142f, -0.07f, -0.147f)
            curveTo(8.819f, 8.144f, 8.489f, 7.999f, 8f, 7.999f)
            reflectiveCurveTo(7.181f, 8.145f, 7.004f, 8.25f)
            curveToRelative(-0.009f, 0.005f, -0.049f, 0.036f, -0.07f, 0.147f)
            lineTo(6.807f, 9.07f)
            curveTo(6.729f, 9.491f, 6.39f, 9.815f, 5.968f, 9.876f)
            lineTo(5.14f, 9.993f)
            curveTo(4.54f, 10.08f, 4f, 9.612f, 4f, 9.003f)
            verticalLineTo(8.25f)
            curveToRelative(0f, -0.775f, 0.615f, -1.341f, 1.301f, -1.685f)
            close()
        }
    }.build()
}
