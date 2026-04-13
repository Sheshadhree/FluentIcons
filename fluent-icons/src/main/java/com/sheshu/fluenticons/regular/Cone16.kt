package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cone16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cone16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 15f)
            curveToRelative(-2.229f, 0f, -6f, -0.421f, -6f, -2f)
            curveToRelative(0f, -0.04f, 0.004f, -0.079f, 0.014f, -0.117f)
            lineToRelative(0.047f, -0.2f)
            curveToRelative(0.009f, -0.035f, 0.02f, -0.068f, 0.036f, -0.1f)
            lineToRelative(5.453f, -11.3f)
            curveToRelative(0.046f, -0.079f, 0.111f, -0.144f, 0.19f, -0.19f)
            curveToRelative(0.08f, -0.046f, 0.17f, -0.07f, 0.26f, -0.07f)
            reflectiveCurveToRelative(0.18f, 0.024f, 0.26f, 0.07f)
            curveToRelative(0.079f, 0.046f, 0.144f, 0.111f, 0.19f, 0.19f)
            lineToRelative(5.453f, 11.3f)
            curveToRelative(0.015f, 0.032f, 0.028f, 0.065f, 0.036f, 0.1f)
            lineToRelative(0.047f, 0.2f)
            curveTo(13.996f, 12.92f, 14f, 12.96f, 14f, 13f)
            curveToRelative(0f, 1.579f, -3.771f, 2f, -6f, 2f)
            close()
            moveToRelative(-4.99f, -1.981f)
            curveToRelative(0.197f, 0.34f, 2.025f, 0.98f, 4.99f, 0.98f)
            curveToRelative(2.94f, 0f, 4.763f, -0.628f, 4.988f, -0.99f)
            lineToRelative(-0.009f, -0.038f)
            lineTo(8f, 2.65f)
            lineTo(3.01f, 13.019f)
            close()
        }
    }.build()
}
