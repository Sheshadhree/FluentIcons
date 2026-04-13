package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Question16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Question16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(6.346f, 2f, 5f, 3.346f, 5f, 5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(6.5f, 5.414f, 6.5f, 5f)
            curveToRelative(0f, -0.826f, 0.674f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveTo(9.5f, 4.174f, 9.5f, 5f)
            curveToRelative(0f, 0.653f, -0.121f, 1.018f, -0.254f, 1.25f)
            curveTo(9.11f, 6.492f, 8.925f, 6.66f, 8.645f, 6.893f)
            lineTo(8.594f, 6.935f)
            curveToRelative(-0.26f, 0.215f, -0.612f, 0.507f, -0.88f, 0.939f)
            curveToRelative(-0.3f, 0.483f, -0.464f, 1.08f, -0.464f, 1.876f)
            verticalLineToRelative(0.5f)
            curveTo(7.25f, 10.664f, 7.586f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.579f, 0.116f, -0.888f, 0.239f, -1.085f)
            curveToRelative(0.135f, -0.219f, 0.316f, -0.37f, 0.616f, -0.62f)
            curveToRelative(0.283f, -0.236f, 0.66f, -0.553f, 0.945f, -1.053f)
            curveTo(10.84f, 6.482f, 11f, 5.847f, 11f, 5f)
            curveToRelative(0f, -1.654f, -1.346f, -3f, -3f, -3f)
            close()
            moveToRelative(0f, 12.25f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
