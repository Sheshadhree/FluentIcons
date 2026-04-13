package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Status12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Status12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveToRelative(0.278f, 0f, 0.55f, 0.023f, 0.816f, 0.066f)
            lineTo(5.88f, 2.002f)
            curveTo(3.726f, 2.065f, 2f, 3.83f, 2f, 6f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            curveToRelative(2.167f, 0f, 3.931f, -1.723f, 3.998f, -3.874f)
            lineToRelative(0.937f, -0.936f)
            curveTo(10.978f, 5.453f, 11f, 5.724f, 11f, 6f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveTo(1f, 8.761f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
            moveToRelative(4.441f, 0.562f)
            curveToRelative(-0.747f, -0.748f, -1.96f, -0.748f, -2.707f, 0f)
            lineTo(5.15f, 4.146f)
            curveTo(5.095f, 4.201f, 5.054f, 4.268f, 5.03f, 4.34f)
            lineTo(4.046f, 7.26f)
            curveTo(3.9f, 7.689f, 4.31f, 8.1f, 4.742f, 7.956f)
            lineToRelative(2.92f, -0.982f)
            curveToRelative(0.074f, -0.025f, 0.14f, -0.066f, 0.195f, -0.12f)
            lineToRelative(2.584f, -2.585f)
            curveToRelative(0.748f, -0.748f, 0.748f, -1.96f, 0f, -2.707f)
            close()
            moveToRelative(-2f, 0.707f)
            curveToRelative(0.357f, -0.357f, 0.936f, -0.357f, 1.293f, 0f)
            curveToRelative(0.357f, 0.357f, 0.357f, 0.936f, 0f, 1.293f)
            lineTo(7.232f, 6.064f)
            lineTo(5.284f, 6.719f)
            lineTo(5.939f, 4.77f)
            lineToRelative(2.502f, -2.502f)
            close()
        }
    }.build()
}
