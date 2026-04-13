package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRotateClockwise16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRotateClockwise16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3.25f)
            curveTo(5.377f, 3.25f, 3.25f, 5.377f, 3.25f, 8f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(1.75f, 8.414f, 1.75f, 8f)
            curveToRelative(0f, -3.452f, 2.798f, -6.25f, 6.25f, -6.25f)
            reflectiveCurveTo(14.25f, 4.548f, 14.25f, 8f)
            curveToRelative(0f, 1.768f, -0.734f, 3.364f, -1.913f, 4.5f)
            horizontalLineToRelative(0.913f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(13.664f, 14f, 13.25f, 14f)
            horizontalLineToRelative(-2.5f)
            curveTo(10.336f, 14f, 10f, 13.664f, 10f, 13.25f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(0.461f)
            curveToRelative(0.777f, -0.845f, 1.25f, -1.973f, 1.25f, -3.211f)
            curveToRelative(0f, -2.623f, -2.127f, -4.75f, -4.75f, -4.75f)
            close()
            moveTo(5.75f, 8f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            reflectiveCurveTo(10.25f, 6.757f, 10.25f, 8f)
            reflectiveCurveTo(9.243f, 10.25f, 8f, 10.25f)
            reflectiveCurveTo(5.75f, 9.243f, 5.75f, 8f)
            close()
            moveTo(8f, 7.25f)
            curveTo(7.586f, 7.25f, 7.25f, 7.586f, 7.25f, 8f)
            reflectiveCurveTo(7.586f, 8.75f, 8f, 8.75f)
            reflectiveCurveTo(8.75f, 8.414f, 8.75f, 8f)
            reflectiveCurveTo(8.414f, 7.25f, 8f, 7.25f)
            close()
        }
    }.build()
}
