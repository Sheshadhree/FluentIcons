package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.People24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.People24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 12f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveToRelative(9f, 0f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineToRelative(0.25f)
            reflectiveCurveTo(2f, 21f, 8f, 21f)
            reflectiveCurveToRelative(6f, -4.5f, 6f, -4.5f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-7.5f)
            close()
            moveTo(17f, 19.5f)
            curveToRelative(-1.171f, 0f, -2.068f, -0.181f, -2.755f, -0.458f)
            curveToRelative(0.342f, -0.575f, 0.527f, -1.128f, 0.627f, -1.558f)
            curveToRelative(0.06f, -0.26f, 0.092f, -0.481f, 0.11f, -0.649f)
            curveToRelative(0.008f, -0.084f, 0.012f, -0.155f, 0.015f, -0.211f)
            lineTo(15f, 16.55f)
            verticalLineToRelative(-0.3f)
            curveToRelative(0f, -0.872f, -0.343f, -1.664f, -0.902f, -2.248f)
            lineTo(14.2f, 14f)
            horizontalLineToRelative(5.6f)
            curveToRelative(1.215f, 0f, 2.2f, 0.985f, 2.2f, 2.2f)
            curveToRelative(0f, 0f, 0f, 3.3f, -5f, 3.3f)
            close()
        }
    }.build()
}
