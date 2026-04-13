package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle132: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle132",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 16f)
            curveTo(4f, 9.373f, 9.373f, 4f, 16f, 4f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(4f, 22.627f, 4f, 16f)
            close()
            moveTo(16f, 2f)
            curveTo(8.268f, 2f, 2f, 8.268f, 2f, 16f)
            reflectiveCurveToRelative(6.268f, 14f, 14f, 14f)
            reflectiveCurveToRelative(14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            close()
            moveToRelative(2f, 7f)
            curveToRelative(0f, -0.499f, -0.367f, -0.921f, -0.861f, -0.99f)
            curveToRelative(-0.493f, -0.07f, -0.962f, 0.235f, -1.1f, 0.713f)
            verticalLineToRelative(0.001f)
            lineToRelative(-0.006f, 0.02f)
            lineToRelative(-0.03f, 0.09f)
            curveToRelative(-0.027f, 0.083f, -0.072f, 0.208f, -0.135f, 0.364f)
            curveToRelative(-0.125f, 0.315f, -0.323f, 0.751f, -0.604f, 1.229f)
            curveToRelative(-0.57f, 0.967f, -1.445f, 2.033f, -2.706f, 2.655f)
            curveToRelative(-0.496f, 0.244f, -0.7f, 0.844f, -0.455f, 1.34f)
            curveToRelative(0.244f, 0.495f, 0.844f, 0.698f, 1.34f, 0.454f)
            curveToRelative(1.072f, -0.529f, 1.912f, -1.273f, 2.557f, -2.037f)
            verticalLineTo(22f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}
