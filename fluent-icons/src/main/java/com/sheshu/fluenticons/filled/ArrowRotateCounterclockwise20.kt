package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRotateCounterclockwise20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRotateCounterclockwise20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3.5f)
            curveToRelative(3.59f, 0f, 6.5f, 2.91f, 6.5f, 6.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(18f, 10.414f, 18f, 10f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            curveToRelative(0f, 2.678f, 1.316f, 5.049f, 3.335f, 6.5f)
            horizontalLineTo(4.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(3.836f, 18f, 4.25f, 18f)
            horizontalLineToRelative(3f)
            curveTo(7.664f, 18f, 8f, 17.664f, 8f, 17.25f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(6.5f, 13.836f, 6.5f, 14.25f)
            verticalLineToRelative(1.228f)
            curveToRelative(-1.805f, -1.155f, -3f, -3.178f, -3f, -5.478f)
            curveToRelative(0f, -3.59f, 2.91f, -6.5f, 6.5f, -6.5f)
            close()
            moveTo(7.5f, 10f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveTo(7.5f, 8.62f, 7.5f, 10f)
            close()
            moveTo(9f, 10f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            close()
        }
    }.build()
}
