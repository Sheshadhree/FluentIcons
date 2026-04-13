package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BezierCurveSquare12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BezierCurveSquare12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(-0.883f, 0f, -1.445f, -0.27f, -1.846f, -0.646f)
            curveToRelative(-0.417f, -0.392f, -0.697f, -0.933f, -0.94f, -1.54f)
            curveTo(8.131f, 5.607f, 8.057f, 5.404f, 7.982f, 5.2f)
            lineTo(7.875f, 4.907f)
            curveToRelative(-0.11f, -0.295f, -0.23f, -0.595f, -0.371f, -0.861f)
            curveTo(7.22f, 3.514f, 6.775f, 3f, 6f, 3f)
            curveTo(5.224f, 3f, 4.78f, 3.514f, 4.496f, 4.046f)
            curveToRelative(-0.141f, 0.266f, -0.26f, 0.566f, -0.37f, 0.861f)
            curveTo(4.087f, 5.006f, 4.052f, 5.103f, 4.016f, 5.2f)
            curveTo(3.944f, 5.404f, 3.87f, 5.607f, 3.787f, 5.814f)
            curveToRelative(-0.243f, 0.607f, -0.523f, 1.148f, -0.94f, 1.54f)
            curveTo(2.444f, 7.729f, 1.881f, 8f, 1f, 8f)
            verticalLineTo(3f)
            close()
            moveToRelative(0f, 6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            curveToRelative(-1.117f, 0f, -1.93f, -0.355f, -2.53f, -0.916f)
            curveToRelative(-0.582f, -0.546f, -0.927f, -1.255f, -1.184f, -1.898f)
            curveToRelative(-0.089f, -0.222f, -0.172f, -0.449f, -0.25f, -0.66f)
            lineToRelative(-0.098f, -0.27f)
            curveTo(6.829f, 4.967f, 6.73f, 4.72f, 6.62f, 4.517f)
            curveTo(6.405f, 4.111f, 6.224f, 4f, 6f, 4f)
            curveTo(5.775f, 4f, 5.595f, 4.11f, 5.379f, 4.516f)
            curveTo(5.27f, 4.72f, 5.17f, 4.966f, 5.062f, 5.256f)
            lineToRelative(-0.099f, 0.27f)
            curveToRelative(-0.077f, 0.211f, -0.16f, 0.438f, -0.249f, 0.66f)
            curveTo(4.457f, 6.829f, 4.112f, 7.538f, 3.53f, 8.084f)
            curveTo(2.93f, 8.645f, 2.118f, 9f, 1f, 9f)
            close()
        }
    }.build()
}
